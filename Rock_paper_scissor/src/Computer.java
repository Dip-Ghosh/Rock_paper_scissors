import java.util.Random;


public class Computer {
	/*
	 * This function helps the computer do the selection among ROCK, PAPER,SCISSORS that is define in driver class
	 * return back random number
	 */ 
	public int getInput() {
		Random random = new Random();
		int input = random.nextInt(3) + 1;//this random object create a random number between 0-2 and store in input
		return input;
	}
}