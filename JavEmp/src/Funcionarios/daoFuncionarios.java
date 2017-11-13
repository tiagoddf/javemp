
package Funcionarios;

import DB.ConnectMYSQL;
import Funcionarios.beansFuncionarios;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class daoFuncionarios {
    
    ConnectMYSQL conex = new ConnectMYSQL();
    beansFuncionarios mod = new beansFuncionarios();
    
    public void Salvar(beansFuncionarios mod){
        conex.conectar();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into funcionarios(usuario,senha,tipo ) values(?,?,?)");
            pst.setString(1, mod.getUsuario());
            pst.setString(2, mod.getSenha());
            pst.setString(3, mod.getTipo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados /n"+ex);
        }
        
        conex.desconecta();

    }
    
    public void excluir(beansFuncionarios mod){
        conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from funcionarios where id=?");
            pst.setInt(1, mod.getId());
            pst.execute();
             JOptionPane.showMessageDialog(null, "Dados excluidos com sucessos");
            
        } catch (SQLException ex) {
            Logger.getLogger(daoFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Erro ao excluir dados/nErro:" +ex);
        }
        
        conex.desconecta();
        
    }
    
    public void editar(beansFuncionarios mod){
      conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update funcionarios set usuario=?, senha=?, tipo=? where id=?"); //alteração
            pst.setString   (1, mod.getUsuario());
            pst.setString   (2, mod.getSenha());
            pst.setString   (3, mod.getTipo());
            pst.setInt      (4, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucessos");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados /nErro:"+ex );
        }
        
      conex.desconecta();
        
    }
          
    public beansFuncionarios buscar(beansFuncionarios mod){
        conex.conectar(); 
        try {  
            // preencherTabela("select *from funcionarios order by usuario");
            conex.executaSql("select *from funcionarios where usuario like'%" + mod.getPesquisa()+ "%'");
            conex.rs.first();
            mod.setId(conex.rs.getInt("id"));
            mod.setUsuario(conex.rs.getString("usuario"));
            mod.setTipo(conex.rs.getString("tipo"));
            mod.setSenha(conex.rs.getString("senha")); 
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar usuario /nErro"+ex);
        }       
        conex.desconecta();       
        return mod;
    }        
    
}
