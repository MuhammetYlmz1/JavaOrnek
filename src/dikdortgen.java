public class dikdortgen{

    private int genislik;
    private int yukseklik;


    //yapıcı,yapılandırıcı(constructor)
    //sınıftan nesne türetilirken otomaik olarak çalışan ön işlemlerin yapılmasını sağlama fonk
    //sınıfla aynı ada sahiptir
    //geriye değer döndürmez
    //bir sınıf içinde birden fazla yapıcı metod yazılabilir
    //
    public dikdortgen() {
     
    }


    
    public dikdortgen(int _yuksek,int _genislik) {
       this.genislik=_genislik;
       this.yukseklik=_yuksek;
    }




    public int AlanHesapla(){
        return(this.genislik*this.yukseklik);

    }
    public int cevreHesapla(){
        return(2*(this.genislik+this.yukseklik));
    }
    




    public void setGenislik(int w){//genislik değişkenine değer atamak için kullanılacak fonksiyon
        this.genislik=w;

    }
    public void setYukseklik(int h){
        this.yukseklik=h;

    }

    public int getGenislik(){//Genişlik değişkeninin değerini döndüren fonksiyon 
        return this.genislik;
    }
    public int getYukseklik(){
        return this.yukseklik;
    }

    
}
