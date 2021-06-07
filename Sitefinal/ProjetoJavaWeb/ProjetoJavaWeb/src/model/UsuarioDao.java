package model;

import java.sql.*;
import java.sql.SQLException;

public class UsuarioDao {
	
	public String buscarUsuario(UsuarioBean tb_produto) throws ClassNotFoundException, SQLException{
		Connection con = null;
        PreparedStatement ps = null;
        
    	con = new ConnectionFactory().getConnection();
        //ps = con.prepareStatement("select * from usuarios where nome like '%?%'");
    	//ps.setString(1, usuario.getNome());
        ps = con.prepareStatement("select * from usuario");
        ResultSet rs = ps.executeQuery();
        String linha = "[";
        String virgula = "";
        while(rs.next()){
        	linha += virgula + "{\"id\":\"" + rs.getString(0) + "\",\"nome\":\"" + rs.getString(1) + "\"email\":\"" + rs.getString(2) + "\"senha\":\"" + rs.getString(3) + "\"perfil\":\"" + rs.getString(4) + "\"status\":\"" + rs.getString(5) + "\"";
        	virgula = ",";
        }
		return linha;
	}

	public void inserirUsuario(UsuarioBean usuario) throws Exception{
		Connection con = null;
        PreparedStatement ps = null;
        try {
        	con = new ConnectionFactory().getConnection();
            ps = con.prepareStatement("insert into usuario(nome,email,senha,perfil,status) values(?, ?, ?, ?, ?)");
            ps.setString(1, usuario.getnome());
            ps.setString(2, usuario.getemail());
            ps.setString(3, usuario.getsenha());
            ps.setString(4, usuario.getperfil());
            ps.setString(5, usuario.getstatus());            
            ps.executeUpdate();
            
        } catch (Exception e) {
        	e.printStackTrace();
        	throw new Exception();
        } finally {
        	con.close();
        }
	}
}
