
public class AnalisisRuangKelas extends KontrolRuangKelas{

    
    String AnalisisPerhitungan(){
        
        Kontrol.setLuas(Kontrol.getPanjangRuang()*Kontrol.getLebarRuang());
 
        Kontrol.setLuasRasio(Kontrol.getJumlahKursi()/Kontrol.getLuas());
        
        if(Kontrol.getPanjangRuang() != Kontrol.getLebarRuang()){
            System.out.println("\n--> bentuk ruang Sesuai");
            return "bentuk ruang Sesuai";
        }
        else {
            System.out.println("\n--> bentuk ruang Tidak Sesuai");
            return "bentuk ruang Tidak Sesuai";
        }
    }
    
    String AnalisisJumlahPintu(){
        
        if(Kontrol.getJumlahPintu()>=2){
              System.out.println("\n--> jumlah pintu Sesuai\n");
              return"jumlah pintu sesuai";
         }
        else{
              System.out.println("\n--> jumlah pintu Tidak Sesuai");
              return"jumlah pintu tidak sesuai";
         }
    }
    
    String AnalisisJumlahJendela(){
        
        if(Kontrol.getJumlahJendela()>=1){
              System.out.println("\n--> jumlah jendela Sesuai");
              return"jumlah jendela sesuai";
         }
        else{
              System.out.println("\n--> jumlah jendela Tidak Sesuai");
              return"jumlah jendela tidak sesuai";
         } 
       
    }
    
    String AnalisisStopKontak(){
        
        if(Kontrol.getJumlahStopKontak() >=4&&Kontrol.getKondisiStopKontak().equalsIgnoreCase("Baik")&&
            (Kontrol.getPosisiStopKontak().equalsIgnoreCase("pojok ruang")||Kontrol.getPosisiStopKontak().equalsIgnoreCase("dekat dosen"))){
             System.out.println("\n--> stop kontak Sesuai");
             return"stop kontak sesuai";
         } 
         else{
             System.out.println("\n-->  stop kontak Tidak Sesuai");
             return"stop kontak Tidak sesuai";
         }
    }
    
    String AnalisisKabelLCD(){
        
        if(Kontrol.getJumlahKabelLcd()>=1&&Kontrol.getKondisiKabelLcd().equalsIgnoreCase("Berfungsi")&&
             Kontrol.getPosisiKabelLcd().equalsIgnoreCase("dekat dosen")){
              System.out.println("\n--> kabel LCD Sesuai");
              return"kabel LCD sesuai";
         }
         else{
              System.out.println("\n--> kabel LCD Tidak Sesuai");
              return"kabel LCD tidak sesuai";
         }
        
    }
    
    String AnalisisLampu(){
        
        if(Kontrol.getJumlahLampu()>=18&&Kontrol.getKondisiLampu().equalsIgnoreCase("Baik")&&
             Kontrol.getPosisiLampu().equalsIgnoreCase("atap ruangan")){
              System.out.println("\n-->  Lampu Sesuai");
              return"lampu sesuai";
         }
         else{
              System.out.println("\n-->  Lampu Tidak Sesuai");
              return"lampu tidak sesuai";
         }
        
    }
    
    String AnalisisKipas(){
        
        if(Kontrol.getJumlahKipas()>=2&&Kontrol.getKondisiKipas().equalsIgnoreCase("Baik")&&
             Kontrol.getPosisiKipas().equalsIgnoreCase("atap ruangan")){
              System.out.println("\n-->  kipas angin Sesuai");
              return"kipas angin sesuai";
              
         }
          else{
              System.out.println("\n-->  kipas angin Tidak Sesuai");
              return"kipas angin tidak sesuai";
         }
        
    }
    
    String AnalisisAc(){
        
        if(Kontrol.getJumlahAc()>=1&&Kontrol.getKondisiAc().equalsIgnoreCase("Baik")&&
             (Kontrol.getPosisiAc().equalsIgnoreCase("di belakang")||Kontrol.getPosisiAc().equalsIgnoreCase("di samping"))){
              System.out.println("\n-->  AC Sesuai");
              return"AC sesuai";
         }
          else{
              System.out.println("\n-->  AC Tidak Sesuai");
              return"AC tidak sesuai";
         }
        
    }
    
    String AnalisisSSID(){
        
        if(Kontrol.getSSID().equalsIgnoreCase("UMM Hotspot")){
              System.out.println("\n-->  SSID Sesuai");
              return"SSID sesuai";
              
          }
          else{
              System.out.println("\n-->  SSID Tidak Sesuai");
              return"SSID tidak Sesuai";
         }
    }
    
    String AnalisisBandwidth(){
        
        if((Kontrol.getID().equalsIgnoreCase("fahri")&&Kontrol.getPassword().equalsIgnoreCase("ale"))||
            (Kontrol.getID().equalsIgnoreCase("gofur")&&Kontrol.getPassword().equalsIgnoreCase("jo"))||
            (Kontrol.getID().equalsIgnoreCase("topek")&&Kontrol.getPassword().equalsIgnoreCase("hidayat"))){
              System.out.println("\n-->  Login berhasil dan -->  Bandwidth Sesuai ");
              return"-->  Login berhasil dan -->  Bandwidth Sesuai";
              
         }
          else{
              System.out.println("\n-->  Login gagal dan -->  Bandwidth Tidak Sesuai");
              return"-->  Login gagal dan -->  Bandwidth Tidak Sesuai";
         } 
        
    }
    
    String AnalisisCctv(){
        
        if(Kontrol.getJumlahCctv()>=2&&Kontrol.getKondisiCctv().equalsIgnoreCase("Baik")&&
           (Kontrol.getPosisiCctv().equalsIgnoreCase("di depan")||Kontrol.getPosisiCctv().equalsIgnoreCase("di belakang"))){
              System.out.println("\n--> CCTV Sesuai");
              return"CCTV sesuai";
         }
          else{
              System.out.println("\n--> CCTV Tidak Sesuai");
              return"CCTV tidak sesuai";
         }  
    }
    
    
    String AnalisisKondisiLantai(){
        
        if(Kontrol.getKondisiLantai().equalsIgnoreCase("Bersih")){
              System.out.println("\n--> kondisi lantai Sesuai");
              return"kondisi lantai sesuai";
         }
       else{
              System.out.println("\n--> kondisi lantai Tidak Sesuai");
              return"kondisi lantai tidak sesuai";
         }
    }
    
    String AnalisisKondisiDinding(){
        
        if(Kontrol.getKondisiDinding().equalsIgnoreCase("Bersih")){
              System.out.println("\n--> kondisi dinding Sesuai");
              return"kondisi dinding sesuai";
         }
       else{
              System.out.println("\n--> kondiisi dinding Tidak Sesuai");
              return"kondisi dinding tidak sesuai";
        }
    }
    
    String AnalisisKondisiAtap(){
        
        if(Kontrol.getKondisiAtap().equalsIgnoreCase("Bersih")){
              System.out.println("\n--> kondisi atap Sesuai");
              return"kondisi atap sesuai";
         }
       else{
              System.out.println("\n--> kondisi atap Tidak Sesuai");
              return"kondisi atap tidak sesuai";
         }
    }
    
    String AnalisisKondisiPintu(){
        
        if(Kontrol.getKondisiPintu().equalsIgnoreCase("Bersih")){
              System.out.println("\n--> kondisi pintu Sesuai");
              return"kondisi pintu sesuai";
         }
       else{
              System.out.println("\n--> kondisi pintu Tidak Sesuai");
              return"kondisi pintu tidak sesuai";
         } 
    }
    
    String AnalisisKondisiJendela(){
        
        if(Kontrol.getKondisiJendela().equalsIgnoreCase("Bersih")){
              System.out.println("\n--> kondisi jendela Sesuai");
              return"kondisi jendela sesuai";
         } 
       else{
              System.out.println("\n--> kondisi jendela Tidak Sesuai");
              return"kondisi jendela tidak sesuai";
         }
        
    }
    
    String AnalisisSirkulasiUdara(){
        
        if(Kontrol.getSirkulasiUdara().equalsIgnoreCase("Lancar")){
              System.out.println("\n--> sirkulasi udara Sesuai");
              return"sirkulasi udara sesuai";
         }
        else{
              System.out.println("\n--> sirkulasi udara Tidak Sesuai");
              return"sirkulasi udara tidak sesuai";
         }
    }
    
    String AnalisisNilaiPencahayaan(){
        
        if(Kontrol.getNilaiPencahayaan()>=250&&Kontrol.getNilaiPencahayaan()<=350){
              System.out.println("\n--> nilai pencahayaan Sesuai");
              return"nilai pencahayaan sesuai";
         }
        else{
              System.out.println("\n--> nilai pencahayaan Tidak Sesuai");
              return"nilai pencahayaan tidak sesuai";
         }
    }
    
    String AnalisisKelembapan(){
        
        if(Kontrol.getKelembapan()>=70&&Kontrol.getKelembapan()<=80){
              System.out.println("\n--> kelembapan Sesuai");
              return"kelembapan sesuai";
         }
        else{
              System.out.println("\n--> kelembapan Tidak Sesuai");
              return"kelembapan tidak sesuai";
         }
    }
    
    String AnalisisSuhu(){
        
        if(Kontrol.getSuhu()>=25&&Kontrol.getSuhu()<=35){
              System.out.println("\n--> Suhu Sesuai");
              return"suhu sesuai";
         }
        else{
              System.out.println("\n--> Suhu Tidak Sesuai");
              return"suhu tidak sesuai";
         } 
    }
    
    String AnalisisKebisingan(){
        
        if(Kontrol.getKebisingan().equalsIgnoreCase("Tidak Bising")){
              System.out.println("\n--> Kebisingan Sesuai");
              return"kebisingan Sesuai";
         }
       else{
              System.out.println("\n--> Kebisingan Tidak Sesuai");
              return"kebisingan tidak sesuai";
         }
    }
    
    String AnalisisBau(){
        
        if(Kontrol.getBau().equalsIgnoreCase("Tidak Bau")){
              System.out.println("\n--> bau Sesuai");
              return"bau sesuai";
         }
       else{
              System.out.println("\n--> bau Tidak Sesuai");
              return"bau tidak sesuai";
         }
    }
    
    String AnalisisKebocoran(){
        
        if(Kontrol.getKebocoran().equalsIgnoreCase("Tidak Bocor")){
              System.out.println("\n--> kebocoran Sesuai");
              return"kebocoran sesuai";
         }
       else{
              System.out.println("\n--> kebocoran Tidak Sesuai");
              return"kebocoran tidak sesuai";
         } 
    }
    
    String AnalisisKerusakan(){
        
        if(Kontrol.getKerusakan().equalsIgnoreCase("Tidak Rusak")){
              System.out.println("\n--> kerusakan Sesuai");
              return"kerusakan sesuai";
         }
       else{
              System.out.println("\n--> kerusakan Tidak Sesuai");
              return"kerusakan tidak sesuai";
         }
    }
    
    String AnalisisKeausan(){
        
        if(Kontrol.getKeausan().equalsIgnoreCase("Tidak Aus")){
              System.out.println("\n--> keausan Sesuai");
              return"keausan sesuai";
         } 
       else{
              System.out.println("\n--> keausan Tidak Sesuai");
              return"keausan tidak sesuai";
         }
    }
    
    String AnalisisKekokohan(){
        
         if(Kontrol.getKekokohan().equalsIgnoreCase("Kokoh")){
              System.out.println("\n--> kekokohan Sesuai");
              return"kekokohan sesuai";
         }
       else{
              System.out.println("\n--> kekokohan Tidak Sesuai");
              return"kekokohan tidak sesuai";
         }
    }
    
    String AnalisisKunciPintu(){
        
         if(Kontrol.getKunciPintu().equalsIgnoreCase("Ada")){
              System.out.println("\n--> kunci pintu Sesuai");
              return"kunci pintu sesuai";
         }
       else{
              System.out.println("\n--> kunci pintu Tidak Sesuai");
              return"kunci pintu tidak sesuai";
         }
    }
    
    String AnalisisKunciJendela(){
        
         if(Kontrol.getKunciJendela().equalsIgnoreCase("Ada")){
              System.out.println("\n--> kunci jendela Sesuai");
              return"kunci jendela sesuai";
         }
       else{
              System.out.println("\n--> kunci jendela Tidak Sesuai");
              return"kunci jendela tidak sesuai";
         }
    }
    
    String AnalisisBahaya(){
        
         if(Kontrol.getBahaya().equalsIgnoreCase("Aman")){
              System.out.println("\n--> bahaya Sesuai");
              return"bahaya sesuai";
         }
       else{
              System.out.println("\n--> bahaya Tidak Sesuai");
              return"bahaya tidak sesuai";
         } 
         
    }

    @Override
    public void IndentitasRuangKelas() {
        
        System.out.println("----------LOKASI RUANG SELAIN GKB 1---------\n");
        
        System.out.println("Masukkan Nama Ruang Kelas yang Anda Inginkan : ");
        String NamaRuang = in.nextLine();
        Kontrol.setNamaRuang(NamaRuang);
        
        System.out.println("Masukkan Lokasi Ruang yang Anda Inginkan : ");
        String LokasiRuang = in.nextLine();
        Kontrol.setLokasiRuang(LokasiRuang);
        
        System.out.println("Masukkan Program Studi atau Fakultas yang Anda Inginkan");
        String ProgramStudi = in.nextLine();
        Kontrol.setProgramStudi(ProgramStudi);
    }
    
}
