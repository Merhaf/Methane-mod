package com.modrinth.methane;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "methane")
public class MethaneSettings implements ConfigData {
    //TODO: we should transition to translatable comments (@Comment(Text.translatable("YOUR.THING.HERE")))

    @Comment("Methane's initial state. (You should set this to 'Yes' if you use sodium.)")
    public boolean modstate = true;
    @Comment("Toggle whether to keep fog settings even with Methane disabled.")
    public boolean persistFogSettings = false;
    public boolean disableAirFog = false; // the fog pass that obscures terrain
    public boolean disableWaterFog = false; // the fog layer that tints everything blue
    public boolean disableLavaFog = false; // the thing that tints everything orange
    public boolean disablePowderedSnowFog = false; // pretty self-explanatory
    @Comment("(you should probably disable this)")
    public boolean disableThickFog = false; // Nether Fog pass
    @Comment("The fog that covers terrain in")
    public boolean disableSkyFog = false; // I think this is another fog pass

    @Comment("Whether or not we calculate rainfall in biomes (breaks a lot of rain effects, but has performance benefits)")
    public boolean destructiveweatheroptimizations = false;


    @ConfigEntry.Gui.CollapsibleObject
    public static DestructiveSettings destructiveSettings = new DestructiveSettings();


    //@Comment("The default world brightness value (15 default and effective max)")
    //public double brightness = 1000; // unused for now because of a ton of issues

    public static class DestructiveSettings{

        @Comment("Deletes the sky (NOT the same as sky fog), and gives a small performance boost. Will also remove the sun + moon")
        public boolean DestroySky;

        @Comment("Forcefully deletes weather.")
        public boolean DestroyWeather;

        @Comment("skip string rendering")
        public boolean RenderLayerSkips;

    }

    @Comment("Render the status messages on the HUD instead of chat?")
    public boolean hudrender = true;
}
