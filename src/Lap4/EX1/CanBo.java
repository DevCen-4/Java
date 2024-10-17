package Lap4.EX1;

public class CanBo {
    private String HoTen;
    private int Tuoi;
    public String GioiTinh;
    public String DiaChi;

    public CanBo(String HoTen, int Tuoi, String GioiTinh, String DiaChi) {
        this.HoTen = HoTen;
        this.Tuoi = Tuoi;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
    }
    public String getHoTen() {
        return HoTen;
    }
    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }
    public int getTuoi() {
        return Tuoi;
    }
    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }
    public String getGioiTinh() {
        return GioiTinh;
    }
    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }
    public String getDiaChi() {
        return DiaChi;
    }
    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }
}

