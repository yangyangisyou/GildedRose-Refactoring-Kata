package com.gildedrose;

public class OtherItem extends Item {

	public OtherItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public String toString() {
		return this.name + ", " + this.sellIn + ", " + this.quality;
	}

	@Override
	public void upgrade() {
		sellIn = sellIn - 1;
		decreaseQuality();

		if (sellIn < 0) {
			decreaseQuality();
		}

	}
}