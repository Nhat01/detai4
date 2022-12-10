import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        ArrayList<SmartPhone> smarts = new ArrayList<SmartPhone>();

        int n;
        System.out.print("Nhap so luong smart phone: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin smartphone thu " + (i+1) + ":");
            SmartPhone smart = new SmartPhone();
            smart.nhap();
            smarts.add(smart);
        }

        System.out.println();

        for (int i = 0; i < smarts.size(); i++) {
            System.out.println("Thong tin cua smartphone thu " + (i+1) + ":");
            smarts.get(i).xuat();
        }
    }
}
