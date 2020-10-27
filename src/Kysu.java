public class Kysu extends CanBo {
    private String nganhDaoTao;

    public Kysu() {
    }


    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return  "\nKỹ sư {" +
                "Họ và Tên: " + getHoVaTen() +
                ", Ngày sinh: " + getNgaySinh() +
                ", Giới tính: " + getGioiTinh() +
                ", Địa chỉ: " + getDiaChi() +
                ", Ngành đào tạo: " + nganhDaoTao +
                '}';
    }
}
