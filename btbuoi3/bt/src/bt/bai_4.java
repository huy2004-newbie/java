package bt;

import java.util.Scanner;

public class bai_4 {
    public static boolean kiemTraChuoiDoiXung(String chuoi) {
        int i = 0;
        int j = chuoi.length() - 1;
        while (i < j) {
            if (chuoi.charAt(i) != chuoi.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String chuoi = sc.nextLine();

        System.out.println(kiemTraChuoiDoiXung(chuoi));
    }
}


