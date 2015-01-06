package vjezbe;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiBinary implements ActionListener{
	
	static JTextField num= new JTextField(30);
	static JButton b1= new JButton("Less");
	static JButton b2= new JButton("Correct");
	static JButton b3= new JButton("More");
	
	static int end = 10000;
	static int start = 0;
	static int mid = (start+end)/2;
	static String str;
	static int counter =0;
	

	public static void main(String[] args) {
		
		JFrame window = new JFrame("Pogodi broj");
		window.setSize(400,300);
				
		Draw panel = new Draw();
		panel.setSize(400,300);
		panel.setLayout(new FlowLayout());
		
		mid = (start+end)/2;
		str= Integer.toString(mid);
		num.setText(str);
		panel.add(num);	
		
		panel.add(b1);
		b1.addActionListener(new ActionListener (){

			@Override
			public void actionPerformed(ActionEvent e) {
				counter++;
				end = mid -1;
				mid = (start + end)/2;
				str = Integer.toString(mid);
				num.setText(str);
				
			}
			
		});
		panel.add(b2);
		b2.addActionListener(new ActionListener (){

			@Override
			public void actionPerformed(ActionEvent e) {
				return;
			}
			
		});
		panel.add(b3);
		b3.addActionListener(new ActionListener (){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				counter++;
				start = mid+1;
				mid = (start + end)/2;
				str = Integer.toString(mid);
				num.setText(str);
				System.out.println("Start: " + start);
				System.out.println("End: " + end);
				System.out.println("Mid: " + mid);
				System.out.println("Str: " + str);
			}
			
		});
		
		window.setContentPane(panel);
		
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static class Draw extends JPanel {
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawString("Imagine number between 1 and 10.000",90, 100);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	


}
