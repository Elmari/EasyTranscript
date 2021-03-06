/*
 * Copyright (C) 2014 e-werkzeug <administrator@e-werkzeug.eu>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package de.ewerkzeug.easytranscript.gui.components;

import de.ewerkzeug.easytranscript.core.ErrorReport;
import static de.ewerkzeug.easytranscript.core.Variables.errors;
import static de.ewerkzeug.easytranscript.core.Variables.logger;
import static de.ewerkzeug.easytranscript.core.Variables.prop;
import java.io.IOException;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author e-werkzeug <administrator@e-werkzeug.eu>
 */
public class InstallationDialog extends javax.swing.JDialog {

    /**
     * Creates new form InstallationDialog
     * @param parent
     * @param modal
     */
    public InstallationDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InstallationBottomPanel = new javax.swing.JPanel();
        InstallationSaveButton = new javax.swing.JButton();
        InstallationCloseButton = new javax.swing.JButton();
        InstallationLanguageCombobox = new javax.swing.JComboBox();
        InstallationTitle2Label = new javax.swing.JLabel();
        InstallationTitleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Installation");
        setModal(true);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Bundle"); // NOI18N
        InstallationSaveButton.setText(bundle.getString("Easytranscript.InstallationSaveButton.text")); // NOI18N
        InstallationSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstallationSaveButtonActionPerformed(evt);
            }
        });
        InstallationBottomPanel.add(InstallationSaveButton);

        InstallationCloseButton.setText(bundle.getString("Easytranscript.InstallationCloseButton.text")); // NOI18N
        InstallationCloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstallationCloseButtonActionPerformed(evt);
            }
        });
        InstallationBottomPanel.add(InstallationCloseButton);

        InstallationLanguageCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Deutsch", "English", "Français", "日本人" }));
        InstallationLanguageCombobox.setToolTipText(bundle.getString("Easytranscript.InstallationLanguageCombobox.toolTipText")); // NOI18N

        InstallationTitle2Label.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        InstallationTitle2Label.setText(bundle.getString("Easytranscript.InstallationTitle2Label.text")); // NOI18N

        InstallationTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        InstallationTitleLabel.setText(bundle.getString("Easytranscript.InstallationTitleLabel.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(InstallationLanguageCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(InstallationTitleLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InstallationTitle2Label, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(InstallationBottomPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(InstallationTitleLabel)
                .addGap(29, 29, 29)
                .addComponent(InstallationTitle2Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InstallationLanguageCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(InstallationBottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// <.editor-fold>//GEN-END:initComponents

    private void InstallationSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstallationSaveButtonActionPerformed

        if (InstallationLanguageCombobox.getSelectedIndex() == 0) {
            prop.setProperty("lang", "de");
        } 
        if (InstallationLanguageCombobox.getSelectedIndex() == 1) {
            prop.setProperty("lang", "en");
        }
        if (InstallationLanguageCombobox.getSelectedIndex() == 3) {
            prop.setProperty("lang", "ja");
        }
        if (InstallationLanguageCombobox.getSelectedIndex() == 2) {
            prop.setProperty("lang", "fr");
            JOptionPane.showMessageDialog(null, "La traduction française n'a pas été pleinement vérifiées, par conséquent, il peut y avoir des erreurs.\nSi vous voulez aider à la traduction, contactez le support.");
        }


      //  JOptionPane.showMessageDialog(null, messages.getString("SpracheAnwenden"));
        try {
            prop.save();
        } catch (IOException e) {
            logger.log(Level.SEVERE, new ErrorReport().show(errors.getString("SavingConfig2")), e);

        }
        
     
       
        dispose();

    }//GEN-LAST:event_InstallationSaveButtonActionPerformed

    private void InstallationCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstallationCloseButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_InstallationCloseButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InstallationBottomPanel;
    private javax.swing.JButton InstallationCloseButton;
    private javax.swing.JComboBox InstallationLanguageCombobox;
    private javax.swing.JButton InstallationSaveButton;
    private javax.swing.JLabel InstallationTitle2Label;
    private javax.swing.JLabel InstallationTitleLabel;
    // End of variables declaration//GEN-END:variables
}
