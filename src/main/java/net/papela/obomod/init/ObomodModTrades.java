
/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package net.papela.obomod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ObomodModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(ObomodModItems.OBO_BILLETE.get()),

				new ItemStack(ObomodModItems.MUSICA.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(ObomodModItems.OBO_COIN.get(), 3),

				new ItemStack(ObomodModBlocks.OBO_ORE.get()), 10, 5, 0.05f));
	}

	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.CLERIC) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.GOLD_INGOT, 4),

					new ItemStack(ObomodModItems.OBO_COIN.get()), 15, 4, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(ObomodModItems.OBO_COIN.get(), 5),

					new ItemStack(ObomodModItems.OBO_BILLETE.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.GOLD_INGOT, 20),

					new ItemStack(ObomodModItems.OBO_BILLETE.get()), 10, 5, 0.05f));
		}
	}
}
