import javax.swing.*;
import java.awt.*;

public class JavaSweeper extends JFrame {

    private final int COLS = 15;
    private final int ROWS = 1;
    private final int IMAGE_SIZE = 50;
    private JPanel panel;

    public static void main(String[] args) {
        new JavaSweeper();
    }

    private JavaSweeper() {
        initPanel();
        initFrame();
    }

    private void initPanel() {
        panel = new JPanel()
        {
            @Override
            protected void printComponent(Graphics g) {
                super.printComponent(g);
                g.drawLine(0,0,500,300);
            }
        };
        panel.setPreferredSize(new Dimension(
                COLS * IMAGE_SIZE,
                ROWS * IMAGE_SIZE));
        add(panel);
    }

    private void initFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Sweeper");
        setVisible(true);
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
    }

    private Image getImage(String name){
        ImageIcon icon = new ImageIcon("res/img/"+name+".png");
        return icon.getImage();
    }
}
