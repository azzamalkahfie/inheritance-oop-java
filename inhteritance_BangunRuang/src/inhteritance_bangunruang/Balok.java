
package inhteritance_bangunruang;


public class Balok  extends  Bangun_Ruang {
double P;
double L;
double T;

 @Override
    double Volume(){
    double Volume = P*L*T;
        System.out.println("Volume Balok: " + Volume);
        return Volume;
    }
     @Override
    double  LuasPermukaan(){
    double LuasPermukaan =  2 * P * L + P * T + L * T;
        System.out.println("LuasPermukaan: " + LuasPermukaan);
        return LuasPermukaan;
    }
    
}
