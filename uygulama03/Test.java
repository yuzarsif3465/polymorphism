package uygulama03;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

    Kare kare1 = new Kare(4);
    System.out.println(kare1.getAlan());
    System.out.println("kare bir alan ve cevresi...");
    alanVeCevreHesaplama(kare1);

    // liste turunde de yazdırabilirsin.
    ArrayList<Sekil> sekils= new ArrayList<>();
    sekils.add(kare1);//bunu arttrabilirsin...
    sekilBilgileriniGir(sekils);
    }
    public static void alanVeCevreHesaplama(Sekil sekil){
        System.out.println(sekil.getAlan());
        System.out.println(sekil.getCevre());
    }
    public static void sekilBilgileriniGir(ArrayList<Sekil> sekiller){
        for(Sekil s:sekiller){
            System.out.println(s.getCevre());
            System.out.println(s.getAlan());
        }
    }
}
