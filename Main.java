import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double mesafe,ucret,a;
        Scanner mec = new Scanner(System.in);

        System.out.print("Mesafeyi Km Cinsinden Giriniz: ");
        mesafe = mec.nextDouble();
        
        a = mesafe*2.20+10;
        ucret = a < 20 ? 20 : a;
        System.out.println("Yol ücretiniz: " + ucret);
    }
}