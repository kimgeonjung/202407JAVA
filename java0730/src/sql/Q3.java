package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.OptionalDouble;

public class Q3 {
	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		String sql = "select * from score";
		ArrayList<Score> score = new ArrayList<>();
		try (Connection conn = DriverManager.getConnection(URL, "root", "mysql");
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			while (rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int kor = rs.getInt("kor");
				int eng = rs.getInt("eng");
				int math = rs.getInt("math");
				score.add(new Score(num, name, kor, eng, math));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		score.stream().forEach(System.out::println);

		int korSum = score.stream().mapToInt(s -> s.getKor()).sum();
		OptionalDouble korAvg = score.stream().mapToInt(s -> s.getKor()).average();
		System.out.println("국어 총점: " + korSum);
		korAvg.ifPresent(avg -> System.out.println("국어 평균: " + avg));

		int engSum = score.stream().mapToInt(s -> s.getEng()).sum();
		OptionalDouble engAvg = score.stream().mapToInt(s -> s.getEng()).average();
		System.out.println("영어 총점: " + engSum);
		engAvg.ifPresent(avg -> System.out.println("영어 평균: " + avg));

		int mathSum = score.stream().mapToInt(s -> s.getMath()).sum();
		OptionalDouble mathAvg = score.stream().mapToInt(s -> s.getMath()).average();
		System.out.println("수학 총점: " + mathSum);
		mathAvg.ifPresent(avg -> System.out.println("수학 평균: " + avg));

		int totSum = score.stream().mapToInt(s -> s.getSum()).sum();
		OptionalDouble totAvg = score.stream().mapToDouble(s -> s.getAvg()).average();
		System.out.println("전체 총점: " + totSum);
		totAvg.ifPresent(avg -> System.out.println("전체 평균: " + avg));
	}
}