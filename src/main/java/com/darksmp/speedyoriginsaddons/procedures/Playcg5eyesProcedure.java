package com.darksmp.speedyoriginsaddons.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

import java.util.Map;

import com.darksmp.speedyoriginsaddons.init.SpeedyoriginsaddonsModSounds;
import com.darksmp.speedyoriginsaddons.SpeedyoriginsaddonsMod;

public class Playcg5eyesProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SpeedyoriginsaddonsMod.LOGGER.warn("Failed to load dependency world for procedure Playcg5eyes!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SpeedyoriginsaddonsMod.LOGGER.warn("Failed to load dependency x for procedure Playcg5eyes!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SpeedyoriginsaddonsMod.LOGGER.warn("Failed to load dependency y for procedure Playcg5eyes!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SpeedyoriginsaddonsMod.LOGGER.warn("Failed to load dependency z for procedure Playcg5eyes!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SpeedyoriginsaddonsMod.LOGGER.warn("Failed to load dependency entity for procedure Playcg5eyes!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal("Now Playing: CG5 - Vibrent Eyes"), (false));
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), SpeedyoriginsaddonsModSounds.CG5_EYES, SoundSource.MASTER, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, SpeedyoriginsaddonsModSounds.CG5_EYES, SoundSource.MASTER, 1, 1, false);
			}
		}
		new Object() {
			private int ticks = 0;

			public void startDelay(LevelAccessor world) {
				ServerTickEvents.END_SERVER_TICK.register((server) -> {
					this.ticks++;
					if (this.ticks == 3000) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Song Stopped Playing..."), (false));
						return;
					}
				});
			}
		}.startDelay(world);
	}
}
