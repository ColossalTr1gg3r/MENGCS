   import javax.swing.JFrame;

    public class email {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Create a frame
        JFrame frame = new JFrame("Compose Message");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Create an instance of EmailWindow and add it to the frame.
        EmailWindow email = new EmailWindow(); 
        frame.getContentPane().add(email); 
        // Set a reasonable starting size for the frame. Note that we 
        // do not use pack() here, since doing so with the default layout 
        // manager would produce a very long frame. Other layout managers 
        // (which will be discussed in Chapter 6) would solve this problem 
        // in a more flexible way.
        frame.setSize(425, 400); 
        // Show the frame. 
        frame.setVisible(true); 
        } 

}