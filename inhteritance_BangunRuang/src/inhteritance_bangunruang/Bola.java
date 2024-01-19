
package inhteritance_bangunruang;


public class Bola extends Bangun_Ruang {
    double R;
    
      @Override
    double  Volume(){
    double Volume = 3.14 * (R * R * R) * 4 / 3;
        System.out.println("LuasPermukaan: " + Volume);
        return Volume;
    }
    
      @Override
    double  LuasPermukaan(){
    double LuasPermukaan = 3.14 * 4 * R * R;
        System.out.println("LuasPermukaan: " + LuasPermukaan);
        return LuasPermukaan;
    }
}
