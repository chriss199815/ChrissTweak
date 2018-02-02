package de.chriss199815.chrisstweak;

import de.chriss199815.chrisstweak.proxy.CommonProxy;
import de.chriss199815.chrisstweak.reference.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MODID, version = Reference.MODVERSION, name = Reference.MODNAME)
public class ChrissTweak {

    @Mod.Instance(Reference.MODID)
    public static ChrissTweak instance;

    @SidedProxy(serverSide = Reference.MODCOMMONPROXY, clientSide = Reference.MODCLIENTPROXY)
    public static CommonProxy proxy;

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();

        proxy.registerRenderers();


    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }
}
