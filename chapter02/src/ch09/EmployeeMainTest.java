package ch09;

public class EmployeeMainTest {

	public static void main(String[] args) {
		
		
		int temp =  Employee.getSerialNum(); //static �޼���
		System.out.println(temp);
		
		
		//Employee test1 = new Employee();
		//test1.getEmployeeId(); // <-- �Ϲ� �޼���
		
		
		
		
		
		
		Employee employee1 = new Employee();
		System.out.println(employee1.serialNum);		
		System.out.println(employee1.getEmployeeId());
	
		
		
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		Employee employee4 = new Employee();
		Employee employee5 = new Employee();
		
		System.out.println(employee5.getEmployeeId());
		
		System.out.println(employee5.serialNum);
		System.out.println(employee1.serialNum);
		System.out.println(employee2.serialNum);
		System.out.println(employee3.serialNum);
		System.out.println(employee4.serialNum);
		
		
		//static ����, ��� ����, ��������, --> �޸� ��ġ Ȯ��
		
		//1
		//employee1 ~ 5 : �ν��Ͻ� ������ �����ؼ� getSerialNum()
		//����
		

				
		//Ŭ���� �̸����� �����ؼ� getSerialNum()�޼��带 �̿�
		//����
		

		

	}//end of main

}//end of class
