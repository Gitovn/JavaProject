package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedException {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, SQLException {

		sample1();
		sample2();
		sample3();

	}

	public static void sample1() throws FileNotFoundException {
		File f = new File("C:\\Users\\Dell\\eclipse-workspace\\OctJavaProject\\javasyllabus.docx");

		FileInputStream fis = new FileInputStream(f);
		System.out.println("After file not found exception");

	}

	public static void sample2() throws ClassNotFoundException {
		Class.forName("exceptions.CheckedException");
		System.out.println("After class not found exception");

	}

	public static void sample3() throws SQLException {
		DriverManager.getConnection("127.0.0.1:3306", "root", "KT123");
		System.out.println("After sql exception");
	}

	public static void sample4() throws Exception {

		File f = new File("C:\\Users\\Dell\\eclipse-workspace\\OctJavaProject\\javasyllabus.docx");
		FileInputStream fis = new FileInputStream(f);
		Class.forName("exceptions.CheckedException");
		DriverManager.getConnection("127.0.0.1:3306", "root", "KT123");
	}

	public static void sample5() {

		try {
			DriverManager.getConnection("127.0.0.1:3306", "root", "KT123");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
