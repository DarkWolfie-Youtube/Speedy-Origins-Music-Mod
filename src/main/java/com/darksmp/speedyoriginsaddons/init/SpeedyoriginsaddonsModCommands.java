
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.speedyoriginsaddons.init;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

import com.darksmp.speedyoriginsaddons.command.MusiccommandCommand;

public class SpeedyoriginsaddonsModCommands {
	public static void load() {
		CommandRegistrationCallback.EVENT.register((dispatcher, commandBuildContext, dedicated) -> {
			MusiccommandCommand.register(dispatcher, commandBuildContext);
		});
	}
}
