package uni.isw.designpatterns.daofactory.controlador;

import java.util.List;
import uni.isw.designpatterns.daofactory.dao.AuthorFactory;
import uni.isw.designpatterns.daofactory.dao.impl.AuthorDAOImpl;
import uni.isw.designpatterns.daofactory.model.Author;

public class AuthorControlador {
    private AuthorDAOImpl autorImpl=AuthorFactory.getAuthorDAO();
    
    public List<Author> obtenerAutores(){
        return autorImpl.obtenerAutores();
    }
    
}
