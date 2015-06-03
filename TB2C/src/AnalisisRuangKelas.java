
import java.io.Serializable;


public class AnalisisRuangKelas extends ListRuangKelas implements Serializable{

   
    @Override
    String AnalisisPerhitungan(){
        
        setLuas(getPanjangRuang()*getLebarRuang());
 
        setLuasRasio(getJumlahKursi()/getLuas());
        
        if(getPanjangRuang() != getLebarRuang()){
            System.out.println("\n--> bentuk ruang Sesuai");
            return "bentuk ruang Sesuai";
        }
        else {
            System.out.println("\n--> bentuk ruang Tidak Sesuai");
            return "bentuk ruang Tidak Sesuai";
        }
    }
    
    @Override
    String AnalisisJumlahPintu(){
        
        if(getJumlahPintu()>=2){
              System.out.println("\n--> jumlah pintu Sesuai\n");
              return"jumlah pintu sesuai";
         }
        else{
              System.out.println("\n--> jumlah pintu Tidak Sesuai");
              return"jumlah pintu tidak sesuai";
         }
    }
    
    @Override
    String AnalisisJumlahJendela(){
        
        if(getJumlahJendela()>=1){
              System.out.println("\n--> jumlah jendela Sesuai");
              return"jumlah jendela sesuai";
         }
        else{
              System.out.println("\n--> jumlah jendela Tidak Sesuai");
              return"jumlah jendela tidak sesuai";
         } 
       
    }
    
    @Override
    String AnalisisStopKontak(){
        
        if(getJumlahStopKontak() >=4&&getKondisiStopKontak().equalsIgnoreCase("Baik")&&
            (getPosisiStopKontak().equalsIgnoreCase("pojok ruang")||getPosisiStopKontak().equalsIgnoreCase("dekat dosen"))){
             System.out.println("\n--> stop kontak Sesuai");
             return"stop kontak sesuai";
         } 
         else{
             System.out.println("\n-->  stop kontak Tidak Sesuai");
             return"stop kontak Tidak sesuai";
         }
    }
    
    @Override
    String AnalisisKabelLCD(){
        
        if(getJumlahKabelLcd()>=1&&getKondisiKabelLcd().equalsIgnoreCase("Berfungsi")&&
             getPosisiKabelLcd().equalsIgnoreCase("dekat dosen")){
              System.out.println("\n--> kabel LCD Sesuai");
              return"kabel LCD sesuai";
         }
         else{
              System.out.println("\n--> kabel LCD Tidak Sesuai");
              return"kabel LCD tidak sesuai";
         }
        
    }
    
    @Override
    String AnalisisLampu(){
        
        if(getJumlahLampu()>=18&&getKondisiLampu().equalsIgnoreCase("Baik")&&
             getPosisiLampu().equalsIgnoreCase("atap ruangan")){
              System.out.println("\n-->  Lampu Sesuai");
              return"lampu sesuai";
         }
         else{
              System.out.println("\n-->  Lampu Tidak Sesuai");
              return"lampu tidak sesuai";
         }
        
    }
    
    @Override
    String AnalisisKipas(){
        
        if(getJumlahKipas()>=2&&getKondisiKipas().equalsIgnoreCase("Baik")&&
             getPosisiKipas().equalsIgnoreCase("atap ruangan")){
              System.out.println("\n-->  kipas angin Sesuai");
              return"kipas angin sesuai";
              
         }
          else{
              System.out.println("\n-->  kipas angin Tidak Sesuai");
              return"kipas angin tidak sesuai";
         }
        
    }
    
    @Override
    String AnalisisAc(){
        
        if(getJumlahAc()>=1&&getKondisiAc().equalsIgnoreCase("Baik")&&
             (getPosisiAc().equalsIgnoreCase("di belakang")||getPosisiAc().equalsIgnoreCase("di samping"))){
              System.out.println("\n-->  AC Sesuai");
              return"AC sesuai";
         }
          else{
              System.out.println("\n-->  AC Tidak Sesuai");
              return"AC tidak sesuai";
         }
        
    }
    
    @Override
    String AnalisisSSID(){
        
        if(getSSID().equalsIgnoreCase("UMM Hotspot")){
              System.out.println("\n-->  SSID Sesuai");
              return"SSID sesuai";
              
          }
          else{
              System.out.println("\n-->  SSID Tidak Sesuai");
              return"SSID tidak Sesuai";
         }
    }
    
    @Override
    String AnalisisBandwidth(){
        
        if((getID().equalsIgnoreCase("ahmad")&&getPassword().equalsIgnoreCase("fahri"))||
            (getID().equalsIgnoreCase("muhammad")&&getPassword().equalsIgnoreCase("gofur"))||
            (getID().equalsIgnoreCase("moh")&&getPassword().equalsIgnoreCase("taufiq"))){
              System.out.println("\n-->  Login berhasil dan -->  Bandwidth Sesuai ");
              return"-->  Login berhasil dan -->  Bandwidth Sesuai";
              
         }
          else{
              System.out.println("\n-->  Login gagal dan -->  Bandwidth Tidak Sesuai");
              return"-->  Login gagal dan -->  Bandwidth Tidak Sesuai";
         } 
        
    }
    
    @Override
    String AnalisisCctv(){
        
        if(getJumlahCctv()>=2&&getKondisiCctv().equalsIgnoreCase("Baik")&&
           (getPosisiCctv().equalsIgnoreCase("di depan")||getPosisiCctv().equalsIgnoreCase("di belakang"))){
              System.out.println("\n--> CCTV Sesuai");
              return"CCTV sesuai";
         }
          else{
              System.out.println("\n--> CCTV Tidak Sesuai");
              return"CCTV tidak sesuai";
         }  
    }
    
    
    @Override
    String AnalisisKondisiLantai(){
        
        if(getKondisiLantai().equalsIgnoreCase("Bersih")){
              System.out.println("\n--> kondisi lantai Sesuai");
              return"kondisi lantai sesuai";
         }
       else{
              System.out.println("\n--> kondisi lantai Tidak Sesuai");
              return"kondisi lantai tidak sesuai";
         }
    }
    
    @Override
    String AnalisisKondisiDinding(){
        
        if(getKondisiDinding().equalsIgnoreCase("Bersih")){
              System.out.println("\n--> kondisi dinding Sesuai");
              return"kondisi dinding sesuai";
         }
       else{
              System.out.println("\n--> kondiisi dinding Tidak Sesuai");
              return"kondisi dinding tidak sesuai";
        }
    }
    
    @Override
    String AnalisisKondisiAtap(){
        
        if(getKondisiAtap().equalsIgnoreCase("Bersih")){
              System.out.println("\n--> kondisi atap Sesuai");
              return"kondisi atap sesuai";
         }
       else{
              System.out.println("\n--> kondisi atap Tidak Sesuai");
              return"kondisi atap tidak sesuai";
         }
    }
    
    @Override
    String AnalisisKondisiPintu(){
        
        if(getKondisiPintu().equalsIgnoreCase("Bersih")){
              System.out.println("\n--> kondisi pintu Sesuai");
              return"kondisi pintu sesuai";
         }
       else{
              System.out.println("\n--> kondisi pintu Tidak Sesuai");
              return"kondisi pintu tidak sesuai";
         } 
    }
    
    @Override
    String AnalisisKondisiJendela(){
        
        if(getKondisiJendela().equalsIgnoreCase("Bersih")){
              System.out.println("\n--> kondisi jendela Sesuai");
              return"kondisi jendela sesuai";
         } 
       else{
              System.out.println("\n--> kondisi jendela Tidak Sesuai");
              return"kondisi jendela tidak sesuai";
         }
        
    }
    
    @Override
    String AnalisisSirkulasiUdara(){
        
        if(getSirkulasiUdara().equalsIgnoreCase("Lancar")){
              System.out.println("\n--> sirkulasi udara Sesuai");
              return"sirkulasi udara sesuai";
         }
        else{
              System.out.println("\n--> sirkulasi udara Tidak Sesuai");
              return"sirkulasi udara tidak sesuai";
         }
    }
    
    @Override
    String AnalisisNilaiPencahayaan(){
        
        if(getNilaiPencahayaan()>=250&&getNilaiPencahayaan()<=350){
              System.out.println("\n--> nilai pencahayaan Sesuai");
              return"nilai pencahayaan sesuai";
         }
        else{
              System.out.println("\n--> nilai pencahayaan Tidak Sesuai");
              return"nilai pencahayaan tidak sesuai";
         }
    }
    
    @Override
    String AnalisisKelembapan(){
        
        if(getKelembapan()>=70&&getKelembapan()<=80){
              System.out.println("\n--> kelembapan Sesuai");
              return"kelembapan sesuai";
         }
        else{
              System.out.println("\n--> kelembapan Tidak Sesuai");
              return"kelembapan tidak sesuai";
         }
    }
    
    @Override
    String AnalisisSuhu(){
        
        if(getSuhu()>=25&&getSuhu()<=35){
              System.out.println("\n--> Suhu Sesuai");
              return"suhu sesuai";
         }
        else{
              System.out.println("\n--> Suhu Tidak Sesuai");
              return"suhu tidak sesuai";
         } 
    }
    
    @Override
    String AnalisisKebisingan(){
        
        if(getKebisingan().equalsIgnoreCase("Tidak Bising")){
              System.out.println("\n--> Kebisingan Sesuai");
              return"kebisingan Sesuai";
         }
       else{
              System.out.println("\n--> Kebisingan Tidak Sesuai");
              return"kebisingan tidak sesuai";
         }
    }
    
    @Override
    String AnalisisBau(){
        
        if(getBau().equalsIgnoreCase("Tidak Bau")){
              System.out.println("\n--> bau Sesuai");
              return"bau sesuai";
         }
       else{
              System.out.println("\n--> bau Tidak Sesuai");
              return"bau tidak sesuai";
         }
    }
    
    @Override
    String AnalisisKebocoran(){
        
        if(getKebocoran().equalsIgnoreCase("Tidak Bocor")){
              System.out.println("\n--> kebocoran Sesuai");
              return"kebocoran sesuai";
         }
       else{
              System.out.println("\n--> kebocoran Tidak Sesuai");
              return"kebocoran tidak sesuai";
         } 
    }
    
    @Override
    String AnalisisKerusakan(){
        
        if(getKerusakan().equalsIgnoreCase("Tidak Rusak")){
              System.out.println("\n--> kerusakan Sesuai");
              return"kerusakan sesuai";
         }
       else{
              System.out.println("\n--> kerusakan Tidak Sesuai");
              return"kerusakan tidak sesuai";
         }
    }
    
    @Override
    String AnalisisKeausan(){
        
        if(getKeausan().equalsIgnoreCase("Tidak Aus")){
              System.out.println("\n--> keausan Sesuai");
              return"keausan sesuai";
         } 
       else{
              System.out.println("\n--> keausan Tidak Sesuai");
              return"keausan tidak sesuai";
         }
    }
    
    @Override
    String AnalisisKekokohan(){
        
         if(getKekokohan().equalsIgnoreCase("Kokoh")){
              System.out.println("\n--> kekokohan Sesuai");
              return"kekokohan sesuai";
         }
       else{
              System.out.println("\n--> kekokohan Tidak Sesuai");
              return"kekokohan tidak sesuai";
         }
    }
    
    @Override
    String AnalisisKunciPintu(){
        
         if(getKunciPintu().equalsIgnoreCase("Ada")){
              System.out.println("\n--> kunci pintu Sesuai");
              return"kunci pintu sesuai";
         }
       else{
              System.out.println("\n--> kunci pintu Tidak Sesuai");
              return"kunci pintu tidak sesuai";
         }
    }
    
    @Override
    String AnalisisKunciJendela(){
        
         if(getKunciJendela().equalsIgnoreCase("Ada")){
              System.out.println("\n--> kunci jendela Sesuai");
              return"kunci jendela sesuai";
         }
       else{
              System.out.println("\n--> kunci jendela Tidak Sesuai");
              return"kunci jendela tidak sesuai";
         }
    }
    
    @Override
    String AnalisisBahaya(){
        
         if(getBahaya().equalsIgnoreCase("Aman")){
              System.out.println("\n--> bahaya Sesuai");
              return"bahaya sesuai";
         }
       else{
              System.out.println("\n--> bahaya Tidak Sesuai");
              return"bahaya tidak sesuai";
         } 
         
    }

}
