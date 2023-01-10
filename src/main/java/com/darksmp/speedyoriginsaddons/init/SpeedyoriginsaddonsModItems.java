
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.speedyoriginsaddons.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import com.darksmp.speedyoriginsaddons.item.Cg5vibrenteyesItem;
import com.darksmp.speedyoriginsaddons.SpeedyoriginsaddonsMod;

public class SpeedyoriginsaddonsModItems {
	public static Item CG_5VIBRENTEYES;

	public static void load() {
		CG_5VIBRENTEYES = Registry.register(Registry.ITEM, new ResourceLocation(SpeedyoriginsaddonsMod.MODID, "cg_5vibrenteyes"),
				new Cg5vibrenteyesItem());
	}
}
