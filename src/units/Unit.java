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
	private int strength;
	/** damage reduction */
	private int defense;
	/** amount of magic */
	private int magic;
	/** defense against magic attacks */
	private int resist;
	/** Determines avoid rate */
	private int speed;
	/** Determines crit rate and hit rate */
	private int skill;
	/** reduces enemy crit rate, and improves hit rate */
	private int luck;
	/** max amount of spaces a unit can move */
	private int move;
	/** weapons that are usable at any time while equipped. index 0 is the used one  */
	private Item [] items = new Item [6];
	/** all items on unit */
	/** item being held */
	/** you can only have 5 weapons equipped, but others will be unusable for the time */
	private Stack<Weapon> allWeapons = new Stack<Weapon>();
	/** Default case if none is specified */
	public Unit() {
		hp = 10;
		defense = 4;
		speed = 3;
	}
	public Unit(String n, Sprite sprite, int h, int hpm, int str, int d, int mg, int r, int spd, int s, int lk, int m, Item [] its) {
		hp = h;
		hpMax = hpm;
		strength = str;
		magic = mg;
		speed = spd;
		skill = sk;
		luck = lk;
		move = m;
		items = its;
	}
	/** compiles the probababilities of a conflict between two units */
	public void combatForecast(Unit other) {
		int dmg = 0;
		int atk = this.calculateAttack();
		String type = ((Weapons)items[0]).getType();
		if(type == Weapon.WeaponType_Magic){
			dmg = atk-other.resist;
		}
		if(type == Weapon.WeaponType_Sword){
			dmg = atk-other.defense;
		}
		int hit = this.hitRate() - other.avoidRate();
		int critical = this.critRate() - other.luck;
	}
	/** determines if unit will strike twice */
	public boolean strikeTwice(Unit other){
		if(this.speed - other.speed >= 5){
			return true;
		}
		return false;
	}
	/** calculate the attack using the magic/strength from this class */
	public int calculateAttack() {
		int a = (((Weapon)items[0]).getType() == Weapon.WeaponType_Magic) ? magic : attack;
		return a + ((Weapon)items[0]).getDealDamage();
	}
	/** calculates hit rate */
	public int hitRate() {
		return ((Weapon)items[0]).getHitRate() + (skill*3 + luck)/2;
	}
	/** calculates avoid rate */
	public int avoidRate() {
		return (speed*3 + luck)/2;
	}
	/** calculates critical hit rate */
	public int critRate() {
		return ((Weapon)items[0]).getCritical() + (skill/2);
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
		items[0] = allWeapons.get(index);
		return has;
	}
	/** swaps index A with B */
	private void swapItems(int a, int b) {
		Item t =  items[a];
		items[a] = items[b];
		items[b] = t;
	}
	public int getAttack() {
		return attack;
	}
	/** performs an ACTION. does NOT get the value */
	public int attack(){
		// make sure items[0] is a Weapon
		if(!items[0].isWeapon()) {
			for(int i = 1; i < items.length; i++) {
				if(items[i].isWeapon()) {
					swapItems(0, i);
					break;
				}
			}
		}
		String type = ((Weapons)items[0]).getType();
		if(type == Weapon.WeaponType_Magic){
			return calculateAttack()-other.resist;
		}
		if(type == Weapon.WeaponType_Sword){
			return calculateAttack()-other.defense;
		}
	    	return 0;
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
