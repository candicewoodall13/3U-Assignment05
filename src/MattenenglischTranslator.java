/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woodc9217
 */
public class MattenenglischTranslator extends javax.swing.JFrame {

    /**
     * Creates new form MattenenglischTranslator
     */
    public MattenenglischTranslator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Original Word:");

        jButton1.setText("Transform Word");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Transformed Word:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(95, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //create variables
        String in = "";
        String out = "";
        int fv = 0;
        //get user's input
        in = this.jTextField1.getText();
//convert string to lowercase
        in = in.toLowerCase();
        boolean sc = true;

//calling method
        sc = startC(in);
        if (sc == true) {//word starts with a consonant
//variable first vowel+calling method
            fv = firstVowel(in);
//get transformed word
            out = translateC(in, fv);

        } else {//starts w/vowel
//does the word end in a vowel?
//end vowel= ev
            boolean ev = true;
            ev = endsInVowel(in);
//get transformed word
            out = translateV(in, ev);
        }
//put transformed word into output textbox
        jTextField2.setText(out);

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MattenenglischTranslator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MattenenglischTranslator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MattenenglischTranslator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MattenenglischTranslator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MattenenglischTranslator().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    //METHODS
//assumes every word contains at least 1 vowel
    //method: startC -determines whether first letter=consonant
    public boolean startC(String in) {
        boolean sc = true;
//first letter variable
        String fl = "";
        fl = in.substring(0, 1);
        if (fl.equals("a") || fl.equals("e") || fl.equals("i") || fl.equals("o") || fl.equals("u")) {
            sc = false;
        }
        return sc;
    }

//method: firstVowel -to find positioning of the first vowel
    public int firstVowel(String in) {
//initialize variable first vowel
        int fv = 1000;
//initialize variable temporary vowel
        int tv = -1;
        tv = in.indexOf("a");
//if it has found it’s lowest #
        if (tv != -1 && tv < fv) {
            fv = tv;
        }
        tv = in.indexOf("e");
//if it has found it’s lowest #
        if (tv != -1 && tv < fv) {
            fv = tv;
        }
        tv = in.indexOf("i");
//if it has found it’s lowest #
        if (tv != -1 && tv < fv) {
            fv = tv;
        }
        tv = in.indexOf("o");
//if it has found it’s lowest #
        if (tv != -1 && tv < fv) {
            fv = tv;
        }
        tv = in.indexOf("u");
//if it has found it’s lowest #
        if (tv != -1 && tv < fv) {
            fv = tv;
        }
        tv = in.indexOf("y");
//if it has found it’s lowest #
        if (tv != -1 && tv < fv) {
            fv = tv;
        }
        if (fv == 1000) {
            fv = -1;
        }
        return fv;
    }

//method: translateC -add transformations to original word
    public String translateC(String in, int fv) {
//define return variable
        String out = "";
//variable for before vowel
        String bv = "";
//variable for after vowel
        String av = "";
        bv = in.substring(0, fv);
        av = in.substring(fv + 1, in.length());
        out = "i" + av + bv + "ee";
        return out;
    }

//method:endsInVowel- determines whether last character of string is a vowel
    public boolean endsInVowel(String in) {
//initialize returning variable
        boolean ev = false;
//create variable for last character
        String lc = "";
        lc = in.substring(in.length() - 1, in.length());
        if (lc.equals("a") || lc.equals("e") || lc.equals("i") || lc.equals("o") || lc.equals("u")) {
            ev = true;
        }
        return ev;
    }

//method:translateV -add transformations to original word
    public String translateV(String in, boolean ev) {
        //define return variable
        String out = "";

//variable for after vowel
        String av = "";
//get rest of word after first vowel(character0)
        av = in.substring(1, in.length());
//make character 0 "i"
        out = "i" + av;
//if the string ends with a vowel out will add "hee" to the end, if not just "ee"
        if (ev == true) {
            out = out + "h";
        }
        out = out + "ee";
        return out;
    }

}
