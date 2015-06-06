import java.io.*;
import java.io.Serializable;


public class OutputRuangKelas extends AnalisisRuangKelas implements Serializable {
    
    void TampilIdentitasRuangKelas(){
        
        System.out.println("\n----------Identitas Ruang Kelas----------\n");
        System.out.println("Nama Ruang Kelas :" +getNamaRuang());
        System.out.println("Lokasi Ruang Kelas :"+getLokasiRuang());
        System.out.println("Program Studi/Fakultas :"+getProgramStudi());
        
       
    
    }
    
    void TampilPerhitungan(){
        
        System.out.println("\nLuas : "+getLuas());
        System.out.println("Luas Rasio : "+getLuasRasio());
        

        
    }
        
    void TampilTambahPerhitungan(){
            
        System.out.println("\nVolume : "+Volume(getPanjangRuang(), getLebarRuang(), getTinggiRuang()));
        System.out.println("Luas Permukaan : "+LuasPermukaan(getPanjangRuang(), getLebarRuang(), getTinggiRuang()));
        

    }
    
    void TampilKondisiRuangKelas(){
        
        System.out.println("\n----------Jumlah Pintu----------\n");
        System.out.println("Jumlah pintu :" +getJumlahPintu());
        
        System.out.println("\n----------Jumlah Jendela----------\n");
        System.out.println("Jumlah Jendela :" +getJumlahJendela());
        

        
    }
    
    void TampilJumlahKondisiDanPosisiSarana(){
        
         System.out.println("\n----------Stop Kontak/Steker----------\n");
         System.out.println("Jumlah Stop Kontak :"+getJumlahStopKontak());
         System.out.println("Kondisi Stop Kontak :"+getKondisiStopKontak());
         System.out.println("Posisi Stop Kontak :"+getPosisiStopKontak());
         
         System.out.println("\n----------Kabel LCD----------\n");
         System.out.println("Jumlah Kabel LCD :"+getJumlahKabelLcd());
         System.out.println("Kondisi Kabel LCD :"+getKondisiKabelLcd());
         System.out.println("Posisi Kabel LCD :"+getPosisiKabelLcd());
         
         System.out.println("----------Lampu----------\n");
         System.out.println("Jumlah Lampu :"+getJumlahLampu());
         System.out.println("Kondisi Lampu :"+getKondisiLampu());
         System.out.println("Posisi Lampu :"+getPosisiLampu());
         
         System.out.println("----------Kipas Angin----------\n");
         System.out.println("Jumlah Kipas Angin :"+getJumlahKipas());
         System.out.println("Kondisi Kipas Angin :"+getKondisiKipas());
         System.out.println("Posisi Kipas Angin :"+getPosisiKipas());
         
         System.out.println("----------AC----------\n");
         System.out.println("Jumlah AC :"+getJumlahAc());
         System.out.println("Kondisi Ac :"+getKondisiAc());
         System.out.println("Posisi Ac :"+getPosisiAc());
         
         System.out.println("----------SSID----------\n");
         System.out.println("SSID :"+getSSID());
         
         System.out.println("-----------Bandwidth-----------");
         System.out.println("Banwidth : "+getBandwidth());
         
         System.out.println("\n----------Kabel CCTV----------\n");
         System.out.println("Jumlah CCTV :"+getJumlahCctv());
         System.out.println("Kondisi CCTV :"+getKondisiCctv());
         System.out.println("Posisi CCTV :"+getPosisiCctv());
         

         
    }
    
    void TampilLingkunganRuangKelas(){
        
       System.out.println("----------Kondisi Lantai----------\n");
       System.out.println("Kondisi Lantai :"+getKondisiLantai());
       
       System.out.println("----------Kondisi Dinding----------\n");
       System.out.println("Kondisi Dinding :"+getKondisiDinding());
       
       System.out.println("----------Kondisi Atap----------\n");
       System.out.println("Kondisi Atap :"+getKondisiAtap());
       
       System.out.println("----------Kondisi Pintu----------\n");
       System.out.println("Kondisi Pintu :"+getKondisiPintu());
       
       System.out.println("----------Kondisi Jendela----------\n");
       System.out.println("Kondisi Jendela :"+getKondisiJendela());
       

       
       
    }
    
    void TampilKebersihanRuangKelas(){
        
        System.out.println("----------Sirkulasi Udara----------\n");
        System.out.println("Sirkulasi Udara :"+getSirkulasiUdara());
        
        System.out.println("----------Nilai Pencahayaan----------\n");
        System.out.println("Nilai Pencahayaan :"+getNilaiPencahayaan());
        
        System.out.println("----------Kelembapan----------\n");
        System.out.println("Kelembapan :"+getKelembapan());
        
        System.out.println("----------Suhu----------\n");
        System.out.println("Suhu :"+getSuhu());
        

        
        
    }
    
    void TampilKenyamananRuangKelas(){
        
        System.out.println("----------Kebisingan----------\n");
        System.out.println("Kebisingan :"+getKebisingan());
        
        System.out.println("----------Bau----------\n");
        System.out.println("Bau :"+getBau());
        
        System.out.println("----------Kebocoran----------\n");
        System.out.println("Kebocoran :"+getKebocoran());
        
        System.out.println("----------Kerusakan----------\n");
        System.out.println("Kerusakan :"+getKerusakan());
        
        System.out.println("----------Keausan----------\n");
        System.out.println("Keausan :"+getKeausan());
        

    }
    
    void TampilKeamananRuangKelas(){
        
        System.out.println("----------Kekokohan----------\n");
        System.out.println("Kekokohan :"+getKekokohan());
        
        System.out.println("----------Kunci Pintu----------\n");
        System.out.println("Kunci Pintu :"+getKunciPintu());
        
        System.out.println("----------Kunci Jendela----------\n");
        System.out.println("Kunci Jedela :"+getKunciJendela());
        
        System.out.println("----------Bahaya----------\n");
        System.out.println("Bahaya :"+getBahaya());
        

        
        
    }

  
}
