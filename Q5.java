package CodeClub;

public class Q5 {

	public static void main(String[] args) {
		int max=0,num=0;
		int max1 =999;
		for(int i=max1;i>=100;i--) {
			for(int j=max1;j>=100;j--) {
				num=i*j;

				if(reverse(num)==num&&(num>max)) {
					max=num;}
				}
		}
			System.out.println(max);
		}
	public static int reverse(int num) {
		int temp=num;
		int rem=0,rev=0;
		while(temp!=0) {
			rem = temp%10;
			rev = rev*10 + rem; 
            temp/= 10;
		}
		return rev;
	

	}
	}

