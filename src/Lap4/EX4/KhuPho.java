/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap4.EX4;

import java.util.ArrayList;
import java.util.List;

public class KhuPho {
    private List<HoDan> hoDans;

    public KhuPho() {
        hoDans = new ArrayList<>();
    }

    public void themHoDan(HoDan hoDan) {
        hoDans.add(hoDan);
    }

    public List<HoDan> getHoDans() {
        return hoDans;
    }

    @Override
    public String toString() {
        return "Khu phố: " + hoDans;
    }
}
