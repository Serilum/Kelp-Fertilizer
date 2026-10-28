package com.serilum.kelpfertilizer;


import com.serilum.kelpfertilizer.dispenser.RecipeManager;

public class ModCommon {

	public static void init() {
		load();
	}

	private static void load() {
		RecipeManager.initDispenserBehavior();
	}
}