package items;
import objects.Sprite;
import org.newdawn.slick.Image;
/** Top class */
public class Item {
	public static final String ItemType_Weapon = "Weapon";
	public static final String ItemType_NonWeapon = "Nonweapon";
	// tyoes of items based on actions
	public static final String ItemType_Heal = "Heal";
	private String type = "NULL";
	private int durCur;
	private int durMax;
	private Sprite spr;
	private boolean isHeal() {
		return type == ItemType_Heal;
	}
	public boolean isWeapon() {
		return type == ItemType_Weapon;
	}
	public Item(String t, int d){
		type= t;
		durMax = d;
		durCur = 0;
	}
	public boolean useItem() {
		durCur = (hasUse()) ? durCur-1 : 0;
		return hasUse();
	}
	public boolean hasUse() {
		return durCur < durMax;
	}
	public String getType(){
		return type;
	}
	
	public int getUse(){
		return durCur;
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
