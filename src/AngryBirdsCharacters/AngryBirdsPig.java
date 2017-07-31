/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AngryBirdsCharacters;

import javax.swing.*;

/**
 *
 * @author 何枝可依
 */
public class AngryBirdsPig extends AngryBirdsCharacter{
    ImageIcon pig1=new ImageIcon("src/AngryBirdsImagePack/pigs.png");
    public AngryBirdsPig() {
        super();
        this.getCharacterinfo().setAppearance(pig1.getImage());
        this.getCharacterfixdef().filter.groupIndex=2;
        this.getCharacterinfo().setHafwidth(0.5f);
        this.getCharacterinfo().setHafheight(0.5f);

    }

}
