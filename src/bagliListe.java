

public class bagliListe {
    public Dugum ilk;//head:Listenin başını tutan veri 
    public Dugum son;
    public bagliListe() {
        this.ilk=null;
        this.son=null;
    }
    public void basaEkle(int deger) {//başa ekleme bu şekilde
        Dugum yeni=new Dugum(deger);
        yeni.sonraki=ilk;
        this.ilk=yeni;
        
    }
    public void sonaEkle(int deger2) {
        Dugum yeni2 = new Dugum(deger2);
        this.son=yeni2.sonraki;
        yeni2=this.son;
        
        
        
    }


    
    //listede ki elemanları 
    public void Listele() {
        Dugum temp=this.ilk;//temp değişkeni liste başına konumlandırılır
        if(temp==null){
            System.out.println("Listede eleman yok");
            return;
        }

        while(temp!=null){
            temp.yazdir();
            temp=temp.sonraki;
        }

    }
    
}
