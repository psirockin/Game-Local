package units;
import items.Item;
import items.ItemHeal;

import java.util.Stack;

import objects.Sprite;
import weapons.Weapon;
import weapons.WeaponSword;
public class UnitLord extends Unit {
	public UnitLord() {
		super("Lord", null, 18, 18, 10, 47, 6, 1, 4);
		Stack<Weapon> equippedWeps = new Stack<Weapon>();
		initNonStats(null, new ItemHeal("Healer", 7), equippedWeps, new WeaponSword());
	}
}
