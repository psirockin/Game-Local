package weapons;
/**Tomes are a bit special. You can use tomes at range 1 AND 2. */
public class WeaponTome extends Weapon {
	public WeaponTome(String name, int dur, int rang,int hit, int crit, int damage) {
		super(name, dur, rang, hit, crit, damage, WeaponType_Magic);
	}
}
