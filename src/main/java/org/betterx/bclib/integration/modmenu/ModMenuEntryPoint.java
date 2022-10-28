package org.betterx.bclib.integration.modmenu;

import java.util.function.Function;


/**
 * Internal class to hook into ModMenu, you should not need to use this class. If you want to register a
 * ModMenu Screen for a Mod using BCLib, use {@link ModMenu#addModMenuScreen(String, Function)}
 */
public class ModMenuEntryPoint {
}/*implements ModMenuApi {
    @Override
    public Map<String, ConfigScreenFactory<?>> getProvidedConfigScreenFactories() {
        Map<String, ConfigScreenFactory<?>> copy = new HashMap<>();
        for (var entry : ModMenu.screen.entrySet()) {
            copy.put(entry.getKey(), (parent) -> entry.getValue().apply(parent));
        }
        return copy;
    }

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        //return (parent) -> new TestScreen(parent, Component.literal("Hello Test"));
        return (parent) -> new MainScreen(parent);
    }


}*/
