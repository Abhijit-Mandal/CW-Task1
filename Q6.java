package CodeClub;

public class Q6 {

	public static  void main(String[] args) {
		int count=0,i=2;
		while(true) {
			if(isPrime(i)) {
				count++;
			}
			
			if(count==10001) {
		System.out.println(i);
			break;}
			i++;
	}
	}
	
        
	public static boolean isPrime(int num) {
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) 
				return false;
			
		}
		
		return true;
		}
	}


