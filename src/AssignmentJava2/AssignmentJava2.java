package AssignmentJava2;
import java.util.Scanner;
import java.util.Random;

public class AssignmentJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your name: ");     // type a word and hit enter
		String nameString = scanner.next();
		System.out.println("Hello " + nameString);
		Scanner s2 = new Scanner(System.in);
		AsciiChars ac = new AsciiChars();
		ac.printNumbers(nameString);
		ac.printLowerCase(nameString);
		ac.printUpperCase(nameString);
		ac.printAgeInteger(nameString);
	ac.printCarmodelnumber(nameString);
		ac.printLuckyNumber();
	ac.printLotteryNumbers();


	}
}


class AsciiChars 

{
	static Scanner Scan = new Scanner(System.in);
	static Random rand = new Random();
	int age;
	int carmodel;
	int petName;
	int luckynum;
	int lott1;
	int lott2;
	int lott3;
	int lott4;
	int lott5;
	
	public void printNumbers(String nameString)
	{ 
		
		System.out.println("Do you want to proceed? (Yes,No): ");//Asks Question
		String input = Scan.nextLine();//Waits for input
		if (input.equalsIgnoreCase("Yes")) {
			System.out.println("Great " + nameString);
		}
		else {    System.out.println("Sure!");
		}
		//A.close();
		// TODO: print valid numeric input
	}

	public void printLowerCase(String nameString)
	{
		
		System.out.println("Do you have a red car? (yes, no): ");//Asks Question
		String input = Scan.nextLine();//Waits for input
		if (input.equalsIgnoreCase("Yes")) {
			System.out.println("Awesome " + nameString);
		}
		else {    System.out.println("Ok!");
		}
		


		// TODO: print valid lowercase alphabetic input
	}

	public void printUpperCase(String nameString)
	{
		// TODO: print valid uppercase alphabetic input
		
		System.out.println("What is the name of your favorite pet? : ");//Asks Question
		String petName = Scan.nextLine();//Waits for input
		if (petName != null) {
			System.out.println(petName + " is a cool name!");
		}
		else {    System.out.println("Ok!");
		}
	
	}
	public void printAgeInteger(String nameString)
	{ 
		
		System.out.println("What is the age of your pet? : ");//Asks Question
		age = Scan.nextInt();//Waits for input
		if (age >= 0) {
			System.out.println("Congratulations " + nameString +"!. Let's play a game");
		}
		else {    System.out.println("Goodbye!");
		}
		
	}
	public void printCarmodelnumber(String nameString)
	{ 
		
		System.out.println("What is the two digit model number of your car? : ");//Asks Question
		int carmodel = Scan.nextInt();//Waits for input
		if (carmodel >= 0) {
			System.out.println("Great " + nameString +"!. Let's play a game!");
		}
		else {    System.out.println("Goodbye!");
		}
		
	}


	public void printLuckyNumber()
	{ 
		
		System.out.println("What is your lucky number?: ");//Asks Question
		int luckynum = Scan.nextInt();//Waits for input
		int rand_int1 = rand.nextInt(76);
		if (luckynum <= 75) {
			 
			//Scanner rand_int1;
			 
			System.out.println("Magic ball" + " = " + (luckynum * rand_int1) );
		}
		else {System.out.println("Magic ball" + " = " + ((luckynum-75) * rand_int1) );
		}

	}

	public void printLotteryNumbers()
{
		int rand_int2 = rand.nextInt(76);
	lott1 = (age + carmodel);
	lott2 = rand_int2;
	lott3 = 42;
	lott4 = petName;

	lott5 = (carmodel + luckynum);
	 
	System.out.print("Lottery numbers: ");
	System.out.print(lott1 + ", ");
		System.out.print(lott2 + ", ");
	System.out.print(lott3 + ", ");
	System.out.print(lott4 + ", ");
	System.out.print(lott5);
	
}


}



