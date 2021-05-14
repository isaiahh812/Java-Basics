import java.util.Scanner;


public class methods {

	
	public static void main(String [] args) {
		Scanner scrn = new Scanner(System.in);
		
		System.out.println("Hello what is your name?\n");
		String name = scrn.nextLine();
		System.out.println("\n"+name + " how old are you?");
		int age = scrn.nextInt();
		System.out.println("\nWow " + age + " is pretty old");
		
		
		//int age = scrn.nextInt();
		
		int sum = add(age,7);
		System.out.print(sum);
		
	}
	public static int add(int a, int b) {
		/*
		int sum;
		sum = a+b;
		return sum;
		*/
		return a+b;
	}
	
}

