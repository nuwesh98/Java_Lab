
import java.awt.*;
import java.awt.event.*;

public class AWTImageText extends Frame {

    Image img;

    public Assignment4_AWTImageText() {
        setTitle("AWT Image and Text Display");
        setSize(500, 400);
        setVisible(true);

        img = Toolkit.getDefaultToolkit().getImage("image.jpg");

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Welcome to AWT Application", 120, 80);

        if (img != null) {
            g.drawImage(img, 180, 120, 150, 150, this);
        }
    }

    public static void main(String[] args) {
        new Assignment4_AWTImageText();
    }
}
