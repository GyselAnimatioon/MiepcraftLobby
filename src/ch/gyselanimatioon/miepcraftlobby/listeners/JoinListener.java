package ch.gyselanimatioon.miepcraftlobby.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import ch.gyselanimatioon.miepcraftlobby.Main;

public class JoinListener implements Listener {
	
	@EventHandler
	public void PlayerJoinEvent(PlayerJoinEvent ev) {
		Main.resetItems(ev.getPlayer());
	}
}
