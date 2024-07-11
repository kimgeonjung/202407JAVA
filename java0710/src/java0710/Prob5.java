package java0710;

public class Prob5 {

	public static void main(String[] args) {
		int i = 85;

		String score =  (i >= 90) ? "A" : 
						(i >= 80) ? "B" : 
						(i >= 70) ? "C" : 
						(i >= 60) ? "D" : "F";

		/*
		 * if 	   (i1 >= 90) { score = "A"; } 
		 * else if (i1 >= 80) { score = "B"; } 
		 * else if (i1 >= 70) { score = "C"; } 
		 * else if (i1 >= 60) { score = "D"; } 
		 * else 			  { score = "F"; }
		 * 
		 * switch (i / 10) { 
		 * case 10: case 9: score = "A"; break; 
		 * 			case 8: score = "B"; break; 
		 * 			case 7: score = "C"; break; 
		 * 			case 6: score = "D"; break; 
		 * 			default: score = "F"; }
		 */
		System.out.println(score);

	}

}
