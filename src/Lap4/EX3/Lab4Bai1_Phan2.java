/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lap4.EX3;

import java.util.Scanner;

public class Lab4Bai1_Phan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TuyenSinh tuyenSinh = new TuyenSinh();
        tuyenSinh.nhapThongTin();
        System.out.println("\nThông tin thí sinh:");
        tuyenSinh.hienThiThongTin();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhập số báo danh để tìm kiếm: ");
        String sbd = scanner.nextLine();
        tuyenSinh.timKiemTheoSoBaoDanh(sbd);

        System.out.println("\nDanh sách thí sinh sau khi sắp xếp theo số báo danh:");
        tuyenSinh.sapXepTheoSoBaoDanh();
        tuyenSinh.hienThiThongTin();

        System.out.println("\nTổng số thí sinh theo khối:");
        tuyenSinh.tongSoSVTheoKhoi();
    }
    
}
