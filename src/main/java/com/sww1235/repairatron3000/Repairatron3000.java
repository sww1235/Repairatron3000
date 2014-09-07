package com.sww1235.repairatron3000;

import com.sww1235.repairatron3000.configuration.ConfigurationHandler;
import com.sww1235.repairatron3000.reference.Reference;
import com.sww1235.repairatron3000.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class Repairatron3000 {

    @Mod.Instance(Reference.MOD_ID)
    public static Repairatron3000 instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {


    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {


    }
}
