package com.natamus.kelpfertilizer.forge.events;

import com.natamus.kelpfertilizer.events.KelpEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;

import java.lang.invoke.MethodHandles;

public class ForgeKelpEvent {
	public static void registerEventsInBus() {
		// BusGroup.DEFAULT.register(MethodHandles.lookup(), ForgeKelpEvent.class);

		PlayerInteractEvent.RightClickBlock.BUS.addListener(ForgeKelpEvent::onKelpUse);
	}

	@SubscribeEvent
	public static void onKelpUse(PlayerInteractEvent.RightClickBlock e) {
		KelpEvent.onKelpUse(e.getLevel(), e.getEntity(), e.getHand(), e.getPos(), e.getHitVec());
	}
}