package com.serilum.kelpfertilizer.neoforge.events;

import com.serilum.kelpfertilizer.events.KelpEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.bus.api.SubscribeEvent;

public class NeoForgeKelpEvent {
	@SubscribeEvent
	public static void onKelpUse(PlayerInteractEvent.RightClickBlock e) {
		KelpEvent.onKelpUse(e.getLevel(), e.getEntity(), e.getHand(), e.getPos(), e.getHitVec());
	}
}