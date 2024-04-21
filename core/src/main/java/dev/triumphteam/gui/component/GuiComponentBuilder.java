package dev.triumphteam.gui.component;

import org.jetbrains.annotations.NotNull;

@FunctionalInterface
public interface GuiComponentBuilder<P, I> {

    void accept(final @NotNull FunctionalGuiComponent<@NotNull P, @NotNull I> component);
}
