import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import objects.Map;
// Shared with David: nexon226@gmail.com
public class FireEmblem extends BasicGame {
	/** width, height */
	private int [] boardDims = {10,20};
	Map map = null;
	private void runGame() {
		
	}
	public FireEmblem(String title) {
		super(title);
	}
	@Override
	public void init(GameContainer gc) throws SlickException {
		map = new Map();
	}

	@Override
	public void update(GameContainer gc, int i) throws SlickException {
		
	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException
	{
		// draw stuff from map variable
		g.drawString("FIRE EMBLEM 2.0", 600, 10);
		for(int r = 0; r < map.cellArr.length; r++) {
			for(int c = 0; c < map.cellArr[0].length; c++) {
				// TODO make the Cell.getImage method return the image for drawing
				//g.drawImage(map.cellArr[0][0].get, x, y);
			}
		}
				
	}
	public static void main(String[] args) {
		//new FireEmblem().runGame();
		try {
			AppGameContainer appgc;
			appgc = new AppGameContainer(new FireEmblem("Fire Emblem 2.0"));
			appgc.setDisplayMode(1280, 720, false);
			appgc.start();
		} catch(SlickException ex) {
			Logger.getLogger(FireEmblem.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
