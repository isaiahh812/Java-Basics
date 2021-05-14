package firstProject;

public class main {
	
	public static void main(String args[]) {
		System.out.println("Hello World!");
		System.out.println("Hi this is Isaiah");
		String text = "jaslfas";
		int a = 3;
		int b = 4;
		boolean one = true; //true or false
		double d = 5.342;
		float e = 3460;
		long g = 76856;
		short h =4356;
		char letter = 'g';
		
		
		//Arrays are primative data structed
		
		int [] firstArray = new int [10];
		int [] secondArray = {89, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int [] thridArray;
		
		//System.out.print(secondArray[1]);
		/*For loop int i =0 set where the the for loop begins
		 * i<= secondArray.length-1 is the condition that has to be met in order for the loop to continue
		 * i++ is how i  itterates
		 * inside the for loop is the code that executes everytime the condition is met
		 */
		for(int i =0; i<=secondArray.length-1; i++) {
			System.out.println(secondArray[i]);
			
		}
		
		int [] grades = {89, 100, 60, 67, 78, 87, 100, 95, 98,100};
		int temp = 0;
		int avg;
		/*
		 * add up all the grades with a for loop
		 * divde the sum by the length of the array
		 * using a temp variable
		 */
		for(int i = 0; i<=grades.length-1; i++) {
			temp = temp + grades[i];
		}
		avg = temp/grades.length;
		System.out.println("Average: " + avg);
		
		
	}
	

}
