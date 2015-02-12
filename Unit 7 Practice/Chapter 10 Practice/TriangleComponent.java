
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
public class TriangleComponent extends JComponent
{
    private Triangle tri;

    public TriangleComponent()
    {
        tri = new Triangle();
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

    }

    public void drawTriangle(int x, int y, int count)
    {
        //how many times have they clicked?
        switch (count)
        {
            case 1: 
            //draw a point
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
            count++;
            int x = event.getX();
            int y = event.getY();
            triComp.drawTriangle(x,y,count);
        }

        public void mouseReleased(MouseEvent event)
        {
        }

        public void mouseClicked(MouseEvent event)
        {
        }

        public void mouseEntered(MouseEvent event)
        {
        }

        public void mouseExited(MouseEvent event)
        {
        }
    }

}
