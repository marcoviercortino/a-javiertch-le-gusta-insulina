
package net.mcreator.marcoviertch.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.marcoviertch.item.ItemLingotedecobre;
import net.mcreator.marcoviertch.block.BlockMenadecobre;
import net.mcreator.marcoviertch.ElementsMarcoviertch;

@ElementsMarcoviertch.ModElement.Tag
public class RecipeFundirmenadecobre extends ElementsMarcoviertch.ModElement {
	public RecipeFundirmenadecobre(ElementsMarcoviertch instance) {
		super(instance, 18);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockMenadecobre.block, (int) (1)), new ItemStack(ItemLingotedecobre.block, (int) (0)), 0F);
	}
}
