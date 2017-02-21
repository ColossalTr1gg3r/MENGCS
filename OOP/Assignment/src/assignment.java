		import java.awt.event.KeyEvent;

		import javax.swing.JFrame;
		import javax.swing.JMenu;
		import javax.swing.JMenuBar;
		import javax.swing.JMenuItem;

public class assignment {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub

		    JFrame frame = new JFrame("MenuSample Example");
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    JMenuBar menuBar = new JMenuBar();

		    // File Menu, F - Mnemonic
		    JMenu fileMenu = new JMenu("File");
		    JMenu helpMenu = new JMenu("Help");
		    fileMenu.setMnemonic(KeyEvent.VK_F);
		    menuBar.add(fileMenu);
		    menuBar.add(helpMenu);

		    // File->New, N - Mnemonic
		    JMenuItem newMenuItem = new JMenuItem("New", KeyEvent.VK_N);
		    fileMenu.add(newMenuItem);
		    
		    // File->save, N - Mnemonic
		    JMenuItem saveMenuItem = new JMenuItem("Save", KeyEvent.VK_N);
		    fileMenu.add(saveMenuItem);
		  
		    // File->load, N - Mnemonic
		    JMenuItem loadMenuItem = new JMenuItem("Load", KeyEvent.VK_N);
		    fileMenu.add(loadMenuItem);
		 
		    // File->save, N - Mnemonic
		    JMenuItem exitMenuItem = new JMenuItem("Exit", KeyEvent.VK_N);
		    fileMenu.add(exitMenuItem);
		    
		    // File->save, N - Mnemonic
		    JMenuItem aboutMenuItem = new JMenuItem("About", KeyEvent.VK_N);
		    helpMenu.add(aboutMenuItem);
		    
		    frame.setJMenuBar(menuBar);
		    frame.setSize(350, 250);
		    frame.setVisible(true);
		  }
		
	}


