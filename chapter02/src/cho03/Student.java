package cho03;

//Ŭ������ �����ϴ� ����
public class Student {
	
	public int studentID;
	public String address;
	public String studentName;
	
	
	//�޼��� (��� ������ �̿��ؼ� ��ü�� ����� ������)
	public void showStudentInfo()
	{
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName()
	{
		
		return studentName;
	
	}
	
	
	

}
