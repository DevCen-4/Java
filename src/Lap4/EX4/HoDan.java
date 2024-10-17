/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap4.EX4;

import java.util.ArrayList;
import java.util.List;

public class HoDan {
    private List<Nguoi> thanhVien;
    private String soNha;

    public HoDan(String soNha) {
        this.soNha = soNha;
        this.thanhVien = new ArrayList<>();
    }

    public void themThanhVien(Nguoi nguoi) {
        thanhVien.add(nguoi);
    }

    public List<Nguoi> getThanhVien() {
        return thanhVien;
    }

    public String getSoNha() {
        return soNha;
    }

    @Override
    public String toString() {
        return "Số nhà: " + soNha + ", Thành viên: " + thanhVien;
    }
}
