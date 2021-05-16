
public class Main {

	public static void main(String[] args) {

		StudentManager studentManager = new StudentManager();
		studentManager.email="deneme@deneme.com";
		studentManager.password="*********";
		studentManager.studentNum="1";
		studentManager.name="Jr.Coder";
		studentManager.lastName="Biowing";
		studentManager.grade="A";
		studentManager.status="Offline";
		studentManager.statu(studentManager.status);
		 
		InstructorManager instructorManager = new InstructorManager();
		System.out.println( "-------------------------");
		instructorManager.email="ins@ins.com";
		instructorManager.password="*********";
		instructorManager.name="Baris";
		instructorManager.lastName="Aydın";
		instructorManager.status="Online";
		instructorManager.instructorNote="Hello World...";
		instructorManager.statu(studentManager.status);
		
	
		
	}

}
