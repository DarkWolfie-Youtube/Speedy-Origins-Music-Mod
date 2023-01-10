
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.speedyoriginsaddons.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class SpeedyoriginsaddonsModSounds {
	public static SoundEvent CG5_EYES = new SoundEvent(new ResourceLocation("speedyoriginsaddons", "cg5_eyes"));

	public static void load() {
		Registry.register(Registry.SOUND_EVENT, new ResourceLocation("speedyoriginsaddons", "cg5_eyes"), CG5_EYES);
	}
}
