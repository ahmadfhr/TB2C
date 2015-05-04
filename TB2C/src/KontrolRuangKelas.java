import java.util.Scanner;


public class KontrolRuangKelas{
    RuangKelas Kontrol = new RuangKelas();
    Scanner in = new Scanner(System.in);
    
    //untuk menginputkan rang kelas , lokasi ruang dan menentukan program studi/fakultas.
    void IdentitasRuangKelas(){  
        System.out.println("Masukkan Nama Ruang Kelas yang Anda Inginkan : ");
        String NamaRuang = in.nextLine();
        Kontrol.setNamaRuang(NamaRuang);
        System.out.println("Masukkan Lokasi Ruang yang Anda Inginkan : ");
        String LokasiRuang = in.nextLine();
        Kontrol.setLokasiRuang(LokasiRuang);
        System.out.println("Masukkan Program Studi atau Fakultas yang Anda Inginkan");
        String ProgramStudi = in.nextLine();
        Kontrol.setProgramStudi(ProgramStudi);
        System.out.println("\n----------Identitas Ruang Kelas----------\n");
        System.out.println("Nama Ruang Kelas :" +Kontrol.getNamaRuang());
        System.out.println("Lokasi Ruang Kelas :"+Kontrol.getLokasiRuang());
        System.out.println("Program Studi/Fakultas :"+Kontrol.getProgramStudi());
    }
    //untuk menginputkan panjang ruang , lebar ruang dan jumlah kursi.
    //untuk menghitung luas , luas rasio dan bentuk ruang .
    String Perhitungan(){
        
        System.out.println("\n----------Perhitungan Luas , Luas Rasio dan Bentuk Ruang----------\n");
        System.out.println("Masukkan Panjang Ruang Kelas yang Anda Inginkan : ");
        int PanjangRuang = in.nextInt();
        Kontrol.setPanjangRuang(PanjangRuang);
        
        System.out.println("Masukkan Lebar Ruang Kelas yang Anda Inginkan : ");
        int LebarRuang = in.nextInt();
        Kontrol.setLebarRuang(LebarRuang);
        
        System.out.println("Masukkan Jumlah Kursi yang ada di ruang kelas : ");
        int JumlahKursi = in.nextInt();
        Kontrol.setJumlahKursi(JumlahKursi);
        
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
    
    //untuk menginputkan jumlah pintu , jumlah jendela .
    void KondisiRuangKelas(){
        
        System.out.println("\nLuas : "+Kontrol.getLuas());
        System.out.println("Luas Rasio : "+Kontrol.getLuasRasio());
        
        System.out.println("\nMasukkan Jumlah Pintu yang ada di ruang kelas : ");
        int JumlahPintu = in.nextInt();
        Kontrol.setJumlahPintu(JumlahPintu);
        
        System.out.println("\n----------Jumlah Pintu----------\n");
        System.out.println("Jumlah pintu :" +Kontrol.getJumlahPintu());
        
        if(Kontrol.getJumlahPintu()>=2){
              System.out.println("\n--> jumlah pintu Sesuai\n");
         }
        else{
              System.out.println("\n--> jumlah pintu Tidak Sesuai");  
         }
        
        System.out.println("Masukkan Jumlah Jendela yang ada di ruang kelas : ");
        int JumlahJendela = in.nextInt();
        Kontrol.setJumlahJendela(JumlahJendela);
        
        System.out.println("\n----------Jumlah Jendela----------\n");
        System.out.println("Jumlah Jendela :" +Kontrol.getJumlahJendela());
         
        if(Kontrol.getJumlahJendela()>=1){
              System.out.println("\n--> jumlah jendela Sesuai");
         }
        else{
              System.out.println("\n--> jumlah jendela Tidak Sesuai");  
         } 
    }
    
    //untuk menginputkan dan menganalisis jumlah kondisi dan posisi stop kontak , kabel LCD,
    //lampu , kipas angin , AC , SSID , Bandwitch , CCTV.
    void JumlahKondisiDanPosisiSarana(){
        System.out.println("\n");
        System.out.println("Masukkan jumlah stop kontak / steker yang ada di ruang tersebut :");
        int JumlahStopKontak = in.nextInt();in.nextLine();
        Kontrol.setJumlahStopKontak(JumlahStopKontak);
        System.out.println("Masukkan Kondisi stop kontak / steker yang ada di ruang tersebut :");
        String KondisiStopKontak = in.nextLine();
        Kontrol.setKondisiStopKontak(KondisiStopKontak);
        System.out.println("Masukkan posisi stop kontak / steker yang ada di ruang tersebut :");
        String PosisiStopKontak = in.nextLine();
        Kontrol.setPosisiStopKontak(PosisiStopKontak);
        
        System.out.println("\n----------Stop Kontak/Steker----------\n");
        System.out.println("Jumlah Stop Kontak :"+Kontrol.getJumlahStopKontak());
        System.out.println("Kondisi Stop Kontak :"+Kontrol.getKondisiStopKontak());
        System.out.println("Posisi Stop Kontak :"+Kontrol.getPosisiStopKontak());
        
        if(Kontrol.getJumlahStopKontak() >=4&&Kontrol.getKondisiStopKontak().equalsIgnoreCase("Baik")&&
           (Kontrol.getPosisiStopKontak().equalsIgnoreCase("pojok ruang")||Kontrol.getPosisiStopKontak().equalsIgnoreCase("dekat dosen"))){
            System.out.println("\n--> stop kontak Sesuai");
        } 
        else{
            System.out.println("\n-->  stop kontak Tidak Sesuai");  
        }  
        
        System.out.println("\n");
        System.out.println("Masukkan jumlah kabel LCD yang ada di ruang tersebut :");
        int JumlahKabelLcd = in.nextInt();in.nextLine();
        Kontrol.setJumlahKabelLcd(JumlahKabelLcd);
        System.out.println("Masukkan kondisi kabel LCD yang ada di ruang tersebut :");
        String KondisiKabelLcd = in.nextLine();
        Kontrol.setKondisiKabelLcd(KondisiKabelLcd);
        System.out.println("Masukkan posisi kabel LCD yang ada di ruang tersebut :");
        String PosisiKabelLcd = in.nextLine();
        Kontrol.setPosisiKabelLcd(PosisiKabelLcd);
        
        System.out.println("\n----------Kabel LCD----------\n");
        System.out.println("Jumlah Kabel LCD :"+Kontrol.getJumlahKabelLcd());
        System.out.println("Kondisi Kabel LCD :"+Kontrol.getKondisiKabelLcd());
        System.out.println("Posisi Kabel LCD :"+Kontrol.getPosisiKabelLcd());
        
        if(Kontrol.getJumlahKabelLcd()>=1&&Kontrol.getKondisiKabelLcd().equalsIgnoreCase("Berfungsi")&&
            Kontrol.getPosisiKabelLcd().equalsIgnoreCase("dekat dosen")){
             System.out.println("\n--> kabel LCD Sesuai");
        }
        else{
             System.out.println("\n--> kabel LCD Tidak Sesuai");  
        }  
       
        System.out.println("\n");
        System.out.println("Masukkan jumlah Lampu yang ada di ruang tersebut :");
        int JumlahLampu = in.nextInt();in.nextLine();
        Kontrol.setJumlahLampu(JumlahLampu);
        System.out.println("Masukkan kondisi Lampu yang ada di ruang tersebut :");
        String KondisiLampu = in.nextLine();
        Kontrol.setKondisiLampu(KondisiLampu);
        System.out.println("Masukkan posisi Lampu yang ada di ruang tersebut :");
        String PosisiLampu = in.nextLine();
        Kontrol.setPosisiLampu(PosisiLampu);
        
        System.out.println("----------Lampu----------\n");
        System.out.println("Jumlah Lampu :"+Kontrol.getJumlahLampu());
        System.out.println("Kondisi Lampu :"+Kontrol.getKondisiLampu());
        System.out.println("Posisi Lampu :"+Kontrol.getPosisiLampu());
        
        if(Kontrol.getJumlahLampu()>=18&&Kontrol.getKondisiLampu().equalsIgnoreCase("Baik")&&
            Kontrol.getPosisiLampu().equalsIgnoreCase("atap ruangan")){
             System.out.println("\n-->  Lampu Sesuai");
        }
        else{
             System.out.println("\n-->  Lampu Tidak Sesuai");  
        } 
        
        System.out.println("\n");
        System.out.println("Masukkan jumlah kipas angin yang ada di ruang tersebut :");
        int JumlahKipas = in.nextInt();in.nextLine();
        Kontrol.setJumlahKipas(JumlahKipas);
        System.out.println("Masukkan kondisi kipas angin yang ada di ruang tersebut :");
        String KondisiKipas = in.nextLine();
        Kontrol.setKondisiKipas(KondisiKipas);
        System.out.println("Masukkan posisi kipas angin yang ada di ruang tersebut :");
        String PosisiKipas = in.nextLine();
        Kontrol.setPosisiKipas(PosisiKipas);
        
        System.out.println("----------Kipas Angin----------\n");
        System.out.println("Jumlah Kipas Angin :"+Kontrol.getJumlahKipas());
        System.out.println("Kondisi Kipas Angin :"+Kontrol.getKondisiKipas());
        System.out.println("Posisi Kipas Angin :"+Kontrol.getPosisiKipas());
        
        if(Kontrol.getJumlahKipas()>=2&&Kontrol.getKondisiKipas().equalsIgnoreCase("Baik")&&
            Kontrol.getPosisiKipas().equalsIgnoreCase("atap ruangan")){
             System.out.println("\n-->  kipas angin Sesuai");
        }
         else{
             System.out.println("\n-->  kipas angin Tidak Sesuai");  
        } 
        
        System.out.println("\n");
        System.out.println("Masukkan jumlah AC yang ada di ruang tersebut :");
        int JumlahAc = in.nextInt();in.nextLine();
        Kontrol.setJumlahAc(JumlahAc);
        System.out.println("Masukkan kondisi AC yang ada di ruang tersebut :");
        String KondisiAc = in.nextLine();
        Kontrol.setKondisiAc(KondisiAc);
        System.out.println("Masukkan posisi AC yang ada di ruang tersebut :");
        String PosisiAc = in.nextLine();
        Kontrol.setPosisiAc(PosisiAc);
        
        System.out.println("----------AC----------\n");
        System.out.println("Jumlah AC :"+Kontrol.getJumlahAc());
        System.out.println("Kondisi Ac :"+Kontrol.getKondisiAc());
        System.out.println("Posisi Ac :"+Kontrol.getPosisiAc());
        
         if(Kontrol.getJumlahAc()>=1&&Kontrol.getKondisiAc().equalsIgnoreCase("Baik")&&
            (Kontrol.getPosisiAc().equalsIgnoreCase("di belakang")||Kontrol.getPosisiAc().equalsIgnoreCase("di samping"))){
             System.out.println("\n-->  AC Sesuai");
        }
         else{
             System.out.println("\n-->  AC Tidak Sesuai");  
        } 
        
        System.out.println("\n");
        System.out.println("Masukkan SSID yang ada di ruang tersebut :");
        String SSID = in.nextLine();
        Kontrol.setSSID(SSID);
        
        System.out.println("----------SSID----------\n");
        System.out.println("SSID :"+Kontrol.getSSID());
        
        if(Kontrol.getSSID().equalsIgnoreCase("UMM Hotspot")){
             System.out.println("\n-->  SSID Sesuai"); 
         }
         else{
             System.out.println("\n-->  SSID Tidak Sesuai");  
        } 
       
        System.out.println("\n----------Benwidth----------\n");
        System.out.println("--Login Hotspot--\n");
        System.out.print("ID : ");
        String ID = in.nextLine();
        Kontrol.setID(ID);
        
        System.out.print("\nPassword : ");
        String Password = in.nextLine();
        Kontrol.setPassword(Password);
        
        
        if((Kontrol.getID().equalsIgnoreCase("fahri")&&Kontrol.getPassword().equalsIgnoreCase("ale"))||
           (Kontrol.getID().equalsIgnoreCase("gofur")&&Kontrol.getPassword().equalsIgnoreCase("jo"))||
           (Kontrol.getID().equalsIgnoreCase("topek")&&Kontrol.getPassword().equalsIgnoreCase("hidayat"))){
             System.out.println("\n-->  Login berhasil");
             System.out.println("\n\n-->  Bandwidth Sesuai");
             
        }
         else{
             System.out.println("\n-->  Login gagal");
             System.out.println("\n-->  Bandwidth Tidak Sesuai");
        } 
        
        System.out.println("\n");
        System.out.println("Masukkan jumlah CCTV yang ada di ruang tersebut :");
        int JumlahCctv = in.nextInt();in.nextLine();
        Kontrol.setJumlahCctv(JumlahCctv);
        System.out.println("Masukkan kondisi CCTV yang ada di ruang tersebut :");
        String KondisiCctv = in.nextLine();
        Kontrol.setKondisiCctv(KondisiCctv);
        System.out.println("Masukkan posisi CCTV yang ada di ruang tersebut :");
        String PosisiCctv = in.nextLine();
        Kontrol.setPosisiCctv(PosisiCctv);
        
        
        System.out.println("\n----------Kabel CCTV----------\n");
        System.out.println("Jumlah CCTV :"+Kontrol.getJumlahCctv());
        System.out.println("Kondisi CCTV :"+Kontrol.getKondisiCctv());
        System.out.println("Posisi CCTV :"+Kontrol.getPosisiCctv());
        
        if(Kontrol.getJumlahCctv()>=2&&Kontrol.getKondisiCctv().equalsIgnoreCase("Baik")&&
          (Kontrol.getPosisiCctv().equalsIgnoreCase("di depan")||Kontrol.getPosisiCctv().equalsIgnoreCase("di belakang"))){
             System.out.println("\n--> CCTV Sesuai");
        }
         else{
             System.out.println("\n--> CCTV Tidak Sesuai");  
        }  
   }
   //untuk menginputkan dan menganalisis kondisi lantai , dinding , atap , pintu dan jendela.
   void LingkunganRuangKelas(){
      
      System.out.println("\nMasukkan Kondisi kebersihan lantai pada Ruang tersebut : ");
      String KondisiLantai = in.nextLine();
      Kontrol.setKondisiLantai(KondisiLantai);
      
      System.out.println("----------Kondisi Lantai----------\n");
      System.out.println("Kondisi Lantai :"+Kontrol.getKondisiLantai());
      
      if(Kontrol.getKondisiLantai().equalsIgnoreCase("Bersih")){
             System.out.println("\n--> kondisi lantai Sesuai");
        }
      else{
             System.out.println("\n--> kondisi lantai Tidak Sesuai");  
        } 
       
      System.out.println("\n");
      System.out.println("Masukkan kondisi kebersihan Dinding pada Ruang tersebut : ");
      String KondisiDinding = in.nextLine();
      Kontrol.setKondisiDinding(KondisiDinding);
      
      System.out.println("----------Kondisi Dinding----------\n");
      System.out.println("Kondisi Dinding :"+Kontrol.getKondisiDinding());
      
      if(Kontrol.getKondisiDinding().equalsIgnoreCase("Bersih")){
             System.out.println("\n--> kondisi dinding Sesuai");
        }
      else{
             System.out.println("\n--> kondiisi dinding Tidak Sesuai");  
        } 
       
      System.out.println("\n");
      System.out.println("Masukkan Kondisi kebersihan Atap pada Ruang tersebut : ");
      String KondisiAtap = in.nextLine();
      Kontrol.setKondisiAtap(KondisiAtap);
      
      System.out.println("----------Kondisi Atap----------\n");
      System.out.println("Kondisi Atap :"+Kontrol.getKondisiAtap());
      
      if(Kontrol.getKondisiAtap().equalsIgnoreCase("Bersih")){
             System.out.println("\n--> kondisi atap Sesuai");
        }
      else{
             System.out.println("\n--> kondisi atap Tidak Sesuai");  
        } 
      
      System.out.println("\n");
      System.out.println("Masukkan Kondisi kebersihan Pintu pada Ruang tersebut : ");
      String KondisiPintu = in.nextLine();
      Kontrol.setKondisiPintu(KondisiPintu);
      
      System.out.println("----------Kondisi Pintu----------\n");
      System.out.println("Kondisi Pintu :"+Kontrol.getKondisiPintu());
      
      if(Kontrol.getKondisiPintu().equalsIgnoreCase("Bersih")){
             System.out.println("\n--> kondisi pintu Sesuai");
        }
      else{
             System.out.println("\n--> kondisi pintu Tidak Sesuai");  
        } 
      
      System.out.println("\n");
      System.out.println("Masukkan Kondisi kebersihan Jendela pada Ruang tersebut : ");
      String KondisiJendela = in.nextLine();
      Kontrol.setKondisiJendela(KondisiJendela);
      
      System.out.println("----------Kondisi Jendela----------\n");
      System.out.println("Kondisi Jendela :"+Kontrol.getKondisiJendela());
      
      if(Kontrol.getKondisiJendela().equalsIgnoreCase("Bersih")){
             System.out.println("\n--> kondisi jendela Sesuai");
        } 
      else{
             System.out.println("\n--> kondisi jendela Tidak Sesuai");  
        } 
      }
    
    
    //untuk menginputkan dan menganalisis sirkulasi udara , nilai pencahayaan , kelembapan,
    //suhu (Celcius).
    void KebersihanRuangKelas(){
        
       
    }
    //untuk menginputkan dan menganalisis kekokohan , kunci pintu dan jendela , dan bahaya.
    void KeamananRuangKelas(){
        
        
    }
    
}
