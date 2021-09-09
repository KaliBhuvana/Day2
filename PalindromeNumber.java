package Day2;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=828 , r,sum=0, temp=n;
while (temp>0) {
	r=temp%10;
	sum=sum*10 + r;
	temp=temp/10;
}
if (n==sum) {
System.out.println(n + " is a palindrome number");	
}
else
	System.out.println(n + " is not a palindrome number");
	}

}
