package weapons;

public class WeaponBow extends Weapon{

	public WeaponBow(String name,int dur,int hit, int crit, int damage) { //Bows have ONLY 2 range
		super(name, dur, 2, hit, crit, damage, WeaponType_Bow); //But I can make a Longbow class when I have time.(3 range)
		// TODO Auto-generated constructor stub
	}

}
