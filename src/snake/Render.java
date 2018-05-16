package snake;

import java.awt.Graphics;
import java.awt.Color;

import javax.swing.JPanel;

//@SuppressWarnings("serial")
@SuppressWarnings("serial")
public class Render extends JPanel
{
	public static Color green = new Color(1666073);
	
	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(green);
		g.fillRect(0, 0, 800, 700);
	}
}
