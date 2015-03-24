package weapons;
import org.newdawn.slick.Image;

import objects.Sprite;
public class Weapon {
	// define types
	public static final String WeaponType_Sword = "Sword";
	private Sprite spr;
	private int durability;
	private int range;
	private int dealDamage;
	private String type = "NULL_TYPE";
	public Weapon(int dur, int r, int dd, String wt) {
		durability = dur;
		range = r;
		dealDamage = dd;
		type = wt;
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
		return type;
	}
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
				type == nWeap.getType() &&
				range == nWeap.getRange();
	}
	public Image getSpriteImage() {
		return spr.getImg();
	}
	public void setSpriteImage(String sType) {
		spr = new Sprite(sType);
	}
}
