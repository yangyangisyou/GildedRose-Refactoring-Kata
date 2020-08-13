package com.gildedrose;

public class SulfurasItem extends Item {

	public SulfurasItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public String toString() {
		return this.name + ", " + this.sellIn + ", " + this.quality;
	}

	@Override
	public void upgrade() {
	}
}