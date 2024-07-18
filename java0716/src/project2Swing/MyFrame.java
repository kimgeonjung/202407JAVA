package project2Swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	JLabel idl = new JLabel("아이디");
	JTextField idt = new JTextField();
	JLabel ssnl = new JLabel("SSN");
	JTextField ssnt = new JTextField();
	JLabel tell = new JLabel("전화번호");
	JTextField telt = new JTextField();

	JButton loginBtn = new JButton("로그인");
	JButton signBtn = new JButton("회원가입");
	JButton depositBtn = new JButton("예금");
	JButton withdrawBtn = new JButton("출금");
	JButton balanceBtn = new JButton("잔고");

	JTextArea ta = new JTextArea();

	List<Member> list;
	Member member;
	
	public MyFrame() {

		try (FileInputStream fis = new FileInputStream("c:\\_temp\\members.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Member[] list2 = (Member[]) ois.readObject();
			list = new ArrayList<>(Arrays.asList(list2)); // 배열을 ArrayList로

			System.out.println("파일에서 객체를 가져왔습니다.");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		for (Member member : list) {
			System.out.println(member);
		}

		System.out.println("총 회원수: " + list.size());

		Member member = null; // 로그인 된 현재 사용자

		Container con = this.getContentPane();
		con.setLayout(null);

		// 아이디
		con.add(idl);
		idl.setLocation(20, 50);
		idl.setSize(100, 30);
		con.add(idt);
		idt.setLocation(80, 50);
		idt.setSize(100, 30);

		// ssn
		con.add(ssnl);
		ssnl.setLocation(210, 50);
		ssnl.setSize(100, 30);
		con.add(ssnt);
		ssnt.setLocation(270, 50);
		ssnt.setSize(100, 30);

		// 전화번호
		con.add(tell);
		tell.setLocation(400, 50);
		tell.setSize(100, 30);
		con.add(telt);
		telt.setLocation(460, 50);
		telt.setSize(200, 30);

		// textarea
		con.add(ta);
		ta.setLocation(20, 120);
		ta.setSize(640, 200);

		// 로그인
		con.add(loginBtn);
		loginBtn.setLocation(30, 350);
		loginBtn.setSize(100, 30);
		loginBtn.addActionListener(new MyListener());

		// 회원가입
		con.add(signBtn);
		signBtn.setLocation(130, 350);
		signBtn.setSize(100, 30);
		// 예금
		con.add(depositBtn);
		depositBtn.setLocation(350, 350);
		depositBtn.setSize(100, 30);
		// 출금
		con.add(withdrawBtn);
		withdrawBtn.setLocation(450, 350);
		withdrawBtn.setSize(100, 30);
		// 잔고
		con.add(balanceBtn);
		balanceBtn.setLocation(550, 350);
		balanceBtn.setSize(100, 30);

		this.setTitle("안녕 스윙");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(700, 300);
		this.setSize(700, 500);
		this.setVisible(true);
	}

	class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String name = idt.getText(); // name 변수의 값 입력
			String strPassword = ssnt.getText();// 패스워드입력

			for (Member member2 : list) {
				if (member2.getName().equals(name) && member2.getSsn().equals(strPassword)) {
					member = member2;
					System.out.println("로그인 성공");
					break;
				}
			}

			System.out.println(member);
		}

	}

	public static void main(String[] args) {
		new MyFrame();
	}
}
