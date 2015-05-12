
public class OutputRuangKelas extends AnalisisRuangKelas {
    

    void TampilIdentitasRuangKelas(){
        
        System.out.println("\n----------Identitas Ruang Kelas----------\n");
        System.out.println("Nama Ruang Kelas :" +Kontrol.getNamaRuang());
        System.out.println("Lokasi Ruang Kelas :"+Kontrol.getLokasiRuang());
        System.out.println("Program Studi/Fakultas :"+Kontrol.getProgramStudi());
    }
    void TampilPerhitungan(){
        
        System.out.println("\nLuas : "+Kontrol.getLuas());
        System.out.println("Luas Rasio : "+Kontrol.getLuasRasio());
        
    }
    void TampilKondisiRuangKelas(){
        
        System.out.println("\n----------Jumlah Pintu----------\n");
        System.out.println("Jumlah pintu :" +Kontrol.getJumlahPintu());
        
        System.out.println("\n----------Jumlah Jendela----------\n");
        System.out.println("Jumlah Jendela :" +Kontrol.getJumlahJendela());
        
        
    }
    
    void TampilJumlahKondisiDanPosisiSarana(){
        
         System.out.println("\n----------Stop Kontak/Steker----------\n");
         System.out.println("Jumlah Stop Kontak :"+Kontrol.getJumlahStopKontak());
         System.out.println("Kondisi Stop Kontak :"+Kontrol.getKondisiStopKontak());
         System.out.println("Posisi Stop Kontak :"+Kontrol.getPosisiStopKontak());
         
         System.out.println("\n----------Kabel LCD----------\n");
         System.out.println("Jumlah Kabel LCD :"+Kontrol.getJumlahKabelLcd());
         System.out.println("Kondisi Kabel LCD :"+Kontrol.getKondisiKabelLcd());
         System.out.println("Posisi Kabel LCD :"+Kontrol.getPosisiKabelLcd());
         
         System.out.println("----------Lampu----------\n");
         System.out.println("Jumlah Lampu :"+Kontrol.getJumlahLampu());
         System.out.println("Kondisi Lampu :"+Kontrol.getKondisiLampu());
         System.out.println("Posisi Lampu :"+Kontrol.getPosisiLampu());
         
         System.out.println("----------Kipas Angin----------\n");
         System.out.println("Jumlah Kipas Angin :"+Kontrol.getJumlahKipas());
         System.out.println("Kondisi Kipas Angin :"+Kontrol.getKondisiKipas());
         System.out.println("Posisi Kipas Angin :"+Kontrol.getPosisiKipas());
         
         System.out.println("----------AC----------\n");
         System.out.println("Jumlah AC :"+Kontrol.getJumlahAc());
         System.out.println("Kondisi Ac :"+Kontrol.getKondisiAc());
         System.out.println("Posisi Ac :"+Kontrol.getPosisiAc());
         
         System.out.println("----------SSID----------\n");
         System.out.println("SSID :"+Kontrol.getSSID());
         
         System.out.println("-----------Bandwidth-----------");
         System.out.println("Banwidth : "+Kontrol.getBandwidth());
         
         System.out.println("\n----------Kabel CCTV----------\n");
         System.out.println("Jumlah CCTV :"+Kontrol.getJumlahCctv());
         System.out.println("Kondisi CCTV :"+Kontrol.getKondisiCctv());
         System.out.println("Posisi CCTV :"+Kontrol.getPosisiCctv());
         
    }
    
    void TampilLingkunganRuangKelas(){
        
       System.out.println("----------Kondisi Lantai----------\n");
       System.out.println("Kondisi Lantai :"+Kontrol.getKondisiLantai());
       
       System.out.println("----------Kondisi Dinding----------\n");
       System.out.println("Kondisi Dinding :"+Kontrol.getKondisiDinding());
       
       System.out.println("----------Kondisi Atap----------\n");
       System.out.println("Kondisi Atap :"+Kontrol.getKondisiAtap());
       
       System.out.println("----------Kondisi Pintu----------\n");
       System.out.println("Kondisi Pintu :"+Kontrol.getKondisiPintu());
       
       System.out.println("----------Kondisi Jendela----------\n");
       System.out.println("Kondisi Jendela :"+Kontrol.getKondisiJendela());
       
    }
    
    void TampilKebersihanRuangKelas(){
        
        System.out.println("----------Sirkulasi Udara----------\n");
        System.out.println("Sirkulasi Udara :"+Kontrol.getSirkulasiUdara());
        
        System.out.println("----------Nilai Pencahayaan----------\n");
        System.out.println("Nilai Pencahayaan :"+Kontrol.getNilaiPencahayaan());
        
        System.out.println("----------Kelembapan----------\n");
        System.out.println("Kelembapan :"+Kontrol.getKelembapan());
        
        System.out.println("----------Suhu----------\n");
        System.out.println("Suhu :"+Kontrol.getSuhu());
    }
    
    void TampilKenyamananRuangKelas(){
        
        System.out.println("----------Kebisingan----------\n");
        System.out.println("Kebisingan :"+Kontrol.getKebisingan());
        
        System.out.println("----------Bau----------\n");
        System.out.println("Bau :"+Kontrol.getBau());
        
        System.out.println("----------Kebocoran----------\n");
        System.out.println("Kebocoran :"+Kontrol.getKebocoran());
        
        System.out.println("----------Kerusakan----------\n");
        System.out.println("Kerusakan :"+Kontrol.getKerusakan());
        
        System.out.println("----------Keausan----------\n");
        System.out.println("Keausan :"+Kontrol.getKeausan());
    }
    
    void TampilKeamananRuangKelas(){
        
        System.out.println("----------Kekokohan----------\n");
        System.out.println("Kekokohan :"+Kontrol.getKekokohan());
        
        System.out.println("----------Kunci Pintu----------\n");
        System.out.println("Kunci Pintu :"+Kontrol.getKunciPintu());
        
        System.out.println("----------Kunci Jendela----------\n");
        System.out.println("Kunci Jedela :"+Kontrol.getKunciJendela());
        
        System.out.println("----------Bahaya----------\n");
        System.out.println("Bahaya :"+Kontrol.getBahaya());
        
        
    }
}
