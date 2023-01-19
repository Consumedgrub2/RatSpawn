
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mbp.ratspawn.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class RatspawnModTabs {
	public static CreativeModeTab TAB_RAT_SPAWN_TAB;

	public static void load() {
		TAB_RAT_SPAWN_TAB = new CreativeModeTab("tabrat_spawn_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.GRASS_BLOCK);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
