package uygulama02ÇokBiçimliliik;

public class Ogrenci extends Kisi{
    private String sınıfı;

    public Ogrenci(){}
    public Ogrenci(String adı, String soyadı, String dogumYılı, String sınıfı){
        super(adı,soyadı,dogumYılı);
        this.sınıfı=sınıfı;
    }
    public Ogrenci(String adı, String soyadı, String dogumYılı){
        super(adı, soyadı, dogumYılı);
    }

    public String getSınıfı() {
        return sınıfı;
    }

    public void setSınıfı(String sınıfı) {
        this.sınıfı = sınıfı;
    }

    public String toString() {
        return "Ogrenci{" +
                "sınıfı= " + sınıfı + '\'' +
                "adı: "+ getAdı()+
                "soyad:"+ getSoyadı()+ "dogum yılı: "+ getDogumYılı()+'}';
    }
}
