
public class mathFunctions {
	
	static int size=200;//global variable
	static int body=700;//global variable
	
//main function
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	addition();	
	conditionalAddition(3000,8000);
	substraction(10,2);
	multiplication(1,2,8);
	division(10,5);
	System.out.println(size);
		}
	
	
	
	public static void addition() {
		
		int x=10;					//local variable
		int y=17;
		
		System.out.println(x+y+size);
	}
	
	public static void conditionalAddition(int x,int y) {
		
		System.out.println(x+y);
	}
	
	public static void adding(int x,int y) {
		
		int answer=x+y;
		
		System.out.println(answer);
	}
	
	public static void substraction(int m,int n) {
		
		System.out.println(m-n);
	}
	
public static void multiplication(int o,int p,int q) {
		
		int answer=o*p*q;
		
		System.out.println(answer);

}

public static void division(int a,int b) {
	
	int answer=a/b;
	
	System.out.println(answer);

}




}

