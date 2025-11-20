import java.util.Scanner;

public class Faiz {
    public static void main(String[] args) {
        Scanner source=new Scanner(System.in);
        double esas_mebleg, illik_faiz_derecesi, illerin_sayi;
        System.out.println("kompound faiz \n əsas məbləğ: "); esas_mebleg=source.nextDouble();
        System.out.print("illik faiz dərəcəsi: "); illik_faiz_derecesi = source.nextDouble();
        System.out.print("illərin sayı: "); illerin_sayi=source.nextDouble();

        double yekun_mebleg = esas_mebleg * Math.pow(1 + illik_faiz_derecesi, illerin_sayi);
        int yekun_mebleg_int=(int)Math.round(yekun_mebleg);

        System.out.println("\nnəticələr");
        System.out.println("\nilkin məbləğ: "+esas_mebleg);
        System.out.println("\nfaiz dərəcəsi: "+illik_faiz_derecesi);
        System.out.println("\nillərin sayı: "+illerin_sayi);
        System.out.println("\nyekun məbləğ: "+yekun_mebleg);
        System.out.println("\nyuvarlaqlaşdırılmış: "+yekun_mebleg_int);
    }
}
