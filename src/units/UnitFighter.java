package units;

import items.Item;
import objects.Sprite;

public class UnitFighter extends Unit{
	public UnitFighter(String nam, Sprite sprite, int health, int str, int def, int mag, int res, int skl, int lck, int spd,int mov, Item [] its){
		super(nam, sprite, health, str, def, mag, res, skl, lck, spd, mov, its);
	}
}
