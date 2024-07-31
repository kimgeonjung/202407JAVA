package sql;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Score {
	private int num;
	private String name;
	private int kor;
	private int eng;
	private int math;

	public int getSum() {
		return kor + eng + math;
	}
	public double getAvg() {
		return getSum() / 3.0;
	}
}