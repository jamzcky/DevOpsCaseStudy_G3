/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JamSOCO
 */


import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.lang.Exception;

public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    public String exMsg;
    private static DecimalFormat decFormat = new DecimalFormat("#.##");
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCalculate = new javax.swing.JButton();
        jLabelDivisor = new javax.swing.JLabel();
        jLabelDividend = new javax.swing.JLabel();
        jLabelAnswer = new javax.swing.JLabel();
        txtboxDivisor = new javax.swing.JTextField();
        txtboxDividend = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCalculate.setText("Calculate");
        jButtonCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalculateActionPerformed(evt);
            }
        });

        jLabelDivisor.setText("Enter Divisor:");

        jLabelDividend.setText("Enter Dividend:");

        jLabelAnswer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelAnswer.setText("Answer:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAnswer)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelDivisor)
                            .addGap(18, 18, 18)
                            .addComponent(txtboxDivisor, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelDividend)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonCalculate)
                                .addComponent(txtboxDividend)))))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDivisor)
                    .addComponent(txtboxDivisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDividend)
                    .addComponent(txtboxDividend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonCalculate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabelAnswer)
                .addGap(86, 86, 86))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalculateActionPerformed
        
/*     ******* add this for feature development dev 1 ********  
       this will catch exceptions such as input string mismatch 
*/       
//        try
//        {
//            
        
        jLabelAnswer.setText("Answer : " + Divide(txtboxDivisor.getText().trim(), txtboxDividend.getText().trim()));
    
//        catch (Exception e){
//          exMsg = jLabelAnswer.setText("Error: " + e.getMessage());
//        }

        
    }//GEN-LAST:event_jButtonCalculateActionPerformed

    public String Divide(String divisor, String dividend) {
             
        try
        {
            double answer;   
            answer = Double.parseDouble(divisor) / Double.parseDouble(dividend);   
            
/*     ******* add this for feature development dev 2 ********  
       this will format the answer by displaying only 2 decimal places
*/  

//          exMsg = (decFormat.format(answer));
            exMsg = Double.toString(answer);
            
/*     ******* add this for hot fix branch dev 3 ********  
       this will catch exceptions for division by zero
*/              
            if(exMsg == "Infinity")  
            {
                exMsg = "Division by Zero not allowed.";
            }
        }
/*     ******* add this for feature development dev 1 ********  
       this will catch exceptions such as input string mismatch 
*/          
        catch (NumberFormatException e){
           exMsg = jLabelAnswer.setText("Error: " + e.getMessage());
        }
        catch (Exception e) {
            exMsg = "Error: " + e.getMessage();
        }
        
        return String.valueOf(exMsg);
    }
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalculate;
    private javax.swing.JLabel jLabelAnswer;
    private javax.swing.JLabel jLabelDividend;
    private javax.swing.JLabel jLabelDivisor;
    private javax.swing.JTextField txtboxDividend;
    private javax.swing.JTextField txtboxDivisor;
    // End of variables declaration//GEN-END:variables
}
