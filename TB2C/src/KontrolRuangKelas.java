import java.util.Scanner;


public class KontrolRuangKelas{
    RuangKelas Kontrol = new RuangKelas();
    Scanner in = new Scanner(System.in);
    
    //overloading
    void IdentitasRuangKelas(String LokasiRuang){
        System.out.println("----------RUANG KHUSUS GKB 1----------\n");
        
        System.out.println("Masukkan Nama Ruang Kelas yang Anda Inginkan : ");
        String NamaRuang = in.nextLine();
        Kontrol.setNamaRuang(NamaRuang);
        
        Kontrol.setLokasiRuang(LokasiRuang);

        System.out.println("Masukkan Program Studi atau Fakultas yang Anda Inginkan");
        String ProgramStudi = in.nextLine();
        Kontrol.setProgramStudi(ProgramStudi);
        
    }
    //untuk menginputkan rang kelas , lokasi ruang dan menentukan program studi/fakultas.
    void IdentitasRuangKelas(){
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
    
    
    //untuk menginputkan panjang ruang , lebar ruang dan jumlah kursi.
    //untuk menghitung luas , luas rasio dan bentuk ruang .
    void Perhitungan(){
        
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
         
    }
    
    //untuk menginputkan jumlah pintu , jumlah jendela .
    void KondisiRuangKelas(){
        
        System.out.println("\nMasukkan Jumlah Pintu yang ada di ruang kelas : ");
        int JumlahPintu = in.nextInt();
        Kontrol.setJumlahPintu(JumlahPintu);
         
        System.out.println("Masukkan Jumlah Jendela yang ada di ruang kelas : ");
        int JumlahJendela = in.nextInt();
        Kontrol.setJumlahJendela(JumlahJendela);
       
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
        
         System.out.println("\n");
         System.out.println("Masukkan SSID yang ada di ruang tersebut :");
         String SSID = in.nextLine();
         Kontrol.setSSID(SSID);
         
         System.out.println("\n----------Benwidth----------\n");
         System.out.println("--Login Hotspot--\n");
         System.out.print("ID : ");
         String ID = in.nextLine();
         Kontrol.setID(ID);
         
         System.out.print("\nPassword : ");
         String Password = in.nextLine();
         Kontrol.setPassword(Password);
     
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
  
    }
    //untuk menginputkan dan menganalisis kondisi lantai , dinding , atap , pintu dan jendela.
    void LingkunganRuangKelas(){
       
       System.out.println("\nMasukkan Kondisi kebersihan lantai pada Ruang tersebut : ");
       String KondisiLantai = in.nextLine();
       Kontrol.setKondisiLantai(KondisiLantai);
     
       System.out.println("\n");
       System.out.println("Masukkan kondisi kebersihan Dinding pada Ruang tersebut : ");
       String KondisiDinding = in.nextLine();
       Kontrol.setKondisiDinding(KondisiDinding);
      
       System.out.println("\n");
       System.out.println("Masukkan Kondisi kebersihan Atap pada Ruang tersebut : ");
       String KondisiAtap = in.nextLine();
       Kontrol.setKondisiAtap(KondisiAtap);
       
       System.out.println("\n");
       System.out.println("Masukkan Kondisi kebersihan Pintu pada Ruang tersebut : ");
       String KondisiPintu = in.nextLine();
       Kontrol.setKondisiPintu(KondisiPintu);
      
       System.out.println("\n");
       System.out.println("Masukkan Kondisi kebersihan Jendela pada Ruang tersebut : ");
       String KondisiJendela = in.nextLine();
       Kontrol.setKondisiJendela(KondisiJendela);
       
       }
    //untuk menginputkan dan menganalisis sirkulasi udara , nilai pencahayaan , kelembapan,
    //suhu (Celcius).
    void KebersihanRuangKelas(){
        
        System.out.println("\n");
        System.out.println("Masukkan Sirkulasi udara pada Ruang tersebut : ");
        String SirkulasiUdara = in.nextLine();
        Kontrol.setSirkulasiUdara(SirkulasiUdara);
        
        System.out.println("\n");
        System.out.println("Masukkan Nilai Pencahayaan pada Ruang tersebut : ");
        int NilaiPencahayaan = in.nextInt();in.nextLine();
        Kontrol.setNilaiPencahayaan(NilaiPencahayaan);
        
        System.out.println("\n");
        System.out.println("Masukkan Kelembapan pada Ruang tersebut : ");
        int Kelembapan = in.nextInt();in.nextLine();
        Kontrol.setKelembapan(Kelembapan);
        
        System.out.println("\n");
        System.out.println("Masukkan Suhu pada Ruang tersebut : ");
        int Suhu = in.nextInt();in.nextLine();
        Kontrol.setSuhu(Suhu);
      
    }
    //untuk menginputkan dan menganalisis kebisingan , bau , kebocoran ,kerusakan dan keausan.
    void KenyamananRuangKelas(){
        
        System.out.println("\n");
        System.out.println("Masukkan kebisingan pada ruang tersebut : ");
        String Kebisingan = in.nextLine();
        Kontrol.setKebisingan(Kebisingan);
        
        System.out.println("\n");
        System.out.println("Masukkan Bau pada ruang tersebut : ");
        String Bau = in.nextLine();
        Kontrol.setBau(Bau);
            
        System.out.println("\n");
        System.out.println("Masukkan kebocoran pada ruang tersebut : ");
        String Kebocoran = in.nextLine();
        Kontrol.setKebocoran(Kebocoran);
          
        System.out.println("\n");
        System.out.println("Masukkan kerusakan pada ruang tersebut : ");
        String Kerusakan = in.nextLine();
        Kontrol.setKerusakan(Kerusakan);
  
        System.out.println("\n");
        System.out.println("Masukkan keausan pada ruang tersebut : ");
        String Keausan = in.nextLine();
        Kontrol.setKeausan(Keausan);
 
    }
    //untuk menginputkan dan menganalisis kekokohan , kunci pintu dan jendela , dan bahaya.
    void KeamananRuangKelas(){
        
        System.out.println("\n");
        System.out.println("Masukkkan kekokohan dalam ruang tersebut : ");
        String Kekokohan = in.nextLine();
        Kontrol.setKekokohan(Kekokohan);
        
        System.out.println("\n");
        System.out.println("Masukkkan kunci pintu dalam ruang tersebut : ");
        String KunciPintu = in.nextLine();
        Kontrol.setKunciPintu(KunciPintu);
        
        System.out.println("\n");
        System.out.println("Masukkkan kunci jendela dalam ruang tersebut : ");
        String KunciJendela = in.nextLine();
        Kontrol.setKunciJendela(KunciJendela);
         
        System.out.println("\n");
        System.out.println("Masukkkan bahaya dalam ruang tersebut : ");
        String Bahaya = in.nextLine();
        Kontrol.setBahaya(Bahaya);
          
    }
    
}
