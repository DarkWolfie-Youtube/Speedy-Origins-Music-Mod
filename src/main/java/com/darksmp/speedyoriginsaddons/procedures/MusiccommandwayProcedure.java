package com.darksmp.speedyoriginsaddons.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.Map;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

import com.darksmp.speedyoriginsaddons.init.SpeedyoriginsaddonsModSounds;
import com.darksmp.speedyoriginsaddons.SpeedyoriginsaddonsMod;

public class MusiccommandwayProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SpeedyoriginsaddonsMod.LOGGER.warn("Failed to load dependency world for procedure Musiccommandway!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SpeedyoriginsaddonsMod.LOGGER.warn("Failed to load dependency x for procedure Musiccommandway!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SpeedyoriginsaddonsMod.LOGGER.warn("Failed to load dependency y for procedure Musiccommandway!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SpeedyoriginsaddonsMod.LOGGER.warn("Failed to load dependency z for procedure Musiccommandway!");
			return;
		}
		if (dependencies.get("arguments") == null) {
			if (!dependencies.containsKey("arguments"))
				SpeedyoriginsaddonsMod.LOGGER.warn("Failed to load dependency arguments for procedure Musiccommandway!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SpeedyoriginsaddonsMod.LOGGER.warn("Failed to load dependency entity for procedure Musiccommandway!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		CommandContext<CommandSourceStack> arguments = (CommandContext<CommandSourceStack>) dependencies.get("arguments");
		Entity entity = (Entity) dependencies.get("entity");
		if ((StringArgumentType.getString(arguments, "artist")).equals("CG5")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("PASS"), (false));
			if ((StringArgumentType.getString(arguments, "song_name")).equals("Vibrent Eyes")) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("PASS"), (false));
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("[Speedy Origins Music Mod] Now Playing: CG5 - Vibrent Eyes"), (false));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
							_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "stopsound @s");
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), SpeedyoriginsaddonsModSounds.CG5_EYES, SoundSource.MASTER, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, SpeedyoriginsaddonsModSounds.CG5_EYES, SoundSource.MASTER, 1, 1, false);
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("FAIL"), (false));
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("FAIL"), (false));
		}
	}
}
