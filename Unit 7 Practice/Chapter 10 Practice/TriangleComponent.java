
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class TriangleComponent extends JComponent
{
    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Building b1 = new Building(200, 100, 300, 100);
        Building b2 = new Building(400, 200, 200, 100);
        Ground ground1 = new Ground(0,400, 200, 800);
        Sun sun = new Sun (600, 0, 100, 100);
        
        ground1.draw(g2);
        b1.draw(g2);
        b1.addWindows(g2);
        b2.draw(g2);
        sun.draw(g2);
        
        
        // create instances of classes and invoke the draw method on each
        // ...
        
        
    }

}
