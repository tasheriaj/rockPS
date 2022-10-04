package rockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class RPC {
public static void main(String[] args ) {

	// code used to get input from user
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("How many rounds of RPC would you like to play?");
	//user tells how many rounds
	int rounds = Integer.parseInt(scanner.nextLine());
	
	for(int i = 0; i < rounds; i++) {
		
	//code to be able to play game multiple times
	playRockPaperScissors(scanner);}
	}
static void playRockPaperScissors(Scanner scanner) {
	
	//getting input from user
	System.out.println("Make a move!(rock/paper/scissors)");

	//string for user input
	String plyerMove = scanner.nextLine();

//code to get random # input from computer
	Random random = new Random();
	int randmNumber = random.nextInt(3); 
	
	//creating if else if code for computer move 
	String comptrMove;{
	if (randmNumber ==0) {
		comptrMove = "rock";
		} else if  (randmNumber ==1) {
		comptrMove = "paper";
	} else {comptrMove = "scissors";
	
	} System.out.println("Computer chose " + comptrMove + "!");}
// code to print winning results


if (plyerMove.equals(comptrMove)) {
	System.out.println("Its a draw!"); }

else if (plyerWins(plyerMove, comptrMove)) {
		System.out.println("Player wins!"); }

		else {System.out.println("Computer wins!");
		}
}
//creating code> true/false  if else if to determine who wins 
	static boolean plyerWins(String plyerMove, String comptrMove) {
		if (plyerMove.equals("rock")) {
			return comptrMove.equals("scissors");
		} else if (plyerMove.equals("paper")) {
			return comptrMove.equals("rock"); 
			}else {
				return comptrMove.equals("paper");
		}
			
		
	}
}