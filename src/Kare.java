public class Kare {
    private int kenar;

    public void setKenar(int knr) {
        this.kenar=knr;
    }
    public int getKenar() {
        return this.kenar;
    }
    public int kareAlan(){
        return kenar*kenar;


    }
    public int kareCevre() {
        return 4*kenar;
        
    }


    
}
