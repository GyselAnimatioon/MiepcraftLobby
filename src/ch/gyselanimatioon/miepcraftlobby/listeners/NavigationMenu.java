package ch.gyselanimatioon.miepcraftlobby.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class NavigationMenu implements Listener {

	@EventHandler
	public void InventoryClick(PlayerInteractEvent event) {
		if (event.getPlayer().getItemInHand().getType() == Material.COMPASS) {
			
			ItemStack spawn = new ItemStack(Material.MAGMA_CREAM);
			ItemStack bedwars = new ItemStack(Material.BED);
			ItemStack molecraft = new ItemStack(Material.IRON_SPADE);
			ItemStack freebuild = new ItemStack(Material.WORKBENCH);
			ItemStack creative = new ItemStack(Material.STONE);
			ItemStack placeholder = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)7);
			

			ItemMeta spawnMeta = spawn.getItemMeta();
			ItemMeta bedwarsMeta = bedwars.getItemMeta();
			ItemMeta molecraftMeta = molecraft.getItemMeta();
			ItemMeta freebuildMeta = freebuild.getItemMeta();
			ItemMeta creativeMeta = creative.getItemMeta();

			spawnMeta.setDisplayName("§r§aSpawn");
			bedwarsMeta.setDisplayName("§r§fBedWars");
			molecraftMeta.setDisplayName("§r§aMolCraft");
			freebuildMeta.setDisplayName("§r§bFreebuild");
			creativeMeta.setDisplayName("§r§cCreative");

			spawn.setItemMeta(spawnMeta);
			bedwars.setItemMeta(bedwarsMeta);
			molecraft.setItemMeta(molecraftMeta);
			freebuild.setItemMeta(freebuildMeta);
			creative.setItemMeta(creativeMeta);
			
			Inventory inv;
			inv = Bukkit.createInventory(null, 27, "§eWähle einen Spielmodus");
			inv.setItem(0, placeholder);
			inv.setItem(1, placeholder);
			inv.setItem(2, placeholder);
			inv.setItem(3, placeholder);
			inv.setItem(4, spawn);
			inv.setItem(5, placeholder);
			inv.setItem(6, placeholder);
			inv.setItem(7, placeholder);
			inv.setItem(8, placeholder);
			inv.setItem(9, placeholder);
			inv.setItem(10, molecraft);
			inv.setItem(11, placeholder);
			inv.setItem(12, freebuild);
			inv.setItem(13, placeholder);
			inv.setItem(14, creative);
			inv.setItem(15, placeholder);
			inv.setItem(16, bedwars);
			inv.setItem(17, placeholder);
			inv.setItem(18, placeholder);
			inv.setItem(19, placeholder);
			inv.setItem(20, placeholder);
			inv.setItem(21, placeholder);
			inv.setItem(22, placeholder);
			inv.setItem(23, placeholder);
			inv.setItem(24, placeholder);
			inv.setItem(25, placeholder);
			inv.setItem(26, placeholder);
			event.getPlayer().openInventory(inv);
		}
	}
}
