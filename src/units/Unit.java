package units;
import items.Item;
import java.util.Stack;
import objects.Sprite;
import org.newdawn.slick.Image;
import weapons.Weapon;
import weapons.WeaponLance;
public class Unit {
	private String name = "UNIT_NAME_NULL";
	/** the image that goes along with it */
	private Sprite spr;
	// stats
	/** hit points */
	private int hp;
	/** Maximum HP */
	private int hpMax;
	/** attack */
	private int attack;
	/** damage reduction */
	private int defense;
	/** amount of magic */
	private int magic;
	/** defense against magic attacks */
	private int resist;
	/** max amount of spaces a unit can move */
	private int speed;
	/** weapons that are usable at any time while equipped. index 0 is the last used one  */
	private Weapon [] eWeapons = new Weapon [5];
	/** all items on unit */
	private Stack<Item> items = new Stack<Item>();
	/** item being held */
	private Item curItem;
	/** you can only have 5 weapons equipped, but others will be unusable for the time */
	private Stack<Weapon> allWeapons = new Stack<Weapon>();
	/** Default case if none is specified */
	public Unit() {
		hp = 10;
		defense = 4;
		speed = 3;
		eWeapons[0] = new WeaponLance();
		for(int i = 1; i < eWeapons.length; i++) {
			
		}
	}
	public Unit(String n, Sprite sprite, int h, int hpm, int atk, int d, int mg, int r, int s) {
		hp = h;
		hpMax = hpm;
		attack = atk;
		magic = mg;
		speed = s;
	}
	/** takes place of some constructor parameters */
	protected void initNonStats(Stack<Item> i, Item ci, Stack<Weapon> allw, Weapon w) {
		items = i;
		curItem = ci;;
		allWeapons = allw;
		eWeapons[0] = w;
		for(int ind = 0; ind < eWeapons.length; ind++)
			eWeapons[ind] = null;
	}
	/** Swap weapons in stack, or add it if not there. Return if it added one. */
	public boolean changeWeapon(Weapon toWeap) {
		boolean has = false;
		int index = 0;
		for(int i = 0; i < allWeapons.size(); i++) {
			if(allWeapons.get(i).equals(toWeap)) {
				has = true;
				index = i;
				break;
			}
		}
		eWeapons[0] = allWeapons.get(index);
		return has;
	}
	/** Returns if the item was added */
	public boolean changeItem(Item i) {
		if(items.indexOf(i) != 0) {
			curItem = i;
			return false;
		} else {
			items.add(i);
			return true;
		}
	}
	public int getAttack() {
		return attack;
	}
	/** performs an ACTION. does NOT get the value */
	public boolean attack(){
	    return true;
	}
	public void setHP(int h) {
		hp = h;
	}
	public int getHP() {
		return hp;
	}
	public int getDefense() {
		return defense;
	}
	public int getSpeed() {
		return speed;
	}
	/** hp, defense, speed */
	public int[] getStats() {
		int [] ret = {hp, defense, speed};
		return ret;
	}
	/** returns the Sprite's Image in the Unit */
	public Image getSpriteImage() {
		return spr.getImg();
	}
	/** sets the Sprite in the Unit */
	public void setSpriteImage(String sType) {
		spr = new Sprite(sType);
	}
	public int getMagic() {
		return magic;
	}
	public int getResist() {
		return resist;
	}
}
