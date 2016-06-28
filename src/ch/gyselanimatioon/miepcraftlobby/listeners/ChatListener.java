package ch.gyselanimatioon.miepcraftlobby.listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

@SuppressWarnings("deprecation")
public class ChatListener implements Listener {

	public ChatListener() {
	}

	@EventHandler
	public void onPlayerChat(PlayerChatEvent event) {
		event.setCancelled(true);
		if (event.getPlayer().hasPermission("miepcraftlobby.chat.owner")) {
			Bukkit.broadcastMessage("§4" + event.getPlayer().getName() + " §r§f" + event.getMessage());
		} else if (event.getPlayer().hasPermission("miepcraftlobby.chat.admin")) {
			Bukkit.broadcastMessage("§c" + event.getPlayer().getName() + " §r§f" + event.getMessage());
		} else if (event.getPlayer().hasPermission("miepcraftlobby.chat.moderator")) {
			Bukkit.broadcastMessage("§9" + event.getPlayer().getName() + " §r§f" + event.getMessage());
		} else if (event.getPlayer().hasPermission("miepcraftlobby.chat.builder")) {
			Bukkit.broadcastMessage("§b" + event.getPlayer().getName() + " §r§f" + event.getMessage());
		} else if (event.getPlayer().hasPermission("miepcraftlobby.chat.youtuber")) {
			Bukkit.broadcastMessage("§d" + event.getPlayer().getName() + " §r§f" + event.getMessage());
		} else if (event.getPlayer().hasPermission("miepcraftlobby.chat.vip")) {
			Bukkit.broadcastMessage("§6" + event.getPlayer().getName() + " §r§f" + event.getMessage());
		} else {
			Bukkit.broadcastMessage("§7" + event.getPlayer().getName() + " §r§f" + event.getMessage());
		}
	}

}
