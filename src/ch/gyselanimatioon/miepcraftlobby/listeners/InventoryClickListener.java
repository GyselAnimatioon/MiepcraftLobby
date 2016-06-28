package ch.gyselanimatioon.miepcraftlobby.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClickListener implements Listener {

	@EventHandler
	public void InventoryClick(InventoryClickEvent e) {
		if (e.getCurrentItem().getType() == Material.MAGMA_CREAM) {

			Location spawn = new Location(Bukkit.getWorld("world"), -216.5, 97, 262.5);
			spawn.setYaw(0);
			e.getWhoClicked().teleport(spawn);

		} else if (e.getCurrentItem().getType() == Material.BED) {

			Location bedwars = new Location(Bukkit.getWorld("world"), -319.5, 79, 262.5);
			bedwars.setYaw(90);
			e.getWhoClicked().teleport(bedwars);

		} else if (e.getCurrentItem().getType() == Material.IRON_SPADE) {

			Location molecraft = new Location(Bukkit.getWorld("world"), -113.5, 79, 262.5);
			molecraft.setYaw(-90);
			e.getWhoClicked().teleport(molecraft);

		} else if (e.getCurrentItem().getType() == Material.WORKBENCH) {

			Location freebuild = new Location(Bukkit.getWorld("world"), -216.5, 79, 365.5);
			freebuild.setYaw(0);
			e.getWhoClicked().teleport(freebuild);

		} else if (e.getCurrentItem().getType() == Material.STONE) {

			Location creative = new Location(Bukkit.getWorld("world"), -216.5, 79, 159.5);
			creative.setYaw(180);
			e.getWhoClicked().teleport(creative);

		} else if (e.getCurrentItem().getType() == Material.SLIME_BALL) {

			Location admin = new Location(Bukkit.getWorld("world"), -538.5, 64, 408.5);
			admin.setYaw(90);
			e.getWhoClicked().teleport(admin);

		}
		if (!e.getWhoClicked().hasPermission("miepcraftlobby.bypass")) {
			e.setCancelled(true);
		}
	}
}
