import java.util.Scanner;

public class ManHinh extends ThietBi{
    private int doPhanGiai,chongLoa;
    private String kichThuoc;
    Scanner sc = new Scanner(System.in);

    public ManHinh() {
        this.kichThuoc = "4.7 inch";
    }
    public ManHinh(String maMH, String hangSX, int doPhanGiai, int chongLoa) {
        this.ma = maMH;
        this.hang = hangSX;
        this.doPhanGiai = doPhanGiai;
        this.chongLoa = chongLoa;
    }
    public int getDoPhanGiai() {
        return doPhanGiai;
    }
    public void setDoPhanGiai(int doPhanGiai) {
        this.doPhanGiai = doPhanGiai;
    }
    public int getChongLoa() {
        return chongLoa;
    }
    public void setChongLoa(int chongLoa) {
        this.chongLoa = chongLoa;
    }

    public void nhap(int dong) {
        switch(dong) {
            case 1:
                System.out.print("Nhap ma man hinh: ");
                ma = sc.nextLine();
                System.out.print("Nhap hang san xuat: ");
                hang = sc.nextLine();
                System.out.print("Do phan giai (1 - HD, 2 - FHD): ");
                doPhanGiai = sc.nextInt();
                if (doPhanGiai == 2) {
                    System.out.print("Co chong loa hay khong (1 - Co, 0 - Khong): "); 
                    chongLoa = sc.nextInt();
                    if (chongLoa == 0) {
                        gia = 300;
                    } else if (chongLoa == 1) {
                        gia = 500;
                    }
                } else if (doPhanGiai == 1) {
                    gia = 200;
                }
                break;
            case 2:
                System.out.print("Nhap ma man hinh: ");
                ma = sc.nextLine();
                System.out.print("Nhap hang san xuat: ");
                hang = sc.nextLine();
                System.out.println("Do phan giai: FHD");
                doPhanGiai = 2;
                System.out.print("Co chong loa hay khong (1 - Co, 0 - Khong): "); 
                chongLoa = sc.nextInt();
                if (chongLoa == 0) {
                    gia = 300;
                } else if (chongLoa == 1) {
                    gia = 500;
                }
                break;
            case 3:
                System.out.print("Nhap ma man hinh: ");
                ma = sc.nextLine();
                System.out.print("Nhap hang san xuat: ");
                hang = sc.nextLine();
                System.out.println("Do phan giai: FHD chong loa");
                doPhanGiai = 2;
                chongLoa = 1;
                gia = 500;
                break;
                default:
        }
    }

    public void xuat() {
        System.out.print("Ma man hinh " + ma + " Hang " + hang);
        switch (doPhanGiai) {
            case 1:
                System.out.print(" Do phan giai HD");
                break;
            case 2:
                System.out.print(" Do phan giai FHD");
                break;
        }
        System.out.print(" Kich thuoc " + kichThuoc + " Gia nhap " + gia);
        switch(chongLoa) {
            case 0:
                System.out.println(" Khong chong loa ");
                break;
            case 1:
                System.out.println(" Co chong loa");
                break;
        }
    }
    @Override
    public String toString() {
        String _doPhanGiai = "",_chongLoa = "";
        switch(doPhanGiai) {
            case 1:
                _doPhanGiai = "HD";
                break;
            case 2:
                _doPhanGiai = "FHD";
                break;
        }
        switch(chongLoa) {
            case 0:
                _chongLoa = "Khong";
                break;
            case 1:
                _chongLoa = "Co";
                break;
        }
        return "ManHinh: <Ma man hinh=" + ma + "> <Hang san xuat=" + hang + "> <Do phan giai=" + _doPhanGiai + "> <Gia Nhao=" + gia + "> <Chong Loa=" + _chongLoa + ">";
    }

    
}
