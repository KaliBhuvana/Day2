package Day2;

public class Armstrong {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153, r, sum=0;
		int temp=n;
		
while (temp!=0) 
{
 r=temp%10;
sum= sum+(r*r*r);
temp=temp/10;
} 
if(n==sum) {
	
	System.out.println(n + " is an armstrong number");		
}
else 
	System.out.println(n + " is not an armstrong number");	

	
}
		
	}


