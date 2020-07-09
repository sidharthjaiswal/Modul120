package MeinPaket;
import java.awt.*;
import javax.swing.*;

 class BasicStrokeDemo extends JFrame
 {
	 public void paint( Graphics g)
	 {
		 Graphics2D g2 = (Graphics2D) g;
		 g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		 
		 g2.setStroke(new BasicStroke(20,BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER));
		 g2.drawLine(30, 50, 200, 50);
		 
		 g2.setStroke( new BasicStroke(20,BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER));
		 g2.drawLine(30, 150, 200, 150);
		 
		 g2.setStroke(new BasicStroke(20, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));
		 g2.drawLine(30, 100, 200, 100);
	 }
	 
	public static void main(String[] args) 
	{
		JFrame f = new BasicStrokeDemo();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(260,600);
		f.setVisible(true);

	}

}
