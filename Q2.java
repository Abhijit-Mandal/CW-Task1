package CodeClub;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		int cases=0;
		int user=0;
		int comp=0;
		while(cases<3) {
			int random = (int) (Math.random()*3)+1;
			System.out.println("Select 'R' for Rock, 'P' for Paper and 'S' for Scissors: " );
			char s = sc.next().charAt(0);
		switch(random) {
		case 1:
			if (s=='R') {
				System.out.println("tie of round");
				comp++;
				user++;
			}
			else if (s=='P') {
				System.out.println("Computer chose Rock. You lost the round");
				comp++;
			}
			else if (s=='S') {
				System.out.println("Computer chose Rock. You won the round");
				user++;
			}
			break;
		case 2:	
			if(s=='P') {
				System.out.println("tie of round");
				comp++;
				user++;
			}
			else if (s=='R') {
				System.out.println("Computer chose Paper. You lost the round");
				comp++;
			}
			else if (s=='S') {
				System.out.println("Computer chose Paper. You won the round");
				user++;
			}
			break;
		case 3:	
			if(s=='S') {
				System.out.println("tie of round");
				comp++;
				user++;
			}
			else if (s=='P') {
				System.out.println("Computer chose Scissor. You lost the round");
				comp++;
			}
			else if (s=='R') {
				System.out.println("Computer chose Scissor. You won the round");
				user++;
			}
			break;
		default:	
			System.out.println("Error...."); break;
		
		}
		cases++;
		}
		if(user==comp) {
				System.out.println("Round 3 over. User scored "+user+",user tied with computer");
			}
		else if (user>comp) {
			System.out.println("Round 3 over. User scored "+user+",user won the game");
			
		}
		else if (user<comp) {
			System.out.println("Round 3 over. User scored "+user+",computer won the game");
		}	
	}
}
