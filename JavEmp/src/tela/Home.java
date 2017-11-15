/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import DB.ConnectMYSQL;
import Funcionarios.formFuncionarios;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tduarte
 */
public class Home extends javax.swing.JFrame {

    ConnectMYSQL conex = new ConnectMYSQL();
    
    public Home(String usuario) {
        initComponents();
        conex.conectar();
        
        jLabelUsuario.setText(usuario);
        //DEIXAR O ADMIN VISIVEL CASO SEJA ADMIN A1
        try {
            conex.conectar();
            conex.executaSql("select *from funcionarios where usuario ='"+jLabelUsuario.getText()+"'");
            conex.rs.first();
            if(conex.rs.getString("tipo").equals("Administrador")){
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

    private Home() {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabelUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuAdmin = new javax.swing.JMenu();
        jMenuItem_CriarUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        jLabelUsuario.setText("jLabel1");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(328, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(233, Short.MAX_VALUE)
                .addComponent(jLabelUsuario)
                .addContainerGap())
        );

        jMenu1.setText("Arquivo");

        jMenuItem3.setText("Sair");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sistema");

        jMenuItem1.setText("Estoque");
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Entrade e saída");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Janelas");
        jMenuBar1.add(jMenu3);

        jMenuAdmin.setText("Admin");

        jMenuItem_CriarUsuario.setText("Criar Usuario");
        jMenuItem_CriarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_CriarUsuarioActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItem_CriarUsuario);

        jMenuBar1.add(jMenuAdmin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      
    private void jMenuItem_CriarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_CriarUsuarioActionPerformed

        try {
            conex.conectar();
            conex.executaSql("select *from funcionarios where usuario ='"+jLabelUsuario.getText()+"'");
            conex.rs.first();
            if(conex.rs.getString("tipo").equals("Administrador")){
                formFuncionarios criarFunc = new formFuncionarios();
                criarFunc.setVisible(true);
                
            }else{
                JOptionPane.showMessageDialog(null, "Você não tem autorização para esta função");
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "ERRO "+ex);
        }
        conex.desconecta();
              
    }//GEN-LAST:event_jMenuItem_CriarUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenuAdmin;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem_CriarUsuario;
    // End of variables declaration//GEN-END:variables
}
