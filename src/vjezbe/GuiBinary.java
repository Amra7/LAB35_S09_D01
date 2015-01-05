package vjezbe;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuiBinary {
	
	static JTextField num;
	static int numForGuess = (int)(1+Math.random() * 10000);
	static JTextArea area;

	public static void main(String[] args) {
		
		JFrame window = new JFrame("Pogodi broj");
		window.setSize(500,500);
				
		Draw panel = new Draw();
		panel.setSize(500,500);
		panel.setLayout(new FlowLayout());
		
		num = new JTextField(40);
		num.setSize(100, 30);
		num.getAccessibleContext();
		panel.add(num);
	
		ButtonHandler listener = new ButtonHandler();
		
		JButton b1= new JButton("Manje");
		panel.add(b1);
		b1.addKeyListener(listener);
    	JButton b2= new JButton("Tacno");
    	b1.addKeyListener(listener);
		panel.add(b2);
		JButton b3= new JButton("Vise");
		b1.addKeyListener(listener);
		panel.add(b3);
		
		area = new JTextArea(5,30);
		panel.add(area);
		
		window.setContentPane(panel);
		
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static class Draw extends JPanel {
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawString("Unesi jedan broj izmedju 1 i 10 000", 500, 100);
		}
		
	}
	
	public static class  ButtonHandler implements KeyListener, ActionListener {

		 int numGuess;
		
		@Override
		public void keyPressed(KeyEvent arg0) {
			binarySearchRecursive(numForGuess, num, 0, 10000);
			
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			binarySearchRecursive(numForGuess, num, 0, 10000);
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			binarySearchRecursive(numForGuess, num, 0, 10000);
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			numGuess = Integer.parseInt(num.getText());
			
		}
		
	}
	
	/**
	 * Binary search with recursion.
	 * @param nums - array of numbers.
	 * @param num - number that we enter.
	 * @param start - start of unsorted array.
	 * @param end - end of unsorted array.
	 * @return index of number that we are searching in array of nums.
	 */
	private static int binarySearchRecursive( int numForGuess, JTextField num, int start, int end){
		int numGuess = Integer.parseInt(num.getText());
		if( start >= end){
			return -1;
		}		
		int mid = (start + end)/2;
		
		if (numGuess == numForGuess){
			return mid;
		} else if (numGuess < numForGuess) {
			return binarySearchRecursive(numForGuess, num, start, mid);
		} else if( numGuess > numForGuess){
			return binarySearchRecursive(numForGuess, num, mid+1, end);
		}
		
		return -1;
	}

}
