
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.speedyoriginsaddons.init;

import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

import com.darksmp.speedyoriginsaddons.client.gui.MusicScreen;

public class SpeedyoriginsaddonsModScreens {
	public static void load() {
		ScreenRegistry.register(SpeedyoriginsaddonsModMenus.MUSIC, MusicScreen::new);
	}
}
