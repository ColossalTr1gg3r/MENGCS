import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


    public class EmailWindow extends JPanel {
    	
    private JTextField to, cc, bcc, subject;
    private JTextPane content;
    private JButton send;
    
    public EmailWindow() {
    	
    	 setLayout(new BoxLayout (this, BoxLayout.Y_AXIS));

        to = new JTextField(40);
    	cc = new JTextField(40);
    	bcc = new JTextField(40);
    	subject = new JTextField(40);



    	   add(createComponentWithLabel("To", to));
    	   add(createComponentWithLabel("Cc", cc));
    	   add(createComponentWithLabel("Bcc", bcc));
    	   add(createComponentWithLabel("Subject ", subject));
    	   


        setBackground(Color.cyan);
        content = new JTextPane();
        content.setPreferredSize(new Dimension(375, 200));
        send = new JButton("Send");
        send.addActionListener(new SendListener());
        add(content);
        add(send);
        
    }


    private JPanel createComponentWithLabel(String label, Component comp) {
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(new JLabel(label, JLabel.RIGHT), BorderLayout.WEST);
        p.add(comp, BorderLayout.CENTER);
        return p;
    }

    private class SendListener implements ActionListener {

        public void actionPerformed(ActionEvent evt) {
            System.out.println("To: " + to.getText());
            System.out.println("Cc: " + cc.getText());
            System.out.println("Bcc: " + bcc.getText());
            System.out.println("Subject: " + subject.getText());
            System.out.println("Message content: "+content.getText());
   

        }
    }
}