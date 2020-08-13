package com.gildedrose;

public class BackstagePassItem extends Item {


	public BackstagePassItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public String toString() {
		return this.name + ", " + this.sellIn + ", " + this.quality;
	}

	@Override
	public void upgrade() {
		sellIn = sellIn - 1;

		increaseQuality();

		if (sellIn < 10) {
			increaseQuality();
		}
		if (sellIn < 5) {
			increaseQuality();
		}

		if (sellIn < 0) {
			quality = 0;
		}

	}
}