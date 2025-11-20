import java.util.Scanner;

public class Zaman{
    public static void main(String[] args){
        Scanner source=new Scanner(System.in);

        System.out.print("saniyə: ");
        long toplam_saniye, qaliq;
        toplam_saniye=source.nextLong();qaliq=toplam_saniye%3600;

        int saat=(int)(toplam_saniye/3600);

        int deqiqe,saniye;
        deqiqe=(int)(qaliq/60);saniye=(int)(qaliq%60);

        System.out.println("nəticə (hh:mm:ss): "+saat+":"+deqiqe+":"+saniye);
    }
}
