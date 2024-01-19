
package inhteritance_bangunruang;


public class LimasSegitiga extends Bangun_Ruang{
    double panjang_sisi_alas;
    double tinggi_alas;
    double luas_selubung;
    double panjang_sisi_tegak;
    double luas;
    double tinggi_limas;
    double luas_alas;
    
      @Override
    double  Volume (){
    double Volume =  (1/3 * luas_alas * tinggi_limas);
        System.out.println("LuasPermukaan: " + Volume);
        return Volume;
    }
    
    
    
      @Override
    double  LuasPermukaan(){
    double LuasPermukaan =  (luas = 0.5 * panjang_sisi_alas * tinggi_alas) * (luas_selubung = panjang_sisi_alas * panjang_sisi_tegak);
        System.out.println("LuasPermukaan: " + LuasPermukaan);
        return LuasPermukaan;
    }
}
