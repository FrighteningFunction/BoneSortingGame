import javax.swing.*;
import java.awt.*;

public class UIManager {
    private JFrame gameFrame;
    private BoneGenerator boneGenerator;
    private GameTimer gameTimer;
    private JLabel scoreLabel;
    private JPanel mainPanel;
    private JPanel topPanel;
    private JPanel boneDisplayPanel;
    private JPanel sortingAreaPanel;

    public UIManager() {
        gameFrame = new JFrame("Bone Sorting Game");
        gameFrame.setSize(1024, 768);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setLayout(new BorderLayout());

        boneGenerator = new BoneGenerator();

        // Setting up top panel for score and timer
        topPanel = new JPanel(new GridLayout(1, 2));
        scoreLabel = new JLabel("Score: 0");
        gameTimer = new GameTimer(300); // Example: 300 seconds or 5 minutes

        topPanel.add(scoreLabel);
        topPanel.add(gameTimer);
        gameFrame.add(topPanel, BorderLayout.NORTH);

        // Setting up main panel
        mainPanel = new JPanel(new BorderLayout());
        gameFrame.add(mainPanel, BorderLayout.CENTER);

        // Bone generator (West side)
        boneDisplayPanel = new JPanel(new BorderLayout());
        boneGenerator.displayBoneInContainer(boneDisplayPanel);
        mainPanel.add(boneDisplayPanel, BorderLayout.WEST);

        // Sorting areas (East side)
        sortingAreaPanel = new JPanel(new GridLayout(3, 1));
        sortingAreaPanel.add(new SortingArea(Bone.BoneType.Red, boneGenerator));
        sortingAreaPanel.add(new SortingArea(Bone.BoneType.Green, boneGenerator));
        sortingAreaPanel.add(new SortingArea(Bone.BoneType.Blue, boneGenerator));
        mainPanel.add(sortingAreaPanel, BorderLayout.EAST);

        // South part reserved for future additional graphics
        // Example: gameFrame.add(new JPanel(), BorderLayout.SOUTH);

        gameFrame.setVisible(true);
    }

    public void startGame() {
        gameTimer.startTimer();

        boneGenerator.produceBone();
        boneGenerator.displayBoneInContainer(boneDisplayPanel);
    }

    public void endGame() {
        gameTimer.stopTimer();
        // Add any end-of-game logic here: score display, game over screen, etc.
    }

    public void updateScore(int newScore) {
        scoreLabel.setText("Score: " + newScore);
    }
}


