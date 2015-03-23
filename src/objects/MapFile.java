package objects;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;
public class MapFile {
	public static final String Map_Default_Loc = "res/map_layout.mapl";
	private FileReader fr = null;
	private char[][] charArrCell = null;
	private char[][] charArrUnit = null;
	private File file = null;
	/** Make a new MapFile to read the game map, and the map only! No settings or stats! */
	public MapFile() {
		try {
			file = new File(Map_Default_Loc);
			initFileData();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/** New MapFile from the specified ".mapl" file */
	public MapFile(String fPath) {
		try {
			file = new File(fPath);
			initFileData();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/** inits the charArrCell with the map values. Basically, it's 
	 * the rest of the constructor. MAY THROW AN IOException */
	private void initFileData() throws IOException {
		FileReader fr = new FileReader(file);
		char[] chars = new char [(int)file.length()];
		fr.read(chars);
		String fileText = String.valueOf(chars);
		Stack<String> rowStackCell = new Stack<String>();
		String sto = "";
		int start = fileText.indexOf('{');
		int width = fileText.indexOf('}', start) - 2;
		int end = 0, height = 0;
		// find Cells
		for(int ch = start; ch < fileText.indexOf(']', start); ch++) {
			if(fileText.charAt(ch) == '}') {
				rowStackCell.add(sto);
				sto = "";
				continue;
			}
			if(fileText.charAt(ch) == ',' || fileText.charAt(ch) == '{') {
				continue;
			}
			sto = new String(sto + fileText.charAt(ch)).trim();
			end = ch;
		}
		charArrCell = get2DCharArray(rowStackCell);
		MapFile.printStringStack(rowStackCell);
		System.out.println("------------------------------------------");
		
		// find units
		start = end;
		start = fileText.indexOf('{', start);
		Stack<String> rowStackUnit = new Stack<String>();
		sto = "";
		for(int ch = start; ch < fileText.indexOf(']', start); ch++) {
			if(fileText.charAt(ch) == '}') {
				rowStackUnit.add(sto);
				sto = "";
				continue;
			}
			if(fileText.charAt(ch) == ',' || fileText.charAt(ch) == '{') {
				continue;
			}
			sto = new String(sto + fileText.charAt(ch)).trim();
			end = ch;
		}
		charArrUnit = get2DCharArray(rowStackUnit);
		MapFile.printStringStack(rowStackUnit);
		System.out.println("------------------------------------------");
	}
	/** Convert String Stack to 2D char array */
	private char[][] get2DCharArray(Stack<String> stack) {
		char[][] ret = new char [stack.size()][stack.get(0).length()];
		for(int i = 0; i < ret.length; i++)
			for(int ch = 0; ch < ret[i].length; ch++)
				ret[i][ch] = stack.get(i).charAt(ch);
		return ret;
	}
	/** Returns the charmap array ({cells, units}) */
	public char[][][] getCharMap() {
		char[][][] ret = {charArrCell, charArrUnit};
		return ret;
	}
	/** Prints all elements of a String Stack */
	public static void printStringStack(Stack<String> stack) {
		for(int i = 0; i < stack.size(); i++)
			System.out.println(stack.get(i));
	}
}
