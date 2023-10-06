import javax.swing.*;

/**
 * Notes:
 *
 * This version of BoneGenerator provides methods to produce a new bone and retrieve the current bone.
 * The displayBoneInContainer method is a very basic method to display the bone in a specified JPanel.
 * Depending on how the game evolves, you might want a more sophisticated way to manage bone display.
 * You might also want to add more methods and functionalities based on the needs of the game.
 * To integrate BoneGenerator with your game:
 *
 * Create an instance of BoneGenerator in your main game loop or controller.
 * Call produceBone() whenever you want to generate a new bone.
 * Use the displayBoneInContainer to show the bone in the desired game area.
 */

public class BoneGenerator {

    private Bone currentBone;

    /**
     * Produces a new bone, which will be randomly chosen based on the Bone class logic.
     * @return The generated Bone instance.
     */
    public Bone produceBone() {
        currentBone = new Bone();
        return currentBone;
    }

    /**
     * Retrieves the currently generated bone.
     * @return The current Bone instance.
     */
    public Bone getCurrentBone() {
        return currentBone;
    }

    /**
     * Display the current bone in a specified container (like a JPanel).
     * This is a simple version and might be expanded based on actual game requirements.
     * @param container The container where the bone image will be shown.
     */
    public void displayBoneInContainer(JPanel container) {
        JLabel boneLabel = new JLabel(currentBone.boneImage);
        container.removeAll(); // Clear previous bones, if any.
        container.add(boneLabel);
        container.revalidate();
        container.repaint();
    }
}
