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
			 date = s.nextToken().replaceAll("st", "").replaceAll("nd", "").replaceAll("rd", "").replaceAll("th", "");
			 month = s.nextToken().toLowerCase();
			 year = s.nextToken();	 
		}
		int d= Integer.parseInt(date);
		int y= Integer.parseInt(year);

		switch(month) {
		
		case "january":
			DN = d;
			break;
			
		case "february":	
				if(((y%4 == 0) && (y%100!= 0)) || (y%400 == 0)) {
			             DN = 32+d;}
                                else{
				     DN = 31+d;}
				break;	
		case "march":	
			   DN = 59+d;
			   break;
		case "april":	   
				DN = 89+d;
				break;
		case "may":		
				DN = 120+d;
				break;
		case "june":		
			    DN = 150+d;
			    break;
		case "july":	    
				DN = 181+d;
				break;
		case "august":		
				DN = 212+d;
				break;
		case "september":		
				DN = 242+d;
				break;
		case "october":		
				DN = 273+d;
				break;
		case "november":		
				DN = 303+d;
				break;
		case "december":
			    DN = 334+d;
			    break;
		default:	    
			break;
		}
		
		
		
		System.out.println("Day Number: "+DN);	
		}		
		}
		

	


