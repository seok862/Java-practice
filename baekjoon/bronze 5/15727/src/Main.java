import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int M = L%5;
		if(M==0) {
			System.out.println(L/5);
		} else {
			System.out.println(L/5+1);
		}
	}
}
