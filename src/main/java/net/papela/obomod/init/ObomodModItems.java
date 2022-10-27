
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.papela.obomod.init;

import net.papela.obomod.item.OboCoinItem;
import net.papela.obomod.item.OboBilleteItem;
import net.papela.obomod.item.MusicaItem;
import net.papela.obomod.ObomodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

public class ObomodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ObomodMod.MODID);
	public static final RegistryObject<Item> OBO_COIN = REGISTRY.register("obo_coin", () -> new OboCoinItem());
	public static final RegistryObject<Item> OBO_ORE = block(ObomodModBlocks.OBO_ORE, ObomodModTabs.TAB_OBO);
	public static final RegistryObject<Item> OBO_BILLETE = REGISTRY.register("obo_billete", () -> new OboBilleteItem());
	public static final RegistryObject<Item> MUSICA = REGISTRY.register("musica", () -> new MusicaItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
