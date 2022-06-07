import java.math.BigInteger;
import java.util.*;
public class ArrayListSort {

	public static void main(String[] args) {
		ArrayList<BigInteger> list= new ArrayList<BigInteger>();
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of array");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			list.add(sc.nextBigInteger());
		}
		Collections.sort(list,Collections.reverseOrder());   
		System.out.println(list);
	}

}
