package weapons;
import items.Item;
import org.newdawn.slick.Image;
import objects.Sprite;
public class Weapon extends Item {
	// define types
	// I think it might be easier to categorize weapons through their damage types(i.e. physical or magic), but....
	public static final String WeaponType_Sword = "Sword";
	public static final String WeaponType_Magic = "Magic";
	public static final String WeaponType_Axe = "Axe";
	public static final String WeaponType_Bow = "Bow";
	public static final String WeaponType_Lance = "Lance";
	private int durability;
	private int range;
	private int dealDamage;
	private int attack;
	private int hitRate;
	private int criticalRate;
	public Weapon(String name, int dur, int rang,int hit, int crit, int damage, String wt) {
		super(name,wt,dur);
		durability = dur;
		range = rang;
		dealDamage = damage;
		hitRate = hit;
		criticalRate = crit;
	}
	public int getDurabilityMax() {
		return durability;
	}
	public int getDurabilityCur() {
		return durability;
	}
	public int getHitRate(){
		return hitRate;
	}
	public int getCritical(){
		return criticalRate;
	}
	
	/** returns if still usable */ 
	public boolean setDurability(int d) {
		durability = d;
		return durability > 0;
	}
	public String getType() {
		return getType();
	}
	/** returns dealDamage, not the calculated kind */
	public int getDealDamage() {
		return dealDamage;
	}
	public int getRange() {
		return range;
	}
	/** must match: durability, type, range */
	public boolean equals(Object obj) {
		Weapon nWeap = (Weapon)obj;
		return durability == nWeap.getDurabilityCur() &&
				getType() == nWeap.getType() &&
				range == nWeap.getRange();
	}
}
