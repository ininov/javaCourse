import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;


public class Calculator {

	private JFrame frame;
	private JTextField num1;
	private JTextField num2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void calcPlus(){
		try {
			String firstNumberText = this.num1.getText();
			int firstNumber = Integer.parseInt(firstNumberText);
			
			String secondNumberText = this.num2.getText();
			int secondNumber = Integer.parseInt(secondNumberText);
			
			int result = firstNumber + secondNumber;
			
			JOptionPane.showMessageDialog(null, "Резултатът е: " + result);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Възникна грешка при изчислението!","Внимание", 0);
		}
		
	}
	
	private void calcMinus(){
		try {
			String firstNumberText = this.num1.getText();
			int firstNumber = Integer.parseInt(firstNumberText);
			
			String secondNumberText = this.num2.getText();
			int secondNumber = Integer.parseInt(secondNumberText);
			
			int result = firstNumber - secondNumber;
			
			JOptionPane.showMessageDialog(null, "Резултатът е: " + result);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Възникна грешка при изчислението!","Внимание", 0);
		}
		
	}
	
	private void calcDevide(){
		try {
			String firstNumberText = this.num1.getText();
			int firstNumber = Integer.parseInt(firstNumberText);
			
			String secondNumberText = this.num2.getText();
			int secondNumber = Integer.parseInt(secondNumberText);
			
			double result = (double)(firstNumber / secondNumber);
			
			JOptionPane.showMessageDialog(null, "Резултатът е: " + result);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Възникна грешка при изчислението!","Внимание", 0);
		}
		
	}
	
	private void calcMultiply(){
		try {
			String firstNumberText = this.num1.getText();
			int firstNumber = Integer.parseInt(firstNumberText);
			
			String secondNumberText = this.num2.getText();
			int secondNumber = Integer.parseInt(secondNumberText);
			
			int result = firstNumber*secondNumber;
			
			JOptionPane.showMessageDialog(null, "Резултатът е: " + result);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Възникна грешка при изчислението!","Внимание", 0);
		}
		
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNumber = new JLabel("Number 1");
		lblNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumber.setBounds(58, 56, 82, 28);
		frame.getContentPane().add(lblNumber);
		
		num1 = new JTextField();
		num1.setToolTipText("Enter a real number");
		num1.setBounds(58, 82, 86, 20);
		frame.getContentPane().add(num1);
		num1.setColumns(10);
		
		num2 = new JTextField();
		num2.setToolTipText("Enter a real number");
		num2.setColumns(10);
		num2.setBounds(239, 82, 86, 20);
		frame.getContentPane().add(num2);
		
		JLabel lblNumber_1 = new JLabel("Number 2");
		lblNumber_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumber_1.setBounds(239, 56, 82, 28);
		frame.getContentPane().add(lblNumber_1);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcPlus();
			}
		});
		plus.setBounds(112, 152, 89, 23);
		frame.getContentPane().add(plus);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcMinus();
			}
		});
		minus.setBounds(202, 152, 89, 23);
		frame.getContentPane().add(minus);
		
		JButton devide = new JButton("/");
		devide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcDevide();
			}
		});
		devide.setBounds(112, 174, 89, 23);
		frame.getContentPane().add(devide);
		
		JButton multiply = new JButton("*");
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcMultiply();
			}
		});
		multiply.setBounds(202, 174, 89, 23);
		frame.getContentPane().add(multiply);
		
		JLabel lblCalculator = new JLabel("CALCULATOR");
		lblCalculator.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblCalculator.setForeground(Color.BLUE);
		lblCalculator.setToolTipText("Created by IN");
		lblCalculator.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalculator.setBounds(94, 11, 219, 45);
		frame.getContentPane().add(lblCalculator);
	}
}
