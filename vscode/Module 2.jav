public class Main
{
	public static void main(String[] args) {

		 int randNum1 = (int)(Math.random() * 6);
		System.out.println("randNum1 is " + randNum1); //1. Goal: write code to generate random integers in the range 0 to 5.
		
		 int randNum2 = (int)(Math.random() * 6) + 10;
		System.out.println("randNum2 is " + randNum2); //Goal: write code to generate random integers in the range 10 to 15.
		 
		 int randNum3 = (int)(Math.random() * 45) + 31; 
		System.out.println("randNum3 is " + randNum3); //Goal: write code to generate random integers in the range 45 to 76.
		
		 int randNum4 = (int)(Math.random() * 10) + 16; 
		System.out.println("randNum4 is " + randNum4); //Goal: write code to generate random integers in the range 16 to 25.
		
		int randNum5 = (int)(Math.random() * 50) + 100; 
        int randNum6 = (int)(Math.random() * 50) + 100;
        System.out.println("randNum5 is " + randNum5);
        System.out.println("randNum6 is " + randNum6); //Write code to generate and print two random integers between (and including) 100 and 149. End with a newline. Ex: 112 102
		
	}
}