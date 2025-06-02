package Views;

import Controllers.QuizController;
import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {

    private CardLayout cardLayout;
    private JPanel mainPanel;
    private QuizController quizController;
    
    public static final String MAIN = "MAINView";
    public static final String PLAY_METHOD = "PlayMethodView";    
    public static final String PLAY_ONLINE = "PlayOnlineView";
    public static final String PLAY_OFFLINE = "PlayOfflineView";
    public static final String SCORE = "ScoreView";
    public static final String ADD = "AddView";
    public static final String UPDATE = "UpdateView";
    public static final String DELETE = "DeleteView";

    public MainFrame() {
        setTitle("Game Launcher");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        
        quizController = new QuizController();
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Tambahkan semua panel ke mainPanel
        mainPanel.add(new MainView(this), MAIN);
        mainPanel.add(new PlayMethodView(this), PLAY_METHOD);
        mainPanel.add(new PlayOnlineView(this), PLAY_ONLINE);
        mainPanel.add(new PlayOfflineView(this, quizController), PLAY_OFFLINE);
        mainPanel.add(new ScoreView(this, quizController), SCORE);
        mainPanel.add(new AddView(this, quizController), ADD);
        mainPanel.add(new UpdateView(this, quizController), UPDATE);
        mainPanel.add(new DeleteView(this, quizController), DELETE);

        setContentPane(mainPanel);
        setVisible(true);
    }
    
    public QuizController getQuizController(){
        return quizController;
    }

    // Method untuk ganti tampilan
    public void showView(String name) {
        cardLayout.show(mainPanel, name);
    }
}