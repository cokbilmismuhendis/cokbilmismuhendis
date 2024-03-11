import java.util.Scanner;
public class ucgeninHipotenusu {
    public static void main(String[] args) {

    Scanner ucgeninKenarlari = new Scanner(System.in);
    double birincikenar,ikicikenar,hipotenus;

        System.out.println("Lütfen dik kenarların ölçülerini girin");
        birincikenar=ucgeninKenarlari.nextDouble();
        ikicikenar=ucgeninKenarlari.nextDouble();


        hipotenus = Math.sqrt((birincikenar * birincikenar) + (ikicikenar * ikicikenar)) ;

        System.out.println("hipotenüsün uzunluğu  "+hipotenus);


        //alan bhesaplayacağız burada
        double ucgeninAlani= (birincikenar*ikicikenar)/2;
        System.out.println("üçgenin alanı  "+ucgeninAlani);

    }
}
