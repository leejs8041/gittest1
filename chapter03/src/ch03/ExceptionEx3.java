package ch03;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

class MyException {

	String fileName;

	public MyException(String fileName) {
		this.fileName = fileName;

	}

	// throws ��
	public String readFile() throws IOException {
		FileInputStream fis = new FileInputStream(fileName);
		Properties prop = new Properties();
		prop.load(fis);
		String dbType = prop.getProperty("DBTYPE");
		return dbType;

	}

}

public class ExceptionEx3 {

	public static void main(String[] args) {

		// ��ü ����
		MyException exception = new MyException("a.txt");

		// ����ϴ� ���忡�� ����ó���� ���� �ذ��ؾ��Ѵ�.
		try {
			String temp = exception.readFile();
			System.out.println("Temp : " + temp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("������ �����ϴ�. ������ Ȯ�����ּ���");
		}
		
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(System.in);
		} catch (Exception e) {
			System.out.println("���� �߻�");
		}
		scanner.close();

	}

}
