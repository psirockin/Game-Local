package objects;
import org.newdawn.slick.Image;
import units.Unit;
/** A single "square" on the map.
 * This can be a Unit, Door, Space */
public class Cell implements SpriteProperties {
	private Sprite cellImage;
	private boolean active = false;
	private boolean activatable = false;
	private boolean passable = false;
	private Unit occupant = null;
	public Cell(String type, Unit u) {
		occupant = u;
	}
	public boolean isPassable() {
		return passable;
	}
	public boolean isActivatable() {
		return activatable;
	}
	public boolean isActive() {
		return active;
	}
	@Override
	public Image getSpriteImage() {
		// TODO Auto-generated method stub
		return cellImage.getImg();
	}
	@Override
	public void setSpriteImage(String sType) {
		cellImage = new Sprite(sType);
	}
}
