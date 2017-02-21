import javax.swing.JFrame;

public class IDCounter {
public static void main(String[] args){ 
	
	JFrame frame = new JFrame("Increment/Decrement");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    IDCounterPanel panel = new IDCounterPanel();
    frame.getContentPane().add(panel);

    frame.pack();
    frame.setVisible(true);
}
}
