
package com.darksmp.speedyoriginsaddons.network;

import net.minecraft.world.level.Level;
import net.minecraft.server.network.ServerGamePacketListenerImpl;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.FriendlyByteBuf;

import net.fabricmc.fabric.api.networking.v1.PacketSender;

import java.util.HashMap;

import io.netty.buffer.Unpooled;

import com.darksmp.speedyoriginsaddons.world.inventory.MusicMenu;
import com.darksmp.speedyoriginsaddons.procedures.Playcg5eyesProcedure;

public class MusicButtonMessage extends FriendlyByteBuf {
	public MusicButtonMessage(int buttonID, int x, int y, int z) {
		super(Unpooled.buffer());
		writeInt(buttonID);
		writeInt(x);
		writeInt(y);
		writeInt(z);
	}

	public static void apply(MinecraftServer server, ServerPlayer entity, ServerGamePacketListenerImpl handler, FriendlyByteBuf buf,
			PacketSender responseSender) {
		int buttonID = buf.readInt();
		double x = buf.readInt();
		double y = buf.readInt();
		double z = buf.readInt();
		server.execute(() -> {
			Level world = entity.getLevel();
			HashMap guistate = MusicMenu.guistate;
			if (buttonID == 0) {

				Playcg5eyesProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x)
						.put("y", y).put("z", z).put("entity", entity).build());
			}
		});
	}
}
