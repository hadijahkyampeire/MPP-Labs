import javax.swing.*;

public class MyInClassFrame extends JFrame {

    MyInClassFrame() {
        setTitle("My In Class Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        MyInClassFrame myInClassFrame = new MyInClassFrame();
    }
}
