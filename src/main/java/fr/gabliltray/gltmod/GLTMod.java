package fr.gabliltray.gltmod;

import fr.gabliltray.gltmod.init.BlocksInit;
import fr.gabliltray.gltmod.proxy.ServerProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, version = Reference.MODVER, acceptedMinecraftVersions = Reference.MCVER, name = Reference.MODNAME)
public class GLTMod {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static ServerProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		BlocksInit.init();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent e) {
		proxy.register();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		
	}

}
