package ch.gyselanimatioon.miepcraftlobby.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class DropListener implements Listener {

	@EventHandler
	public void onItemDrop(PlayerDropItemEvent event) {
		if (!event.getPlayer().hasPermission("miepcraftlobby.bypass")) {
			event.setCancelled(true);
		}
	}
}
