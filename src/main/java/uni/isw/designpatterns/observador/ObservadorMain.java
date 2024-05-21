package uni.isw.designpatterns.observador;

public class ObservadorMain {
    public static void main(String[] args){
        Motor m1=new Motor();
        Acelerador a1=new Acelerador();
        a1.enlazarObservador(m1);
        a1.pisarElAcelerador();
    }
    
}
