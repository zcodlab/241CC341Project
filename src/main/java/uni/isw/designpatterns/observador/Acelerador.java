package uni.isw.designpatterns.observador;

import java.util.ArrayList;
import java.util.List;

public class Acelerador implements SujetoObservable{
    private List<Observador> observadores;
    
    public Acelerador() {
        observadores=new ArrayList();
    }    
    
    public void pisarElAcelerador(){
        notificar();        
    }
    
    public void enlazarObservador(Observador o){
        observadores.add(o);
    }

    @Override
    public void notificar() {
        for(Observador o : observadores)
            o.update();
    }
    
    
}
