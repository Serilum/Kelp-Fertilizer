package com.natamus.kelpfertilizer.dispenser;

import com.natamus.kelpfertilizer.util.Reference;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.DispenserBlock;

public class RecipeManager {
	public static void initDispenserBehavior() {
		try {
			DispenserBlock.registerBehavior(Items.KELP, new BehaviourKelpDispenser(Items.KELP));
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("[" + Reference.NAME + "] Something went wrong when adding the kelp behaviour to dispensers.");
		}
	}
}
