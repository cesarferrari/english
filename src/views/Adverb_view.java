/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author HP
 */
public class Adverb_view extends java.awt.Frame {

    /**
     * Creates new form Inicio
     */
    public Adverb_view() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        txt_word = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_new = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_word2 = new javax.swing.JTextField();
        cbx_type = new javax.swing.JComboBox<>();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        panel.setBackground(new java.awt.Color(0, 0, 102));
        panel.setMaximumSize(new java.awt.Dimension(32767, 100));

        txt_word.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_word.setForeground(new java.awt.Color(255, 255, 255));
        txt_word.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_wordActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("English New Words Adverb");

        jLabel2.setText("WORD");

        jLabel3.setText("Traduction");

        btn_new.setText("NEW");

        jLabel4.setText("Type");

        txt_word2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_word2.setForeground(new java.awt.Color(255, 255, 255));
        txt_word2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_word2ActionPerformed(evt);
            }
        });

        cbx_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose an Option", "Adverb of Manner", "Adverb of Place", "Adverb of Time", "Adverb of quantity", "Interrogative and Exclamatory Adverb", "Adverb of Affirmation", "Adverb of Negation", "Adverb of Doubt" }));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_new, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                    .addComponent(txt_word)
                    .addComponent(txt_word2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbx_type, 0, 428, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(196, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(135, 135, 135))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_word, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_word2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbx_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addComponent(btn_new)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        add(panel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void txt_wordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_wordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_wordActionPerformed

    private void txt_word2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_word2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_word2ActionPerformed

    /**
     * @param args the command line arguments
     */
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_new;
    public javax.swing.JComboBox<String> cbx_type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel panel;
    public javax.swing.JTextField txt_word;
    public javax.swing.JTextField txt_word2;
    // End of variables declaration//GEN-END:variables
}
