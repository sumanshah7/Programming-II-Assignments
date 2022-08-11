import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

/**
 * Application.java
 * Main window for displaying the coordinate plane.
 *
 * @author Brian Borowski
 * @version 1.1
 */
public class Application extends JFrame {
    public static final String NAME = "Rectangle Grid";

    private static final int DEFAULT_WIDTH = 640,
                             DEFAULT_HEIGHT = 480;
    private static final long serialVersionUID = 1L;

    private final CoordinatePlane coordinatePlane;

    public Application() {
        super(NAME);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        coordinatePlane = new CoordinatePlane(
            DEFAULT_WIDTH, DEFAULT_HEIGHT, 200, 200);
        final Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(coordinatePlane, BorderLayout.CENTER);

        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        coordinatePlane.requestFocusInWindow();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Application();
    }
}
