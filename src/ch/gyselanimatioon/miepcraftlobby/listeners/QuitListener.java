package ch.gyselanimatioon.miepcraftlobby.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class QuitListener implements Listener {
	
	@EventHandler
	public void PlayerQuitEvent(PlayerQuitEvent ev) {
		ev.setQuitMessage(null);
	}
}
