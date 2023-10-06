public class GameMain {

    private static UIManager uiManager;

    public static void main(String[] args) {
        initializeGame();
        startGame();

        // For the sake of simplicity, there's no endGame() in this initial version.
        // It could be triggered by a game timer expiration or a specific event.
    }

    public static void initializeGame() {
        // Set the look and feel to the system default
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        //load the bones from the directories. If that does not work,
        //it throws a fatal error
        Bone.loadBoneImages();

        // Initialize the game UI
        uiManager = new UIManager();
    }

    public static void startGame() {
        uiManager.startGame();
    }

    public static void endGame() {
        uiManager.endGame();

        // Example game over logic:
        // Display the score and possibly provide options to restart or exit.
        // For now, simply print the game over message.
        System.out.println("Game Over!");
        // You can extend this to show a dialog or update the UI with the game over message and score.
    }
}


