
package net.mcreator.marcoviertch.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.marcoviertch.procedure.ProcedureArmaduradediamantereforzadaHelmetTickEvent;
import net.mcreator.marcoviertch.ElementsMarcoviertch;

@ElementsMarcoviertch.ModElement.Tag
public class ItemArmaduradediamantereforzada extends ElementsMarcoviertch.ModElement {
	@GameRegistry.ObjectHolder("marcoviertch:armaduradediamantereforzadahelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("marcoviertch:armaduradediamantereforzadabody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("marcoviertch:armaduradediamantereforzadalegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("marcoviertch:armaduradediamantereforzadaboots")
	public static final Item boots = null;
	public ItemArmaduradediamantereforzada(ElementsMarcoviertch instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("ARMADURADEDIAMANTEREFORZADA", "marcoviertch:diamond_", 200,
				new int[]{6, 11, 12, 7}, 40,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 4f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				super.onArmorTick(world, entity, itemstack);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureArmaduradediamantereforzadaHelmetTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("armaduradediamantereforzadahelmet").setRegistryName("armaduradediamantereforzadahelmet")
				.setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("armaduradediamantereforzadabody")
				.setRegistryName("armaduradediamantereforzadabody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("armaduradediamantereforzadalegs")
				.setRegistryName("armaduradediamantereforzadalegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("armaduradediamantereforzadaboots")
				.setRegistryName("armaduradediamantereforzadaboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0,
				new ModelResourceLocation("marcoviertch:armaduradediamantereforzadahelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("marcoviertch:armaduradediamantereforzadabody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("marcoviertch:armaduradediamantereforzadalegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("marcoviertch:armaduradediamantereforzadaboots", "inventory"));
	}
}
