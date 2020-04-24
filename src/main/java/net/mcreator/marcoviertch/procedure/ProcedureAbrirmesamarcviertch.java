package net.mcreator.marcoviertch.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.marcoviertch.gui.GuiMesademarcoviertchGUI;
import net.mcreator.marcoviertch.Marcoviertch;
import net.mcreator.marcoviertch.ElementsMarcoviertch;

@ElementsMarcoviertch.ModElement.Tag
public class ProcedureAbrirmesamarcviertch extends ElementsMarcoviertch.ModElement {
	public ProcedureAbrirmesamarcviertch(ElementsMarcoviertch instance) {
		super(instance, 15);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Abrirmesamarcviertch!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Abrirmesamarcviertch!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Abrirmesamarcviertch!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Abrirmesamarcviertch!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Abrirmesamarcviertch!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(Marcoviertch.instance, GuiMesademarcoviertchGUI.GUIID, world, x, y, z);
	}
}
