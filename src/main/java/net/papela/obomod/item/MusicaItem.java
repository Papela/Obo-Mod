
package net.papela.obomod.item;

import net.papela.obomod.init.ObomodModTabs;
import net.papela.obomod.init.ObomodModSounds;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicaItem extends RecordItem {
	public MusicaItem() {
		super(0, ObomodModSounds.REGISTRY.get(new ResourceLocation("obomod:musicaobo")),
				new Item.Properties().tab(ObomodModTabs.TAB_OBO).stacksTo(1).rarity(Rarity.RARE));
	}
}
