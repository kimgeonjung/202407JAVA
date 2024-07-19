package project;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	JLabel title = new JLabel("Table 자료 출력");
	JLabel sell = new JLabel("Table이름 입력");
	
	JTextField tf = new JTextField(10);
	
	JTextArea ta = new JTextArea(22, 60);

	JButton deptbtn = new JButton("DEPT");
	JButton empbtn = new JButton("EMP");
	JButton selbtn = new JButton("실행");

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

		jp1.add(title);

		jp2.add(ta);
		jp2.add(deptbtn);
		deptbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				String sql = "select * from dept";
				String URL = "jdbc:mysql://192.168.56.1:3306/spring5fs";
				Connection con = null;
				Statement stmt = null;
				
				String field="deptno\tdname\tloc\n";
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection(URL, "spring5", "spring5");
					System.out.println("MySQL 접속 성공");
					
					stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
					while (rs.next()) {
						field += rs.getString("deptno")+"\t"
								+ rs.getString("dname")+"\t"
								+ rs.getString("loc")+"\n";
					}
					ta.setText(field);
					
				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
			}
		});
		jp2.add(empbtn);
		empbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				String sql = "select * from emp";
				String URL = "jdbc:mysql://192.168.56.1:3306/spring5fs";
				Connection con = null;
				Statement stmt = null;
				
				String field="empno\tename\tjob\tmgr\thiredate\tsal\tcomm\tdeptno\n";
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection(URL, "spring5", "spring5");
					System.out.println("MySQL 접속 성공");
					
					stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
					while (rs.next()) {
						field += rs.getString("empno")+"\t"
								+ rs.getString("ename")+"\t"
								+ rs.getString("job")+"\t"
								+ rs.getString("mgr")+"\t"
								+ rs.getString("hiredate")+"\t"
								+ rs.getString("sal")+"\t"
								+ rs.getString("comm")+"\t"
								+ rs.getString("deptno")+"\n";
					}
					ta.setText(field);
					
				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
				
			}
		});
		
		jp3.add(sell);
		jp3.add(tf);
		jp3.add(selbtn);
		selbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				
				String str = tf.getText();
				String URL = "jdbc:mysql://192.168.56.1:3306/spring5fs";
				Connection con = null;
				Statement stmt = null;
				
				String field1="empno\tename\tjob\tmgr\thiredate\tsal\tcomm\tdeptno\n";
				String field2="deptno\tdname\tloc\n";

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection(URL, "spring5", "spring5");
					System.out.println("MySQL 접속 성공");
					
					stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM " + str);
						if(str.equals("emp")) {
							while (rs.next()) {
								field1 += rs.getString("empno")+"\t"
									+ rs.getString("ename")+"\t"
									+ rs.getString("job")+"\t"
									+ rs.getString("mgr")+"\t"
									+ rs.getString("hiredate")+"\t"
									+ rs.getString("sal")+"\t"
									+ rs.getString("comm")+"\t"
									+ rs.getString("deptno")+"\n";
							}
						} else if(str.equals("dept")) {
							while (rs.next()) {
								field2 += rs.getString("deptno")+"\t"
										+ rs.getString("dname")+"\t"
										+ rs.getString("loc")+"\n";
							}
						}
						if(str.equals("emp"))ta.setText(field1);
						else if(str.equals("dept"))ta.setText(field2);
				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
			}
		});


		this.setBounds(1000, 200, 700, 550);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MyFrame();
	}

}
