
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.papela.obomod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ObomodModTabs {
	public static CreativeModeTab TAB_OBO;

	public static void load() {
		TAB_OBO = new CreativeModeTab("tabobo") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ObomodModItems.OBO_COIN.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
