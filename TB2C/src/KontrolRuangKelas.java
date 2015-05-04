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
    
    
    }   
    //untuk menginputkan dan menganalisis sirkulasi udara , nilai pencahayaan , kelembapan,
    //suhu (Celcius).
    public void KebersihanRuangKelas(){
        
       
    }
    //untuk menginputkan dan menganalisis kekokohan , kunci pintu dan jendela , dan bahaya.
    public void KeamananRuangKelas(){
        
        
    }
    
}
