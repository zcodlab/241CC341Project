package uni.isw.designpatterns.daofactory.vista;

import uni.isw.designpatterns.daofactory.controlador.AuthorControlador;
import uni.isw.designpatterns.daofactory.dao.AuthorFactory;
import uni.isw.designpatterns.daofactory.model.Author;

public class AuthorVista {
    private AuthorControlador authorControlador=AuthorFactory.getAuthorControlador();
    public void obtenerAutores(){
        for(Author a: authorControlador.obtenerAutores()){
            System.out.println("ID:"+a.getId()+"\tNombre: "+a.getNombre());
        }
    }
    
}
