import javax.swing.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * it represents an individual bone
 *
 * static bone image arrays need to be loaded manually!
 */
public class Bone {
    public enum BoneType {
        Red,
        Green,
        Blue
    };
    BoneType boneType;

    Icon boneImage;

    static Icon[] RED_BONES;
    static Icon[] GREEN_BONES;
    static Icon[] BLUE_BONES;

    /**
     * Spawns a bone randomly: chooses its type, then randomly pics
     * an icon from the corresponding static icon container
     */
    Bone(){
        boneType = BoneType.values()[(int)(Math.random()*3)];

        switch(boneType){
            case Red:
                boneImage = RED_BONES[(int)(Math.random()* RED_BONES.length)];
                break;
            case Green:
                boneImage = GREEN_BONES[(int)(Math.random()* GREEN_BONES.length)];
                break;
            case Blue:
                boneImage = BLUE_BONES[(int)(Math.random()* BLUE_BONES.length)];
                break;
        }
    }

    public static void loadBoneImages() {
        RED_BONES = loadImagesFromDirectory("./BoneImages/Blue");
        GREEN_BONES = loadImagesFromDirectory("./BoneImages/Green");
        BLUE_BONES = loadImagesFromDirectory("./BoneImages/Red");
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
