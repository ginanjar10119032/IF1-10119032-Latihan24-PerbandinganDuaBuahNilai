package if1.pkg10119032.latihan24.perbandinganduabuahnilai;
import java.util.Scanner;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program untuk menampilkan
 * perbandingan dua buah nilai
 */
public class IF110119032Latihan24PerbandinganDuaBuahNilai {

    static void perbandinganNilai(){
        //pengguna memasukkan nilai pertama dan kedua
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai pertama : ");
        int nilaiPertama = scan.nextInt();
        System.out.print("Masukkan nilai kedua : ");
        int nilaiKedua = scan.nextInt();        
        
        //menampilkan nilai mana yang lebih besar
        int hasil;
        System.out.print("Hasil : ");
        if(nilaiPertama > nilaiKedua)
            System.out.println(nilaiPertama +" Lebih besar dari " +nilaiKedua);
        else if(nilaiPertama < nilaiKedua)
            System.out.println(nilaiPertama +" Lebih kecil dari " +nilaiKedua);
        else if(nilaiPertama == nilaiKedua)
            System.out.println(nilaiPertama +" Sama dengan " +nilaiKedua);
        else
            System.out.println("Pastikan nilai yang anda masukkan adalah angka");
    }

        public static String opsiPengguna(){
            //menanyakan apakah pengguna ingin melakukan perbandingan lagi
            Scanner scan = new Scanner(System.in);
            System.out.print("\nUlangi aktivitas ? (Ya/Tidak) : ");
            String getOpsi = scan.next();
            return getOpsi;
        }
        
    public static void main(String[] args) {
        //badan program
        System.out.println("===== Program perbandingan Nilai =====");        
        perbandinganNilai();
        String getOpsi = opsiPengguna();
        
        while(getOpsi.equals("ya") || getOpsi.equals("Ya")){
            perbandinganNilai();
            getOpsi = null;
            getOpsi = opsiPengguna();
        }
    }
}
