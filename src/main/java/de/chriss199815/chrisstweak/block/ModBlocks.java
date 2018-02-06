package de.chriss199815.chrisstweak.block;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {


    //Compressed Cobblestone
    public static BlockOre oreCobble1 = new BlockOre("ore_cobblestone1").setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockOre oreCobble2 = new BlockOre("ore_cobblestone2").setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockOre oreCobble3 = new BlockOre("ore_cobblestone3").setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockOre oreCobble4 = new BlockOre("ore_cobblestone4").setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockOre oreCobble5 = new BlockOre("ore_cobblestone5").setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockOre oreCobble6 = new BlockOre("ore_cobblestone6").setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockOre oreCobble7 = new BlockOre("ore_cobblestone7").setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockOre oreCobble8 = new BlockOre("ore_cobblestone8").setCreativeTab(CreativeTabs.MATERIALS);

    public static void register(IForgeRegistry<Block> registry){
            registry.registerAll(
                    oreCobble1,
                    oreCobble2,
                    oreCobble3,
                    oreCobble4,
                    oreCobble5,
                    oreCobble6,
                    oreCobble7,
                    oreCobble8
            );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry){
            registry.registerAll(
                    oreCobble1.createItemBlock(),
                    oreCobble2.createItemBlock(),
                    oreCobble3.createItemBlock(),
                    oreCobble4.createItemBlock(),
                    oreCobble5.createItemBlock(),
                    oreCobble6.createItemBlock(),
                    oreCobble7.createItemBlock(),
                    oreCobble8.createItemBlock()
            );
    }

    public static void registerModuels(){
        oreCobble1.registerItemModel(Item.getItemFromBlock(oreCobble1));
        oreCobble2.registerItemModel(Item.getItemFromBlock(oreCobble2));
        oreCobble3.registerItemModel(Item.getItemFromBlock(oreCobble3));
        oreCobble4.registerItemModel(Item.getItemFromBlock(oreCobble4));
        oreCobble5.registerItemModel(Item.getItemFromBlock(oreCobble5));
        oreCobble6.registerItemModel(Item.getItemFromBlock(oreCobble6));
        oreCobble7.registerItemModel(Item.getItemFromBlock(oreCobble7));
        oreCobble8.registerItemModel(Item.getItemFromBlock(oreCobble8));
    }
}
