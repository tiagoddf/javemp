/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produtos;

import DB.ConnectMYSQL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tiago
*/
public class daoProdutos {
    ConnectMYSQL conex = new ConnectMYSQL();
    beansProdutos mod = new beansProdutos();
    
    public void Salvar(beansProdutos mod) {
        conex.conectar();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into produtos(nome,tipo) values(?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getTipo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados /n"+ex);
        }
        conex.desconecta();
    }
}
