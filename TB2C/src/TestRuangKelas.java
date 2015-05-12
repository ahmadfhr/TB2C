
import java.util.Scanner;

public class TestRuangKelas {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        
        OutputRuangKelas Test3 = new OutputRuangKelas();
        
        //----------KontrolRuangKelas----------
        
        System.out.println("Apakah Ruangan anda di GKB 1  (ya/tidak) : ");
        String LokasiRuang = in.nextLine();
        if(LokasiRuang.equalsIgnoreCase("ya")){
           Test3.IdentitasRuangKelas("GKB 1");
        }
        else{Test3.IdentitasRuangKelas();}
        
        
        Test3.Perhitungan();
        Test3.KondisiRuangKelas();
        Test3.JumlahKondisiDanPosisiSarana();
        Test3.LingkunganRuangKelas(); 
        Test3.KebersihanRuangKelas();
        Test3.KenyamananRuangKelas();
        Test3.KeamananRuangKelas();
        
    }
}