import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        ArrayList<SmartPhone> smarts = new ArrayList<SmartPhone>();

        int n,option;
        boolean flag = true;

        do {
            System.out.println("Ban muon lam gi:");
            System.out.println("1. Nhap danh sach smartphone");
            System.out.println("2. Xuat danh sach smartphone");
            System.out.println("3. In danh sach smartphone xuong file");
            System.out.println("Thoat");
            option = sc.nextInt();
            switch(option) {
                case 1:
                    System.out.print("Nhap so luong smart phone: ");
                    n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhap thong tin smartphone thu " + (i+1) + ":");
                        SmartPhone smart = new SmartPhone();
                        smart.nhap();
                        smarts.add(smart);
                    }
                    break;
                case 2:
                    for (int i = 0; i < smarts.size(); i++) {
                        System.out.println("Thong tin cua smartphone thu " + (i+1) + ":");
                        smarts.get(i).xuat();
                    }
                    break;
                case 3:
                    MyFile mFile = new MyFile("ds_smartphone.txt");
                    for (int i = 0; i < smarts.size(); i++) {
                        mFile.appendStr2File(smarts.get(i).toString());
                    }
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}
