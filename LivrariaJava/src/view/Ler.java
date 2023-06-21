package view;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Livro;
import model.LivroDAO;

public class Ler extends javax.swing.JFrame {
   
       public void preencherTabela(){
        DefaultTableModel tableModel;
    
        tableModel = (DefaultTableModel)Tabela.getModel();
        tableModel.setRowCount(0);
        ArrayList<Livro> livraria;
        livraria = new LivroDAO().listar();
        for(Livro l : livraria){
            Object[] linha = {l.getId(),l.getRegistro(),l.getNomeLivro(), l.getAutor()};
            tableModel.addRow(linha);
        }
        
    }
    public Ler() {
        initComponents();
        preencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        bntExcluir = new javax.swing.JButton();
        bntLRAtualizar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Livros ");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("Registrados");

        bntExcluir.setBackground(new java.awt.Color(255, 255, 51));
        bntExcluir.setForeground(new java.awt.Color(0, 0, 0));
        bntExcluir.setText("Excluir");
        bntExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntExcluirActionPerformed(evt);
            }
        });

        bntLRAtualizar.setBackground(new java.awt.Color(0, 0, 0));
        bntLRAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        bntLRAtualizar.setText("Atualizar");
        bntLRAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntLRAtualizarActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Registro", "Nome do Livro", "Autor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabela);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntLRAtualizar)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntExcluir)
                    .addComponent(bntLRAtualizar)
                    .addComponent(btnVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Capa c = new Capa();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void bntExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExcluirActionPerformed
        
        int linha = Tabela.getSelectedRow();
        int id = (int)Tabela.getValueAt(linha,0 );
         
         
         Livro l = new Livro();
         
         
         l.setId(id);
         
         Delete d = new Delete();
         d.setVisible(true);
         d.setForm(l);
    }//GEN-LAST:event_bntExcluirActionPerformed

    private void bntLRAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLRAtualizarActionPerformed
        int linha = Tabela.getSelectedRow();
        int id = (int)Tabela.getValueAt(linha,0 );
        String Registro = (String)Tabela.getValueAt(linha, 1);
        String NomeLivro = (String)Tabela.getValueAt(linha, 2);
        String Autor = (String)Tabela.getValueAt(linha, 3);
         
         
         Livro l = new Livro();
         
         
         l.setId(id);
         l.setRegistro(Registro);
         l.setNomeLivro(NomeLivro);
         l.setAutor(Autor);
         
         Atualiza al = new Atualiza();
         al.setVisible(true);
         al.setForm(l);    }//GEN-LAST:event_bntLRAtualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton bntExcluir;
    private javax.swing.JButton bntLRAtualizar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
