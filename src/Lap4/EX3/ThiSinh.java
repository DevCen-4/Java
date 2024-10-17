/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap4.EX3;


public class ThiSinh {
    private String soBaoDanh;
    private String hoTen;
    private String diaChi;
    private String khoiThi;
    private String uuTien; // Thuộc tính ưu tiên

    public ThiSinh(String soBaoDanh, String hoTen, String diaChi, String khoiThi, String uuTien) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.khoiThi = khoiThi;
        this.uuTien = uuTien; // Khởi tạo thuộc tính ưu tiên
    }

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getKhoiThi() {
        return khoiThi;
    }

    public String getUuTien() {
        return uuTien; // Phương thức truy cập thuộc tính ưu tiên
    }

    @Override
    public String toString() {
        return "Thí sinh: " + hoTen + ", SBD: " + soBaoDanh + ", Địa chỉ: " + diaChi + ", Khối thi: " + khoiThi + ", Ưu tiên: " + uuTien;
    }
    
}
