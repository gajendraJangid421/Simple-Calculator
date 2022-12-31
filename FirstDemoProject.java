import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;

public class FirstDemoProject {

	private JFrame frmCalculator;
	private JTextField tf_firstNum;
	private JTextField tf_secondNum;
	private JTextField tf_answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstDemoProject window = new FirstDemoProject();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FirstDemoProject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setFont(new Font("Algerian", Font.BOLD, 15));
		frmCalculator.setTitle("CALCULATOR");
		frmCalculator.setBounds(100, 100, 464, 553);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		tf_firstNum = new JTextField();
		tf_firstNum.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf_firstNum.setBounds(68, 89, 131, 41);
		frmCalculator.getContentPane().add(tf_firstNum);
		tf_firstNum.setColumns(10);
		
		tf_secondNum = new JTextField();
		tf_secondNum.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf_secondNum.setColumns(10);
		tf_secondNum.setBounds(249, 89, 131, 41);
		frmCalculator.getContentPane().add(tf_secondNum);
		
		JLabel lblNewLabel = new JLabel("First Number");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(83, 58, 100, 21);
		frmCalculator.getContentPane().add(lblNewLabel);
		
		JLabel lblSecondNumber = new JLabel("Second Number");
		lblSecondNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSecondNumber.setBounds(257, 58, 123, 21);
		frmCalculator.getContentPane().add(lblSecondNumber);
		
		JButton btnAddition = new JButton("Addition");
		btnAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ans = Integer.valueOf(tf_firstNum.getText()) + 
						Integer.valueOf(tf_secondNum.getText());
				tf_answer.setText("" + ans);
			}
		});
		btnAddition.setFont(new Font("Courier New", Font.PLAIN, 15));
		btnAddition.setBounds(83, 201, 105, 27);
		frmCalculator.getContentPane().add(btnAddition);
		
		JButton btnSubtract = new JButton("Subtract");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ans = Integer.valueOf(tf_firstNum.getText()) - 
						Integer.valueOf(tf_secondNum.getText());
				tf_answer.setText("" + ans);
			}
		});
		btnSubtract.setFont(new Font("Courier New", Font.PLAIN, 15));
		btnSubtract.setBounds(249, 201, 105, 27);
		frmCalculator.getContentPane().add(btnSubtract);
		
		JButton btnMultiplication = new JButton("Multiplication");
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ans = Integer.valueOf(tf_firstNum.getText()) * 
						Integer.valueOf(tf_secondNum.getText());
				tf_answer.setText("" + ans);
			}
		});
		btnMultiplication.setFont(new Font("Courier New", Font.PLAIN, 15));
		btnMultiplication.setBounds(48, 278, 163, 27);
		frmCalculator.getContentPane().add(btnMultiplication);
		
		JButton btnDivision = new JButton("Division");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.valueOf(tf_secondNum.getText())!=0) {
					int ans = Integer.valueOf(tf_firstNum.getText()) / 
							Integer.valueOf(tf_secondNum.getText());
					tf_answer.setText("" + ans);
				}
			}
		});
		btnDivision.setFont(new Font("Courier New", Font.PLAIN, 15));
		btnDivision.setBounds(249, 278, 105, 27);
		frmCalculator.getContentPane().add(btnDivision);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAnswer.setBounds(200, 355, 100, 21);
		frmCalculator.getContentPane().add(lblAnswer);
		
		tf_answer = new JTextField();
		tf_answer.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf_answer.setColumns(10);
		tf_answer.setBounds(160, 386, 140, 41);
		frmCalculator.getContentPane().add(tf_answer);
	}
}
