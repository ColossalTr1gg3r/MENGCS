import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


///// MenuDemoGUI
class MenuGUI extends JFrame {
	
	//Menu Bar Icons
	ImageIcon newitem = new ImageIcon("new.png");
	ImageIcon openitem = new ImageIcon("open.png");
	ImageIcon exit = new ImageIcon("exit.png");
	ImageIcon save = new ImageIcon("save.png");
	ImageIcon about = new ImageIcon("about.png");
	
    JMenu     m_fileMenu = new JMenu("File");// declare and create new menu
    JMenuItem m_openItem = new JMenuItem("Open", openitem); // create new menu item
    JMenuItem m_newItem = new JMenuItem("New", newitem); // create new menu item
    JMenuItem m_quitItem = new JMenuItem("Exit", exit); // another menu item
    JMenuItem m_saveItem = new JMenuItem("Save", save); // another menu item
    JMenu m_helpMenu = new JMenu("Help");
    JMenuItem m_aboutItem = new JMenuItem("About" , about ); // another menu item
    
//constructor
    public MenuGUI() {
        //... Add listeners to menu items
        m_openItem.addActionListener(new OpenAction());
        m_newItem.addActionListener(new NewAction());
        m_aboutItem.addActionListener(new AboutAction());
        m_saveItem.addActionListener(new SaveAction());
        m_quitItem.addActionListener(new QuitAction());

        
        //... Menubar, menus, menu items.  Use indentation to show structure.
        JMenuBar menubar = new JMenuBar();
        // declare and create new menu bar
            menubar.add(m_fileMenu);        // add the menu to the menubar
                m_fileMenu.add(m_newItem); // add the menu item to the menu
                
                m_fileMenu.addSeparator(); 
                m_fileMenu.add(m_openItem); // add the menu item to the menu
                m_fileMenu.addSeparator(); // add separator line to menu
                m_fileMenu.add(m_saveItem); // add the menu item to the menu
                m_fileMenu.addSeparator(); 
                m_fileMenu.add(m_quitItem);
                menubar.add(m_helpMenu);
                m_helpMenu.add(m_aboutItem);

        
        //... Content pane: create, layout, add components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2, 5, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        
        JTextArea m_editArea = new JTextArea(19, 50);
        m_editArea.setBorder(BorderFactory.createLoweredBevelBorder());
        m_editArea.setBorder(BorderFactory.createTitledBorder("Title"));
        panel.add(m_editArea);
        
        JPanel p2 = new JPanel();
        p2.setBorder(BorderFactory.createLineBorder(Color.blue, 3));
        p2.add(new JLabel("Line Border"));
        panel.add(p2);
        
        //... Set JFrame's menubar, content pane, and title.
        this.setContentPane(panel);       // Set windows content pane..
        this.setJMenuBar(menubar);          // Set windows menubar.
        this.pack();
        this.setTitle("Assignment");
    }//endconstructor
    
//// OpenAction
    class OpenAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Sorry, can't open anything");
        }
    }

////SaveAction
   class SaveAction implements ActionListener {
       public void actionPerformed(ActionEvent e) {
           JOptionPane.showMessageDialog(null, "Sorry, can't save anything");
       }
   }
////NewAction
  class NewAction implements ActionListener {
      public void actionPerformed(ActionEvent e) {
          JOptionPane.showMessageDialog(null, "Sorry, can't create anything new");
      }
  }
  
////SaveAction
 class AboutAction implements ActionListener {
     public void actionPerformed(ActionEvent e) {
         JOptionPane.showMessageDialog(null, "Hi may i help you ");
     }
 }
/// QuitAction
    class QuitAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);  // terminate this program
        }
    }
}