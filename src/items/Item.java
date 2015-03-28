package items;
import objects.Sprite;
import org.newdawn.slick.Image;
/** Top class */
public class Item {
	public static final String ItemType_Weapon = "Weapon";
	public static final String ItemType_NonWeapon = "Nonweapon";
	// types of items based on actions
	public static final String ItemType_Heal = "Heal";
	private String type = "NULL";
	private String name;
	private int durCur;
	private int durMax;
	private Sprite spr;
	private boolean isHeal() {
		return type == ItemType_Heal;
	}
	public boolean isWeapon() {
		return type == ItemType_Weapon;
	}
	public Item(String n, String t, int d){
		name = n;
		type = t;
		durMax = d;
		durCur = d;
	}
	public boolean useItem() {
		durCur = (hasUse()) ? durCur-1 : 0;
		return hasUse();
	}
	public boolean hasUse() { //Item object has to be deleted if durCur reaches 0
		return durCur > 0;
	}
	
	public String getType(){
		return type;
	}
	
	public int getUse(){
		return durCur;
	}
	
	public String getName(){
		return name;
	}
	
	public String toString(){
		return type + " has " + durCur + " uses";
	}
	
	public Image getSpriteImage() {
		return spr.getImg();
	}
	public void setSpriteImage(String sType) {
		spr = new Sprite(sType);
	}
}
