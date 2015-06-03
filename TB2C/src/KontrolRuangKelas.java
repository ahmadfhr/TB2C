
import java.io.*;
import java.util.Scanner;


public class KontrolRuangKelas implements Serializable {
    
    OutputRuangKelas Test3 = new OutputRuangKelas();
    transient Scanner in =  new Scanner(System.in);
    
    void Analisis(){
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
        Test3.AnalisisKondisiJendela();
        
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
    }
    
    void Output(){
        //-----------OutputRuangKelas-----------
        
        Test3.TampilIdentitasRuangKelas();
        Test3.TampilPerhitungan();
        Test3.TampilTambahPerhitungan();
        Test3.TampilKondisiRuangKelas();
        Test3.TampilJumlahKondisiDanPosisiSarana();
        Test3.TampilLingkunganRuangKelas();
        Test3.TampilKebersihanRuangKelas();
        Test3.TampilKenyamananRuangKelas();
        Test3.TampilKeamananRuangKelas();
    }
    
//untuk menginputkan rang kelas , lokasi ruang dan menentukan program studi/fakultas.
        void IdentitasRuangKelas(){
        System.out.println("----------Lokasi Ruang---------\n");
        
        
        System.out.println("Masukkan Nama Ruang Kelas yang Anda Inginkan : ");
        String NamaRuang = in.nextLine();
        Test3.setNamaRuang(NamaRuang);
        
        System.out.println("Masukkan Lokasi Ruang yang Anda Inginkan : ");
        String LokasiRuang = in.nextLine();
        Test3.setLokasiRuang(LokasiRuang);
        
        System.out.println("Masukkan Program Studi atau Fakultas yang Anda Inginkan");
        String ProgramStudi = in.nextLine();
        Test3.setProgramStudi(ProgramStudi);
        
        try{
            FileWriter save = new FileWriter("save_IdentitasRuangKelas.txt");
            File file = new File("save_IdentasRuangKelas.txt");
            if(file.exists()){
                System.out.println("\n>>>>BERHASIL SAVE<<<<");
            }
            save.write(Test3.getNamaRuang()+"\n");
            save.write(Test3.getLokasiRuang()+"\n");
            save.write(Test3.getProgramStudi()+"\n");
            save.close();
        }catch(IOException fail){
            System.out.println(">>>>GAGAL SAVE<<<<");
            fail.printStackTrace();
        }
    }
    
    
    //untuk menginputkan panjang ruang , lebar ruang dan jumlah kursi.
    //untuk menghitung luas , luas rasio dan bentuk ruang .
    void Perhitungan(){
        
        System.out.println("\n----------Perhitungan Luas , Luas Rasio dan Bentuk Ruang----------\n");
        System.out.println("Masukkan Panjang Ruang Kelas yang Anda Inginkan : ");
        int PanjangRuang = in.nextInt();
        Test3.setPanjangRuang(PanjangRuang);
        
        System.out.println("Masukkan Lebar Ruang Kelas yang Anda Inginkan : ");
        int LebarRuang = in.nextInt();
        Test3.setLebarRuang(LebarRuang);
        
        System.out.println("Masukkan Jumlah Kursi yang ada di ruang kelas : ");
        int JumlahKursi = in.nextInt();
        Test3.setJumlahKursi(JumlahKursi);
        
        try{
            FileWriter save= new FileWriter("save_Perhitungan.txt");
            File file = new File("save_Perhitungan.txt");
            if(file.exists()){
                System.out.println("\n>>>>BERHASIL SAVE<<<<");
            }
            save.write(""+Test3.getPanjangRuang()+"\n");
            save.write(""+Test3.getLebarRuang()+"\n");
            save.write(""+Test3.getJumlahKursi()+"\n");
            save.close();
        }catch(IOException fail){
            System.out.println(">>>>GAGAL SAVE<<<<");
            fail.printStackTrace();
        }
         
    }
    
    //untuk menginputkan tinggi ruang.
    void TambahPerhitungan(){
        
        System.out.println("\n----------Perhitungan Volume dan Luas Permukaan ----------\n");
        System.out.println("Masukkan Tinggi Ruang Kelas yang Anda Inginkan : ");
        int TinggiRuang = in.nextInt();
        Test3.setTinggiRuang(TinggiRuang);
        
        try{
            FileWriter save = new FileWriter("save_TambahPerhitungan.txt");
            File file = new File("save_TambahPerhitungan.txt");
            if(file.exists()){
                System.out.println("\n>>>>BERHASIL SAVE<<<<");
            }
            save.write(""+Test3.getTinggiRuang()+"\n");
            save.close();
        }catch(IOException fail){
            System.out.println(">>>>GAGAL SAVE<<<<");
            fail.printStackTrace();
        }
        
    }
    //untuk menginputkan jumlah pintu , jumlah jendela .
    void KondisiRuangKelas(){
        
        System.out.println("\nMasukkan Jumlah Pintu yang ada di ruang kelas : ");
        int JumlahPintu = in.nextInt();
        Test3.setJumlahPintu(JumlahPintu);
         
        System.out.println("Masukkan Jumlah Jendela yang ada di ruang kelas : ");
        int JumlahJendela = in.nextInt();
        Test3.setJumlahJendela(JumlahJendela);
        
        try{
            FileWriter save = new FileWriter("save_KondisiRuangKelas.txt");
            File file = new File("save_KondisiRuangKelas.txt");
            if(file.exists()){
                System.out.println("\n>>>>BERHASIL SAVE<<<<");
            }
            save.write(""+Test3.getJumlahPintu()+"\n");
            save.write(""+Test3.getJumlahJendela()+"\n");
            save.close();
        }catch(IOException fail){
            System.out.println(">>>>GAGAL SAVE<<<<");
            fail.printStackTrace();
        }
       
    }
    
    //untuk menginputkan dan menganalisis jumlah kondisi dan posisi stop kontak , kabel LCD,
    //lampu , kipas angin , AC , SSID , Bandwitch , CCTV.
    void JumlahKondisiDanPosisiSarana(){
        
         System.out.println("\n");
         System.out.println("Masukkan jumlah stop kontak / steker yang ada di ruang tersebut :");
         int JumlahStopKontak = in.nextInt();in.nextLine();
         Test3.setJumlahStopKontak(JumlahStopKontak);
         System.out.println("Masukkan Kondisi stop kontak / steker yang ada di ruang tersebut :");
         String KondisiStopKontak = in.nextLine();
         Test3.setKondisiStopKontak(KondisiStopKontak);
         System.out.println("Masukkan posisi stop kontak / steker yang ada di ruang tersebut :");
         String PosisiStopKontak = in.nextLine();
         Test3.setPosisiStopKontak(PosisiStopKontak);
         
         System.out.println("\n");
         System.out.println("Masukkan jumlah kabel LCD yang ada di ruang tersebut :");
         int JumlahKabelLcd = in.nextInt();in.nextLine();
         Test3.setJumlahKabelLcd(JumlahKabelLcd);
         System.out.println("Masukkan kondisi kabel LCD yang ada di ruang tersebut :");
         String KondisiKabelLcd = in.nextLine();
         Test3.setKondisiKabelLcd(KondisiKabelLcd);
         System.out.println("Masukkan posisi kabel LCD yang ada di ruang tersebut :");
         String PosisiKabelLcd = in.nextLine();
         Test3.setPosisiKabelLcd(PosisiKabelLcd);
         
         System.out.println("\n");
         System.out.println("Masukkan jumlah Lampu yang ada di ruang tersebut :");
         int JumlahLampu = in.nextInt();in.nextLine();
         Test3.setJumlahLampu(JumlahLampu);
         System.out.println("Masukkan kondisi Lampu yang ada di ruang tersebut :");
         String KondisiLampu = in.nextLine();
         Test3.setKondisiLampu(KondisiLampu);
         System.out.println("Masukkan posisi Lampu yang ada di ruang tersebut :");
         String PosisiLampu = in.nextLine();
         Test3.setPosisiLampu(PosisiLampu);
         
         System.out.println("\n");
         System.out.println("Masukkan jumlah kipas angin yang ada di ruang tersebut :");
         int JumlahKipas = in.nextInt();in.nextLine();
         Test3.setJumlahKipas(JumlahKipas);
         System.out.println("Masukkan kondisi kipas angin yang ada di ruang tersebut :");
         String KondisiKipas = in.nextLine();
         Test3.setKondisiKipas(KondisiKipas);
         System.out.println("Masukkan posisi kipas angin yang ada di ruang tersebut :");
         String PosisiKipas = in.nextLine();
         Test3.setPosisiKipas(PosisiKipas);
        
         System.out.println("\n");
         System.out.println("Masukkan jumlah AC yang ada di ruang tersebut :");
         int JumlahAc = in.nextInt();in.nextLine();
         Test3.setJumlahAc(JumlahAc);
         System.out.println("Masukkan kondisi AC yang ada di ruang tersebut :");
         String KondisiAc = in.nextLine();
         Test3.setKondisiAc(KondisiAc);
         System.out.println("Masukkan posisi AC yang ada di ruang tersebut :");
         String PosisiAc = in.nextLine();
         Test3.setPosisiAc(PosisiAc);
        
         System.out.println("\n");
         System.out.println("Masukkan SSID yang ada di ruang tersebut :");
         String SSID = in.nextLine();
         Test3.setSSID(SSID);
         
         System.out.println("\n----------Benwidth----------\n");
         System.out.println("--Login Hotspot--\n");
         System.out.print("ID : ");
         String ID = in.nextLine();
         Test3.setID(ID);
         
         System.out.print("\nPassword : ");
         String Password = in.nextLine();
         Test3.setPassword(Password);
     
         System.out.println("\n");
         System.out.println("Masukkan jumlah CCTV yang ada di ruang tersebut :");
         int JumlahCctv = in.nextInt();in.nextLine();
         Test3.setJumlahCctv(JumlahCctv);
         System.out.println("Masukkan kondisi CCTV yang ada di ruang tersebut :");
         String KondisiCctv = in.nextLine();
         Test3.setKondisiCctv(KondisiCctv);
         System.out.println("Masukkan posisi CCTV yang ada di ruang tersebut :");
         String PosisiCctv = in.nextLine();
         Test3.setPosisiCctv(PosisiCctv);
         
         try{
            FileWriter save = new FileWriter("save_JumlahKondisiDanPosisiSarana.txt");
            File file = new File("save_JumlahKondisiDanPosisiSarana.txt");
            if(file.exists()){
                System.out.println("\n>>>>BERHASIL SAVE<<<<");
            }
            save.write(""+Test3.getJumlahStopKontak()+"\n");
            save.write(Test3.getKondisiStopKontak()+"\n");
            save.write(Test3.getPosisiStopKontak()+"\n\n");
            
            save.write(""+Test3.getJumlahKabelLcd()+"\n");
            save.write(Test3.getKondisiKabelLcd()+"\n");
            save.write(Test3.getPosisiKabelLcd()+"\n\n");
            
            save.write(""+Test3.getJumlahLampu()+"\n");
            save.write(Test3.getKondisiLampu()+"\n");
            save.write(Test3.getPosisiLampu()+"\n\n");
            
            save.write(""+Test3.getJumlahKipas()+"\n");
            save.write(Test3.getKondisiKipas()+"\n");
            save.write(Test3.getPosisiKipas()+"\n\n");
            
            save.write(""+Test3.getJumlahAc()+"\n");
            save.write(Test3.getKondisiAc()+"\n");
            save.write(Test3.getPosisiAc()+"\n\n");
            
            save.write(Test3.getSSID()+"\n");
            
            
            save.write(Test3.getID()+"\n");
            save.write(Test3.getPassword()+"\n\n");
            
            save.write(""+Test3.getJumlahCctv()+"\n");
            save.write(Test3.getKondisiCctv()+"\n");
            save.write(Test3.getPosisiCctv()+"\n");
            
            
            save.close();
        }catch(IOException fail){
            System.out.println(">>>>GAGAL SAVE<<<<");
            fail.printStackTrace();
        }
  
    }
    //untuk menginputkan dan menganalisis kondisi lantai , dinding , atap , pintu dan jendela.
    void LingkunganRuangKelas(){
       
       System.out.println("\nMasukkan Kondisi kebersihan lantai pada Ruang tersebut : ");
       String KondisiLantai = in.nextLine();
       Test3.setKondisiLantai(KondisiLantai);
     
       System.out.println("\n");
       System.out.println("Masukkan kondisi kebersihan Dinding pada Ruang tersebut : ");
       String KondisiDinding = in.nextLine();
       Test3.setKondisiDinding(KondisiDinding);
      
       System.out.println("\n");
       System.out.println("Masukkan Kondisi kebersihan Atap pada Ruang tersebut : ");
       String KondisiAtap = in.nextLine();
       Test3.setKondisiAtap(KondisiAtap);
       
       System.out.println("\n");
       System.out.println("Masukkan Kondisi kebersihan Pintu pada Ruang tersebut : ");
       String KondisiPintu = in.nextLine();
       Test3.setKondisiPintu(KondisiPintu);
      
       System.out.println("\n");
       System.out.println("Masukkan Kondisi kebersihan Jendela pada Ruang tersebut : ");
       String KondisiJendela = in.nextLine();
       Test3.setKondisiJendela(KondisiJendela);
       
       try{
            FileWriter save = new FileWriter("save_LingkunganRuangKelas.txt");
            File file = new File("save_LingkunganRuangKelas.txt");
            if(file.exists()){
                System.out.println("\n>>>>BERHASIL SAVE<<<<");
            }
            save.write(Test3.getKondisiLantai()+"\n");
            save.write(Test3.getKondisiDinding()+"\n");
            save.write(Test3.getKondisiAtap()+"\n");
            save.write(Test3.getKondisiPintu()+"\n");
            save.write(Test3.getKondisiJendela()+"\n");
            
            save.close();
        }catch(IOException fail){
            System.out.println(">>>>GAGAL SAVE<<<<");
            fail.printStackTrace();
        }
       
       
       }
    //untuk menginputkan dan menganalisis sirkulasi udara , nilai pencahayaan , kelembapan,
    //suhu (Celcius).
    void KebersihanRuangKelas(){
        
        System.out.println("\n");
        System.out.println("Masukkan Sirkulasi udara pada Ruang tersebut : ");
        String SirkulasiUdara = in.nextLine();
        Test3.setSirkulasiUdara(SirkulasiUdara);
        
        System.out.println("\n");
        System.out.println("Masukkan Nilai Pencahayaan pada Ruang tersebut : ");
        int NilaiPencahayaan = in.nextInt();in.nextLine();
        Test3.setNilaiPencahayaan(NilaiPencahayaan);
        
        System.out.println("\n");
        System.out.println("Masukkan Kelembapan pada Ruang tersebut : ");
        int Kelembapan = in.nextInt();in.nextLine();
        Test3.setKelembapan(Kelembapan);
        
        System.out.println("\n");
        System.out.println("Masukkan Suhu pada Ruang tersebut : ");
        int Suhu = in.nextInt();in.nextLine();
        Test3.setSuhu(Suhu);
        
        try{
            FileWriter save = new FileWriter("save_KebersihanRuangKelas.txt");
            File file = new File("save_KebersihanRuangKelas.txt");
            if(file.exists()){
                System.out.println("\n>>>>BERHASIL SAVE<<<<");
            }
            save.write(Test3.getSirkulasiUdara()+"\n");
            save.write(""+Test3.getNilaiPencahayaan()+"\n");
            save.write(""+Test3.getKelembapan()+"\n");
            save.write(""+Test3.getSuhu()+"\n");
            
            
            save.close();
        }catch(IOException fail){
            System.out.println(">>>>GAGAL SAVE<<<<");
            fail.printStackTrace();
        }
        
       
      
    }
    //untuk menginputkan dan menganalisis kebisingan , bau , kebocoran ,kerusakan dan keausan.
    void KenyamananRuangKelas(){
        
        System.out.println("\n");
        System.out.println("Masukkan kebisingan pada ruang tersebut : ");
        String Kebisingan = in.nextLine();
        Test3.setKebisingan(Kebisingan);
        
        System.out.println("\n");
        System.out.println("Masukkan Bau pada ruang tersebut : ");
        String Bau = in.nextLine();
        Test3.setBau(Bau);
            
        System.out.println("\n");
        System.out.println("Masukkan kebocoran pada ruang tersebut : ");
        String Kebocoran = in.nextLine();
        Test3.setKebocoran(Kebocoran);
          
        System.out.println("\n");
        System.out.println("Masukkan kerusakan pada ruang tersebut : ");
        String Kerusakan = in.nextLine();
        Test3.setKerusakan(Kerusakan);
  
        System.out.println("\n");
        System.out.println("Masukkan keausan pada ruang tersebut : ");
        String Keausan = in.nextLine();
        Test3.setKeausan(Keausan);
        
        try{
            FileWriter save = new FileWriter("save_KenyamananRuangKelas.txt");
            File file = new File("save_KenyamananRuangKelas.txt");
            if(file.exists()){
                System.out.println("\n>>>>BERHASIL SAVE<<<<");
            }
            save.write(Test3.getKebisingan()+"\n");
            save.write(Test3.getBau()+"\n");
            save.write(Test3.getKebocoran()+"\n");
            save.write(Test3.getKerusakan()+"\n");
            save.write(Test3.getKeausan()+"\n");
            
            
            save.close();
        }catch(IOException fail){
            System.out.println(">>>>GAGAL SAVE<<<<");
            fail.printStackTrace();
        }
        
        
 
    }
    //untuk menginputkan dan menganalisis kekokohan , kunci pintu dan jendela , dan bahaya.
    void KeamananRuangKelas(){
        
        System.out.println("\n");
        System.out.println("Masukkkan kekokohan dalam ruang tersebut : ");
        String Kekokohan = in.nextLine();
        Test3.setKekokohan(Kekokohan);
        
        System.out.println("\n");
        System.out.println("Masukkkan kunci pintu dalam ruang tersebut : ");
        String KunciPintu = in.nextLine();
        Test3.setKunciPintu(KunciPintu);
        
        System.out.println("\n");
        System.out.println("Masukkkan kunci jendela dalam ruang tersebut : ");
        String KunciJendela = in.nextLine();
        Test3.setKunciJendela(KunciJendela);
         
        System.out.println("\n");
        System.out.println("Masukkkan bahaya dalam ruang tersebut : ");
        String Bahaya = in.nextLine();
        Test3.setBahaya(Bahaya);
        
        try{
            FileWriter save = new FileWriter("save_KeamananRuangKelas.txt");
            File file = new File("save_KeamananRuangKelas.txt");
            if(file.exists()){
                System.out.println("\n>>>>BERHASIL SAVE<<<<");
            }
            save.write(Test3.getKekokohan()+"\n");
            save.write(Test3.getKunciPintu()+"\n");
            save.write(Test3.getKunciJendela()+"\n");
            save.write(Test3.getBahaya()+"\n");
            
            
            save.close();
        }catch(IOException fail){
            System.out.println(">>>>GAGAL SAVE<<<<");
            fail.printStackTrace();
        }
          
    }
}
