import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {
	public Calculator() {
		JFrame jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocation(300, 30);
		
		JLabel display = new JLabel("Hello");
		display.setBounds(20, 20, 480, 50);
		display.setBackground(Color.gray);
		display.setOpaque(true);
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setForeground(Color.white);
		jf.add(display);
		
		JButton sevenButton =new JButton("7");
		sevenButton.setBounds(30, 120, 80, 80);
		sevenButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(sevenButton);
		JButton eightButton=new JButton("8");
		eightButton.setBounds(150, 120, 80, 80);
		eightButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(eightButton);
		JButton nineButton = new JButton("9");
		nineButton.setBounds(270, 120, 80, 80);
		nineButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(nineButton);
		
		
		JButton fourButton =new JButton("4");
		fourButton.setBounds(30, 220, 80, 80);
		fourButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(fourButton);
		JButton fiveButton=new JButton("5");
		fiveButton.setBounds(150, 220, 80, 80);
		fiveButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(fiveButton);
		JButton sixButton = new JButton("6");
		sixButton.setBounds(270, 220, 80, 80);
		sixButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(sixButton);
		
		
		JButton oneButton =new JButton("1");
		oneButton.setBounds(30, 320, 80, 80);
		oneButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(oneButton);
		JButton twoButton=new JButton("2");
		twoButton.setBounds(150, 320, 80, 80);
		twoButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(twoButton);
		JButton threeButton = new JButton("3");
		threeButton.setBounds(270, 320, 80, 80);
		threeButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(threeButton);
		
		JButton dotButton =new JButton(".");
		dotButton.setBounds(30, 420, 80, 80);
		dotButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(dotButton);
		JButton zeroButton=new JButton("0");
		zeroButton.setBounds(150, 420, 80, 80);
		zeroButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(zeroButton);
		JButton equalButton = new JButton("=");
		equalButton.setBounds(270, 420, 80, 80);
		equalButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(equalButton);
		
		
		
		
		
		JButton divButton = new JButton("/");
		divButton.setBounds(390, 120, 80, 80);
		divButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(divButton);
		JButton mulButton = new JButton("X");
		mulButton.setBounds(390, 220, 80, 80);
		mulButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(mulButton);
		JButton subButton = new JButton("-");
		subButton.setBounds(390, 320, 80, 80);
		subButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(subButton);
		JButton addButton = new JButton("+");
		addButton.setBounds(390, 420, 80, 80);
		addButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(addButton);
		
		
	}
	public static void main(String[] args) {
		new Calculator();	}
}
