import javax.swing.*;

public class Scoreboard extends JLabel {
    private int Score;

    public Scoreboard(){
        Score = 0;
        setupUI();
        displayScore();
    }

    public int getScore(){
        return Score;
    }

    public void increaseScore(int score){
        Score+=score;
        displayScore();
    }

    private void setupUI(){
        this.setBorder(BorderFactory.createTitledBorder("Your score: "));
    }

    private void displayScore(){
        this.setText(String.valueOf(Score));
    }




}
