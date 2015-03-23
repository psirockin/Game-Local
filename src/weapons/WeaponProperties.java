package weapons;

public interface WeaponProperties {
	/** Get the starting durability */
	public int getDurabilityMax();
	/** Get the current durability */
	public int getDurabilityCur();
	/** Set the current durability. Return if still usable */
	public boolean setDurability(int d);
}
