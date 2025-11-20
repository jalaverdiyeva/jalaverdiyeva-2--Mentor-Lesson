import java.util.Scanner;

public class Anbar{
    public static void main(String[] args){
        Scanner source=new Scanner(System.in);
        String anbar_kodu; int ascii_deyeri, tehlukesizlik_kodu;
        System.out.print("\nkod: "); anbar_kodu=source.nextLine();

        char kod_herfi=anbar_kodu.charAt(1);
        ascii_deyeri=(int)kod_herfi; tehlukesizlik_kodu=(ascii_deyeri/32)-10;

        System.out.println("\nnəticə");
        System.out.println("\nikinci simvol: "+kod_herfi+", ASCII dəyəri: " + ascii_deyeri+", təhlükəsizlik kodu: " + tehlukesizlik_kodu);
    }
}
