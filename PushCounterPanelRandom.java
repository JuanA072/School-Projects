import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public class PushCounterPanelRandom extends JPanel{

	private int text;
	private JButton push;
	private JLabel label;
	{
		text=0;
		push=new JButton("Push Me!");
		label=new JLabel();
		push.addActionListener(new ButtonListener());
		add(push);
		add(label);
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(300, 40));
	}
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
		text= new Random().nextInt(100) + 1;
		label.setText("Pushes: " + text);
	}
	}
}
