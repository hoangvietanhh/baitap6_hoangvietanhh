import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        ThongTin thongTin = new ThongTin();
        QuanLy quanLy = new QuanLy();
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("1: Tạo cán bộ.");
            System.out.println("2: Hiển thị thông tin các cán bộ.");
            System.out.println("3: Xem thông tin cán bộ.");
            System.out.println("0: Exit.");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:

                    System.out.println("1: Kỹ sư.");
                    System.out.println("2: Công nhân.");
                    System.out.println("3: Nhân viên.");
                    int chon = Integer.parseInt(input.nextLine());
                    switch (chon){
                        case 1:
                            CanBo kysu = new Kysu();
                            thongTin.themKysu(thongTin.themCanBo(kysu));
                            quanLy.create(kysu);
                            quanLy.read();
                            break;
                        case 2:
                            CanBo congNhan = new CongNhan();
                            thongTin.themCongNhan(thongTin.themCanBo(congNhan));
                            quanLy.create(congNhan);
                            quanLy.read();
                            break;
                        case 3:
                            CanBo nhanVien = new NhanVien();
                            thongTin.themNhanVien(thongTin.themCanBo(nhanVien));
                            quanLy.create(nhanVien);
                            quanLy.read();
                            break;

                    }
                    break;
                case 2:
                    quanLy.read();
                    break;
                case 3:
                    System.out.println("Nhập tên cán bộ cần tìm kiếm: ");
                    String name = input.nextLine();
                    quanLy.search(name);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }while (true);
    }
}
