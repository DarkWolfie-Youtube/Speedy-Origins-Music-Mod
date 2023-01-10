
package com.darksmp.speedyoriginsaddons.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import com.darksmp.speedyoriginsaddons.init.SpeedyoriginsaddonsModSounds;

public class Cg5vibrenteyesItem extends RecordItem {
	public Cg5vibrenteyesItem() {
		super(7, SpeedyoriginsaddonsModSounds.CG5_EYES, new Item.Properties().tab(null).stacksTo(1).rarity(Rarity.RARE), 3000);
	}
}
