package units;
import items.Item;

import java.util.Stack;

import objects.Sprite;
import weapons.Weapon;
import weapons.WeaponLance;
public class UnitCavalier extends Unit {
	public UnitCavalier(String nam, Sprite sprite, int health, int str, int def, int mag, int res, int skl, int lck, int spd,int mov, Item [] its) {
		super(nam, sprite, health, str, def, mag, res, skl, lck, spd, mov, its);
	}
}
