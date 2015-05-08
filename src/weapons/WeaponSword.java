package weapons;
public class WeaponSword extends Weapon {
	public WeaponSword(String name, int dur, int rang,int hit, int crit, int damage) {
		super(name, dur, 1, hit, crit, damage, WeaponType_Sword);
	}
	public WeaponSword(){
		super("Durandal",20,1,90,0,17,WeaponType_Sword);
	}
}
