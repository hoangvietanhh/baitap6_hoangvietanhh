public class NhanVien extends CanBo {
    private String congViec;

    public NhanVien() {
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return  "\nNhân viên {" +
                "Họ và Tên: " + getHoVaTen() +
                ", Ngày sinh: " + getNgaySinh() +
                ", Giới tính: " + getGioiTinh() +
                ", Địa chỉ: " + getDiaChi() +
                ", Công việc: " + congViec +
                '}';
    }
}
