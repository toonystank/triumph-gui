package dev.triumphteam.gui.builder;

import dev.triumphteam.gui.BaseGui;
import dev.triumphteam.gui.component.GuiComponent;
import dev.triumphteam.gui.component.GuiComponentBuilder;
import dev.triumphteam.gui.component.SimpleFunctionalGuiComponent;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "UnusedReturnValue"})
public abstract class BaseGuiBuilder<B extends BaseGuiBuilder<B, P, G, I>, P, G extends BaseGui<P>, I> {

    protected final List<SimpleFunctionalGuiComponent<P, I>> componentRenderers = new ArrayList<>();

    @Contract("_ -> this")
    public @NotNull B component(final @NotNull GuiComponentBuilder<P, I> builder) {
        final var componentRenderer = new SimpleFunctionalGuiComponent<P, I>();
        builder.accept(componentRenderer);
        componentRenderers.add(componentRenderer);
        return (B) this;
    }

    @Contract("_ -> this")
    public @NotNull B component(final @NotNull GuiComponent<P, I> component) {
        // TODO(matt): Yeah
        return (B) this;
    }

    public abstract G build();
}
