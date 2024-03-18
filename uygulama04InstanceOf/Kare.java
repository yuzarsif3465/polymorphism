package uygulama04InstanceOf;


public class Kare extends Sekil {
    private int kenar;
    public Kare() {
    }

    /*public int getKenar() {
        return kenar;
    }bu metod kulllanmayacagız*/
    public Kare(int kenar){
        this.kenar= kenar;
    }
    public void setKenar(int kenar) {
        this.kenar = kenar;
    }
    public double getAlan(){
        return kenar*kenar;
    }
    public double getCevre(){
        return 4*kenar;
    }


}

