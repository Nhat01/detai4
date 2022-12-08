public class SmartPhone {
    private String maSmartPhone;
    private int dong;
    CPU cpu = new CPU();
    Vo vo = new Vo();
    ManHinh mh = new ManHinh();

    SmartPhone() {

    }

    SmartPhone(String maSmartPhone, int dong, CPU cpu, ManHinh mh, Vo vo) {
        this.maSmartPhone = maSmartPhone;
        this.dong = dong;
        this.cpu = cpu;
        this.vo = vo;
        this.mh = mh;
    }

    public void xuat() {
        System.out.println("Ma smart phone :" + maSmartPhone);
        System.out.println("Dong: " + dong);
        cpu.xuatCPU();
    }
}
