package ch01;

public class StudentMainTest2 {

	public static void main(String[] args) {
		
		
		Student student1 = new Student();
		//1.�����ؼ� name, height, weight, grade
		//���� �༭ ȭ�鿡 ������ּ���.
		
		student1.height = 174.5;
		student1.weight = 68;
		student1.grade = 3;
		student1.name = "�̸��������� ���ϰ���̳�";
		
		
		System.out.println(student1.height);
		System.out.println(student1.weight);
		System.out.println(student1.grade);
		System.out.println(student1.name);
		
		
		
		System.out.println("=================");
		
		Student student2 = new Student();
		
		student2.height = 157.5;
		student2.weight = 48;
		student2.grade = 2;
		student2.name = "�г������������� ������̳�";
		
		
		System.out.println(student2.height);
		System.out.println(student2.weight);
		System.out.println(student2.grade);
		System.out.println(student2.name);
		

	}

}
