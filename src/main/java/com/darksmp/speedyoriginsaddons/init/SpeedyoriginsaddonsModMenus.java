
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.speedyoriginsaddons.init;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;

import com.darksmp.speedyoriginsaddons.world.inventory.MusicMenu;
import com.darksmp.speedyoriginsaddons.client.gui.MusicScreen;
import com.darksmp.speedyoriginsaddons.SpeedyoriginsaddonsMod;

public class SpeedyoriginsaddonsModMenus {
	public static MenuType<MusicMenu> MUSIC;

	public static void load() {
		MUSIC = ScreenHandlerRegistry.registerExtended(new ResourceLocation(SpeedyoriginsaddonsMod.MODID, "music"), MusicMenu::new);
		MusicScreen.screenInit();
	}
}
