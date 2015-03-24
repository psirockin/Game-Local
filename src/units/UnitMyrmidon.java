package units;
import items.Item;
import java.util.Stack;
import objects.Sprite;
import weapons.Weapon;
public class UnitMyrmidon extends Unit {
	public UnitMyrmidon(String n, Sprite sprite, int h, int hpm, int atk, int d, 
			int mg, int r, int s, Weapon[] ew, Stack<Item> i, Item ci, 
			Stack<Weapon> allw, int spd, Weapon w) {
		super(n, sprite, h, hpm, atk, d, mg, r, s, ew, i, ci, allw, spd, w);
	}
	@Override
	public boolean attack() {
		return false;
	}
}
