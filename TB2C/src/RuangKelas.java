import java.util.Scanner;

public class RuangKelas {
    
    Scanner in = new Scanner(System.in);
    
    private String NamaRuang;
    private String LokasiRuang;
    private String ProgramStudi;
    private int PanjangRuang;
    private int LebarRuang;
    private int TinggiRuang;
    private double Luas;
    private double LuasRasio;
    private int JumlahKursi;
    private int JumlahPintu;
    private int JumlahJendela;
    private int JumlahStopKontak;
    private String KondisiStopKontak;
    private String PosisiStopKontak;
    private int JumlahKabelLcd;
    private String KondisiKabelLcd;
    private String PosisiKabelLcd;
    private int JumlahLampu;
    private String KondisiLampu;
    private String PosisiLampu;
    private int JumlahKipas;
    private String KondisiKipas;
    private String PosisiKipas;
    private int JumlahAc;
    private String KondisiAc;
    private String PosisiAc;
    private String SSID;
    private String Bandwidth;
    private String ID;
    private String Password;
    private int JumlahCctv;
    private String KondisiCctv;
    private String PosisiCctv;
    private String KondisiLantai;
    private String KondisiDinding;
    private String KondisiAtap;
    private String KondisiPintu;
    private String KondisiJendela;
    private String SirkulasiUdara;
    private int NilaiPencahayaan;
    private int Kelembapan;
    private int Suhu;
    private String Kebisingan;
    private String Bau;
    private String Kebocoran;
    private String Kerusakan;
    private String Keausan; 
    private String Kekokohan;
    private String KunciPintu;
    private String KunciJendela;
    private String Bahaya;
    int LuasRuang;
    int LuasRasioRuang;        

    public String getBahaya() {
        return Bahaya;
    }

    public void setBahaya(String Bahaya) {
        this.Bahaya = Bahaya;
    }
    
    public String getBandwidth() {
        return Bandwidth;
    }

    public void setBandwidth(String Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    public String getBau() {
        return Bau;
    }

    public void setBau(String Bau) {
        this.Bau = Bau;
    }

    public int getJumlahAc() {
        return JumlahAc;
    }

    public void setJumlahAc(int JumlahAc) {
        this.JumlahAc = JumlahAc;
    }

    public int getJumlahCctv() {
        return JumlahCctv;
    }

    public void setJumlahCctv(int JumlahCctv) {
        this.JumlahCctv = JumlahCctv;
    }

    public int getJumlahJendela() {
        return JumlahJendela;
    }

    public void setJumlahJendela(int JumlahJendela) {
        this.JumlahJendela = JumlahJendela;
    }

    public int getJumlahKabelLcd() {
        return JumlahKabelLcd;
    }

    public void setJumlahKabelLcd(int JumlahKabelLcd) {
        this.JumlahKabelLcd = JumlahKabelLcd;
    }

    public int getJumlahKipas() {
        return JumlahKipas;
    }

    public void setJumlahKipas(int JumlahKipas) {
        this.JumlahKipas = JumlahKipas;
    }

    public int getJumlahKursi() {
        return JumlahKursi;
    }

    public void setJumlahKursi(int JumlahKursi) {
        this.JumlahKursi = JumlahKursi;
    }

    public int getJumlahLampu() {
        return JumlahLampu;
    }

    public void setJumlahLampu(int JumlahLampu) {
        this.JumlahLampu = JumlahLampu;
    }

    public int getJumlahPintu() {
        return JumlahPintu;
    }

    public void setJumlahPintu(int JumlahPintu) {
        this.JumlahPintu = JumlahPintu;
    }

    public int getJumlahStopKontak() {
        return JumlahStopKontak;
    }

    public void setJumlahStopKontak(int JumlahStopKontak) {
        this.JumlahStopKontak = JumlahStopKontak;
    }

    public String getKeausan() {
        return Keausan;
    }

    public void setKeausan(String Keausan) {
        this.Keausan = Keausan;
    }

    public String getKebisingan() {
        return Kebisingan;
    }

    public void setKebisingan(String Kebisingan) {
        this.Kebisingan = Kebisingan;
    }

    public String getKebocoran() {
        return Kebocoran;
    }

    public void setKebocoran(String Kebocoran) {
        this.Kebocoran = Kebocoran;
    }

    public String getKekokohan() {
        return Kekokohan;
    }

    public void setKekokohan(String Kekokohan) {
        this.Kekokohan = Kekokohan;
    }

    public int getKelembapan() {
        return Kelembapan;
    }

    public void setKelembapan(int Kelembapan) {
        this.Kelembapan = Kelembapan;
    }

    public String getKerusakan() {
        return Kerusakan;
    }

    public void setKerusakan(String Kerusakan) {
        this.Kerusakan = Kerusakan;
    }

    public String getKondisiAc() {
        return KondisiAc;
    }

    public void setKondisiAc(String KondisiAc) {
        this.KondisiAc = KondisiAc;
    }

    public String getKondisiAtap() {
        return KondisiAtap;
    }

    public void setKondisiAtap(String KondisiAtap) {
        this.KondisiAtap = KondisiAtap;
    }

    public String getKondisiCctv() {
        return KondisiCctv;
    }

    public void setKondisiCctv(String KondisiCctv) {
        this.KondisiCctv = KondisiCctv;
    }

    public String getKondisiDinding() {
        return KondisiDinding;
    }

    public void setKondisiDinding(String KondisiDinding) {
        this.KondisiDinding = KondisiDinding;
    }

    public String getKondisiJendela() {
        return KondisiJendela;
    }

    public void setKondisiJendela(String KondisiJendela) {
        this.KondisiJendela = KondisiJendela;
    }

    public String getKondisiKabelLcd() {
        return KondisiKabelLcd;
    }

    public void setKondisiKabelLcd(String KondisiKabelLcd) {
        this.KondisiKabelLcd = KondisiKabelLcd;
    }

    public String getKondisiKipas() {
        return KondisiKipas;
    }

    public void setKondisiKipas(String KondisiKipas) {
        this.KondisiKipas = KondisiKipas;
    }

    public String getKondisiLampu() {
        return KondisiLampu;
    }

    public void setKondisiLampu(String KondisiLampu) {
        this.KondisiLampu = KondisiLampu;
    }

    public String getKondisiLantai() {
        return KondisiLantai;
    }

    public void setKondisiLantai(String KondisiLantai) {
        this.KondisiLantai = KondisiLantai;
    }

    public String getKondisiPintu() {
        return KondisiPintu;
    }

    public void setKondisiPintu(String KondisiPintu) {
        this.KondisiPintu = KondisiPintu;
    }

    public String getKondisiStopKontak() {
        return KondisiStopKontak;
    }

    public void setKondisiStopKontak(String KondisiStopKontak) {
        this.KondisiStopKontak = KondisiStopKontak;
    }

    public String getKunciJendela() {
        return KunciJendela;
    }

    public void setKunciJendela(String KunciJendela) {
        this.KunciJendela = KunciJendela;
    }

    public String getKunciPintu() {
        return KunciPintu;
    }

    public void setKunciPintu(String KunciPintu) {
        this.KunciPintu = KunciPintu;
    }

    public int getLebarRuang() {
        return LebarRuang;
    }

    public void setLebarRuang(int LebarRuang) {
        this.LebarRuang = LebarRuang;
    }

    public String getLokasiRuang() {
        return LokasiRuang;
    }

    public void setLokasiRuang(String LokasiRuang) {
        this.LokasiRuang = LokasiRuang;
    }

    public String getNamaRuang() {
        return NamaRuang;
    }

    public void setNamaRuang(String NamaRuang) {
        this.NamaRuang = NamaRuang;
    }

    public int getNilaiPencahayaan() {
        return NilaiPencahayaan;
    }

    public void setNilaiPencahayaan(int NilaiPencahayaan) {
        this.NilaiPencahayaan = NilaiPencahayaan;
    }

    public int getPanjangRuang() {
        return PanjangRuang;
    }

    public void setPanjangRuang(int PanjangRuang) {
        this.PanjangRuang = PanjangRuang;
    }

    public String getPosisiAc() {
        return PosisiAc;
    }

    public void setPosisiAc(String PosisiAc) {
        this.PosisiAc = PosisiAc;
    }

    public String getPosisiKabelLcd() {
        return PosisiKabelLcd;
    }

    public void setPosisiKabelLcd(String PosisiKabelLcd) {
        this.PosisiKabelLcd = PosisiKabelLcd;
    }    
    
    public String getPosisiKipas() {
        return PosisiKipas;
    }

    public void setPosisiKipas(String PosisiKipas) {
        this.PosisiKipas = PosisiKipas;
    }    
    
    public String getPosisiCctv() {
        return PosisiCctv;
    }

    public void setPosisiCctv(String PosisiCctv) {
        this.PosisiCctv = PosisiCctv;
    }

    public String getPosisiLampu() {
        return PosisiLampu;
    }

    public void setPosisiLampu(String PosisiLampu) {
        this.PosisiLampu = PosisiLampu;
    }

    public String getPosisiStopKontak() {
        return PosisiStopKontak;
    }

    public void setPosisiStopKontak(String PosisiStopKontak) {
        this.PosisiStopKontak = PosisiStopKontak;
    }

    public String getProgramStudi() {
        return ProgramStudi;
    }

    public void setProgramStudi(String ProgramStudi) {
        this.ProgramStudi = ProgramStudi;
    }

    public String getSSID() {
        return SSID;
    }

    public void setSSID(String SSID) {
        this.SSID = SSID;
    }

    public String getSirkulasiUdara() {
        return SirkulasiUdara;
    }

    public void setSirkulasiUdara(String SirkulasiUdara) {
        this.SirkulasiUdara = SirkulasiUdara;
    }

    public int getSuhu() {
        return Suhu;
    }

    public void setSuhu(int Suhu) {
        this.Suhu = Suhu;
    }

    
    public double getLuas() {
        return Luas;
    }

    
    public void setLuas(double Luas) {
        this.Luas = Luas;
    }

    
    public double getLuasRasio() {
        return LuasRasio;
    }

    
    public void setLuasRasio(double LuasRasio) {
        this.LuasRasio = LuasRasio;
    }   

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

  
    public int getTinggiRuang() {
        return TinggiRuang;
    }

  
    public void setTinggiRuang(int TinggiRuang) {
        this.TinggiRuang = TinggiRuang;
    }
   
}
