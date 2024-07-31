package java0731;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

public class Ex2 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// HashMap의 과거 버전인 Hashtable을 확장한 Properties 클래스
		Properties properties = new Properties(); 
		String path = Ex2.class.getResource("database.properties").getPath(); // p506
		path = URLDecoder.decode(path, "utf-8");
		System.out.println(path);
		properties.load(new FileReader(path));
		String driver = properties.getProperty("driver");
		System.out.println("드라이버 : " + driver);
		String username = properties.getProperty("username");
		System.out.println("username : " + username);
	}
}