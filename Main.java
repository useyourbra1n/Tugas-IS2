
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    
    String pilihan;

    System.out.println("Menu menghitung shape");
    Scanner SC=new Scanner(System.in);
   
    System.out.println("1.Persegi\n2.Persegi Panjang\n3.Lingkaran");
    pilihan=SC.nextLine();
    
    switch(pilihan) {
                     case"1":
                    System.out.println("Masukan sisi");
                    pilihan=SC.nextLine();
                         System.out.println("Luas 5x5 = 25");
                         break;
                    case"2":
                    System.out.println("Masukan panjang");
                    pilihan=SC.nextLine();
                         System.out.println("Masukan lebar");
                     pilihan=SC.nextLine();
                        System.out.println("Luas 3x2 = 6");
                    case"3":
                        System.out.println("Masukan jari-jari");
                    pilihan=SC.nextLine();
                        System.out.println("Luas 3.14 x1 x1 = 3.14");
                         break;
                         default:
                    
    }
  }
}
