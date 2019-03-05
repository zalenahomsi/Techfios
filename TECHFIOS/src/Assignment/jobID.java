
package Assignment;//#1

public class jobID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add();
		}
	
	
	//Bonus:multiply all values in the table:
	
		public static void add() {
			
			int a=101;
			int b=102;
			int c=103;
			int d=104;
			
				System.out.println(a*b*c*d);
			
		//make integer double array with 2 rows,2 columns:
		int jobID[][]=new int [2][2];
		
		//row 1:
		jobID[0][0]=101;
		jobID[0][1]=102;
		
		//row 2:
		jobID[1][0]=103;
		jobID[1][1]=104;
		
		//use for loop to print all values:
		//for rows
		for (int x=0;x<jobID.length;x++) {
		
		//for columns:
		for (int y=0;y<jobID.length;y++) {
				
				System.out.println(jobID[x][y]);
				
			
				
				
				
		}
		}
		
		
			}

}
