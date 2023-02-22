import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        System.out.print("Fibonaci Sayısının Eleman Sayısını Giriniz :");
        int n = inp.nextInt();

        int a = 0, b = 1,c;
        System.out.print(a+""+b);

        for (int i = 2;i < n;i++) {
            c = a + b;
            System.out.print(""+ c);
            a = b;
            b = c;
        }
    }
}