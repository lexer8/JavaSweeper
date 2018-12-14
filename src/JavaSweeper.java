import javax.swing.*;

public class JavaSweeper extends JFrame {

    public static void main(String[] args) {
        new JavaSweeper();
    }

    private JavaSweeper(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Sweeper");
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }
}
