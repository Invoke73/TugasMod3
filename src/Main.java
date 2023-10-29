import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Program kalkulator sederhana");
        System.out.println("Pilih menu : ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Pembagian");
        System.out.print("Pilihan : ");
        int pilih = input.nextInt();

        System.out.print("Masukkan angka ke -1 : ");
        int num1 = input.nextInt();
        System.out.print("Masukkan angka ke -2 : ");
        int num2 = input.nextInt();

        calculator(pilih,num1,num2);

    }



    // template for calculator
    //index for user choice input, num1 for var num 1 and num 2 var num 2
    public static void calculator (int index,int num1,int num2) {
        switch(index){
            case 1:
               System.out.println("Melakukan penjumlahan");
               System.out.println("Hasil : "+(num1 + num2));
             break;
            case 2:
               System.out.println("Melakukan pengurangan");
               System.out.println("Hasil : "+(num1 - num2));
             break;
            case 3:
               System.out.println("melakukan Pembagian");
               System.out.println("Hasil : "+(num1 / num2));
             break;
        }
    }

}