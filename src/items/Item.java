package items;
public class Item {
	private String name;
	private int uses;
	
	public Item(String n, int u){
		name = n; uses = u;
	}
	
	public String getName(){
		return name;
	}
	
	public int getUse(){
		return uses;
	}
	
	public String toString(){
		return name+" has "+uses+" uses.";
	}	
}
