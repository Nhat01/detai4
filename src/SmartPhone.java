import java.util.Scanner;

public class SmartPhone extends ThietBi {
    private int dong;
    CPU cpu = new CPU();
    Vo vo = new Vo();
    ManHinh mh = new ManHinh();

    Scanner sc = new Scanner(System.in);

    SmartPhone() {

    }
    
    SmartPhone(String maSmartPhone, int dong, CPU cpu, ManHinh mh, Vo vo) {
        this.ma = maSmartPhone;
        this.dong = dong;
        this.cpu = cpu;
        this.vo = vo;
        this.mh = mh;
    }

    public int getDong() {
        return dong;
    }
    public void setDong(int dong) {
        this.dong = dong;
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
    }

    public double tinhGia() {
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
        return gia;
    }

    public void xuat() {
        System.out.println("SmartPhone: " + ma + " Dong " + dong + " Gia " + this.tinhGia());
        System.out.print("CPU: ");
        cpu.xuat();
        System.out.print("Man Hinh: ");
        mh.xuat();
        System.out.print("Vo: ");
        vo.xuat();
    }

    @Override
    public String toString() {
        String _dong = "";
        switch (dong) {
            case 1: 
                _dong = "Venus"; 
                break;
            case 2: 
                _dong = "Mars"; 
                break;
            case 3: 
                _dong = "Jupiter"; 
                break;
        }
        return "SmartPhone: <Ma smartphone=" + ma + ">" + " " + "<Dong smartphone=" + _dong + ">" + " " + "<Gia nhap=" + this.tinhGia() + ">\n" + cpu.toString()
        + "\n" +  mh.toString() + "\n" + vo.toString();
    }

    
}
