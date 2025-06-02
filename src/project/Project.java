package project;

import Views.MainFrame;
import javax.swing.JFrame;

public class Project {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new MainFrame();
        });
    }
    
}
