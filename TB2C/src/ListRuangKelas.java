
abstract public class ListRuangKelas extends RuangKelas implements TambahRuangKelas{
    
    //abstract
        //Perhitungan()
        abstract String  AnalisisPerhitungan();
        
        //KondisiRuangKelas()
        abstract String  AnalisisJumlahPintu();
        abstract String  AnalisisJumlahJendela();
        
        //JumlahKondisiDanPosisiSarana()
        abstract String  AnalisisStopKontak();
        abstract String  AnalisisKabelLCD();
        abstract String  AnalisisLampu();
        abstract String  AnalisisKipas();
        abstract String  AnalisisAc();
        abstract String  AnalisisSSID();
        abstract String  AnalisisBandwidth();
        abstract String  AnalisisCctv();
        
        //LingkunganRuangKelas()
        abstract String  AnalisisKondisiLantai();
        abstract String  AnalisisKondisiDinding();
        abstract String  AnalisisKondisiAtap();
        abstract String  AnalisisKondisiPintu();
        abstract String  AnalisisKondisiJendela();
        
        //KebersihanRuangKelas()
        abstract String  AnalisisSirkulasiUdara();
        abstract String  AnalisisNilaiPencahayaan();
        abstract String  AnalisisKelembapan();
        abstract String  AnalisisSuhu();
        
        //KenyamananRuangKelas()
        abstract String  AnalisisKebisingan();
        abstract String  AnalisisBau();
        abstract String  AnalisisKebocoran();
        abstract String  AnalisisKerusakan();
        abstract String  AnalisisKeausan();
        
        //KeamananRuangKelas()
        abstract String  AnalisisKekokohan();
        abstract String  AnalisisKunciPintu();
        abstract String  AnalisisKunciJendela();
        abstract String  AnalisisBahaya();

   //interface
        
    @Override
    public double Volume(double PanjangRuang, double LebarRuang, double TinggiRuang) {
      double Volume = PanjangRuang*LebarRuang*TinggiRuang;
      return Volume;
    }
    
    @Override
    public double LuasPermukaan(double PanjangRuang, double LebarRuang, double TinggiRuang) {
      double LuasPermukaan = 2*((PanjangRuang*LebarRuang)+(PanjangRuang*TinggiRuang)+(LebarRuang*TinggiRuang));
      return LuasPermukaan;
    }
 
}
