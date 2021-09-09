package Day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] num= {1,3,6,5,7};

Arrays.sort(num);
for (int i = 0; i < num.length; i++) {
	 int j=i+1;
	if (num[i]!=j) {
System.out.println(j);
	break;
	}
}
	}

}
