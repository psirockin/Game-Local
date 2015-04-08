package weapons;
import weapons.Weapon;
public class WeaponAxe extends Weapon {
	/*I just realized that the names don't really have to be changed; this is because the string name is for the name
	of the weapon, rather than its type, and two weapons of the same type may have their own unique names and stats.
	In other words, only the weapon type will be excluded from the class parameters since that's the only one that matters.**/
	public WeaponAxe(String name, int dur, int rang,int hit, int crit, int damage) {
		super(name, dur, 1, hit, crit, damage, WeaponType_Axe);
		// TODO Auto-generated constructor stub
	}
	
}
