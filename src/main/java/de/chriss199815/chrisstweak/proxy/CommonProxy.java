package de.chriss199815.chrisstweak.proxy;

import net.minecraft.item.Item;
import net.minecraft.util.text.translation.I18n;

public class CommonProxy {

    public void registerItemRenderer(Item item, int meta, String id) {

    }

    public String localize(String unlocalized, Object... args) {
        return I18n.translateToLocalFormatted(unlocalized, args);
        //TODO Move to LanguageMap IF Possible

    }

    public void registerRenderers() {
    }

}
