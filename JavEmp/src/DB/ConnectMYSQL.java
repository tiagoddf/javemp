package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConnectMYSQL {
    
    public Statement stm;
    public ResultSet rs;
    
    /*public static void main(String[] args) throws SQLException {
        Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/nome_banco","usuario","senha");
        System.out.println("Conectado!");
        conexao.close();
    }    */   
        public ConnectMYSQL () {    } //Possibilita instancias
            public static Connection con = null;
 
        public static void conectar() {
            System.out.println("Conectando ao banco...");
              try {
                Class.forName("com.mysql.jdbc.Driver");
                con =  DriverManager.getConnection("jdbc:mysql://localhost/empresa","8SS","suDX7YMHsFPyCMOW");
                System.out.println("Conectado.");
        } catch (ClassNotFoundException ex) {
                System.out.println("Classe não encontrada, adicione o driver nas bibliotecas.");
                Logger.getLogger(ConnectMYSQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch(SQLException e) {
                System.out.println(e);
                throw new RuntimeException(e);
        }
     }
          public void desconecta(){
       try {         
           con.close();      
       } catch (SQLException ex) {
           
            JOptionPane.showMessageDialog(null, "erro ao se desconectar ao Banco de dados " + ex.getMessage());
    } 
  }
          public void executaSql(String sql){
       try {
           stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
           rs =  stm.executeQuery(sql);
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao executaSql " + ex.getMessage());
       }
    
        
    }
          
}  

