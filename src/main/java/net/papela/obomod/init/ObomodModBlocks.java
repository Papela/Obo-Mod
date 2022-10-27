
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.papela.obomod.init;

import net.papela.obomod.block.OboOreBlock;
import net.papela.obomod.ObomodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class ObomodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ObomodMod.MODID);
	public static final RegistryObject<Block> OBO_ORE = REGISTRY.register("obo_ore", () -> new OboOreBlock());
}
