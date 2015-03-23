package objects;
import org.newdawn.slick.Image;
public interface SpriteProperties {
	/** retruns the image of the sprite */
	public Image getSpriteImage();
	/** reassign the Sprite to a new one, specified by sType */
	public void setSpriteImage(String sType);
}
