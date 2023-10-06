import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameTimer extends JLabel {
    private int timeRemaining; // time in seconds
    private Timer timer;
    private TitledBorder titledBorder;

    public GameTimer(int startTime) {
        this.timeRemaining = startTime;
        this.setBorder(BorderFactory.createTitledBorder("Time remaining:"));

        // Set up the Swing timer to decrease time every second
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                decrementTime();
            }
        });
    }

    private void decrementTime() {
        if (timeRemaining > 0) {
            timeRemaining--;
            updateDisplay();
        } else {
            timer.stop();
            onTimeOut();
        }
    }

    private void updateDisplay() {
        this.setText("Time remaining: " + timeRemaining + "s");
    }

    public void startTimer() {
        timer.start();
    }

    public void stopTimer() {
        timer.stop();
    }

    public void resetTimer(int newStartTime) {
        timeRemaining = newStartTime;
        updateDisplay();
    }

    // This function can be overridden in subclasses, or you can add an event listener
    // to handle specific actions when time runs out.
    protected void onTimeOut() {
        System.out.println("Time's up!");
    }
}