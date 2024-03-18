package uygulama02ÇokBiçimliliik;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // ogrenci clasındaki degerleri kisi den aldıklarıyla beraber veya yalnız olarak nesne tanımladıktan sonra kisi clasına gonderebiliriz
        //----->Kisi kisi1= new Ogrenci("yusuf","zorlu","2002","2");
        // ogrenci clasından kisi clasına ulaşılabilir lakin tersi gercekleşemez

        Ogrenci ogrenci1= new Ogrenci("yusuf","zorlu","2002","14");
        // farzetki ogretmen adında baska bir class da var ver nesnesin oluşturdun(bu kısımda)

        // bu kısım polymorphism oluyor
        ArrayList<Kisi> kisiler = new ArrayList<>();
        kisiler.add(ogrenci1);
        // kisiler.add(ogretmen1);

        ogrenciBilgileri(ogrenci1);
    }
    public static void kisiBilgileri(Kisi kisi){
        System.out.println("adı: "+ kisi.getAdı());
        System.out.println("soyadı: "+ kisi.getSoyadı());
        System.out.println("dogum yılı: "+ kisi.getDogumYılı());
        // bu kısımda sadece ortak ozellikler ulaşılabilir(kisi de olan bilgilere )
    }
    public static void ogrenciBilgileri(Ogrenci ogrenci){
        System.out.println("sınıfı: "+ ogrenci.getSınıfı());
        System.out.println("adı: "+ ogrenci.getAdı());
        // bu kısımda ogrencinin butun ozelliklerine ulaşabilirsin
    }
    // aynı şekilde ogretmene ait de bir class oluşturullabilir
}
