package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
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
        
        if (item.name.equals("Aged Brie")) {
			if (item.quality < 50) {
				item.quality = item.quality + 1;
			}
		} else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (items[i].quality < 50) {
                items[i].quality = items[i].quality + 1;
            }
        }
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            if (item.name.equals("Aged Brie")) {
                item.quality = item.quality - item.quality;
            } else {
                if (item.quality > 0) {
                    item.quality = item.quality - 1;
                }
            }
        }
        // for (int i = 0; i < items.length; i++) {
        //     if (!items[i].name.equals("Aged Brie")
        //             && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
        //         if (items[i].quality > 0) {
        //             if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
        //                 items[i].quality = items[i].quality - 1;
        //             }
        //         }
        //     } else {
        //         if (items[i].quality < 50) {
        //             items[i].quality = items[i].quality + 1;

        //             if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
        //                 if (items[i].sellIn < 11) {
        //                     if (items[i].quality < 50) {
        //                         items[i].quality = items[i].quality + 1;
        //                     }
        //                 }

        //                 if (items[i].sellIn < 6) {
        //                     if (items[i].quality < 50) {
        //                         items[i].quality = items[i].quality + 1;
        //                     }
        //                 }
        //             }
        //         }
        //     }

        //     if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
        //         items[i].sellIn = items[i].sellIn - 1;
        //     }

        //     if (items[i].sellIn < 0) {
        //         if (!items[i].name.equals("Aged Brie")) {
        //             if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
        //                 if (items[i].quality > 0) {
        //                     if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
        //                         items[i].quality = items[i].quality - 1;
        //                     }
        //                 }
        //             } else {
        //                 items[i].quality = items[i].quality - items[i].quality;
        //             }
        //         } else {
        //             if (items[i].quality < 50) {
        //                 items[i].quality = items[i].quality + 1;
        //             }
        //         }
        //     }
        // }
    }
}