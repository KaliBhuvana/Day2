package Day2;

public class PrintFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] num= {10,20,10,10,30,40,60,20,40};

int[] fr=new int[num.length];
		
		for (int i = 0; i < num.length; i++) {
			
			int count=1;
			for (int j = i+1; j < num.length; j++) {
				
				if (num[i]==num[j]) {
					
					count++;
			fr[j]=-1;
				}
			}
			if (fr[i]!=-1) {
				fr[i]=count;
				
			}	
		}
				for (int k = 0; k < num.length; k++) {
				if (fr[k]!=-1) 
				
					System.out.println(num[k] + "repeated" + fr[k]);
				
			
				
				}
		
	}
	
	}


