package uni.isw.designpatterns.daofactory.dao;

import java.util.List;
import uni.isw.designpatterns.daofactory.model.Author;

public interface AuthorDAO {
    public List<Author> obtenerAutores();
    public Author obtenerAutor(Long id);
    public void insertarAutor(Author autor);
    public void actualizarAutor(Author autor, Long id);
    public void eliminarAutor(Long id);
    
}
