
package inhteritance_bangunruang;


public class Inhteritance_BangunRuang {

  
    public static void main(String[] args) {
       
        Bangun_Ruang Bangun_Ruang= new Bangun_Ruang();
        
        Balok Balok = new Balok();
        Balok.L = 10;
        Balok.P = 12;
        Balok.T = 15;
        
        Bola Bola = new Bola();
        Bola.R = 21;
        
        Tabung Tabung = new Tabung();
        Tabung.r = 14;
        Tabung.t = 15;
        
        LimasSegitiga LimasSegitiga = new LimasSegitiga();
        LimasSegitiga.luas = 20;
        LimasSegitiga.luas_alas = 10;
        LimasSegitiga.luas_selubung = 5;
        LimasSegitiga.panjang_sisi_alas = 8;
        LimasSegitiga.panjang_sisi_tegak = 13;
        LimasSegitiga.tinggi_alas = 6;
        LimasSegitiga.tinggi_limas = 25;
        
        
        Bangun_Ruang.LuasPermukaan();
         Bangun_Ruang.Volume();
         
          Bola.LuasPermukaan();
         Bola.Volume();
         
          Balok.LuasPermukaan();
           Balok.Volume();
           
            LimasSegitiga.LuasPermukaan();
             LimasSegitiga.Volume();
          
    }
    
}
