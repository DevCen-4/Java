/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap4.EX4;

class Nguoi {
    private String hoTen;
    private int tuoi;
    private String namSinh;
    private String ngheNghiep;

    public Nguoi(String hoTen, int tuoi, String namSinh, String ngheNghiep) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.namSinh = namSinh;
        this.ngheNghiep = ngheNghiep;
    }

    @Override
    public String toString() {
        return "Họ tên: " + hoTen + ", Tuổi: " + tuoi + ", Năm sinh: " + namSinh + ", Nghề nghiệp: " + ngheNghiep;
    }
}

