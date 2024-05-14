package uni.isw.designpatterns.daofactory.vista;

import uni.isw.designpatterns.daofactory.dao.AuthorFactory;

public class DaoFactoryMain {
    public static void main(String[] args){
        AuthorVista authorVista=AuthorFactory.getAuthorVista();
        authorVista.obtenerAutores();
    }
}
