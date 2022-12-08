import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        ArrayList<SmartPhone> smarts = new ArrayList<SmartPhone>();

        String maSo,maCPU,maMH = "",hangSX = "",maVo = "";
        int n,dong,loai = 0,doPhanGiai = 0,chongLoa = 0,loaiVo = 0,mauVo = 0;
        System.out.print("Nhap so luong smart phone: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin smartphone thu " + (i+1) + ":");
            System.out.print("Dong smart phone (1 - dong Venus, 2 - dong Mars, 3 - Jupiter): ");
            dong = sc.nextInt();
            System.out.print("Nhap ma so: ");
            maSo = sc.nextLine();
            switch(dong) {
                case 1:
                    System.out.print("Loại CPU (1-loại Alpha, 2- loại Beta): ");
                    loai = sc.nextInt();
                    break;
                case 2:
                    System.out.print("Loại CPU (1-loại Alpha, 2- loại Beta, 3 - Gamma): ");
                    loai = sc.nextInt();
                    break;
                case 3:
                    System.out.print("Loại CPU: Gamma");
                    loai = 3;
                    break;
                default:

            }
            
            System.out.print("Nhap ma CPU: ");
            sc.nextLine();
            maCPU = sc.nextLine();
            
            CPU cpu = new CPU(maCPU, loai);
            switch(dong) {
                case 1:
                    System.out.print("Nhap ma man hinh: ");
                    maMH = sc.nextLine();
                    System.out.print("Nhap hang san xuat: ");
                    hangSX = sc.nextLine();
                    System.out.print("Do phan giai (1 - HD, 2 - FHD): ");
                    doPhanGiai = sc.nextInt();
                    if (doPhanGiai == 2) {
                        System.out.print("Co chong loa hay khong (1 - Co, 0 - Khong): "); 
                        chongLoa = sc.nextInt();
                    }
                    break;
                case 2:
                    System.out.print("Nhap ma man hinh: ");
                    maMH = sc.nextLine();
                    System.out.print("Nhap hang san xuat: ");
                    hangSX = sc.nextLine();
                    System.out.print("Do phan giai: FHD");
                    doPhanGiai = 2;
                    System.out.print("Co chong loa hay khong (1 - Co, 0 - Khong): "); 
                    chongLoa = sc.nextInt();
                    break;
                case 3:
                    System.out.print("Nhap ma man hinh: ");
                    maMH = sc.nextLine();
                    System.out.print("Nhap hang san xuat: ");
                    hangSX = sc.nextLine();
                    System.out.print("Do phan giai: FHD chong loa");
                    doPhanGiai = 2;
                    chongLoa = 1;
                    break;
                    default:
                }
            
                ManHinh mh = new ManHinh(maMH,hangSX,doPhanGiai, chongLoa);
            switch(dong) {
                case 1:
                    System.out.print("Loai Vo SmartPhone (1 - Nhom, 2 - Nhua): ");
                    loaiVo = sc.nextInt();
                    System.out.print("Ma Vo: ");
                    sc.nextLine();
                    maVo = sc.nextLine();
                    System.out.print("Mau Vo SmartPhone (1 - Do, 2 - Den): ");
                    mauVo = sc.nextInt();
                    break;
                case 2:
                    System.out.print("Loai Vo SmartPhone: Nhom");
                    loaiVo = 1;
                    System.out.print("Ma Vo: ");
                    maVo = sc.nextLine();
                    System.out.print("Mau Vo SmartPhone (1 - Do, 2 - Den): ");
                    mauVo = sc.nextInt();
                    break;
                case 3:
                    System.out.print("Loai Vo SmartPhone: Nhom");
                    loaiVo = 1;
                    System.out.print("Ma Vo: ");
                    maVo = sc.nextLine();
                    System.out.print("Mau Vo SmartPhone (1 - Do, 2 - Den): ");
                    mauVo = sc.nextInt();
                    break;
                default:
            }
            Vo vo = new Vo(maVo, mauVo,loaiVo);
            SmartPhone smart = new SmartPhone(maSo,dong,cpu,mh,vo);
            smarts.add(smart);
        }

        System.out.println();

        for (int i = 0; i < smarts.size(); i++) {
            smarts.get(i).xuat();
        }
    }
}
