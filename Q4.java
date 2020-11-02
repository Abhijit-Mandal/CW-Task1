package CodeClub;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Q4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a date: ");
	StringTokenizer s = new StringTokenizer(sc.nextLine());
		String date="",month="",year="";
		int DN=0;
		
		while(s.hasMoreTokens()) {
			 date = s.nextToken();
			 month = s.nextToken();
			 year = s.nextToken();	 
		}
		int d= Integer.parseInt(date);
		int y= Integer.parseInt(year);

		switch(month) {
		
		case "January":
			DN = d;
			break;
			
		case "February":	
				DN = 31+d;
				break;	
		case "March":	
			   DN = 59+d;
			   break;
		case "April":	   
				DN = 89+d;
				break;
		case "May":		
				DN = 120+d;
				break;
		case "June":		
			    DN = 150+d;
			    break;
		case "July":	    
				DN = 181+d;
				break;
		case "August":		
				DN = 212+d;
				break;
		case "September":		
				DN = 242+d;
				break;
		case "October":		
				DN = 273+d;
				break;
		case "November":		
				DN = 303+d;
				break;
		case "December":
			    DN = 334+d;
			    break;
		default:	    
			break;
		}
		
		if(((y%4 == 0) && (y%100!= 0)) || (y%400 == 0)) {
			DN+=1;
		}
		System.out.println("Day Number: "+DN);	
		}		
		}
		

	


