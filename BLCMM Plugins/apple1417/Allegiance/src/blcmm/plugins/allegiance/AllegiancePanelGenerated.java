/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blcmm.plugins.allegiance;

/**
 *
 * @author apple1417
 */
public class AllegiancePanelGenerated extends javax.swing.JPanel {

    /**
     * Creates new form AllegiancePanel
     */
    public AllegiancePanelGenerated() {
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

        buttonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton9 = new javax.swing.JRadioButton();
        eridianButton = new javax.swing.JRadioButton();
        moxxiButton = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        charComboBox = new javax.swing.JComboBox<>();

        jLabel1.setText("Standard Manufacturers");

        buttonGroup.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText(Manufacturer.BANDIT.toString()
        );

        buttonGroup.add(jRadioButton2);
        jRadioButton2.setText(Manufacturer.DAHL.toString());

        buttonGroup.add(jRadioButton3);
        jRadioButton3.setText(Manufacturer.HYPERION.toString());

        buttonGroup.add(jRadioButton4);
        jRadioButton4.setText(Manufacturer.JAKOBS.toString());

        buttonGroup.add(jRadioButton5);
        jRadioButton5.setText(Manufacturer.MALIWAN.toString());

        buttonGroup.add(jRadioButton6);
        jRadioButton6.setText(Manufacturer.TEDIORE.toString());

        buttonGroup.add(jRadioButton7);
        jRadioButton7.setText(Manufacturer.TORGUE.toString());

        buttonGroup.add(jRadioButton8);
        jRadioButton8.setText(Manufacturer.VLADOF.toString());

        jLabel2.setText("Unconvetional Manufacturers");

        buttonGroup.add(jRadioButton9);
        jRadioButton9.setText(Manufacturer.ANSHIN.toString());

        buttonGroup.add(eridianButton);
        eridianButton.setText(Manufacturer.ERIDIAN.toString());
        eridianButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eridianButtonActionPerformed(evt);
            }
        });

        buttonGroup.add(moxxiButton);
        moxxiButton.setText(Manufacturer.MOXXI.toString());

        buttonGroup.add(jRadioButton12);
        jRadioButton12.setText(Manufacturer.PANGOLIN.toString());

        jLabel3.setText("Select someone you're NOT playing as");

        charComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jRadioButton9)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton7)
                            .addComponent(moxxiButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton12)
                            .addComponent(eridianButton)
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton8)))
                    .addComponent(jLabel3)
                    .addComponent(charComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton9)
                    .addComponent(eridianButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moxxiButton)
                    .addComponent(jRadioButton12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(charComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void eridianButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eridianButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eridianButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.ButtonGroup buttonGroup;
    protected javax.swing.JComboBox<String> charComboBox;
    protected javax.swing.JRadioButton eridianButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    protected javax.swing.JRadioButton jRadioButton1;
    protected javax.swing.JRadioButton jRadioButton12;
    protected javax.swing.JRadioButton jRadioButton2;
    protected javax.swing.JRadioButton jRadioButton3;
    protected javax.swing.JRadioButton jRadioButton4;
    protected javax.swing.JRadioButton jRadioButton5;
    protected javax.swing.JRadioButton jRadioButton6;
    protected javax.swing.JRadioButton jRadioButton7;
    protected javax.swing.JRadioButton jRadioButton8;
    protected javax.swing.JRadioButton jRadioButton9;
    protected javax.swing.JRadioButton moxxiButton;
    // End of variables declaration//GEN-END:variables
}
