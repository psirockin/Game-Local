package items;
/**Old method commented out because there are all nonweapon objects can be used either way*/
public class ItemHeal extends NonWeapon {
	private int amount; //Here's the issue: Who owns this? How do I make it recover?
	/** default healing item gives 10HP */
	public ItemHeal(String nam) {
		super(nam, 3);
//		super(nam, ItemType_Heal, 3); 
		amount = 10;
	}
	public ItemHeal(String nam,int use, int amnt){ //For special healing items
		super(nam, use);
//		super(nam, ItemType_Heal, use);
		amount = amnt;
	}
	public void effect() {
		
	}
	public int getHeal(){
		return amount;
	}
}
