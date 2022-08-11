import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * MyRectangleGraphic.java
 * Rectangle that is able to render itself on the screen.
 *
 * @author Brian Borowski
 * @version 1.0
 */
public class MyRectangleGraphic extends MyRectangle2D {
    private int graphX, graphY, graphWidth, graphHeight;
    private final int panelWidth, panelHeight, xPoints, yPoints;
    private boolean isSelected;
    private final double width, height;
    private final Color color;
    private final AlphaComposite composite;

    public MyRectangleGraphic(double x, double y, double width, double height,
            Color color, boolean isSelected, int panelWidth, int panelHeight,
            int xPoints, int yPoints) {
        super(x, y, width, height);
        this.width = width;
        this.height = height;
        this.color = color;
        this.isSelected = isSelected;
        this.panelWidth = panelWidth;
        this.panelHeight = panelHeight;
        this.xPoints = xPoints;
        this.yPoints = yPoints;
        composite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.75f);
        render();
    }

    public void setSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }

    public boolean getSelected() {
        return isSelected;
    }

    public Color getColor() {
        return color;
    }

    public int getGraphX() {
        return graphX;
    }

    public int getGraphY() {
        return graphY;
    }

    public boolean canMoveLeft(int xCoord) {
        return xCoord >= 0;
    }

    public boolean canMoveRight(int xCoord) {
        return xCoord <= panelWidth - graphWidth;
    }

    public boolean canMoveDown(int yCoord) {
        return yCoord <= panelHeight - graphHeight;
    }

    public boolean canMoveUp(int yCoord) {
        return yCoord >= 0;
    }

    public void moveX(int deltaX) {
        int newX = this.graphX + deltaX;
        if (deltaX > 0 && canMoveRight(newX) || deltaX < 0 && canMoveLeft(newX)) {
            setX(getX() + deltaX * (double)xPoints / panelWidth);
            this.graphX = newX;
        }
    }

    public void moveY(int deltaY) {
        int newY = this.graphY + deltaY;
        if (deltaY > 0 && canMoveDown(newY) || deltaY < 0 && canMoveUp(newY)) {
            setY(getY() - deltaY * (double)yPoints / panelHeight);
            this.graphY = newY;
        }
    }

    public void render() {
        graphX = (int)((double)panelWidth / xPoints *
                            ((getX() - width / 2.0) + xPoints / 2.0));
        graphY = (int)((double)panelHeight / yPoints *
                            ((-getY() - height / 2.0) + yPoints / 2.0));
        graphWidth = (int)(width * panelWidth / xPoints);
        graphHeight = (int)(height * panelHeight / yPoints);
    }

    protected void paintComponent(final Graphics g) {
        final Graphics2D g2d = (Graphics2D)g;

        Composite originalComposite = g2d.getComposite();

        g2d.setPaint(color);
        g2d.setComposite(composite);
        g2d.fillRect(graphX, graphY, graphWidth, graphHeight);
        if (isSelected) {
            g2d.setComposite(originalComposite);
            g2d.setPaint(Color.black);
            g2d.drawRect(graphX, graphY, graphWidth, graphHeight);
        } else {
            g2d.drawRect(graphX, graphY, graphWidth, graphHeight);
            g2d.setComposite(originalComposite);
        }
    }
}
