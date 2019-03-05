
public class doubleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//first array symbol []represents row. secondary symbol[] represents column
		String colors [][]= new String[3][4];
		
		//first row:
		colors[0][0]="green";
		colors[0][1]="gray";
		colors[0][2]="yellow";
		colors[0][3]="red";
		
		//second row
		colors[1][0]="blue";
		colors[1][1]="black";
		colors[1][2]="brown";
		colors[1][3]="white";
		
		//third row
		colors[2][0]="pink";
		colors[2][1]="purple";
		colors[2][2]="lime";
		colors[2][3]="dark blue";
		
		System.out.println(colors[2][1]);
		
		//argument for rows and column
		int rows=colors.length;
		
		int column=colors[0].length;
		
		//for loop for the row
		for(int rownum=0;rownum<rows;rownum++) {
		
		//for loop for the column
		for(int col=0;col<column;col++) {

			System.out.println(colors[rownum][col]);
			
		}
		}
			
		
		
		
		
		
		
		
		
		
	}

}
