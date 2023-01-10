package com.darksmp.speedyoriginsaddons.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;

import java.util.Map;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

import com.darksmp.speedyoriginsaddons.SpeedyoriginsaddonsMod;

public class ErrorforcommandProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("arguments") == null) {
			if (!dependencies.containsKey("arguments"))
				SpeedyoriginsaddonsMod.LOGGER.warn("Failed to load dependency arguments for procedure Errorforcommand!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SpeedyoriginsaddonsMod.LOGGER.warn("Failed to load dependency entity for procedure Errorforcommand!");
			return;
		}
		CommandContext<CommandSourceStack> arguments = (CommandContext<CommandSourceStack>) dependencies.get("arguments");
		Entity entity = (Entity) dependencies.get("entity");
		if ((StringArgumentType.getString(arguments, "artist")).equals("null")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("FAIL"), (false));
		}
		if ((StringArgumentType.getString(arguments, "song_name")).equals("null")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("FAIL"), (false));
		}
	}
}
