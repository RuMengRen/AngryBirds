/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AngryBirdsCharacters;

import org.jbox2d.collision.shapes.Shape;
import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.BodyDef;
import org.jbox2d.dynamics.FixtureDef;

/**
 *
 * @author 何枝可依
 */
abstract public  class AngryBirdsCharacter {

    public BodyDef characterdef=new BodyDef();
    public FixtureDef characterfixdef=new FixtureDef();
    public Shape charactershape;
    public AngryBirdsBodyInfo characterinfo=new AngryBirdsBodyInfo();

    AngryBirdsCharacter() {
        characterdef.bullet=false;
        characterdef.type=characterdef.type.DYNAMIC;
        characterdef.allowSleep=true;
        characterfixdef.friction=0.8f;
        characterfixdef.density=1f;
        characterfixdef.restitution=.4f;


    }


    public void setPosition(Vec2 worldpos) {
        characterdef.position.set(worldpos);
    }

    public void setCharactershape(Shape charactershape) {
        this.characterfixdef.shape=charactershape;
    }
    public void setCharacterdef(BodyDef characterdef) {
        this.characterdef=characterdef;
    }
    public void setCharacterfixturedef(FixtureDef characterfix) {
        this.characterfixdef=characterfix;

    }

    public void setCharacterinfo(AngryBirdsBodyInfo characterinfo) {
        this.characterinfo = characterinfo;
    }

    public BodyDef getCharacterdef() {
        return characterdef;
    }

    public FixtureDef getCharacterfixdef() {
        return characterfixdef;
    }

    public AngryBirdsBodyInfo getCharacterinfo() {
        return characterinfo;
    }
}
