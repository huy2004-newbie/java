package bai3;

import java.util.Scanner;

public class HangHoaDienTu extends HangHoa {
    private int thoiGianBaoHanh;
    private int congSuat;
    
    
    public HangHoaDienTu() {
    }

    
    public HangHoaDienTu(String maHang, String tenHang, float soLuong, float donGia, VatLieu[] dsVL, int thoiGianBaoHanh, int congSuat) {
        super(maHang, tenHang, soLuong, donGia, dsVL);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }

    
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Nhập thời gian bảo hành hàng hóa điện tử: ");
        thoiGianBaoHanh=sc.nextInt();
        System.out.println("Nhập công suất hàng hóa điện tử: ");
        congSuat=sc.nextInt();
    }

    
    @Override
    public void output() {
        super.output();
        System.out.println("Thời gian bảo hành: " + thoiGianBaoHanh);
        System.out.println("Công suất: " +congSuat);
    }
}
