package pkg;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;

import pkg.CalAnswer;

public class Calculator_Sci_Ui extends JFrame {

	private JPanel		contentPane;
	private JTextField	PPrint;


//		--------------------- Launch the application --------------------
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator_Std_Ui frame = new Calculator_Std_Ui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


//		------------------------- Creating Frame ------------------------
	public Calculator_Sci_Ui() {
		setTitle("\uACF5\uD559 \uACC4\uC0B0\uAE30");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 599);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
//		------------------------- Change Button -------------------------
		JButton btnChange = new JButton("\uBCC0\uD658");
		btnChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				setVisible(false);
				new Calculator_Std_Ui().setVisible(true);
			}
		});
		btnChange.setBounds(135, 115, 215, 74);
		contentPane.add(btnChange);
		
		
//		-------------------------- Output Label -------------------------
		PPrint = new JTextField("0");
		PPrint.setHorizontalAlignment(SwingConstants.RIGHT);
		PPrint.setFont(new Font("����", Font.PLAIN, 22));
		PPrint.setBounds(24, 36, 655, 63);
		contentPane.add(PPrint);
		PPrint.setColumns(10);
		PPrint.setEditable(false);
		

		
//		------------------------- Number Button -------------------------
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("����", Font.BOLD, 18));
		btn0.setBounds(25, 461, 215, 74);
		contentPane.add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("����", Font.BOLD, 18));
		btn1.setBounds(25, 375, 105, 74);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("����", Font.BOLD, 18));
		btn2.setBounds(135, 375, 105, 74);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("����", Font.BOLD, 18));
		btn3.setBounds(245, 375, 105, 74);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("����", Font.BOLD, 18));
		btn4.setBounds(25, 289, 105, 74);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("����", Font.BOLD, 18));
		btn5.setBounds(135, 289, 105, 74);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("����", Font.BOLD, 18));
		btn6.setBounds(245, 289, 105, 74);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("����", Font.BOLD, 18));
		btn7.setBounds(25, 203, 105, 74);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("����", Font.BOLD, 18));
		btn8.setBounds(135, 203, 105, 74);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("����", Font.BOLD, 18));
		btn9.setBounds(245, 203, 105, 74);
		contentPane.add(btn9);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("����", Font.BOLD, 30));
		btnDot.setBounds(245, 461, 105, 74);
		contentPane.add(btnDot);

		btn0.addActionListener(new NumberActionListener(PPrint, "0"));
		btn1.addActionListener(new NumberActionListener(PPrint, "1"));
		btn2.addActionListener(new NumberActionListener(PPrint, "2"));
		btn3.addActionListener(new NumberActionListener(PPrint, "3"));
		btn4.addActionListener(new NumberActionListener(PPrint, "4"));
		btn5.addActionListener(new NumberActionListener(PPrint, "5"));
		btn6.addActionListener(new NumberActionListener(PPrint, "6"));
		btn7.addActionListener(new NumberActionListener(PPrint, "7"));
		btn8.addActionListener(new NumberActionListener(PPrint, "8"));
		btn9.addActionListener(new NumberActionListener(PPrint, "9"));
		btnDot.addActionListener(new NumberActionListener(PPrint, "."));
		
		
//		------------------------ Operator Button ------------------------
		JButton btnEqu = new JButton("=");
		btnEqu.setFont(new Font("����", Font.BOLD, 18));
		btnEqu.setBounds(355, 461, 105, 74);
		contentPane.add(btnEqu);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("����", Font.BOLD, 22));
		btnPlus.setBounds(355, 375, 105, 74);
		contentPane.add(btnPlus);
		
		JButton btnSub = new JButton("-");
		btnSub.setFont(new Font("����", Font.BOLD, 22));
		btnSub.setBounds(355, 289, 105, 74);
		contentPane.add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.setFont(new Font("����", Font.BOLD, 18));
		btnMul.setBounds(355, 203, 105, 74);
		contentPane.add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setFont(new Font("����", Font.BOLD, 18));
		btnDiv.setBounds(355, 115, 105, 74);
		contentPane.add(btnDiv);
		
		JButton btnLf = new JButton("(");
		btnLf.setFont(new Font("����", Font.BOLD, 18));
		btnLf.setBounds(465, 115, 105, 74);
		contentPane.add(btnLf);
		
		JButton btnRt = new JButton(")");
		btnRt.setFont(new Font("����", Font.BOLD, 18));
		btnRt.setBounds(575, 115, 105, 74);
		contentPane.add(btnRt);
		
		JButton btnRes = new JButton("C");
		btnRes.setFont(new Font("����", Font.BOLD, 18));
		btnRes.setBounds(25, 115, 105, 74);
		contentPane.add(btnRes);
		
		btnPlus.addActionListener(new OperatorActionListener(PPrint, "+"));
		btnSub.addActionListener(new OperatorActionListener(PPrint, "-"));
		btnMul.addActionListener(new OperatorActionListener(PPrint, "*"));
		btnDiv.addActionListener(new OperatorActionListener(PPrint, "/"));
		btnLf.addActionListener(new BracketActionListener(PPrint, "("));
		btnRt.addActionListener(new BracketActionListener(PPrint, ")"));
		btnRes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PPrint.setText("0");
			}
		});
		btnEqu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					PPrint.setText(CalAnswer.answerMain(PPrint.getText()).toString());
				} catch (Exception exeption) {
					PPrint.setText("Incorrect Expression");
				}
			}
		});
		
		
//		------------------ Mathematical Function Button ------------------
		JButton btnSin = new JButton("sin");
		btnSin.setFont(new Font("����", Font.BOLD, 18));
		btnSin.setBounds(465, 203, 105, 74);
		contentPane.add(btnSin);
		
		JButton btnCos = new JButton("cos");
		btnCos.setFont(new Font("����", Font.BOLD, 18));
		btnCos.setBounds(465, 289, 105, 74);
		contentPane.add(btnCos);
		
		JButton btnTan = new JButton("tan");
		btnTan.setFont(new Font("����", Font.BOLD, 18));
		btnTan.setBounds(574, 203, 105, 74);
		contentPane.add(btnTan);
		
		JButton btnPi = new JButton("\u03C0");
		btnPi.setFont(new Font("����", Font.BOLD, 18));
		btnPi.setBounds(574, 289, 105, 74);
		contentPane.add(btnPi);
		
		JButton btnE = new JButton("e");
		btnE.setFont(new Font("����", Font.BOLD, 18));
		btnE.setBounds(465, 375, 105, 74);
		contentPane.add(btnE);
		
		JButton btnRoot = new JButton("\u221A");
		btnRoot.setFont(new Font("����", Font.BOLD, 18));
		btnRoot.setBounds(574, 375, 105, 74);
		contentPane.add(btnRoot);
		
		JButton btnSq = new JButton("x\u00B2");
		btnSq.setFont(new Font("����", Font.BOLD, 18));
		btnSq.setBounds(465, 461, 105, 74);
		contentPane.add(btnSq);
		
		JButton btnLog = new JButton("log");
		btnLog.setFont(new Font("����", Font.BOLD, 18));
		btnLog.setBounds(575, 461, 105, 74);
		contentPane.add(btnLog);

		btnSin.addActionListener(new MathematicalFunctionActionListener(PPrint, "sin"));
		btnCos.addActionListener(new MathematicalFunctionActionListener(PPrint, "cos"));
		btnTan.addActionListener(new MathematicalFunctionActionListener(PPrint, "tan"));
		btnPi.addActionListener(new MathematicalFunctionActionListener(PPrint, "\u03C0"));
		btnE.addActionListener(new MathematicalFunctionActionListener(PPrint, "e"));
		btnRoot.addActionListener(new MathematicalFunctionActionListener(PPrint, "\u221A"));
		btnLog.addActionListener(new MathematicalFunctionActionListener(PPrint, "log"));
		btnSq.addActionListener(new powerActionListener(PPrint, "(^2)"));
		
	}
}


//------------------------ Number ActionListener ------------------------
class NumberActionListener implements ActionListener {
	
	private JTextField	textField;
	private String		input;
	
	public NumberActionListener(JTextField textField, String input) {
		this.textField = textField;
		this.input = input;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String curr = textField.getText();
		
		if ("0".equals(curr) && "0".equals(input)) {
			return;
		} else if ("0".equals(curr) && ".".equals(input)){
			textField.setText("0" + input);
		} else if ("0".equals(curr)) {
			textField.setText(input);
		} else {
			textField.setText(curr + input);
		}
	}
	
}


//----------------------- Operator ActionListener -----------------------
class OperatorActionListener implements ActionListener {
	
	private JTextField	textField;
	private String		input;
	
	public OperatorActionListener(JTextField textField, String input) {
		this.textField = textField;
		this.input = input;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String curr = textField.getText();
		char recent = textField.getText().charAt(textField.getText().length() - 1);
		
		if ("0".equals(curr) && ("*".equals(input) || "/".equals(input) || "+".equals(input))) {
			return;
		} else if ("0".equals(curr) && "-".equals(input)) {
			textField.setText(input);
			return;
		} else if ((!"-".equals(input) && (recent == '(' || recent == '*' 
				|| recent == '/' || recent == '+' || recent == '-')) 
				|| ("-".equals(input) && recent == '-') || recent == '.') {
			return;
		} else {
			textField.setText(curr + input);
		}
	}
	
}


//----------------------- Bracket ActionListener -----------------------
class BracketActionListener implements ActionListener {
	
	private JTextField	textField;
	private String		input;
	
	public BracketActionListener(JTextField textField, String input) {
		this.textField = textField;
		this.input = input;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String curr = textField.getText();
		int leftBra = 0;
		int rightBra = 0;
		
		for (int i = 0; i < curr.length(); i++) {
			leftBra = curr.charAt(i) == '(' ? ++leftBra : leftBra;
			rightBra = curr.charAt(i) == ')' ? ++rightBra : rightBra;
		}
		
		if ("(".equals(input) && "0".equals(curr)) {
			textField.setText(input);
		} else if (("(".equals(input)) || (")".equals(input) && leftBra > rightBra)) {
			textField.setText(curr + input);
		} else {
			return;
		}
		
	}
	
}


//-------------------- Mathematical Function ActionListener --------------------
class MathematicalFunctionActionListener implements ActionListener {
	
	private JTextField	textField;
	private String		input;
	
	public MathematicalFunctionActionListener(JTextField textField, String input) {
		this.textField = textField;
		this.input = input;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (("\u03C0".equals(input) || "e".equals(input)) && "0".equals(textField.getText())) {
			textField.setText(input);
		} else if (("\u03C0".equals(input) || "e".equals(input)) && !"0".equals(textField.getText())) {
			textField.setText(textField.getText() + input);
		} else if ("0".equals(textField.getText())) {
			textField.setText(input + "(");
		} else {
			textField.setText(textField.getText() + input + "(");
		}
	}
	
}


//---------------------------- Power ActionListener ----------------------------
class powerActionListener implements ActionListener {
	
	private JTextField	textField;
	private String		input;
	
	public powerActionListener(JTextField textField, String input) {
		this.textField = textField;
		this.input = input;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		char recent = textField.getText().charAt(textField.getText().length() - 1);
		
		if (!"0".equals(textField.getText()) && ((recent >= 48 && recent <= 57) || recent == 'e' || recent == '\u03C0')) {
			textField.setText(textField.getText() + input);
		} else {
			return;
		}
		
	}
	
}
