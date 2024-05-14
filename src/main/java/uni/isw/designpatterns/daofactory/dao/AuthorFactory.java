package uni.isw.designpatterns.daofactory.dao;

import uni.isw.designpatterns.daofactory.controlador.AuthorControlador;
import uni.isw.designpatterns.daofactory.dao.impl.AuthorDAOImpl;
import uni.isw.designpatterns.daofactory.model.Author;
import uni.isw.designpatterns.daofactory.vista.AuthorVista;

public class AuthorFactory {
    public static Author getAuthor(){
        return new Author();
    }
    public static AuthorDAOImpl getAuthorDAO(){
        return new AuthorDAOImpl();
    }
    public static AuthorControlador getAuthorControlador(){
        return new AuthorControlador();
    }
    public static AuthorVista getAuthorVista(){
        return new AuthorVista();
    }
}
