//Fun with Arrays. A simple game of Rock Paper Scissors. By yibinna.

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
	public enum Hand {
		ROCK, PAPER, SCISSORS
	}

	public static void main(String[] args) {

		RockPaperScissors rockPaperScissors = new RockPaperScissors();

		Menu myMenu = new Menu();
		String answer = "";
		while (myMenu.getOption() != 2) {
			myMenu.outputMenu();
			rockPaperScissors.rockPaperScissors();
			System.out.println("Would you like to play again?");
			answer = myMenu.userAnswer();
			myMenu.setAnswer(answer);
			if (!myMenu.getAnswer().equalsIgnoreCase("yes") && 
					!myMenu.getAnswer().equalsIgnoreCase("y")) {
				System.out.println("Exiting.");
				System.out.println("Program by yibinna");
				return;
			} else {
				myMenu.setOption(0);
			}
		}
	}

	private void rockPaperScissors() {
		System.out.println("type rock  paper  or scissors");
		Scanner scanner = new Scanner(System.in);
		String readInput = scanner.nextLine();
		Hand myHand = Hand.PAPER;
		String myArray[] = { myHand.ROCK.name(), myHand.PAPER.name(), myHand.SCISSORS.name() };
		Random randomized = new Random();
		int asdf2 = randomized.nextInt(myArray.length);
		System.out.println(myArray[asdf2]);

		readInput = readInput.toUpperCase();
		{
			switch (readInput) {
			case "ROCK":
				if (myArray[asdf2].equals(myHand.ROCK.name())) {
					System.out.println("It's a draw!");
				}
				if (myArray[asdf2].equals(myHand.PAPER.name())) {
					System.out.println("Computer wins");
				}
				if (myArray[asdf2].equals(myHand.SCISSORS.name())) {
					System.out.println("You Win");
				}
				break;
			case "PAPER":
				if (myArray[asdf2].equals(myHand.ROCK.name())) {
					System.out.println("You Win");
				}
				if (myArray[asdf2].equals(myHand.PAPER.name())) {
					System.out.println("It's a draw!");
				}
				if (myArray[asdf2].equals(myHand.SCISSORS.name())) {
					System.out.println("Computer Wins");
				}
				break;
			case "SCISSORS":
				if (myArray[asdf2].equals(myHand.ROCK.name())) {
					System.out.println("Computer Wins");
				}
				if (myArray[asdf2].equals(myHand.PAPER.name())) {
					System.out.println("You Win!");
				}
				if (myArray[asdf2].equals(myHand.SCISSORS.name())) {
					System.out.println("It's a draw!");
				}
				break;
			default:
				System.out.println("Not a valid Option");
			}
			{
				System.out.println("Thanks for playing Rock, Paper, Scissors!");
			}
		}
	}
}
