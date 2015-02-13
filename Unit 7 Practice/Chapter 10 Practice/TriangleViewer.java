import javax.swing.JFrame;

/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class TriangleViewer
{
    /**
     * main method for the program which creates and configures the frame for the program
     *
     */
    public static void main(String[] args)
    {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();
        
        frame.setSize(800 /* x */, 600 /* y */);
        frame.setTitle("Triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       
        TriangleComponent component = new TriangleComponent();
        frame.add(component);
        
        // make the frame visible which will result in the paintComponent method being invoked on the
        // component.
        frame.setVisible(true);
    }

}
