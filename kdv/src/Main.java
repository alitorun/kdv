import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double kdvoran=0.18, tutar, kdvtutar, kdvlitutar  ;

        Scanner giris = new Scanner(System.in);
        System.out.println("ücret tutarini giriniz");
        tutar =giris.nextDouble();
        kdvtutar = kdvoran*tutar;
        kdvlitutar = kdvtutar+tutar;

        System.out.println("Kdv siz tutar :" +tutar);
        System.out.println("kdv tutari :" +kdvtutar);
        System.out.println("KDV li tutar :" +kdvlitutar);



    }
}