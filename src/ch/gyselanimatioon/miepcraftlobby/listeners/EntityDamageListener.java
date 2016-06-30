package ch.gyselanimatioon.miepcraftlobby.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class EntityDamageListener implements Listener {

	@EventHandler
	public void onEntityDamageEvent(EntityDamageEvent event) {
		event.setCancelled(true);
	}
}
