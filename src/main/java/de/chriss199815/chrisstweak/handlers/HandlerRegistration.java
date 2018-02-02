package de.chriss199815.chrisstweak.handlers;


import de.chriss199815.chrisstweak.block.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class HandlerRegistration {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        ModBlocks.registerItemBlocks(event.getRegistry());
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        ModBlocks.registerModuels();
    }

    @SubscribeEvent
    public static void registerBlocks (RegistryEvent.Register<Block> event){
        ModBlocks.register(event.getRegistry());
    }
}
