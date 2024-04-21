package dev.triumphteam.gui.bukkit.builder;

import dev.triumphteam.gui.builder.BaseGuiBuilder;
import dev.triumphteam.gui.bukkit.Gui;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public final class GuiBuilder extends BaseGuiBuilder<GuiBuilder, Player, Gui, ItemStack> {

    @Override
    public Gui build() {
        return new Gui(componentRenderers);
    }
}
