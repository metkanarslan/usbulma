import java.util.Scanner;
public class Yeniiiiii {
    public static void main(String[] args) {
        int n,k;
        Scanner inp = new Scanner(System.in);
        System.out.print("Üssü Alınacak Sayıyı Giriniz : ");
        n=inp.nextInt();
        System.out.print("Üs Olacak Sayıyı Giriniz : ");
        k=inp.nextInt();
        int total=1;
        for (int i=1; i<=k; i++){
            total*=n;
        }
        System.out.println("Cevap : "+total);
    }

}
