package ch09;

public class Employee {

	public static int serialNum = 1000;

	private int employeeId;
	private String employeeName;
	private String department;
	

	public Employee() {
		serialNum++;
		employeeId = serialNum;

	}

	
	//get
	public int getEmployeeId() {
		return employeeId;
	}
	
	
	
	
	
	

	// static �޼��� Ȱ��
	public static int getSerialNum() {
		
		//����  : static �޼��� �ȿ����� ��� ������ ����� �� ����
		//why : ��ü�� ��������� ���� �����ؼ� ����� �� �ִ� static
		//�̱� �����Դϴ�
		//��ü�� �����Ǳ� ���� ����� �� �ִ� �޼���
		//department = "������";
		return serialNum;
	}

}
