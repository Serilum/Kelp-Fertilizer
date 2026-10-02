package com.serilum.kelpfertilizer.forge.events;

import com.serilum.kelpfertilizer.events.KelpEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ForgeKelpEvent {
	@SubscribeEvent
	public static void onKelpUse(PlayerInteractEvent.RightClickBlock e) {
		KelpEvent.onKelpUse(e.getLevel(), e.getEntity(), e.getHand(), e.getPos(), e.getHitVec());
	}
}