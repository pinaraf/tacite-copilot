package com.tacite.copilot;

import javax.swing.*;
import java.awt.*;

public class TaciteCopilotApp extends JFrame {

    public TaciteCopilotApp() {
        setTitle("Tacite Copilot");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        
        initComponents();
    }

    private void initComponents() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(5, 1, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JButton importClioButton = new JButton("Import CLIO data");
        importClioButton.addActionListener(e -> onImportClioData());

        JButton importHcButton = new JButton("Import HC data");
        importHcButton.addActionListener(e -> onImportHcData());

        JButton importTaciteButton = new JButton("Import Tacite data");
        importTaciteButton.addActionListener(e -> onImportTaciteData());

        JButton setupButton = new JButton("Setup");
        setupButton.addActionListener(e -> onSetup());

        JButton quitButton = new JButton("Quit");
        quitButton.addActionListener(e -> onQuit());

        mainPanel.add(importClioButton);
        mainPanel.add(importHcButton);
        mainPanel.add(importTaciteButton);
        mainPanel.add(setupButton);
        mainPanel.add(quitButton);

        add(mainPanel);
    }

    private void onImportClioData() {
        // To be implemented later
    }

    private void onImportHcData() {
        // To be implemented later
    }

    private void onImportTaciteData() {
        // To be implemented later
    }

    private void onSetup() {
        // To be implemented later
    }

    private void onQuit() {
        System.exit(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | 
                     IllegalAccessException | UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            }
            TaciteCopilotApp app = new TaciteCopilotApp();
            app.setVisible(true);
        });
    }
}
