package units;
import items.Item;
import items.ItemHeal;
public class CharTester {
	public static void main(String[] args) {
		Unit c = new UnitMyrmidon("Edward", 4, 19, 0, null, 7, 0, 11, 12, 8, 5, 0);
		Unit d = new UnitCavalier("Kieran", 12, 30, 0, null, 11, 1, 10, 12, 8, 10, 1);
		System.out.println(c.toString());
		System.out.println("-------------");
		System.out.println(d.toString());
		Item a = new ItemHeal("Fire",40,2,3);
		Item b = new Sword("Mystletainn",20,1,18);
		System.out.println(a.toString()+" "+a.toString2());
		System.out.println(b.toString()+" "+b.toString2());
	}
}
