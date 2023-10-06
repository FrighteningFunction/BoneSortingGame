import javax.swing.*;

import static java.lang.Math.floor;

/**
 * it represents an individual bone
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

}
