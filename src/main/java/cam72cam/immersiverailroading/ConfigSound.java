package cam72cam.immersiverailroading;

import net.minecraftforge.common.config.Config.Comment;

@net.minecraftforge.common.config.Config(modid = ImmersiveRailroading.MODID, name = ImmersiveRailroading.MODID + "_sounds")
public class ConfigSound {
	@Comment("Enable Sounds")
	public static boolean soundEnabled = true;

	@Comment("Enable Pressure Valve Sound")
	public static boolean soundPressureValve = true;

	@Comment("Sound Distance Multiplier")
	public static double soundDistanceScale = 1;

	@Comment("Re-configure the sound system to use more audo channels (fixes audio cutting out at high speed)")
	public static boolean overrideSoundChannels = true;

}
