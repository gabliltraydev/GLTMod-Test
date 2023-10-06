package fr.gabliltray.gltmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GreenScreenBlock extends Block{

	public GreenScreenBlock(String name, Material materialIn) {
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
	}

}
