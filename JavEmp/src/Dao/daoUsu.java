
package Dao;

import Beans.beansUsuario;
import conexaoBD.ConnectMYSQL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class daoUsu {
    
    ConnectMYSQL conex = new ConnectMYSQL();
    beansUsuario mod = new beansUsuario();
    
    public void Salvar(beansUsuario mod){
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
    
    public void excluir(beansUsuario mod){
        conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from funcionarios where id=?");
            pst.setInt(1, mod.getId());
            pst.execute();
             JOptionPane.showMessageDialog(null, "Dados excluidos com sucessos");
            
        } catch (SQLException ex) {
            Logger.getLogger(daoUsu.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Erro ao excluir dados/nErro:" +ex);
        }
        
        conex.desconecta();
        
    }
    
    public void editar(beansUsuario mod){
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
   /*         
    public BeansMedico buscaMedico(BeansMedico mod){
        conex.conexao(); 
        conex.executaSql("select *from medicos where nome_medico like'%" + mod.getPesquisa()+ "%'");
        try {  
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("cod_medico"));
            mod.setNome(conex.rs.getString("nome_medico"));
            mod.setEspecialidade(conex.rs.getString("especializaçao_medico"));
            mod.setCrm(conex.rs.getInt("crm_medico")); 
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar medico! /nErro"+ex);
        }       
        conex.desconecta();       
        return mod;
    }        
    */
}
