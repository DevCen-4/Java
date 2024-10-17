package Lab3.ex1;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ThucPham  {
    // Các thuộc tính
    private final String maHang;
    private String tenHang;
    private double donGia;
    private LocalDate nSX;  // Ngày sản xuất
    private LocalDate hSD;  // Ngày hết hạn

    // Constructor mặc định
    public ThucPham() {
        this.maHang = "0000";
        this.tenHang = "No Name";
        this.donGia = 0;
        this.nSX = LocalDate.now();
        this.hSD = LocalDate.now().plusDays(1);
    }

    // Constructor có tham số
    public ThucPham(String maHang, String tenHang, double donGia, LocalDate nSX, LocalDate hSD) {
        if (maHang.isEmpty() || tenHang.isEmpty() || donGia <= 0 || hSD.isBefore(nSX)) {
            throw new IllegalArgumentException("Thông tin không hợp lệ.");
        }
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.nSX = nSX;
        this.hSD = hSD;
    }

    // Getter và Setter
    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        if (tenHang.isEmpty()) {
            throw new IllegalArgumentException("Tên hàng không được để rỗng.");
        }
        this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia <= 0) {
            throw new IllegalArgumentException("Đơn giá phải lớn hơn 0.");
        }
        this.donGia = donGia;
    }

    public LocalDate getNSX() {
        return nSX;
    }

    public void setNSX(LocalDate nSX) {
        if (nSX.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Ngày sản xuất không hợp lệ.");
        }
        this.nSX = nSX;
    }

    public LocalDate getHSD() {
        return hSD;
    }

    public void setHSD(LocalDate hSD) {
        if (hSD.isBefore(nSX)) {
            throw new IllegalArgumentException("Ngày hết hạn phải sau ngày sản xuất.");
        }
        this.hSD = hSD;
    }

    // Kiểm tra sản phẩm còn hạn sử dụng hay không
    public boolean isConSuDung() {
        return LocalDate.now().isBefore(hSD);
    }

    // toString để hiển thị kết quả dưới dạng chuỗi
    @Override
    public String toString() {
        Locale locale = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        String donGia = numberFormat.format(this.donGia);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Mã hàng: " + maHang +
                "\nTên hàng: " + tenHang +
                "\nĐơn giá: " + donGia +
                "\nNgày sản xuất: " + nSX.format(dtf) +
                "\nHạn sử dụng: " + hSD.format(dtf) +
                "\nCòn hạn sử dụng: " + (isConSuDung() ? "Có" : "Không");
    }

    // Main để kiểm tra class ThucPham
    public static void main(String[] args) {
        ThucPham tp1 = new ThucPham("TP01", "Bánh", 20000, LocalDate.of(2023, 10, 1), LocalDate.of(2024, 10, 1));
        System.out.println(tp1.toString());

        ThucPham tp2 = new ThucPham("TP02", "Kẹo", 10000, LocalDate.of(2024, 9, 1), LocalDate.of(2025, 9, 1));
        System.out.println(tp2.toString());
    }
}

