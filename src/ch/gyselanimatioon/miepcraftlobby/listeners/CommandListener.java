package ch.gyselanimatioon.miepcraftlobby.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class CommandListener implements Listener {

	public CommandListener() {

	}

	@EventHandler
	public void onPlayerCommandPreprocessEvent(PlayerCommandPreprocessEvent event) {
		if (!event.getPlayer().hasPermission("miepcraftlobby.bypass")) {
			event.setCancelled(true);
		}
	}
}
