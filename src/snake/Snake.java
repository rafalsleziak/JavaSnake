package snake;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;

public class Snake implements ActionListener
{
	public JFrame jframe;
	public Render renderPanel;
	public static Snake snake;
	
	public Snake() 
	{
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		jframe = new JFrame("Snake");
		jframe.setVisible(true);  
		jframe.setSize(800, 600);
		jframe.setLocation(dim.width/4, dim.height/4);
		jframe.add(renderPanel = new Render() );
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) 
	{
		snake = new Snake();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
