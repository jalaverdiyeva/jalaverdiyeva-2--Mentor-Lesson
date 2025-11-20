import java.util.Scanner;

public class Gonderis{
    public static void main(String[] args){
        Scanner source=new Scanner(System.in);
        double uzunluq,en,hundurluk,gonderis_hecmi,hecm_cekisi,yekun_qiymet;
        System.out.println("\nbeynəlxalq göndərişin qiymətləndirilməsi");
        System.out.print("\nuzunluğu: "); uzunluq=source.nextDouble();
        System.out.print("\neni: "); en=source.nextDouble();
        System.out.print("\nhündürlüyü: "); hundurluk=source.nextDouble();

        gonderis_hecmi=uzunluq*en*hundurluk;
        hecm_cekisi=gonderis_hecmi/6000;
        yekun_qiymet=hecm_cekisi*1.5;

        System.out.println("\nnəticə");
        System.out.println("\nhəcm: "+gonderis_hecmi+", həcm çəkisi: "+hecm_cekisi+", yekun göndəriş qiyməti: "+yekun_qiymet+" AZN");
    }
}
