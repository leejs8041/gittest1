package ch01;

public class StudentMainTest2 {

	public static void main(String[] args) {
		
		
		Student student1 = new Student();
		//1.접근해서 name, height, weight, grade
		//값을 줘서 화면에 출력해주세요.
		
		student1.height = 174.5;
		student1.weight = 68;
		student1.grade = 3;
		student1.name = "이름지을때가 제일고민이네";
		
		
		System.out.println(student1.height);
		System.out.println(student1.weight);
		System.out.println(student1.grade);
		System.out.println(student1.name);
		
		
		
		System.out.println("=================");
		
		Student student2 = new Student();
		
		student2.height = 157.5;
		student2.weight = 48;
		student2.grade = 2;
		student2.name = "닉네임을지을때가 젤고민이네";
		
		
		System.out.println(student2.height);
		System.out.println(student2.weight);
		System.out.println(student2.grade);
		System.out.println(student2.name);
		

	}

}
