package items;

import objects.Sprite;

import org.newdawn.slick.Image;

/** Top class */
public class Item {
	private String name;
	private int durCur;
	private int durMax;
	private Sprite spr;
	public Item(String n, int d){
		name = n;
		durMax = d;
		durCur = 0;
	}
	public boolean hasUse() {
		return durCur < durMax;
	}
	public String getName(){
		return name;
	}
	
	public int getUse(){
		return durCur;
	}
	
	public String toString(){
		return name + " has " + durCur + " uses";
	}
	public Image getSpriteImage() {
		return spr.getImg();
	}
	public void setSpriteImage(String sType) {
		spr = new Sprite(sType);
	}
}
