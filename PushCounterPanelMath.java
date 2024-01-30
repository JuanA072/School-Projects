import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PushCounterPanelMath extends JPanel{

	private int count;
	private JButton push1;
	private JButton push2;
	private JLabel label;
	{
		count=50;
		push1= new JButton("Increment");
		push2= new JButton("Decrement");
		label= new JLabel();
		push1.addActionListener(new ButtonListener1());
		push2.addActionListener(new ButtonListener2());
		add(push1);
		add(push2);
		add(label);
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(300, 40));
	}
	private class ButtonListener1 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			count++;
			label.setText("Number:" + count);
			
		}
	}
	private class ButtonListener2 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			count--;
			label.setText("Number:" + count);
			
		}
	}
}
