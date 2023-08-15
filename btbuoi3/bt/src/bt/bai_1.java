package bt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bai_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu:");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = sc.nextInt();
		}
		
		Map<Integer, Integer> dem = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int kiemTraPhanTu = a[i];
            if (dem.containsKey(kiemTraPhanTu)) {
                dem.put(kiemTraPhanTu, dem.get(kiemTraPhanTu) + 1);
            } else {
                dem.put(kiemTraPhanTu, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : dem.entrySet()) {
            int kiemTraPhanTu = entry.getKey();
            int dem_1 = entry.getValue();
            System.out.println("So " + kiemTraPhanTu + " xuat hien " + dem_1 + " lan");
        }
		
	}
	
	
}
