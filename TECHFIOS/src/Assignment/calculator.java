package Assignment;//#2


	

public class calculator {
	
	//enter global variables:
		static String ans="answer= ";
	//main function
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	
//enter any numbers in operation
		addminus(-1,-1,23);
		addmulti(100,50,9);
		muldiv(76,67,40,2);
		subdiv(90,12,4);
		
	}

	//math operation 1:add and minus
	public static void addminus(int num1,int num2,int num3) {
		
				
		System.out.println(ans);
		System.out.println(num1+num2-num3);
		
		
	}
	
	//mathematical operations 2:add and multiply
		public static void addmulti(int num1,int num2,int num3) {
			
			System.out.println(ans);
			System.out.println(num1+num2*num3);
		}
		
		//math operation 3:multiply and divide
		public static void muldiv(int num1,int num2,int num3,int num4) {
			
			System.out.println(ans);
			System.out.println(num1*num2*num3/num4);
		}
		
		//math operation 4:sub and div
		public static void subdiv(int num1,int num2,int num3) {
			
			System.out.println(ans);
			System.out.println(num1-num2/num3);
		}
}
