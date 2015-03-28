package items;
public class ItemHeal extends NonWeapon {
	private int amount; //Here's the issue: Who owns this? How do I make it recover?
	/** default healing item gives 10HP */
	public ItemHeal(String n, String t) { 
		super(n, ItemType_Heal, 3);
		amount = 10;
	}
	public ItemHeal(String n, String t, int u, int a){ //For special healing items
		super(n, ItemType_Heal, u);
		amount = a;
	}
	public void effect() {
		
	}
	public int getHeal(){
		return amount;
	}
}
