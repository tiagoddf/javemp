/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import Clientes.telaGerenciarClientes;
import Funcionarios.telaGerenciarFuncionarios;
import DB.ConnectMYSQL;
import Funcionarios.telaEntradaSaida;
import Logando.telaLogin;
import Logando.telaTrocaSenha;
import Pedidos.telaTirarPedido;
import Produtos.telaGerenciarProdutos;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author tduarte
 */
public class telaHome extends javax.swing.JFrame {

    ConnectMYSQL conex = new ConnectMYSQL();
    public telaHome(String usuario) {
        initComponents();
        conex.conectar();   
        
        jLabelUsuario.setText(usuario);
        //DEIXAR O ADMIN VISIVEL CASO SEJA ADMIN A1
        try {
            conex.conectar();
            conex.executaSql("select *from funcionarios where usuario ='"+jLabelUsuario.getText()+"'");
            conex.rs.first();
            if(conex.rs.getString("cargo").equals("Administrador")){
               jMenuAdmin.setVisible(true);
                
            }else{
                jMenuAdmin.setVisible(false);
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "ERRO "+ex);
        }
        conex.desconecta();
        //FIM A1
    }

    private telaHome() {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem10 = new javax.swing.JMenuItem();
        jLabelUsuario = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItemControleDeMaterial = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuAdmin = new javax.swing.JMenu();
        jMenuItem_CriarUsuario = new javax.swing.JMenuItem();
        jMenuItemGerenciarProdutos = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        jMenuItem10.setText("jMenuItem10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabelUsuario.setText("jLabelUsuario");

        jDesktopPane1.setLayer(jTabbedPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
        );

        jMenu1.setText("Arquivo");

        jMenuItem6.setText("Alterar Senha");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sistema");

        jMenuItem1.setText("Estoque");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Entrade e saída");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem4.setText("Tirar Pedido");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem8.setText("Alocação");
        jMenu2.add(jMenuItem8);

        jMenuItemControleDeMaterial.setText("Controle de Material");
        jMenuItemControleDeMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemControleDeMaterialActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemControleDeMaterial);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Janelas");
        jMenuBar1.add(jMenu3);

        jMenuAdmin.setText("Admin");

        jMenuItem_CriarUsuario.setText("Gerenciar Funcionarios");
        jMenuItem_CriarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_CriarUsuarioActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItem_CriarUsuario);

        jMenuItemGerenciarProdutos.setText("Gerenciar Produtos");
        jMenuItemGerenciarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGerenciarProdutosActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItemGerenciarProdutos);

        jMenuItem5.setText("Gerenciar Clientes");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItem5);

        jMenuItem7.setText("Logs Movimentação");
        jMenuAdmin.add(jMenuItem7);

        jMenuItem9.setText("Estatísticas de Venda");
        jMenuAdmin.add(jMenuItem9);

        jMenuBar1.add(jMenuAdmin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUsuario)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(584, 416));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

      
    private void jMenuItem_CriarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_CriarUsuarioActionPerformed
        try {
            conex.conectar();
            conex.executaSql("select *from funcionarios where usuario ='"+jLabelUsuario.getText()+"'");
            conex.rs.first();
            if(conex.rs.getString("cargo").equals("Administrador")){
               telaGerenciarFuncionarios criarFunc = new telaGerenciarFuncionarios();
               criarFunc.setVisible(true);
               jDesktopPane1.add(criarFunc);
               jTabbedPane1.addTab("Criar Funcionario", criarFunc);
               
            }else{
                JOptionPane.showMessageDialog(null, "Você não tem autorização para esta função");
            }                

        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "ERRO "+ex);
        }
        conex.desconecta();          
    }//GEN-LAST:event_jMenuItem_CriarUsuarioActionPerformed

    private void jMenuItemControleDeMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemControleDeMaterialActionPerformed
   
    }//GEN-LAST:event_jMenuItemControleDeMaterialActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemGerenciarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGerenciarProdutosActionPerformed
        // TODO add your handling code here:
         try {
            conex.conectar();
            conex.executaSql("select *from funcionarios where usuario ='"+jLabelUsuario.getText()+"'");
            conex.rs.first();
            if(conex.rs.getString("cargo").equals("Administrador")){
                telaGerenciarProdutos gerenciarProdutos = new telaGerenciarProdutos();
                
                
               gerenciarProdutos.setVisible(true);
               jDesktopPane1.add(gerenciarProdutos);
               jTabbedPane1.addTab("Gerenciar Produtos", gerenciarProdutos);
               
            }else{
                JOptionPane.showMessageDialog(null, "Você não tem autorização para esta função");
            }                

        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "ERRO "+ex);
        }
        conex.desconecta();      
    }//GEN-LAST:event_jMenuItemGerenciarProdutosActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
            telaTirarPedido gerenciarPedido = new telaTirarPedido();
            gerenciarPedido.setVisible(true);
            jDesktopPane1.add(gerenciarPedido);
            jTabbedPane1.addTab("Tirar Pedido", gerenciarPedido);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        telaTrocaSenha tsenha = new telaTrocaSenha();
        tsenha.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        telaGerenciarClientes gerenciarClientes = new telaGerenciarClientes();
        gerenciarClientes.setVisible(true);
        jDesktopPane1.add(gerenciarClientes);
        jTabbedPane1.addTab("Gerenciar Clientes", gerenciarClientes);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        conex.desconecta();
        telaLogin tlogin = new telaLogin();
        tlogin.setVisible(true);
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        telaEntradaSaida tentradasaida = new telaEntradaSaida();
        tentradasaida.setVisible(true);
        jDesktopPane1.add(tentradasaida);
        jTabbedPane1.addTab("Entrada e Saída", tentradasaida);
        jDesktopPane1.setSize(772, 366);
        jTabbedPane1.setSize(772, 366);
        //tentradasaida.setSize(772, 366);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaHome().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenuAdmin;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemControleDeMaterial;
    private javax.swing.JMenuItem jMenuItemGerenciarProdutos;
    private javax.swing.JMenuItem jMenuItem_CriarUsuario;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
