package fr.gabliltray.gltmod.init;

import fr.gabliltray.gltmod.Reference;
import fr.gabliltray.gltmod.blocks.GreenScreenBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MODID)
public class BlocksInit {

	public static Block 
	greenscreen_block;
	
	
	public static void init() {
		greenscreen_block = new GreenScreenBlock("greenscreen_block", Material.ROCK);
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> e) {
		e.getRegistry().registerAll(greenscreen_block);
	}
	
	@SubscribeEvent
	public static void regsiterItemBlock(RegistryEvent.Register<Item> e) {
		e.getRegistry().registerAll(
				new ItemBlock(greenscreen_block).setRegistryName(greenscreen_block.getRegistryName())
				);
	}

	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent e) {
		registerRender(Item.getItemFromBlock(greenscreen_block));
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
