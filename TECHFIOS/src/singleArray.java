
public class singleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//String array table
		String flight []=new String [5];
		
		flight[0]="dallas";
		flight[1]="NYC";
		flight[2]="chicago";
		flight[3]="virginia";
		flight[4]="utah";
		
		
		//condition using for loop with x representing the rows
		for (int x=0;x<flight.length;x++) {
			System.out.println(flight[x]);
			}
		
		//condition using while loop with x representing the rows
		//length is represents size of the table. here it should be not more than 5 rows
		int x=0;
		while(x<flight.length) {
			System.out.println(flight[x]);
			x=x+2;
		}
	}
	

}
