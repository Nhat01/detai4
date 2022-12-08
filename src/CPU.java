public class CPU {
    protected String maCPU,xungNhip; 
    protected double giaNhap;
    protected int soCore,loaiCPU;
    
    public CPU() {
    }

    public CPU(String maCPU, int loaiCPU) {
        this.maCPU = maCPU;
        this.loaiCPU = loaiCPU;
    }

    public String getMaCPU() {
        return maCPU;
    }

    public void setMaCPU(String maCPU) {
        this.maCPU = maCPU;
    }

    // public String getLoaiCPU() {
    //     return loaiCPU;
    // }

    // public void setLoaiCPU(String loaiCPU) {
    //     this.loaiCPU = loaiCPU;
    // }

    public String getXungNhip() {
        return xungNhip;
    }

    public void setXungNhip(String xungNhip) {
        this.xungNhip = xungNhip;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public int getSoCore() {
        return soCore;
    }

    public void setSoCore(int soCore) {
        this.soCore = soCore;
    }

    public void xuatCPU() {
        System.out.println("Ma CPU: " + maCPU);
        System.out.println("Loai CPU: " + loaiCPU);
    }
}
