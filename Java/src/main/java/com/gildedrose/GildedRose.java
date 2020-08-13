package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    private void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    private void decreaseQuality(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    public void updateQuality() {
        for (Item item : items) {
            updateItem(item);
        }
    }

    public void updateItem(Item item) {
        if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
			return;
        }
        item.sellIn = item.sellIn - 1;

        if (item.name.equals("Aged Brie")) {
            increaseQuality(item);
            if (item.sellIn < 0) {
                increaseQuality(item);
            } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")){
                increaseQuality(item);
                if (item.quality < 10) {
                    increaseQuality(item);
                }
                if (item.quality < 5) {
                    increaseQuality(item);
                }
                if (item.quality < 0) {
                    item.quality = item.quality - item.quality;
                }
            }
            else {
                decreaseQuality(item);
                if (item.sellIn < 0) {
                    decreaseQuality(item);
                }
            }
		} 
    }
}