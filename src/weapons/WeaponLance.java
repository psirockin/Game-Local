package weapons;
public class WeaponLance extends Weapon {
	public WeaponLance(String name, int dur, int rang,int hit, int crit, int damage) {
		super(name, dur, 1, hit, crit, damage, WeaponType_Lance);
	}
	public WeaponLance(){
		super("Maltet",20,1,80,0,16,WeaponType_Lance);
	}
}
