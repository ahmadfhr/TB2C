
abstract public class ListRuangKelas extends RuangKelas implements TambahRuangKelas{
    
    
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
