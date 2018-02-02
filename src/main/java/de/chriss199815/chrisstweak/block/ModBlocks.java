package de.chriss199815.chrisstweak.block;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {


    //Compressed Cobblestone
    public static BlockBase compCobble = new BlockNorm("comp_cobblestone").setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockBase compCobble2 = new BlockNorm("comp_cobblestone2").setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockBase compCobble3 = new BlockNorm("comp_cobblestone3").setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockBase compCobble4 = new BlockNorm("comp_cobblestone4").setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockBase compCobble5 = new BlockNorm("comp_cobblestone5").setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockOre oreCopper = new BlockOre("ore_copper").setCreativeTab(CreativeTabs.MATERIALS);

    public static void register(IForgeRegistry<Block> registry){
            registry.registerAll(
                    compCobble,
                    compCobble2,
                    compCobble3,
                    compCobble4,
                    compCobble5,
                    oreCopper
            );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry){
            registry.registerAll(
                    compCobble.createItemBlock(),
                    compCobble2.createItemBlock(),
                    compCobble3.createItemBlock(),
                    compCobble4.createItemBlock(),
                    compCobble5.createItemBlock(),
                    oreCopper.createItemBlock()
            );
    }

    public static void registerModuels(){
            compCobble.registerItemModel(Item.getItemFromBlock(compCobble));
            compCobble2.registerItemModel(Item.getItemFromBlock(compCobble2));
            compCobble3.registerItemModel(Item.getItemFromBlock(compCobble3));
            compCobble4.registerItemModel(Item.getItemFromBlock(compCobble4));
            compCobble5.registerItemModel(Item.getItemFromBlock(compCobble5));
            oreCopper.registerItemModel(Item.getItemFromBlock(oreCopper));
    }
}
