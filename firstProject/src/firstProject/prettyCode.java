package firstProject;

public class prettyCode {

	public static void main(String[] args) {
		/*TODO Auto-generated method stub
		for(int i = 0; i <10; i++) {
			inside for loop
			System.out.println("hello");
			if(5>4) {
				System.out.println("bye");
			}
		}
		int temp = 5;
		while(temp < 5) {
			System.out.println("while condition is met");
		}
		do {
			System.out.println("Do while loop");
		}while(temp != 5);
		*/
		
		int temp = 9;
		if(temp == 5) {
			System.out.println("temp is 5");
		}
		else if(temp ==4) {
			System.out.println("temp is 4");
		}
		/*else {
			System.out.print("temp is niether 5 or 4");
		}*/
		String day = "Monday";
		String otherDay = "true";
		String one = "1";
		int otherOne = 1;
		String test = "true";
		Boolean check = Boolean.parseBoolean(test);
		int oneAsInt = Integer.parseInt(one);
		if(oneAsInt == otherOne) {
			System.out.println("they are equal");
		}
		
		if(day.equalsIgnoreCase(otherDay)) {
			System.out.println("The strings are the same");
		}
		/*
		 * Create a string variable and set it equal to 5 
		 * convert string to int
		 * convert string to boolean
		 * if the new int is > 3 print the variable is greater than 3
		 * else if the varibale is true print the variable is true
		 * else print the variable has failed all tests
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Switch statments
		 * if()
		 * else if
		 * else if
		 * else if
		 * else if
		 * else
		 * */
		int Day = 4;
		switch(Day) {
		case 1:
			System.out.print("Monday");
			break;
		case 2:
			System.out.print("Tuesday");
			break;
		case 3:
			System.out.print("Wednesday");
			break;
		case 4:
			System.out.print("Thursday");
			break;
		case 5:
			System.out.print("Friday");
			break;
		case 6:
			System.out.print("Saturday");
			break;
		case 7:
			System.out.print("Sunday");
			break;
			
		
		}
	}

}
