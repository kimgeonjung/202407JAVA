package project2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	JLabel idl = new JLabel("아이디");
	JLabel ssnl = new JLabel("SSN");
	JLabel tell = new JLabel("전화번호");
	JLabel moneyl = new JLabel("금액");

	JTextField idt = new JTextField(5);
	JTextField ssnt = new JTextField(5);
	JTextField telt = new JTextField(10);
	JTextField moneyt = new JTextField(5);

	JTextArea ta = new JTextArea(20, 60);

	JButton loginBtn = new JButton("로그인");
	JButton signBtn = new JButton("회원가입");
	JButton depositBtn = new JButton("예금");
	JButton withdrawBtn = new JButton("출금");
	JButton balanceBtn = new JButton("잔고");

	List<Member> list;
	Member member;

	MyFrame() {
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
		ta.setText("총 회원수: " + list.size());

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
		jp1.add(moneyl);
		jp1.add(moneyt);

		jp2.add(ta);

		jp3.add(loginBtn);
		loginBtn.addActionListener(new ActionListener() {
			// 로그인 기능
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = idt.getText(); // name 변수의 값 입력
				String strPassword = ssnt.getText();// 패스워드입력
				for (Member member2 : list) {
					if (member2.getName().equals(name) && member2.getSsn().equals(strPassword)) {
						member = member2;
						System.out.println("로그인 성공");
						ta.setText("로그인 성공\n" + member.toString());
						break;
					}
				}
				System.out.println(member);
			}
		});
		jp3.add(signBtn);
		signBtn.addActionListener(new ActionListener() {
			// 회원가입 기능
			@Override
			public void actionPerformed(ActionEvent e) {
				String name2 = idt.getText();
				String ssn = ssnt.getText();
				String tel = telt.getText();
				int bal = 0;
				list.add(new Member(name2, ssn, tel, bal));
				ta.setText("Member [name=" + name2 + ", ssn=" + ssn + ", phone=" + tel + ", balance=" +bal+"]");
			}
		});
		jp3.add(depositBtn);
		depositBtn.addActionListener(new ActionListener() {
			// 예금 기능
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		jp3.add(withdrawBtn);
		withdrawBtn.addActionListener(new ActionListener() {
			// 출금 기능
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		jp3.add(balanceBtn);
		balanceBtn.addActionListener(new ActionListener() {
			// 잔고 확인 기능
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});

		this.setBounds(1000, 200, 700, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addWindowListener(new JFrameWindowClosingEventHandler());
	}

	// 종료시 저장
	class JFrameWindowClosingEventHandler extends WindowAdapter {

		@Override
		public void windowClosing(WindowEvent w) {
			JFrame frame = (JFrame) w.getWindow();
			Member[] list2 = list.toArray(new Member[list.size()]); // ArrayList를 배열로
			try (FileOutputStream fos = new FileOutputStream("c:\\_temp\\members.dat");
					ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject(list2);
				System.out.println("객체를 파일에 저장했습니다.");

			} catch (IOException e) {
				e.printStackTrace();
			}
			frame.dispose();
			System.out.println("windowClosing()");
		}
	}

//	// 로그인 기능
//	class LoginListener implements ActionListener {
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			String name = idt.getText(); // name 변수의 값 입력
//			String strPassword = ssnt.getText();// 패스워드입력
//			for (Member member2 : list) {
//				if (member2.getName().equals(name) && member2.getSsn().equals(strPassword)) {
//					member = member2;
//					System.out.println("로그인 성공");
//					ta.setText("로그인 성공\n" + member.toString());
//					break;
//				}
//			}
//			System.out.println(member);
//		}
//	}

//	// 회원가입 기능
//	class signListener implements ActionListener {
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			String name2 = idt.getText();
//			String ssn = ssnt.getText();
//			String tel = telt.getText();
//			int bal = 0;
//			list.add(new Member(name2, ssn, tel, bal));
//			ta.setText("Member [name=" + name2 + ", ssn=" + ssn + ", phone=" + tel + ", balance=" +bal+"]");
//		}
//	}


	public static void main(String[] args) {
		new MyFrame();
	}
}
