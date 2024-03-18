package uygulama04InstanceOf;
// bu uygulama da metotlar icinde sartlı hesaplamalaer yazpıcaz or: kareyse alan, daireyse cevre hesapla..
public class Test {
    public static void main(String[] args) {
        Kare kare1= new Kare(6);
        hesapla(kare1);

    }
    public static void hesapla(Sekil sekil){
        if(sekil instanceof Kare){
            System.out.println("Karenin alanı: "+ sekil.getAlan());
        }
        /* else if(sekil instanceof Daire){
            S.o.p("dairenin cevresi : "+ sekil.getCevre());
        }*/
        // not: burada da eger fazla kare varsa liste yapabilirsin daha sonra metot icinde for la hızlıca hepsinden sonuc alırsın

    }


}
