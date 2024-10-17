package Lab3.ex1;

import java.util.Locale;

import java.util.Scanner;

public class SinhVien {
    //Các thuộc tính của đối tượng sinh viên
    private String maSv;
    private String tenSv;
    private double diemLT;
    private double diemTH;

    //Hàm khởi tạo không tham số
    public SinhVien() {
        maSv = "";
        tenSv = "";
        diemLT = 0;
        diemTH = 0;
    }

    //Hàm khởi tạo có tham số
    public SinhVien(String maSv, String tenSv, double diemLT, double diemTH) {
        this.maSv = maSv;
        this.tenSv = tenSv;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    //Tạo getter setter cho các thuộc tính
    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getTenSv() {
        return tenSv;
    }

    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }

    public double getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(double diemLT) {
        this.diemLT = diemLT;
    }

    public double getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(double diemTH) {
        this.diemTH = diemTH;
    }
    @Override
    public String toString() {
        return maSv + "-" + tenSv + " điểm trung bình:" + tinhdiemTB();
    }

    public double tinhdiemTB() {
        return (diemLT * diemTH)/2;
    }
    public void inSV(){
        Locale locale = new Locale("vi","VN");
        System.out.printf(locale,"%-6s %-18s %12.2f %12.2f %12.2f \n",maSv,tenSv,diemLT,diemTH,tinhdiemTB());

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinhVien sv_1    = new SinhVien();
        System.out.println("Nhập mã sinh viên 1:");
        sv_1.setMaSv(scanner.nextLine());
        System.out.println("Nhập tên sinh viên 1:");
        sv_1.setTenSv(scanner.nextLine());
        System.out.println("Nhập điểm lý thuyết:");
        sv_1.setDiemLT(scanner.nextDouble());
        System.out.println("Nhập điểm thực hành:");
        sv_1.setDiemTH(scanner.nextDouble());
        sv_1.inSV();
        System.out.println(sv_1);
    }
}

