
package inhteritance_bangunruang;


public class Tabung extends Bangun_Ruang{
    double r;
    double t;
    
    
      @Override
    double  Volume(){
    double Volume = 3.14 * r * r * t;
        System.out.println("LuasPermukaan: " + Volume);
        return Volume;
    }
    
    @Override
      double  LuasPermukaan(){
    double LuasPermukaan =  2 * 3.14 * r *( r + t);
        System.out.println("LuasPermukaan: " + LuasPermukaan);
        return LuasPermukaan;
    }
}
