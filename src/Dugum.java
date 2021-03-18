public class Dugum {
    public int veri;
    public Dugum sonraki;

    public Dugum() {
        this.veri=0;
        this.sonraki=null;//default:başlagıç değeri
    }
    public Dugum(int deger) {//yapılandırıcı(constructor) fonskiyonu
        this.veri=deger;
        this.sonraki=null;
    }
    //görevi dugum bileşenini ekrana basmak
    public void yazdir(){
        System.out.println(this.veri);

    }



}
