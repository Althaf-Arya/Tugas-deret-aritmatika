import java.util.Scanner;

public class deretPerulangan {
    public static void main(String[] args) {
        int batasAwal=0, batasAkhir=0, beda, pilihan;

        Scanner d = new Scanner(System.in);

        System.out.println("Masukkan batas atas: ");
        batasAwal = d.nextInt();

        System.out.println("Masukkan batas akhir: ");
        batasAkhir = d.nextInt();

        System.out.println("Masukkan beda deret: ");
        beda = d.nextInt();


        System.out.println("1. for\n2. while");
        System.out.println("Ingin menggunakan for atau while? ");
        pilihan = d.nextInt();

        if (pilihan == 1) {  
            // Menggunakan loop for  
            for (int i = batasAwal; i <= batasAkhir; i += beda) {  
               System.out.print(i + " ");  
            }  
          } else if (pilihan == 2) {  
            // Menggunakan loop while  
            int i = batasAwal;  
            while (i <= batasAkhir) {  
               System.out.print(i + " ");  
               i += beda;  
            }  
          } else {  
            System.out.println("Pilihan tidak valid");  
          }  
       }  
    }


    

