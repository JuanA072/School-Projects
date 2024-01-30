import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Arrays;

public class PushCounterPanelSorter extends JPanel{

	private JButton push;
	private JLabel label;
	private int[] intarry= new int[5];
	private JTextField text1= new JTextField(10);
	private JTextField text2= new JTextField(10);
	private JTextField text3= new JTextField(10);
	private JTextField text4= new JTextField(10);
	private JTextField text5= new JTextField(10);
	{
		push= new JButton("Sort!");
		label= new JLabel();
		push.addActionListener(new ButtonListener());
		add(text1);
		add(text2);
		add(text3);
		add(text4);
		add(text5);
		add(push);
		add(label);
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(300, 40));
	}
		private class ButtonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				intarry[0]= Integer.parseInt(text1.getText());
				intarry[1]= Integer.parseInt(text2.getText());
				intarry[2]= Integer.parseInt(text3.getText());
				intarry[3]= Integer.parseInt(text4.getText());
				intarry[4]= Integer.parseInt(text5.getText());
				Arrays.sort(intarry);
			label.setText(intarry[0]+ "," + intarry[1]+ "," + intarry[2] + "," + intarry[3] + "," + intarry[4]);
			
			}
	}
}
