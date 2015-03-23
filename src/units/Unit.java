package units;
import java.util.Stack;

import org.newdawn.slick.Image;

import objects.Sprite;
import objects.SpriteProperties;
import weapons.Weapon;
public class Unit implements SpriteProperties {
	protected Sprite spr;
	
	// stats
	/** hit points */
	protected int hp;
	/** attack */
	protected int attack;
	/** damage reduction */
	protected int defense;
	/** amount of magic */
	protected int magic;
	/** max amount of spaces a unit can move */
	protected int speed;
	/** weapons that are usable at any time while equipped. index 0 is the last used one  */
	private Weapon [] allWeapons = new Weapon [5];
	/** you can only have 5 weapons equipped, but others will be unusable for the time */
	private Stack<Weapon> weapons = new Stack<Weapon>();
	/** to be changed with getters and setters */
	public Unit() {
		// type, like "Lord/", "Mage", etc...
		hp = 10;
		defense = 4;
		speed = 3;
		allWeapons[0] = new Weapon();
		for(int i = 1; i < allWeapons.length; i++) {
			
		}
	}
	public Unit(String n, int h, int atk, int mg, int spd, Weapon w) {
		hp = h;
		attack = atk;
		magic = mg;
		speed = spd;
		allWeapons[0] = w;
	}
	/** returns the Sprite in the Unit */
	/** Swap weapons in stack, or add it if not there. Return if it added one. */
	public boolean changeWeapon(Weapon toWeap) {
		boolean has = false;
		int index = 0;
		for(int i = 0; i < weapons.size(); i++) {
			if(weapons.get(i).equals(toWeap)) {
				has = true;
				index = i;
				break;
			}
		}
		allWeapons[0] = weapons.get(index);
		return has;
	}
	public boolean attack(){
	    return true;
	}
	
	public void setHP(int h) {
		this.hp = h;
	}
	public int getHP() {
		return this.hp;
	}
	public int getDefense() {
		return this.defense;
	}
	public int getSpeed() {
		return this.speed;
	}
	public int[] getStats() {
		int [] ret = {this.hp,this.defense,this.speed};
		return ret;
	}
	@Override
	public Image getSpriteImage() {
		// TODO Auto-generated method stub
		return spr.getImg();
	}
	@Override
	public void setSpriteImage(String sType) {
		this.spr = new Sprite(sType);
	}
}
