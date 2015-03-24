package objects;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
public class Sprite {
	// Sprite types
	public static final String SpriteType_Char_Lord = "Lord";
	public static final String SpriteType_Char_Mage = "Mage";
	// Sprite paths
	public static final String SpritePath_Char_Lord = "spr_char_LORD.png";
	public static final String SpritePath_Char_Mage = "spr_char_MAGE.png";
	public static final String SpritePath_Weapon_Sword = "spr_weapon_SWORD.png";
	private Image img = null;
	private String spriteType = "NULL_TYPE";
	public Sprite(String type) {
		String imgPath = "null_img.png";
		spriteType = type;
		if(type == SpriteType_Char_Lord)
			imgPath = SpritePath_Char_Lord;
		try {
			img = new Image(imgPath);
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
	public Image getImg() {
		return img.getScaledCopy(1);
	}
	public String getType() {
		return spriteType;
	}
	/** retruns the image of the sprite */
	public Image getSpriteImage() {
		return null;
	}
	/** reassign the Sprite to a new one, specified by sType */
	public void setSpriteImage(String sType) {
	}
}
