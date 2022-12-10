import java.util.Scanner;

public class CPU extends ThietBi {
    protected String xungNhip,hang; 
    protected int soCore,loaiCPU;

    Scanner sc = new Scanner(System.in);
    
    public CPU() {
    }

    public CPU(String maCPU, int loaiCPU, String hang) {
        this.ma = maCPU;
        this.loaiCPU = loaiCPU;
        this.hang = hang;
    }

    public String getMaCPU() {
        return ma;
    }

    public void setMaCPU(String maCPU) {
        this.ma = maCPU;
    }
    

    public String getXungNhip() {
        return xungNhip;
    }

    public void setXungNhip(String xungNhip) {
        this.xungNhip = xungNhip;
    }

    public double getGiaNhap() {
        return gia;
    }

    public void setGiaNhap(double giaNhap) {
        this.gia = giaNhap;
    }

    public int getSoCore() {
        return soCore;
    }

    public void setSoCore(int soCore) {
        this.soCore = soCore;
    }

    public int getLoaiCPU() {
        return loaiCPU;
    }

    public void setLoaiCPU(int loaiCPU) {
        this.loaiCPU = loaiCPU;
    }
    
    public void nhap(int dong) {
        switch(dong) {
            case 1:
                System.out.print("Loai CPU (1-loai Alpha, 2- loai Beta): ");
                loaiCPU = sc.nextInt();
                System.out.print("Nhap ma CPU: ");
                sc.nextLine();
                ma = sc.nextLine();
                gia = 200;
                soCore = 2;
                xungNhip = "1.8 GHz";
                hang = "Black";
                break;
            case 2:
                System.out.print("Loai CPU (1-loai Alpha, 2- loai Beta, 3 - Gamma): ");
                loaiCPU = sc.nextInt();
                System.out.print("Nhap ma CPU: ");
                sc.nextLine();
                ma = sc.nextLine();
                gia = 400;
                soCore = 4;
                xungNhip = "2.46 GHz";
                hang = "Black";
                break;
            case 3:
                System.out.println("Loai CPU: Gamma");
                System.out.print("Nhap ma CPU: ");
                ma = sc.nextLine();
                loaiCPU = 3;
                gia = 600;
                soCore = 4;
                xungNhip = "2.6 GHz";
                hang = "White";
                break;
            default:
        }
        
    }

    public void xuat() {
        switch(loaiCPU) {
            case 1:
                System.out.print("Loai CPU Alpha ");
                break;
            case 2:
                System.out.print("Loai CPU Beta ");
                break;
            case 3:
                System.out.print("Loai CPU Gamma ");
                break;
        }
        System.out.println("Hang " + hang + " So Core: " + soCore + " Xung nhip " + xungNhip + " Gia nhap " + gia);
    }
}
