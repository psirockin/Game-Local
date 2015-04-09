package units;
import items.Item;

import java.util.Stack;

import objects.Sprite;
import weapons.Weapon;
public class UnitMyrmidon extends Unit {
	public UnitMyrmidon(String nam, Sprite sprite, int health, int str, int def, int mag, int res, int skl, int lck, int spd,int mov, Item [] its) {
		super(nam, sprite, health, str, def, mag, res, skl, lck, spd, mov, its);
	}
}
