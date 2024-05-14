package uni.isw.designpatterns.daofactory.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import uni.isw.designpatterns.daofactory.dao.AuthorDAO;
import uni.isw.designpatterns.daofactory.dao.AuthorFactory;
import uni.isw.designpatterns.daofactory.dao.Conexion;
import uni.isw.designpatterns.daofactory.model.Author;

public class AuthorDAOImpl implements AuthorDAO{
    private Conexion conexionBD=Conexion.getInstance();

    @Override
    public List<Author> obtenerAutores() {
        List<Author> lista=new ArrayList<>();
        conexionBD.conectar();
        try{
            PreparedStatement statement=conexionBD.conexion.prepareStatement("select id,name from author");
            ResultSet result=statement.executeQuery();
            while(result.next()){
                Author autor=AuthorFactory.getAuthor();
                autor.setId(result.getLong("id"));
                autor.setNombre(result.getString("name"));
                lista.add(autor);
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return lista;
    }

    @Override
    public Author obtenerAutor(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insertarAutor(Author autor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actualizarAutor(Author autor, Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarAutor(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
