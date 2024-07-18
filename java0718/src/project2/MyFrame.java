package project2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	JLabel idl = new JLabel("아이디");
	JLabel ssnl = new JLabel("SSN");
	JLabel tell = new JLabel("전화번호");
	
	JTextField idt = new JTextField(5);
	JTextField ssnt = new JTextField(5);
	JTextField telt = new JTextField(10);
	
	JTextArea ta = new JTextArea(20, 60);

	JButton loginBtn = new JButton("로그인");
	JButton signBtn = new JButton("회원가입");
	JButton depositBtn = new JButton("예금");
	JButton withdrawBtn = new JButton("출금");
	JButton balanceBtn = new JButton("잔고");
	

	MyFrame() {
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		
		JPanel jp1 = new JPanel();
		con.add(jp1, BorderLayout.NORTH);
		jp1.setLayout(new FlowLayout());

		JPanel jp2 = new JPanel();
		con.add(jp2, BorderLayout.CENTER);
		jp2.setLayout(new FlowLayout());

		JPanel jp3 = new JPanel();
		con.add(jp3, BorderLayout.SOUTH);
		jp3.setLayout(new FlowLayout());
		
		jp1.add(idl);
		jp1.add(idt);
		jp1.add(ssnl);
		jp1.add(ssnt);
		jp1.add(tell);
		jp1.add(telt);
		
		jp2.add(ta);
		
		
		jp3.add(loginBtn);
		jp3.add(signBtn);
		jp3.add(depositBtn);
		jp3.add(withdrawBtn);
		jp3.add(balanceBtn);
		
		this.setBounds(1000, 200, 700, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyFrame();
		
	}
}
