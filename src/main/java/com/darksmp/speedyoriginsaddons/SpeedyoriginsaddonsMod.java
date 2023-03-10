/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package com.darksmp.speedyoriginsaddons;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.fabricmc.api.ModInitializer;

import com.darksmp.speedyoriginsaddons.init.SpeedyoriginsaddonsModSounds;
import com.darksmp.speedyoriginsaddons.init.SpeedyoriginsaddonsModProcedures;
import com.darksmp.speedyoriginsaddons.init.SpeedyoriginsaddonsModMenus;
import com.darksmp.speedyoriginsaddons.init.SpeedyoriginsaddonsModKeyMappings;
import com.darksmp.speedyoriginsaddons.init.SpeedyoriginsaddonsModItems;
import com.darksmp.speedyoriginsaddons.init.SpeedyoriginsaddonsModCommands;

public class SpeedyoriginsaddonsMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "speedyoriginsaddons";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing SpeedyoriginsaddonsMod");

		SpeedyoriginsaddonsModItems.load();

		SpeedyoriginsaddonsModProcedures.load();
		SpeedyoriginsaddonsModCommands.load();

		SpeedyoriginsaddonsModMenus.load();
		SpeedyoriginsaddonsModKeyMappings.serverLoad();

		SpeedyoriginsaddonsModSounds.load();

	}
}
