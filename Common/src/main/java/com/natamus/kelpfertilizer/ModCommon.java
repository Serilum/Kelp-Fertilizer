package com.natamus.kelpfertilizer;


import com.natamus.kelpfertilizer.dispenser.RecipeManager;

public class ModCommon {

	public static void init() {
		load();
	}

	private static void load() {
		RecipeManager.initDispenserBehavior();
	}
}