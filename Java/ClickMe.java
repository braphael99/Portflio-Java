import java.applet. Applet;
import java.awt.*;
import java.awt.event.*;

public class ClickMe extends Applet implements MouseListener
{
	private Spot spot = null;
	private static final int RADIUS = 7;
		

	public void init()
	{
		addMouseListener(this);
	} // end init method

	public void paint(Graphics g)
	{
						
		// draw a black border and a white background
		g.setColor(Color.white);
		g.fillRect(0, 0, getSize().width - 1, getSize().height - 1);
		g.setColor(Color.black);
		g.drawRect(0, 0, getSize().width - 1, getSize().height - 1);

		String fname = "Blake";
	
		// draw the spot
		g.setColor(new Color(0,255,255));
		if (spot != null)
		{
			g.drawString(fname,  );
		}

	} // end paint method

	public void mousePressed(MouseEvent event)
	{
		if (spot == null)
		{
			spot = new Spot(RADIUS);
		}

		spot.x = event.getX();
		spot.y = event.getY();
		repaint();

	} // end mousePressed method

	public void mouseClicked(MouseEvent event) {}
	public void mouseReleased(MouseEvent event) {}
	public void mouseEntered(MouseEvent event) {}
	public void mouseExited(MouseEvent event) {}
} // end ClickMe class