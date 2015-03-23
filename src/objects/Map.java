package objects;
import units.Unit;
public class Map {
	public Unit [][] cellArr = null;
	/** Map from width, height */
	public Map() {
		cellArr = generateMap(new MapFile(MapFile.Map_Default_Loc).getCharMap()[1]);
	}
	/** Generates a map size Cell array */
	private Unit[][] generateMap(char[][] mapChars) {
		Unit[][] ret = null;
		
		return ret;
	}
}
