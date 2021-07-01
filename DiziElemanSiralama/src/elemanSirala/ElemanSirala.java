package elemanSirala;
import java.util.Scanner;
import java.util.Arrays;

public class ElemanSirala {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Dizinin boyutu n: ");
		int n = scan.nextInt();
		
		int [] a = new int[n];
		for (int i= 0 ; i < n ; i++) {
			System.out.print((i+1) + ". elemaný giriniz: ");
			int val = scan.nextInt();
			a[i] = val;
		}
		scan.close();
		
		Arrays.sort(a);
		for (int i = 0 ; i < a.length; i++) {
			System.out.println("Dizinin sýralanmýþ hali: " + a[i]);
		}
	}
}
