package ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionEx2 {

	public static void main(String[] args) {
		
		FileInputStream fis;
		
		try {
			fis = new FileInputStream("a.txt");
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}catch(Exception e) {
			System.out.println("에외 처리");
			return; //심지어 리턴문이 있어도 finally가 실행이된다.
		}finally {
			//try 문이 실행되면 바듯이 실행됨
			System.out.println("반드시 실행됩니다.");
		}
		
		
		System.out.println("비정상 종료가 되지 않았습니다.");

	}

}
