
public class Clase2 {

    private int punto;
    public Clase2(){
        this.punto=0;
    }
    public int cd8Mover(int posicion){
        return this.punto+posicion;
    }
    public int cd9GetPosicion(){
        return this.punto;
    }
    public int fetchGetPosicion(){
        return this.punto*8;
    }
}
