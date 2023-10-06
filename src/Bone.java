import javax.swing.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.floor;

/**
 * it represents an individual bone
 *
 * static bone image arrays need to be loaded manually!
 */
public class Bone {
    public enum BoneType {
        Alien,
        Bird,
        Human
    };
    BoneType boneType;

    Icon boneImage;

    static Icon[] ALIEN_BONES;
    static Icon[] BIRD_BONES;
    static Icon[] HUMAN_BONES;

    /**
     * Spawns a bone randomly: chooses its type, then randomly pics
     * an icon from the corresponding static icon container
     */
    Bone(){
        boneType = BoneType.values()[(int)(Math.random()*3)];

        switch(boneType){
            case Alien:
                boneImage = ALIEN_BONES[(int)(Math.random()*ALIEN_BONES.length)];
                break;
            case Bird:
                boneImage = BIRD_BONES[(int)(Math.random()* BIRD_BONES.length)];
                break;
            case Human:
                boneImage = HUMAN_BONES[(int)(Math.random()*HUMAN_BONES.length)];
                break;
        }
    }

    public static void loadBoneImages() {
        ALIEN_BONES = loadImagesFromDirectory("path/to/alien/bones");
        BIRD_BONES = loadImagesFromDirectory("path/to/bird/bones");
        HUMAN_BONES = loadImagesFromDirectory("path/to/human/bones");
    }

    private static Icon[] loadImagesFromDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        File[] files = directory.listFiles((dir, name) -> name.toLowerCase().endsWith(".png"));

        // Check if no files are found or if the directory does not exist.
        if (files == null || files.length == 0) {
            throw new RuntimeException("Fatal error: No images found in directory: " + directoryPath);
        }

        List<Icon> icons = new ArrayList<>();
        for (File file : files) {
            icons.add(new ImageIcon(file.getAbsolutePath()));
        }
        return icons.toArray(new ImageIcon[0]);
    }

}
