import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;

public class ButtonViewer
{
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 100;
    
    private JFrame frame;
    private JPanel panel;
    private JButton button, button2;
    private JLabel label;
    
    public ButtonViewer()
    {
        this.frame = new JFrame();
        this.panel = new JPanel();
        this.button = new JButton("eh");
        panel.add(button);
        
        this.button2 = new JButton("bee");
        panel.add(button2);
        
        this.label = new JLabel("No Button Clicked");
        panel.add(label);
        
        frame.add(panel);
        
        ActionListener listener = new ClickListener();
        button.addActionListener(listener);
        button2.addActionListener(listener);
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); 
    }
    

    public class ClickListener implements ActionListener
    {
    
        public void actionPerformed(ActionEvent event)
        {
            System.out.println("Button " + event.getActionCommand() + " was clicked!");
        }
    
    }


    public static void main(String [] args)
    {
        ButtonViewer viewer = new ButtonViewer();
    }
}
