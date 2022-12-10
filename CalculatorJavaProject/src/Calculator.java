import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	JFrame jf;
	JLabel display;
	JButton sevenButton,eightButton,nineButton,
	fourButton,fiveButton,sixButton,oneButton,twoButton,
	threeButton,dotButton,zeroButton,equalButton,divButton,
	mulButton,subButton,addButton,clearButton;
	boolean isAddClicked=false;
	boolean isSubClicked=false;
	boolean isMulClicked=false;
	boolean isDivClicked=false;
	float firstNumber = 0,secondNumber=0;
	int flag=0;
	String result= new String();
	public Calculator() {
		jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(580,600);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocation(300, 30);
		
		display = new JLabel();
		display.setBounds(20, 20, 480, 50);
		display.setBackground(Color.gray);
		display.setOpaque(true);
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setForeground(Color.white);
		jf.add(display);
		
		sevenButton =new JButton("7");
		sevenButton.setBounds(30, 120, 70, 70);
		sevenButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(sevenButton);
		sevenButton.addActionListener(this);
		
		eightButton=new JButton("8");
		eightButton.setBounds(130, 120, 70,70);
		eightButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(eightButton);
		eightButton.addActionListener(this);

		nineButton = new JButton("9");
		nineButton.setBounds(230, 120, 70,70);
		nineButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(nineButton);
		nineButton.addActionListener(this);
		
		fourButton =new JButton("4");
		fourButton.setBounds(30, 220, 70,70);
		fourButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(fourButton);
		fourButton.addActionListener(this);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(130, 220, 70,70);
		fiveButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(fiveButton);
		fiveButton.addActionListener(this);
		
		sixButton = new JButton("6");
		sixButton.setBounds(230, 220, 70,70);
		sixButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(sixButton);
		sixButton.addActionListener(this);
		
		
		oneButton =new JButton("1");
		oneButton.setBounds(30, 320, 70,70);
		oneButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(oneButton);
		oneButton.addActionListener(this);
		
		twoButton=new JButton("2");
		twoButton.setBounds(130, 320, 70,70);
		twoButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(twoButton);
		twoButton.addActionListener(this);
		
		threeButton = new JButton("3");
		threeButton.setBounds(230, 320, 70,70);
		threeButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(threeButton);
		threeButton.addActionListener(this);
		
		dotButton =new JButton(".");
		dotButton.setBounds(30, 420, 70,70);
		dotButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(dotButton);
		dotButton.addActionListener(this);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(130, 420, 70,70);
		zeroButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(zeroButton);
		zeroButton.addActionListener(this);
		
		equalButton = new JButton("=");
		equalButton.setBounds(230, 420, 70,70);
		equalButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(equalButton);
		equalButton.addActionListener(this);
		
		
		
		
		
		divButton = new JButton("/");
		divButton.setBounds(330, 120, 70,70);
		divButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(divButton);
		divButton.addActionListener(this);
		
		mulButton = new JButton("X");
		mulButton.setBounds(330, 220, 70,70);
		mulButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(mulButton);
		mulButton.addActionListener(this);
		
		subButton = new JButton("-");
		subButton.setBounds(330, 320, 70,70);
		subButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(subButton);
		subButton.addActionListener(this);
		
		addButton = new JButton("+");
		addButton.setBounds(330, 420, 70,70);
		addButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(addButton);
		addButton.addActionListener(this);
		
		clearButton = new JButton("C");
		clearButton.setBounds(430, 120, 70,70);
		clearButton.setFont(new Font ("Arial", Font.PLAIN, 40));
		jf.add(clearButton);
		clearButton.addActionListener(this);
		
		
	}
	public static void main(String[] args) {
		new Calculator();	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		if(e.getSource()==sevenButton) {
			display.setText(display.getText()+"7");
		}else if (e.getSource()==eightButton) {
			display.setText(display.getText()+"8");
		}else if (e.getSource()==nineButton) {
			display.setText(display.getText()+"9");
		}else if (e.getSource()==fourButton) {
			display.setText(display.getText()+"4");
		}else if (e.getSource()==fiveButton) {
			display.setText(display.getText()+"5");
		}else if (e.getSource()==sixButton) {
			display.setText(display.getText()+"6");
		}else if (e.getSource()==oneButton) {
			display.setText(display.getText()+"1");
		}else if (e.getSource()==twoButton) {
			display.setText(display.getText()+"2");
		}else if (e.getSource()==threeButton) {
			display.setText(display.getText()+"3");
		}else if (e.getSource()==dotButton) {
			display.setText(display.getText()+".");
		}else if (e.getSource()==zeroButton) {
			display.setText(display.getText()+"0");
		}else if (e.getSource()==clearButton) {
			display.setText("");
			firstNumber=0;secondNumber=0;
			flag=0;
			
		}
		else if (e.getSource()==equalButton) {
			if(isAddClicked) {
			secondNumber=Float.valueOf(display.getText());
			secondNumber=secondNumber+firstNumber;
			result=Float.toString(secondNumber);
			display.setText(result);
			isAddClicked=false;
			}
			else if(isSubClicked) {
				secondNumber=Float.valueOf(display.getText());
				secondNumber=firstNumber-secondNumber;
				result=Float.toString(secondNumber);
				display.setText(result);
				isSubClicked=false;
			}
			else if(isMulClicked){
				secondNumber=Float.valueOf(display.getText());
				secondNumber=firstNumber*secondNumber;
				result=Float.toString(secondNumber);
				display.setText(result);
				isMulClicked=false;
			}
			else if (isDivClicked) {
				
				secondNumber=Float.valueOf(display.getText());
				
				secondNumber=firstNumber/secondNumber;
				result=Float.toString(secondNumber);
				display.setText(result);
				
				
				isDivClicked=false;
			}
		}else if (e.getSource()==divButton) {
			if(flag==0) {
				firstNumber=Float.valueOf(display.getText());
				flag=1;
				}
				else {
					firstNumber=firstNumber/Float.valueOf(display.getText());
				}
			display.setText("");
			isDivClicked=true;
		}else if (e.getSource()==mulButton) {
			if(flag==0) {
				firstNumber=Float.valueOf(display.getText());
				flag=1;
				}
				else {
					firstNumber=firstNumber*Float.valueOf(display.getText());
				}
			display.setText("");
			isMulClicked=true;
		}else if (e.getSource()==subButton) {
			if(flag==0) {
			firstNumber=Float.valueOf(display.getText());
			flag=1;
			}
			else {
				firstNumber=firstNumber-Float.valueOf(display.getText());
			}
			display.setText("");
			isSubClicked=true;
		}else if (e.getSource()==addButton) {
//			try {
//				if (display.getText().equals(""));
//			}
//			catch (Exception emptyString){
//				firstNumber=0;
//			}
			isAddClicked=true;
			firstNumber=firstNumber+Float.valueOf(display.getText());
			display.setText("");
			
			
		}
		
	}
}
