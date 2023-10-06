import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SortingArea extends JPanel {
    private Bone.BoneType boneType;
    private BoneGenerator boneGenerator; // Reference to the bone generator to get the current bone

    public SortingArea(Bone.BoneType boneType, BoneGenerator boneGenerator) {
        this.boneType = boneType;
        this.boneGenerator = boneGenerator;

        setupUI();
    }

    private void setupUI() {
        // Basic UI setup
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createTitledBorder(boneType.name() + " Bones"));

        // Add a mouse listener for drag-and-drop or clicking functionality
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                handleBoneSorting();
            }
        });
    }

    private void handleBoneSorting() {
        Bone currentBone = boneGenerator.getCurrentBone();
        if(currentBone != null && currentBone.boneType == this.boneType) {
            // Bone sorted correctly
            // Here, you can add a visual indication or increment score
            System.out.println("Correctly sorted!");
        } else {
            // Bone sorted incorrectly
            // Handle incorrect sorting, like decrementing score or showing a message
            System.out.println("Incorrectly sorted!");
        }
    }
}

