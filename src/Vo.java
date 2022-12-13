import java.util.Scanner;
public class Vo extends ThietBi{
    private int mauVo,loaiVo;

    Scanner sc = new Scanner(System.in);
    
    public Vo() {
    }

    public Vo(String maVo, int mauVo, int loaiVo) {
        this.mauVo = mauVo;
        this.ma = maVo;
        this.loaiVo = loaiVo;
    }

    public int getMauVo() {
        return mauVo;
    }

    public void setMauVo(int mauVo) {
        this.mauVo = mauVo;
    }

    public int getLoaiVo() {
        return loaiVo;
    }

    public void setLoaiVo(int loaiVo) {
        this.loaiVo = loaiVo;
    }

    public void nhap(int dong) {
        switch(dong) {
            case 1:
                System.out.print("Loai Vo SmartPhone (1 - Nhom, 2 - Nhua): ");
                loaiVo = sc.nextInt();
                if (loaiVo == 1) {
                    gia = 400;
                    hang = "black";
                    System.out.print("Mau Vo SmartPhone (1 - Do, 2 - Den): ");
                    mauVo = sc.nextInt();
                } else if (loaiVo == 2) {
                    gia = 200;
                    hang = "white";
                    System.out.print("Mau Vo SmartPhone (1 - Do, 2 - Den, 3 - Xanh): ");
                    mauVo = sc.nextInt();
                }
                System.out.print("Ma Vo: ");
                sc.nextLine();
                ma = sc.nextLine();
                
                break;
            case 2:
                System.out.println("Loai Vo SmartPhone: Nhom");
                loaiVo = 1;
                gia = 400;
                hang = "black";
                System.out.print("Ma Vo: ");
                ma = sc.nextLine();
                System.out.print("Mau Vo SmartPhone (1 - Do, 2 - Den): ");
                mauVo = sc.nextInt();
                break;
            case 3:
                System.out.println("Loai Vo SmartPhone: Nhom");
                loaiVo = 1;
                gia = 400;
                hang = "black";
                System.out.print("Ma Vo: ");
                ma = sc.nextLine();
                System.out.print("Mau Vo SmartPhone (1 - Do, 2 - Den): ");
                mauVo = sc.nextInt();
                break;
            default:
        }
    }

    public void xuat() {    
        System.out.print("Ma Vo " + ma);
        switch(loaiVo) {
            case 1:
                System.out.print(" Loai Vo Nhom");
                break;
            case 2:
                System.out.print(" Loai Vo Nhua");
                break;
        }
        System.out.print(" Hang " + hang);
        switch(mauVo) {
            case 1:
                System.out.print(" Mau Do");
                break;
            case 2:
                System.out.print(" Mau Den");
                break;
            case 3:
                System.out.print(" Mau Xanh");
                break;
        }
        System.out.println(" Gia " + gia);
    }

    @Override
    public String toString() {
        String _loaiVo= "", _mauVo = "";
        switch(loaiVo) {
            case 1:
                _loaiVo = "Nhom";
                break;
            case 2:
                _loaiVo = "Nhua";
                break;
        }
        switch(mauVo) {
            case 1:
                _mauVo = "Do";
                break;
            case 2:
                _mauVo = "Den";
                break;
            case 3:
                _mauVo = "Xanh";
                break;
        }
        return "Vo: <Ma vo=" + ma + "> <loaiVo=" + _loaiVo + "> <Hang=" + hang + "> <Mau sac=" + _mauVo +"> <Gia Nhap=" + gia + ">\n";
    }

    
}
