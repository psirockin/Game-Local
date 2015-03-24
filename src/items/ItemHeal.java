package items;
public class ItemHeal extends Item {
	private int amount; //Here's the issue: Who owns this? How do I make it recover?
	/** default healing item gives 10HP */
	public ItemHeal(String n, int u) { 
		super(n, u);
		amount = 10;
	}
	public ItemHeal(String n, int u, int a){
		super(n, u);
		amount = a;
	}
	public void effect() {
		
	}
	public int getHeal(){
		return amount;
	}
}
