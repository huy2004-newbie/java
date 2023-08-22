package bt;

import java.util.Scanner;

class bai1 {
    private String maSach;
    private String tenSach;
    private String tenTacGia;
    private String nhaXuatBan;
    private int namXuatBan;


    public bai1() {
        
    }

    
    public bai1(String maSach, String tenSach, String tenTacGia, String nhaXuatBan, int namXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;
    }


    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    
    public String getMaSach() {
        return maSach;
    }

    
    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }
    

    public String getTenSach() {
        return tenSach;
    }
    

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }
    

    public String getTenTacGia() {
        return tenTacGia;
    }
    

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }
    

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }
    

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }
    

    public int getNamXuatBan() {
        return namXuatBan;
    }

    
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sách: ");
        maSach = scanner.nextLine();
        System.out.print("Nhập tên sách: ");
        tenSach = scanner.nextLine();
        System.out.print("Nhập tên tác giả: ");
        tenTacGia = scanner.nextLine();
        System.out.print("Nhập nhà xuất bản: ");
        nhaXuatBan = scanner.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        namXuatBan = scanner.nextInt();
    }

    
    public void xuatThongTin() {
        System.out.print(maSach + "\t\t" + tenSach + "\t\t" + tenTacGia + "\t\t" + nhaXuatBan + "\t\t" + namXuatBan);
    }
    
    
    public static void main(String[] args) {
        bai1[] danhSachSach = new bai1[5]; // Tạo mảng chứa 5 đối tượng sách

        // Nhập thông tin 5 cuốn sách
        for (int i = 0; i < danhSachSach.length; i++) {
            System.out.println("Nhập thông tin sách thứ " + (i + 1));
            danhSachSach[i] = new bai1(); // Khởi tạo đối tượng sách mới
            danhSachSach[i].nhapThongTin();
        }

        // In thông tin 5 cuốn sách
        System.out.println("Ma sach" + "\t\t" + "Ten sach" + "\t" + "Tac gia" + "\t\t" + "Nha xuat ban" + "\t" + "Nam xuat ban");
        for (bai1 sach : danhSachSach) {
            sach.xuatThongTin();
            System.out.println("\n");
        }
    }
}



