
package com.darksmp.speedyoriginsaddons.command;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.Commands;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandBuildContext;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.CommandDispatcher;

import com.darksmp.speedyoriginsaddons.procedures.MusiccommandwayProcedure;

public class MusiccommandCommand {
	public static void register(CommandDispatcher<CommandSourceStack> dispatcher, CommandBuildContext commandBuildContext) {
		dispatcher.register(Commands.literal("music")

				.then(Commands.argument("artist", StringArgumentType.word()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					Direction direction = entity.getDirection();

					MusiccommandwayProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x)
							.put("y", y).put("z", z).put("arguments", arguments).put("entity", entity).build());
					return 0;
				}).then(Commands.argument("song_name", StringArgumentType.string()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					Direction direction = entity.getDirection();

					MusiccommandwayProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x)
							.put("y", y).put("z", z).put("arguments", arguments).put("entity", entity).build());
					return 0;
				}))));
	}
}
