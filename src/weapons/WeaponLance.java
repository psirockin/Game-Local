package weapons;
public class WeaponLance extends Weapon {
	public WeaponLance(String name, int dur, int rang,int hit, int crit, int damage) {
		super(name, dur, rang, hit, crit, damage, WeaponType_Lance);
	}
}
