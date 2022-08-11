import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

import javax.swing.JPanel;

/**
 * CoordinatePlane.java
 * Draws 3 rectangles on the coordinate plan and allows
 * the user to move them via the mouse and keyboard.
 *
 * @author Brian Borowski
 * @version 1.1
 */
public class CoordinatePlane extends JPanel {
    private static final long serialVersionUID = 1L;
    private final int panelWidth, panelHeight, xPoints, yPoints;
    private int lastX, lastY;
    private final MyRectangleGraphic[] rectangles = new MyRectangleGraphic[3];
    private final DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public CoordinatePlane(
            final int panelWidth, final int panelHeight,
            final int width, final int height) {
        this.panelWidth = panelWidth;
        this.panelHeight = panelHeight;
        this.xPoints = width;
        this.yPoints = height;
        this.lastX = this.lastY = 0;

        rectangles[0] = new MyRectangleGraphic(
            -50, 30, 55, 49, new Color(128, 0, 0), true,
            panelWidth, panelHeight, xPoints, yPoints);
        rectangles[1] = new MyRectangleGraphic(
            40, 50, 105, 32, new Color(28, 21, 145), false,
            panelWidth, panelHeight, xPoints, yPoints);
        rectangles[2] = new MyRectangleGraphic(
                40, -20, 20, 20, new Color(38, 88, 31), false,
                panelWidth, panelHeight, xPoints, yPoints);

        addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                MyRectangleGraphic selectedRect = null;
                for (MyRectangleGraphic rectangle : rectangles) {
                    if (rectangle.getSelected()) {
                        selectedRect = rectangle;
                        break;
                    }
                }
                if (selectedRect == null) {
                    return;
                }
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_LEFT) {
                    moveRectangle(selectedRect, -1, 0);
                } else if (key == KeyEvent.VK_RIGHT) {
                    moveRectangle(selectedRect, 1, 0);
                } else if (key == KeyEvent.VK_UP) {
                    moveRectangle(selectedRect, 0, -1);
                } else if (key == KeyEvent.VK_DOWN) {
                    moveRectangle(selectedRect, 0, 1);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) { }

            @Override
            public void keyTyped(KeyEvent e) { }
        });

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                final int x = translateX(e.getX()), y = translateY(e.getY());
                int selectedIndex = -1;
                for (int i = 0; i < rectangles.length; i++) {
                    if (rectangles[i].contains(x, y)) {
                        selectedIndex = i;
                        if (rectangles[i].getSelected()) {
                            break;
                        }
                    }
                }
                for (int i = 0; i < rectangles.length; i++) {
                    if (i != selectedIndex) {
                        rectangles[i].setSelected(false);
                    } else {
                        rectangles[i].setSelected(true);
                    }
                }
                repaint();
                if (lastX == 0 || lastY == 0) {
                    lastX = e.getX();
                    lastY = e.getY();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                lastX = 0;
                lastY = 0;
            }
        });

        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                final int x = e.getX(),
                          y = e.getY();
                if (x >= 0 && x < panelWidth && y >= 0 && y < panelHeight) {
                    final int tx = translateX(e.getX()),
                              ty = translateY(e.getY());
                    for (MyRectangleGraphic rectangle : rectangles) {
                        if (rectangle.contains(tx, ty) && rectangle.getSelected()) {
                            moveRectangle(rectangle, x - lastX, y - lastY);
                            break;
                        }
                    }
                    lastX = x;
                    lastY = y;
                }
            }
        });

        setPreferredSize(new Dimension(panelWidth, panelHeight));
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(panelWidth, panelHeight);
    }

    @Override
    protected void paintComponent(final Graphics g) {
        final Graphics2D g2d = (Graphics2D)g;

        g2d.setColor(Color.white);
        g2d.fillRect(0, 0, panelWidth, panelHeight);

        int midX = panelWidth / 2;
        int midY = panelHeight / 2;
        g2d.setColor(Color.black);

        g2d.drawString("(0, 0)", midX - 30, midY + 15);
        g2d.drawString("x", panelWidth - 15, midY + 15);
        g2d.drawString("y", midX - 10, 18);

        // Draw axes
        g2d.drawLine(0, midY, panelWidth, midY);
        g2d.drawLine(midX, 0, midX, panelHeight);

        // Add top arrow
        g2d.drawLine(midX, 0, midX - 6, 6);
        g2d.drawLine(midX, 0, midX + 6, 6);

        // Add bottom arrow
        g2d.drawLine(midX, panelHeight - 1, midX - 6, panelHeight - 7);
        g2d.drawLine(midX, panelHeight - 1, midX + 6, panelHeight - 7);

        // Add left arrow
        g2d.drawLine(0, midY, 6, midY - 6);
        g2d.drawLine(0, midY, 6, midY + 6);

        // Add right arrow
        g2d.drawLine(panelWidth - 1, midY, panelWidth - 7, midY - 6);
        g2d.drawLine(panelWidth - 1, midY, panelWidth - 7, midY + 6);

        int rectNumber = 1;
        for (MyRectangleGraphic rectangle : rectangles) {
            rectangle.paintComponent(g);
            g2d.setColor(rectangle.getColor());

            g2d.drawString("Rect " + rectNumber + " - Perimeter: "
                    + decimalFormat.format(rectangle.getPerimeter())
                    + ", area: "
                    + decimalFormat.format(rectangle.getArea())
                    + ", ("
                    + decimalFormat.format(rectangle.getX())
                    + ", "
                    + decimalFormat.format(rectangle.getY())
                    + ")", 5,
                    panelHeight - (35 - 15 * (rectNumber - 1)));
            rectNumber++;
        }

        g2d.setColor(Color.black);
        int y = 50;
        for (int j = 1; j < rectangles.length; j++) {
            int j1 = j + 1;
            if (rectangles[0].overlaps(rectangles[j])) {
                g2d.drawString("R1 Overlaps R" + j1 + ": YES", panelWidth - 125, panelHeight - (y - 15 * (j - 1)));
            } else {
                g2d.drawString("R1 Overlaps R" + j1 + ": NO", panelWidth - 125, panelHeight - (y - 15 * (j - 1)));
            }
            y -= 15;
            if (rectangles[0].contains(rectangles[j])) {
                g2d.drawString("R1 Contains R" + j1 + ": YES", panelWidth - 126, panelHeight - (y - 15 * (j - 1)));
            } else {
                g2d.drawString("R1 Contains R" + j1 + ": NO", panelWidth - 126, panelHeight - (y - 15 * (j - 1)));
            }
        }
    }

    private void moveRectangle(MyRectangleGraphic r, int x, int y) {
        r.moveX(x);
        r.moveY(y);
        repaint();
    }

    private int translateX(int x) {
        return (int)(x * (double)xPoints / panelWidth - xPoints / 2.0);
    }

    private int translateY(int y) {
        int val = (int)(y * (double)yPoints / panelHeight - yPoints / 2.0);
        return val == 0 ? 0 : -val;
    }
}
