package ch11;

import java.util.Calendar;





public class CompanyMainTest1 {

	public static void main(String[] args) {
		
		//Company 객체를 생성해 보세요 5개
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		Company company3 = Company.getInstance();
		Company company4 = Company.getInstance();
		Company company5 = Company.getInstance();
		
		
		
		//화면에 주소값을 출력해보세요
		System.out.println(company1);
		
		
		Calendar c = Calendar.getInstance();
		//싱글턴 패턴, 

	}

}
