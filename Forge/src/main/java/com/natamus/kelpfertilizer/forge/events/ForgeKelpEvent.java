package com.natamus.kelpfertilizer.forge.events;

import com.natamus.kelpfertilizer.events.KelpEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class ForgeKelpEvent {
	@SubscribeEvent
	public void onKelpUse(PlayerInteractEvent.RightClickBlock e) {
		KelpEvent.onKelpUse(e.getLevel(), e.getEntity(), e.getHand(), e.getPos(), e.getHitVec());
	}
}