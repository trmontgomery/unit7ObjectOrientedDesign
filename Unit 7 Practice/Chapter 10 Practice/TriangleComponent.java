import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
public class TriangleComponent extends JComponent
{
    private Triangle tri;

    public TriangleComponent()
    {
        tri = new Triangle();
        TriMouseListener listener = new TriMouseListener();
        this.addMouseListener(listener);
    }

    public void paintComponent(Graphics g, int x, int y, int count)
    {
        Graphics2D g2 = (Graphics2D) g;
        //how many times have they clicked?
        switch (count)
        {
            case 1: 
               g2.setColor(Color.yellow);
               g2.drawOval(x, y, 5, 5);
               g2.fillOval(x, y, 5, 5);
            case 2:
            //draw a line connecting a point and the new point
            case 3:
            //fill in the triangle that connects the three points
        }

    }


    public class TriMouseListener implements MouseListener
    {
        private TriangleComponent triComp;
        private int count;
     

        /**
         * Default constructor for objects of class MouseListener
         */
        public TriMouseListener()
        {

        }

        public void mousePressed(MouseEvent event)
        {
        }

        public void mouseReleased(MouseEvent event)
        {
        }

        public void mouseClicked(MouseEvent event)
        {
            count++;
            int x = event.getX();
            int y = event.getY();
            triComp.paintComponent(x,y,count);
        }

        public void mouseEntered(MouseEvent event)
        {
        }

        public void mouseExited(MouseEvent event)
        {
        }
    }

}
