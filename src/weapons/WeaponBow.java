package weapons;

public class WeaponBow extends Weapon{

	public WeaponBow(String n,int dur, int r, int dd, String wt) { //Bows have ONLY 2 range
		super(n, dur, 2, dd, WeaponType_Bow); //But I can make a Longbow class when I have time.(3 range)
		// TODO Auto-generated constructor stub
	}

}
