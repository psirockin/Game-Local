import java.util.List;

/**
 * ADD
 * THIS
 * CODE
 * TO 
 * OUR
 * UNIT
 * CLASS!
 */
public abstract class Character {

	private String name;
	private int health;
	private int maxHP;
	private List<Item> items;
	private int attack;
	private int magic;
	private int skill;
	private int defense;
	private int resist;
	protected int movement;
	
	public Unit(String newName, int startingLevel, int defaultHP, int StartingEXP, List<Item> startingItems, int a, int m, int sk, int s, int l, int d,  int r){
		name = newName; health = defaultHP; items = startingItems; level = startingLevel; exp = StartingEXP; 
		attack = a; defense = d; magic = m; resist = r; skill = sk; speed = s; luck = l; movement = 5;
		maxHP = defaultHP; 
	}
	
	@Override
	public String myName() {
		return name;
	}

	@Override
	public int myHealth() {
		return health;
	}

	@Override
	public int myLevel() {
		return level;
	}

	@Override
	public int myExp() {
		return exp;
	}

	@Override
	public int myAttack() {
		return attack;
	}

	@Override
	public int myDefense() {
		return defense;
	}

	@Override
	public int myMagic() {
		return magic;
	}

	@Override
	public int myResist() {
		return resist;
	}

	@Override
	public int mySpeed() {
		return speed;
	}

	@Override
	public int myLuck() {
		return luck;
	}
	
	@Override
	public int mySkill(){
		return skill;
	}
	
	public int myMove(){
		return movement;
	}
	
	public String toString(){
		return "My name is "+name+", I have "+health+"HP, I am level "+level+", I currently have "+exp+" EXP, \n "
				+ "my attack is "+attack+", my magic is "+magic+
				", \n my skill is "+skill+", my speed is "+speed+
				", \n my luck is "+luck+", my defense is "+defense+
				", \n my resistance is "+resist+", and my movement is "+movement;
	}
	
	
	public abstract boolean attack();
}
