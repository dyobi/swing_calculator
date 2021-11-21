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
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class Calculator_Std_Ui extends JFrame {
	private JPanel contentPane;
	private JTextField Print;
	private String msg; // ȭ�� ��¿�(��ü �Է°�)
	private String input; // �ڷᱸ��add��
	private double sum; // ����� ����
	private ArrayList <Double> num = new ArrayList <Double> (); // �ڷᱸ��(����)
	private ArrayList <String> op = new ArrayList <String> (); // �ڷᱸ��(������)

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

	public void Init(String msg, String input, double sum, ArrayList <Double> num, ArrayList <String> op) { // �Ӽ� �ʱ�ȭ��(�ߺ� �ڵ��)
		this.msg = "";
		this.input = "";
		this.sum = 0;
		this.num.clear();
		this.op.clear();
	}
	
	public void IO(String msg, String input, JTextField Print, JButton btn) { // ���콺 Ŭ�� �̺�Ʈ �ڵ鷯 InputOutput��(�ߺ� �ڵ��)
		

		if ("0".equals(Print.getText()) && "0".equals(btn.getText())) {
			return;
		} else if ("0".equals(Print.getText()) && ".".equals(btn.getText())) {
			Print.setText(Print.getText() + btn.getText());
		} else if ("0".equals(Print.getText()) && !".".equals(btn.getText())) {
			Print.setText(btn.getText());
		} else {
			Print.setText(Print.getText() + btn.getText());
		}
		
		
		this.msg += btn.getText();
		this.input += btn.getText();
//		this.Print.setText(this.msg);
	}

	public Calculator_Std_Ui() {
		Init(msg, input, sum, num, op);
		
		setTitle("\uD45C\uC900 \uACC4\uC0B0\uAE30");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 590);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnChange = new JButton("\uBCC0\uD658");
		btnChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				setVisible(false);
				new Calculator_Sci_Ui().setVisible(true);
			}
		});
		btnChange.setBounds(115, 117, 215, 74);
		contentPane.add(btnChange);
		
		Print = new JTextField("0");
		Print.setHorizontalAlignment(SwingConstants.LEFT);
		Print.setBounds(5, 37, 439, 63);
		contentPane.add(Print);
		Print.setColumns(10);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IO(msg, input, Print, btn0);
			}
		});
		btn0.setFont(new Font("����", Font.BOLD, 18));
		btn0.setBounds(5, 461, 215, 74);
		contentPane.add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IO(msg, input, Print, btn1);
			}
		});
		btn1.setFont(new Font("����", Font.BOLD, 18));
		btn1.setBounds(5, 375, 105, 74);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IO(msg, input, Print, btn2);
			}
		});
		btn2.setFont(new Font("����", Font.BOLD, 18));
		btn2.setBounds(115, 375, 105, 74);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IO(msg, input, Print, btn3);
			}
		});
		btn3.setFont(new Font("����", Font.BOLD, 18));
		btn3.setBounds(225, 375, 105, 74);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IO(msg, input, Print, btn4);
			}
		});
		btn4.setFont(new Font("����", Font.BOLD, 18));
		btn4.setBounds(5, 289, 105, 74);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IO(msg, input, Print, btn5);
			}
		});
		btn5.setFont(new Font("����", Font.BOLD, 18));
		btn5.setBounds(115, 289, 105, 74);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IO(msg, input, Print, btn6);
			}
		});
		btn6.setFont(new Font("����", Font.BOLD, 18));
		btn6.setBounds(225, 289, 105, 74);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IO(msg, input, Print, btn7);
			}
		});
		btn7.setFont(new Font("����", Font.BOLD, 18));
		btn7.setBounds(5, 203, 105, 74);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IO(msg, input, Print, btn8);
			}
		});
		btn8.setFont(new Font("����", Font.BOLD, 18));
		btn8.setBounds(115, 203, 105, 74);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IO(msg, input, Print, btn9);
			}
		});
		btn9.setFont(new Font("����", Font.BOLD, 18));
		btn9.setBounds(225, 203, 105, 74);
		contentPane.add(btn9);
		
		JButton btnEqu = new JButton("=");
		btnEqu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = Print.getText();
				char c = s.charAt(s.length() - 1);
				if (c != '+' && c != '-' &&c != 'x' && c != '/' && c != '.') {
					num.add(Double.parseDouble(input));
					s += btnEqu.getText();
					Print.setText(s);
					sum = num.get(0);
					num.remove(0);
					for (int i = 0; i < num.size(); i++) {
							switch(op.get(i)) {
								case "+":
									sum += num.get(i);
									Print.setText("" + sum);
									break;
								case "-":
									sum -= num.get(i);
									Print.setText("" + sum);
									break;
								case "x":
									sum *= num.get(i);
									Print.setText("" + sum);
									break;
								case "/":
									if (num.get(i) == 0) {
										Print.setText("0���� ���� �� �����ϴ�");
										Init(msg, input, sum, num, op);
									}
									else {
										sum /= num.get(i);
										Print.setText("" + sum);
									}
									break;
							}
					}
				}
				Init(msg, input, sum, num, op);
			}
		});
		btnEqu.setFont(new Font("����", Font.BOLD, 18));
		btnEqu.setBounds(335, 461, 105, 74);
		contentPane.add(btnEqu);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				System.out.println(Print.getText());
				if ("0".equals(Print.getText())) {
					return;
				} else if (msg.charAt(msg.length()-1) != '+' && msg.charAt(msg.length()-1) != '-' && msg.charAt(msg.length()-1) != 'x' && msg.charAt(msg.length()-1) != '/' && msg.charAt(msg.length()-1) != '.') {
					num.add(Double.parseDouble(Print.getText()));
					IO(msg, input, Print, btnPlus);
					input = "";
					op.add(btnPlus.getText());
				}
			}
		});
		btnPlus.setFont(new Font("����", Font.BOLD, 22));
		btnPlus.setBounds(335, 375, 105, 74);
		contentPane.add(btnPlus);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = Print.getText();
				char c = s.charAt(s.length() - 1);
				if (c != '+' && c != '-' && c != 'x' && c != '/' && c != '.') {
					System.out.println(num);
					if (!"0".equals(s)) {
						num.add(Double.parseDouble(Print.getText()));
						IO(msg, input, Print, btnSub);
						input = "";
						op.add(btnSub.getText());
					} else {
						Print.setText("-");
					}
				}
			}
		});
		btnSub.setFont(new Font("����", Font.BOLD, 22));
		btnSub.setBounds(335, 289, 105, 74);
		contentPane.add(btnSub);
		
		JButton btnMul = new JButton("x");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ("0".equals(Print.getText())) {
					return;
				} else if (msg.charAt(msg.length()-1) != '+' && msg.charAt(msg.length()-1) != '-' && msg.charAt(msg.length()-1) != 'x' && msg.charAt(msg.length()-1) != '/' && msg.charAt(msg.length()-1) != '.') {
					num.add(Double.parseDouble(Print.getText()));
					IO(msg, input, Print, btnMul);
					input = "";
					op.add(btnMul.getText());
				}
			}
		});
		btnMul.setFont(new Font("����", Font.BOLD, 18));
		btnMul.setBounds(335, 203, 105, 74);
		contentPane.add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ("0".equals(Print.getText())) {
					return;
				} else if (msg.charAt(msg.length()-1) != '+' && msg.charAt(msg.length()-1) != '-' && msg.charAt(msg.length()-1) != 'x' && msg.charAt(msg.length()-1) != '/' && msg.charAt(msg.length()-1) != '.') {
					num.add(Double.parseDouble(Print.getText()));
					IO(msg, input, Print, btnDiv);
					input = "";
					op.add(btnDiv.getText());
				}
			}
		});
		btnDiv.setFont(new Font("����", Font.BOLD, 18));
		btnDiv.setBounds(335, 117, 105, 74);
		contentPane.add(btnDiv);
		
		JButton btnRes = new JButton("C");
		btnRes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Print.setText("0");
				Init(msg, input, sum, num, op);
			}
		});
		btnRes.setFont(new Font("����", Font.BOLD, 18));
		btnRes.setBounds(5, 117, 105, 74);
		contentPane.add(btnRes);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = Print.getText();
				if (s.length() > 0 && s.charAt(s.length() - 1) != '+' && s.charAt(s.length() - 1) != '-' && s.charAt(s.length() - 1) != 'x' && s.charAt(s.length() - 1) != '/' && s.charAt(s.length() - 1) != '.' 
						&& (s.charAt(s.length() - 1) >= 48 && s.charAt(s.length() - 1) <= 57)) {
					IO(msg, input, Print, btnDot);
				}
			}
		});
		btnDot.setFont(new Font("����", Font.BOLD, 30));
		btnDot.setBounds(225, 461, 105, 74);
		contentPane.add(btnDot);
	}
}
