
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
        
        //----------AnalisisRuangKelas----------
        
        //Perhitungan()
        Test3.AnalisisPerhitungan();
        
        //KondisiRuangKelas()
        Test3.AnalisisJumlahPintu();
        Test3.AnalisisJumlahJendela();
        
        //JumlahKondisiDanPosisiSarana()
        Test3.AnalisisStopKontak();
        Test3.AnalisisKabelLCD();
        Test3.AnalisisLampu();
        Test3.AnalisisKipas();
        Test3.AnalisisAc();
        Test3.AnalisisSSID();
        Test3.AnalisisBandwidth();
        Test3.AnalisisCctv();
        
        //LingkunganRuangKelas()
        Test3.AnalisisKondisiLantai();
        Test3.AnalisisKondisiDinding();
        Test3.AnalisisKondisiAtap();
        Test3.AnalisisKondisiPintu();
        Test3.AnalisisKunciJendela();
        
        //KebersihanRuangKelas()
        Test3.AnalisisSirkulasiUdara();
        Test3.AnalisisNilaiPencahayaan();
        Test3.AnalisisKelembapan();
        Test3.AnalisisSuhu();
        
        //KenyamananRuangKelas()
        Test3.AnalisisKebisingan();
        Test3.AnalisisBau();
        Test3.AnalisisKebocoran();
        Test3.AnalisisKerusakan();
        Test3.AnalisisKeausan();
        
        //KeamananRuangKelas()
        Test3.AnalisisKekokohan();
        Test3.AnalisisKunciPintu();
        Test3.AnalisisKunciJendela();
        Test3.AnalisisBahaya();
        
        //-----------OutputRuangKelas-----------
        
        Test3.TampilIdentitasRuangKelas();
        Test3.TampilPerhitungan();
        Test3.TampilKondisiRuangKelas();
        Test3.TampilJumlahKondisiDanPosisiSarana();
        Test3.TampilLingkunganRuangKelas();
        Test3.TampilKebersihanRuangKelas();
        Test3.TampilKenyamananRuangKelas();
        Test3.TampilKeamananRuangKelas();
                    
    }
}
