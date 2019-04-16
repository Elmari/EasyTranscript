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
package de.ewerkzeug.easytranscript.GUI.Components;

import de.ewerkzeug.easytranscript.Core.V;
import static de.ewerkzeug.easytranscript.Core.V.Millisekunden_current;
import static de.ewerkzeug.easytranscript.Core.V.MinutenC_string;
import static de.ewerkzeug.easytranscript.Core.V.SekundenC_string;
import static de.ewerkzeug.easytranscript.Core.V.StundenC_string;
import static de.ewerkzeug.easytranscript.Core.V.easytranscript;
import static de.ewerkzeug.easytranscript.Core.V.messages;
import static de.ewerkzeug.easytranscript.Core.V.millisecondsPerStep;
import static de.ewerkzeug.easytranscript.Core.V.player;
import static de.ewerkzeug.easytranscript.Core.V.prop;
import static de.ewerkzeug.easytranscript.Core.V.useFXPlayer;
import de.ewerkzeug.easytranscript.GUI.Misc.UpdateTimer;
import de.ewerkzeug.easytranscript.IO.Data.TranscriptHandler;
import static de.ewerkzeug.easytranscript.IO.Data.TranscriptHandler.transcriptName;
import de.ewerkzeug.easytranscript.Tools.PlayerFX;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import uk.co.caprica.vlcj.binding.internal.libvlc_audio_output_channel_t;
import uk.co.caprica.vlcj.player.Equalizer;
import uk.co.caprica.vlcj.player.MediaPlayerFactory;
import uk.co.caprica.vlcj.version.LibVlcVersion;
import uk.co.caprica.vlcj.version.Version;

/**
 *
 * @author e-werkzeug <administrator@e-werkzeug.eu>
 */
public class TunerDialog extends javax.swing.JDialog {

    private Equalizer equalizer;
    private EqualizerFrame equalizerFrame;

    /**
     * Creates new form TunerDialog
     */
    public TunerDialog() {
        super();
        
        if (prop.getIntProperty("maxPlayerRate")==-1){
            prop.setIntProperty("maxPlayerRate", 200);
            try {
                prop.save();
            } catch (IOException ex) {
                Logger.getLogger(TunerDialog.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (prop.getIntProperty("maxPlayerRate")<50){
            V.maxPlayerRate = 50;
            
        }else if(prop.getIntProperty("maxPlayerRate")>=50 && prop.getIntProperty("maxPlayerRate")<=400){
            V.maxPlayerRate = prop.getIntProperty("maxPlayerRate");
        }else if (prop.getIntProperty("maxPlayerRate")>400){
            V.maxPlayerRate = 400;
        }
            
        
        
      
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

        TunerPanel2 = new javax.swing.JPanel();
        TunerSpeedPanel2 = new javax.swing.JPanel();
        TunerrateSlider = new javax.swing.JSlider();
        TunerrateLabel = new javax.swing.JLabel();
        TunerVolumePanel = new javax.swing.JPanel();
        TunerVolumeLabel = new javax.swing.JLabel();
        TunerVolumeSlider = new javax.swing.JSlider();
        TunerEqPanel = new javax.swing.JPanel();
        TunereqButton = new javax.swing.JButton();
        TunerChannelPanel = new javax.swing.JPanel();
        TunerChannelCombobox = new javax.swing.JComboBox();
        TunerChannelLabel = new javax.swing.JLabel();

        setUndecorated(true);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        TunerPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        TunerrateSlider.setMaximum(200);
        TunerrateSlider.setValue(100);
        TunerrateSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TunerrateSliderMouseReleased(evt);
            }
        });

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("de/ewerkzeug/easytranscript/Core/Bundles/Bundle"); // NOI18N
        TunerrateLabel.setText(bundle.getString("Easytranscript.TunerrateLabel.text")); // NOI18N
        TunerrateLabel.setEnabled(false);

        javax.swing.GroupLayout TunerSpeedPanel2Layout = new javax.swing.GroupLayout(TunerSpeedPanel2);
        TunerSpeedPanel2.setLayout(TunerSpeedPanel2Layout);
        TunerSpeedPanel2Layout.setHorizontalGroup(
            TunerSpeedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TunerSpeedPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TunerSpeedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TunerrateSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TunerrateLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TunerSpeedPanel2Layout.setVerticalGroup(
            TunerSpeedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TunerSpeedPanel2Layout.createSequentialGroup()
                .addComponent(TunerrateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TunerrateSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        TunerrateSlider.setMaximum(V.maxPlayerRate);
        TunerrateSlider.setMinimum(50);
        TunerrateSlider.setMajorTickSpacing(50);
        TunerrateSlider.setMinorTickSpacing(10);
        TunerrateSlider.setPaintTicks(true);
        TunerrateSlider.setPaintLabels(true);
        TunerrateSlider.setValue(100);
        TunerrateSlider.setSnapToTicks(true);

        TunerVolumeLabel.setText(bundle.getString("Easytranscript.TunerVolumeLabel.text")); // NOI18N
        TunerVolumeLabel.setEnabled(false);

        TunerVolumeSlider.setMaximum(150);
        TunerVolumeSlider.setEnabled(false);
        TunerVolumeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TunerVolumeSliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout TunerVolumePanelLayout = new javax.swing.GroupLayout(TunerVolumePanel);
        TunerVolumePanel.setLayout(TunerVolumePanelLayout);
        TunerVolumePanelLayout.setHorizontalGroup(
            TunerVolumePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TunerVolumePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TunerVolumePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TunerVolumeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TunerVolumeLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TunerVolumePanelLayout.setVerticalGroup(
            TunerVolumePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TunerVolumePanelLayout.createSequentialGroup()
                .addComponent(TunerVolumeLabel)
                .addGap(0, 0, 0)
                .addComponent(TunerVolumeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        TunerVolumeSlider.setMaximum(150);
        TunerVolumeSlider.setMajorTickSpacing(25);
        TunerVolumeSlider.setMinorTickSpacing(5);
        TunerVolumeSlider.setPaintTicks(true);
        TunerVolumeSlider.setPaintLabels(true);
        TunerVolumeSlider.setValue(100);

        TunereqButton.setText(bundle.getString("Easytranscript.TunereqButton.text")); // NOI18N
        TunereqButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TunereqButtonActionPerformed(evt);
            }
        });
        TunerEqPanel.add(TunereqButton);
        if (!useFXPlayer){
            boolean supported = LibVlcVersion.getVersion().atLeast(new Version("2.2.0"));
            TunereqButton.setEnabled(supported);
            if (!supported) TunereqButton.setText(messages.getString("equalizerNotSupported"));
        }

        TunerChannelCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Stereo", "Left", "Right" }));
        TunerChannelCombobox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TunerChannelComboboxItemStateChanged(evt);
            }
        });
        TunerChannelPanel.add(TunerChannelCombobox);

        TunerChannelLabel.setText(bundle.getString("Easytranscript.TunerChannelLabel.text")); // NOI18N
        TunerChannelLabel.setEnabled(false);

        javax.swing.GroupLayout TunerPanel2Layout = new javax.swing.GroupLayout(TunerPanel2);
        TunerPanel2.setLayout(TunerPanel2Layout);
        TunerPanel2Layout.setHorizontalGroup(
            TunerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TunerEqPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TunerPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TunerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TunerSpeedPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TunerVolumePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(TunerPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(TunerChannelLabel)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(TunerChannelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TunerPanel2Layout.setVerticalGroup(
            TunerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TunerPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TunerVolumePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TunerSpeedPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TunerChannelLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TunerChannelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TunerEqPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TunerPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TunerPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TunerrateSliderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TunerrateSliderMouseReleased
        updateSpeed();
    }//GEN-LAST:event_TunerrateSliderMouseReleased

    private void TunerVolumeSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TunerVolumeSliderStateChanged
        if (!useFXPlayer) {
            if (player != null) {
                if (player.isMediaLoaded()) {
                    player.getMediaPlayer().setVolume(TunerVolumeSlider.getValue());
                }
            }
        } else {
            if (PlayerFX.getMediaPlayer() != null) {

                PlayerFX.getMediaPlayer().setVolume(TunerVolumeSlider.getValue() / 100d);

            }
        }
    }//GEN-LAST:event_TunerVolumeSliderStateChanged

    private void TunereqButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TunereqButtonActionPerformed
        if (!useFXPlayer) {
            MediaPlayerFactory mediaPlayerFactory = player.getMediaPlayerFactory();

            if (mediaPlayerFactory.isEqualizerAvailable()) {
                if (equalizer == null) {
                    equalizer = mediaPlayerFactory.newEqualizer();
                    equalizerFrame = new EqualizerFrame(mediaPlayerFactory.getEqualizerBandFrequencies(), mediaPlayerFactory.getEqualizerPresetNames(), mediaPlayerFactory, player.getMediaPlayer(), equalizer);
                    equalizerFrame.pack();
                    equalizerFrame.setLocationRelativeTo(null);
                }
                equalizerFrame.setVisible(true);
                equalizerFrame.toFront();

            } else {
                equalizerFrame = null;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Currently not supported with internal Java Player activated. Come back later");
        }
    }//GEN-LAST:event_TunereqButtonActionPerformed

    private void TunerChannelComboboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TunerChannelComboboxItemStateChanged
        if (!useFXPlayer) {
            int index = 0;

            if (TunerChannelCombobox.getSelectedIndex() == 0) { // Stereo

                for (int i = 0; i < libvlc_audio_output_channel_t.values().length; i++) {
                    if (libvlc_audio_output_channel_t.values()[i].toString().substring(20, libvlc_audio_output_channel_t.values()[i].toString().length()).equals("Stereo")) {
                        index = i;
                        break;
                    }
                }

                player.getMediaPlayer().setAudioChannel(index);
            }

            if (TunerChannelCombobox.getSelectedIndex() == 1) { // Links
                for (int i = 0; i < libvlc_audio_output_channel_t.values().length; i++) {
                    if (libvlc_audio_output_channel_t.values()[i].toString().substring(20, libvlc_audio_output_channel_t.values()[i].toString().length()).equals("Left")) {
                        index = i;
                        break;
                    }
                }

                player.getMediaPlayer().setAudioChannel(index);
            }

            if (TunerChannelCombobox.getSelectedIndex() == 2) { // Rechts
                for (int i = 0; i < libvlc_audio_output_channel_t.values().length; i++) {
                    if (libvlc_audio_output_channel_t.values()[i].toString().substring(20, libvlc_audio_output_channel_t.values()[i].toString().length()).equals("Right")) {
                        index = i;
                        break;
                    }
                }

                player.getMediaPlayer().setAudioChannel(index);
            }

        } else {
            if (TunerChannelCombobox.getSelectedIndex() == 0) { // Stereo

                PlayerFX.getMediaPlayer().setBalance(0);

            }

            if (TunerChannelCombobox.getSelectedIndex() == 1) { // Links
                PlayerFX.getMediaPlayer().setBalance(-1d);
            }

            if (TunerChannelCombobox.getSelectedIndex() == 2) { // Rechts
                PlayerFX.getMediaPlayer().setBalance(1d);
            }
        }
    }//GEN-LAST:event_TunerChannelComboboxItemStateChanged

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        setVisible(false);
    }//GEN-LAST:event_formWindowLostFocus

    public Equalizer getEqualizer() {
        return equalizer;
    }

    public EqualizerFrame getEqualizerFrame() {
        return equalizerFrame;
    }

    public JSlider getTunerVolumeSlider() {
        return TunerVolumeSlider;
    }

    public JSlider getTunerrateSlider2() {
        return TunerrateSlider;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox TunerChannelCombobox;
    private javax.swing.JLabel TunerChannelLabel;
    private javax.swing.JPanel TunerChannelPanel;
    private javax.swing.JPanel TunerEqPanel;
    private javax.swing.JPanel TunerPanel2;
    private javax.swing.JPanel TunerSpeedPanel2;
    private javax.swing.JLabel TunerVolumeLabel;
    private javax.swing.JPanel TunerVolumePanel;
    private javax.swing.JSlider TunerVolumeSlider;
    private javax.swing.JButton TunereqButton;
    private javax.swing.JLabel TunerrateLabel;
    private javax.swing.JSlider TunerrateSlider;
    // End of variables declaration//GEN-END:variables

    public void updateSpeed() {
        if (!useFXPlayer) {
            if (player.isMediaLoaded()) {
                if (millisecondsPerStep != TunerrateSlider.getValue() / 10) {
                    boolean playing = player.getMediaPlayer().isPlaying();
                    player.getMediaPlayer().setPause(true);

                    player.getMediaPlayer().setRate((float) TunerrateSlider.getValue() / 100);

                    V.currentPlayerTime = easytranscript.getMainSlider().getValue() * 1000;

                    new UpdateTimer().updateTimeStrings();

                    easytranscript.getMainTimeLabel().setText(StundenC_string + ":" + MinutenC_string + ":" + SekundenC_string);
                    String stern = "";
                    if (TranscriptHandler.isUnsaved()) {
                        stern = "*";
                    }
                    setTitle("easytranscript - " + transcriptName + stern + " - " + easytranscript.getMainTimeLabel().getText() + " " + messages.getString("vonTime") + " " + easytranscript.getMainTotalLabel().getText());
                    easytranscript.getMainTimeMilliLabel().setText("-" + Millisekunden_current);

                    millisecondsPerStep = TunerrateSlider.getValue() / 10;

                    try {
                        Thread.sleep(200);

                    } catch (InterruptedException ex) {
                        Logger.getLogger(TunerDialog.class
                                .getName()).log(Level.SEVERE, null, ex);
                    }

                    player.getMediaPlayer().setPause(!playing);
                }
            }
        } else {

            if (millisecondsPerStep != TunerrateSlider.getValue() / 10) {
                boolean playing = PlayerFX.getMediaPlayer().getStatus().equals(javafx.scene.media.MediaPlayer.Status.PLAYING);
                PlayerFX.getMediaPlayer().pause();

                PlayerFX.getMediaPlayer().setRate((float) TunerrateSlider.getValue() / 100);

                V.currentPlayerTime = easytranscript.getMainSlider().getValue() * 1000;

                easytranscript.getMainTimeLabel().setText(StundenC_string + ":" + MinutenC_string + ":" + SekundenC_string);
                String stern = "";
                if (TranscriptHandler.isUnsaved()) {
                    stern = "*";
                }
                setTitle("easytranscript - " + transcriptName + stern + " - " + easytranscript.getMainTimeLabel().getText() + " " + messages.getString("vonTime") + " " + easytranscript.getMainTotalLabel().getText());
                easytranscript.getMainTimeMilliLabel().setText("-" + Millisekunden_current);

                millisecondsPerStep = TunerrateSlider.getValue() / 10;

                try {
                    Thread.sleep(200);

                } catch (InterruptedException ex) {
                    Logger.getLogger(TunerDialog.class
                            .getName()).log(Level.SEVERE, null, ex);
                }

                if (playing) {
                    PlayerFX.getMediaPlayer().play();
                }
            }

        }
    }

    public JSlider getTunerrateSlider() {
        return TunerrateSlider;
    }

}
