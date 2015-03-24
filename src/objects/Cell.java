package objects;
import org.newdawn.slick.Image;
import units.Unit;
/** A single "square" on the map.
 * This can be a Unit, Door, Space */
public abstract class Cell {
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
	public Image getSpriteImage() {
		// TODO Auto-generated method stub
		return cellImage.getImg();
	}
	public void setSpriteImage(String sType) {
		cellImage = new Sprite(sType);
	}
}
