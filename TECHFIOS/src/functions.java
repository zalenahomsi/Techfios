//main function
public class functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	printname();
	printage();
	salary(10000);
	Dream(10000,30,5.2,"zalena");
		
	}
//printname function	
		public static void printname() {
			
			System.out.println("My name is zalena");
		
	}
		
	//printage function
	public static void printage() {
		
		int age=8;
		
		System.out.println(age);
	}

	//printage salary
	public static void salary(int salary) {
		
		System.out.println(salary);
	}
	
	//printage Dream
	public static void Dream(int salary,int age,double height,String name) {
		
		System.out.println(name+" "+height+" "+age+" "+salary);
	}
}
