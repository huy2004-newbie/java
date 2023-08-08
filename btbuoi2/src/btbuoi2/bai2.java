package btbuoi2;
import java.util.Scanner;

public class bai2{
	private static long giaithua(int n) {
		if (n == 1)
			return 1;
		return n*giaithua(n-1);
	}
	public static void main(String[] args) {
		System.out.println("Ý a:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n:");
		int n = sc.nextInt();
		float tong = 0;
		for(int i=1; i <= n; i++) {
			tong += 1.0/i;
		}
		System.out.println("S=" + tong);
		
		System.out.println("\n");		
		System.out.println("Ý b:");
		long p = 0;
		for(int i=1; i <= n; i++) {
			p += giaithua(i);
		}
		System.out.println("P=" + p);		
	}
}
