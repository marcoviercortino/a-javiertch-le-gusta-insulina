package net.mcreator.marcoviertch.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.marcoviertch.ElementsMarcoviertch;

@ElementsMarcoviertch.ModElement.Tag
public class ProcedureArmaduradediamantereforzadaHelmetTickEvent extends ElementsMarcoviertch.ModElement {
	public ProcedureArmaduradediamantereforzadaHelmetTickEvent(ElementsMarcoviertch instance) {
		super(instance, 9);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ArmaduradediamantereforzadaHelmetTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		for (int index0 = 0; index0 < (int) (1000); index0++) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, (int) 100000, (int) 1));
		}
	}
}
