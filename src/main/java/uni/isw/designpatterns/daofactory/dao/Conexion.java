package uni.isw.designpatterns.daofactory.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String DRIVER="org.postgresql.Driver";
    private static final String URL="jdbc:postgresql://137.184.120.127:5432/Libreria";
    private static final String USER="modulo4";
    private static final String PASSWORD="modulo4";
    
    public Connection conexion=null;
    private static final Conexion CONEXIONINSTANCIA=new Conexion();

    public Conexion() {
    }
    
    public static Conexion getInstance(){
        return CONEXIONINSTANCIA;        
    }
    
    public void conectar(){
        try{
            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(URL, USER, PASSWORD);            
        }catch(SQLException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    
    public void desconectar(){
        try{         
            if(conexion!=null && (!conexion.isClosed()))
                conexion.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    
}
