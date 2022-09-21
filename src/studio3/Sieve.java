package studio3;
import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("What is the largest number?");
		int n = in.nextInt();
		int[] numbers = new int[n-1];

		for (int i=0; i<numbers.length; i++) {
			numbers[i]=i+2;
			
		}
		for (int a =2; a<n; a++) {
		for (int j=0; j<numbers.length; j++) {
			if (numbers[j] % a == 0 && numbers[j]!=a){
				numbers[j] = 0;
			}
				
		}
		}
		for (int k = 0; k<numbers.length; k++) {
			if (numbers[k] != 0) {
				System.out.print(numbers[k] + " ");
			}
		}
		// TODO Auto-generated method stub

	}

}
