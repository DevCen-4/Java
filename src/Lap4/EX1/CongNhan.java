package Lap4.EX1;

public class CongNhan extends CanBo{
    private int Bac;
    public CongNhan(String HoTen, int Tuoi, String GioiTinh, String DiaChi, int Bac) {
        super(HoTen, Tuoi, GioiTinh, DiaChi);
        this.Bac = Bac;
    }
    public int getBac() {
        return Bac;
    }
    public void setBac(int Bac) {
        this.Bac = Bac;
    }
}
