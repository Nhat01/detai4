import java.util.Scanner;

public class SmartPhone extends ThietBi {
    CPU cpu = new CPU();
    Vo vo = new Vo();
    ManHinh mh = new ManHinh();

    Scanner sc = new Scanner(System.in);

    SmartPhone() {

    }
    SmartPhone(int dong) {
        this.dong = dong;
        cpu.dong = dong;
        vo.dong = dong;
        mh.dong = dong;
    }
    
    SmartPhone(String maSmartPhone, int dong, CPU cpu, ManHinh mh, Vo vo) {
        this.ma = maSmartPhone;
        this.dong = dong;
        this.cpu = cpu;
        this.vo = vo;
        this.mh = mh;
    }

    public void xuat() {
        System.out.println("SmartPhone: " + ma + " Dong " + dong + " Gia " + gia);
        System.out.print("CPU: ");
        cpu.xuat();
        System.out.print("Man Hinh: ");
        mh.xuat();
        System.out.print("Vo: ");
        vo.xuat();
    }

    public void nhap() {
        System.out.print("Dong smart phone (1 - dong Venus, 2 - dong Mars, 3 - Jupiter): ");
        dong = sc.nextInt();
        System.out.print("Nhap ma so: ");
        sc.nextLine();
        ma = sc.nextLine();
        cpu.nhap(dong);
        mh.nhap(dong);
        vo.nhap(dong);
        switch(dong) {
            case 1:
                gia = (cpu.getGia() + mh.getGia() + vo.getGia()) * 1.3;
                break;
            case 2:
                gia = (cpu.getGia() + mh.getGia() + vo.getGia()) * 1.5;
                break;
            case 3:
                gia = (cpu.getGia() + mh.getGia() + vo.getGia()) * 1.8;
                break;
        }
    }
}
