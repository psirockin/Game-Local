package units;
import items.Item;
import java.util.Stack;
import objects.Sprite;
import weapons.Weapon;
import weapons.WeaponLance;
public class UnitCavalier extends Unit {
	public UnitCavalier() {
		super("Cavalier", null, 9, 9, 10, 0, 7, 1, 6, null, null, null, null, new WeaponLance());
	}
	@Override
	public boolean attack() {
		return true;
	}
}
