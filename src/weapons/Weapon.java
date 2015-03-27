package weapons;
import items.Item;
import org.newdawn.slick.Image;
import objects.Sprite;
public class Weapon extends Item {
	// define types
	public static final String WeaponType_Sword = "Sword";
	public static final String WeaponType_Magic = "Magic";
	private int durability;
	private int range;
	private int dealDamage;
	private int hit;
	private int critical;
	private int attack;
	public Weapon(int dur, int r, int h, int c, int dd, String wt) {
		super(wt,dur);
		durability = dur;
		range = r;
		dealDamage = dd;
		hit = h;
		critical = c;
	}
	public int getHitRate(){
		return hit;
	}
	public int getCritical(){
		return critical;
	}
	public int getDurabilityMax() {
		return durability;
	}
	public int getDurabilityCur() {
		return durability;
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
