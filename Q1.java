package CodeClub;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String input = sc.nextLine().toUpperCase();
		
		char ch[]=input.toCharArray();
		int flag=0;
		for(int i=0;i<ch.length;i++) {
			if((ch[i]=='G')||(ch[i]=='C')||(ch[i]=='T')||(ch[i]=='A')){
			
			
			if (ch[i]=='G') {
				
				ch[i]='C';
			}	
			else if (ch[i]=='C') {
				ch[i]='G';
			}
			else if (ch[i]=='T') {
				ch[i]='A';
			}
			else if (ch[i]=='A') {
				ch[i]='U';
				
			}}
			
			else {
			flag=1;	
			break;}
			
			}
		if(flag==0) {
		for(int i=0;i<ch.length;i++) {
			
				System.out.print(ch[i]);
		}
		}
		else {
			System.out.print("Invalid input");
		}
		
		

	}

}
