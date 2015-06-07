
import java.io.*;
import java.util.Scanner;

public class TestRuangKelas {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        
        KontrolRuangKelas Test2 = new KontrolRuangKelas();
          
            
          //Test2.login();
          Test2.Perhitungan();
          Test2.TambahPerhitungan();
          Test2.KondisiRuangKelas();
          Test2.JumlahKondisiDanPosisiSarana();
          Test2.LingkunganRuangKelas(); 
          Test2.KebersihanRuangKelas();
          Test2.KenyamananRuangKelas();
          Test2.KeamananRuangKelas();
        
          Test2.Analisis();
          Test2.Output();

    }
    
    
}
