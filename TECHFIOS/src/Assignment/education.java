package Assignment;//#4

public class education {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//scenario:education level based on someone's age from children to adult.
		
	
		
	//declares variables
		int age=18;
		String edu_level;
		
		//break and switch method
		switch(age) {
		case 5:
		case 6: 
		case 7:
		case 8:
		case 9:
		case 10:
		edu_level="kindergarden";
		break;
		case 11:
		case 12:
		case 13:
		edu_level="middle school";
		break;
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		edu_level="high school";
		break;
		case 19:
		edu_level="college";
		break;
		default:
		edu_level="invalid data";
		break;
	
		}
		System.out.print(edu_level);
		
		
	}

}
