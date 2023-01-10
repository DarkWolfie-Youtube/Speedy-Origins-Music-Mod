
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.speedyoriginsaddons.init;

import org.lwjgl.glfw.GLFW;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.KeyMapping;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

import com.mojang.blaze3d.platform.InputConstants;

import com.darksmp.speedyoriginsaddons.network.PlayMusicMessage;
import com.darksmp.speedyoriginsaddons.SpeedyoriginsaddonsMod;

public class SpeedyoriginsaddonsModKeyMappings {
	public static class SpeedyoriginsaddonsModKeyMapping extends KeyMapping {
		private boolean isDownOld;

		public SpeedyoriginsaddonsModKeyMapping(String string, int i, String string2) {
			super(string, InputConstants.Type.KEYSYM, i, string2);
		}

		public int action() {
			if (isDownOld != isDown() && isDown()) {
				isDownOld = isDown();
				return 1;
			} else if (isDownOld != isDown() && !isDown()) {
				isDownOld = isDown();
				return 2;
			}
			isDownOld = isDown();
			return 0;
		}
	}

	public static SpeedyoriginsaddonsModKeyMapping PLAY_MUSIC = new SpeedyoriginsaddonsModKeyMapping("key.speedyoriginsaddons.play_music",
			GLFW.GLFW_KEY_F10, "key.categories.misc");

	public static void serverLoad() {
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(SpeedyoriginsaddonsMod.MODID, "play_music"), PlayMusicMessage::apply);
	}

	public static void load() {
		ClientTickEvents.END_CLIENT_TICK.register((client) -> {
			int PLAY_MUSICaction = PLAY_MUSIC.action();
			if (PLAY_MUSICaction == 1) {
				ClientPlayNetworking.send(new ResourceLocation(SpeedyoriginsaddonsMod.MODID, "play_music"), new PlayMusicMessage(true, false));
			} else if (PLAY_MUSICaction == 2) {
				ClientPlayNetworking.send(new ResourceLocation(SpeedyoriginsaddonsMod.MODID, "play_music"), new PlayMusicMessage(false, true));
			}
		});
	}
}
