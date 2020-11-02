package CodeClub;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int count=1;
		int max =0;
		long n=0;
		long number=0;
		for(int i=1;i<=999999;i++) {
			n=i;
			
		while(n!=1&&n>=1) {
			if(n%2==0) {
				n=n/2;	
			}
			else  {
				n=3*n+1;
			}
			count++;
		}
		
		if(count>max) {
			max=count;
			number=i;
		}
		count=1;
		
		}
		System.out.println(number);

	}

}
