package ch.gyselanimatioon.miepcraftlobby.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.simonsator.partyandfriendsgui.api.PartyFriendsAPI;

public class NavigationMenu implements Listener {

	@EventHandler
	public void InventoryClick(PlayerInteractEvent event) {
		if (event.getPlayer().getItemInHand().getType() == Material.COMPASS) {

			ItemStack spawn = new ItemStack(Material.MAGMA_CREAM);
			ItemStack bedwars = new ItemStack(Material.BED);
			ItemStack molecraft = new ItemStack(Material.IRON_SPADE);
			ItemStack freebuild = new ItemStack(Material.WORKBENCH);
			ItemStack creative = new ItemStack(Material.STONE);
			ItemStack quickbedwars = new ItemStack(Material.WATCH);
			ItemStack survivalgames = new ItemStack(Material.IRON_SWORD);
			ItemStack quicksurvivalgames = new ItemStack(Material.GOLD_SWORD);
			ItemStack onevsone = new ItemStack(Material.DIAMOND_SWORD);
			ItemStack skywars = new ItemStack(Material.GRASS);
			ItemStack masterbuilders = new ItemStack(Material.WOOD_PICKAXE);
			ItemStack skyblock = new ItemStack(Material.DIRT);
			ItemStack oneinthechamber = new ItemStack(Material.ARROW);
			
			ItemStack placeholder = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
			ItemStack admin = new ItemStack(Material.SLIME_BALL);

			ItemMeta spawnMeta = spawn.getItemMeta();
			ItemMeta bedwarsMeta = bedwars.getItemMeta();
			ItemMeta molecraftMeta = molecraft.getItemMeta();
			ItemMeta freebuildMeta = freebuild.getItemMeta();
			ItemMeta creativeMeta = creative.getItemMeta();
			ItemMeta adminMeta = admin.getItemMeta();
			ItemMeta quickbedwarsMeta = quickbedwars.getItemMeta();
			ItemMeta survivalgamesMeta = survivalgames.getItemMeta();
			ItemMeta quicksurvivalgamesMeta = quicksurvivalgames.getItemMeta();
			ItemMeta onevsoneMeta = onevsone.getItemMeta();
			ItemMeta skywarsMeta = skywars.getItemMeta();
			ItemMeta masterbuildersMeta = masterbuilders.getItemMeta();
			ItemMeta skyblockMeta = skyblock.getItemMeta();
			ItemMeta oneinthechamberMeta = oneinthechamber.getItemMeta();

			spawnMeta.setDisplayName("§r§aSpawn");
			bedwarsMeta.setDisplayName("§r§fBedWars");
			molecraftMeta.setDisplayName("§r§aMoleCraft §7(Comming Soon)");
			freebuildMeta.setDisplayName("§r§bFreebuild");
			creativeMeta.setDisplayName("§r§cCreative");
			adminMeta.setDisplayName("§r§6Admin");
			quickbedwarsMeta.setDisplayName("§r§bQuickBedWars §7(Comming Soon)");
			survivalgamesMeta.setDisplayName("§r§cSurvivalGames §7(Comming Soon)");
			quicksurvivalgamesMeta.setDisplayName("§r§aQuickSurvivalGames §7(Comming Soon)");
			onevsoneMeta.setDisplayName("§r§b1vs1 §7(Comming Soon)");
			skywarsMeta.setDisplayName("§r§cSkyWars §7(Comming Soon)");
			masterbuildersMeta.setDisplayName("§r§dMasterBuilders §7(Comming Soon)");
			skyblockMeta.setDisplayName("§r§eSkyBlock §7(Comming Soon)");
			oneinthechamberMeta.setDisplayName("§r§fOITC §7(Comming Soon)");

			spawn.setItemMeta(spawnMeta);
			bedwars.setItemMeta(bedwarsMeta);
			molecraft.setItemMeta(molecraftMeta);
			freebuild.setItemMeta(freebuildMeta);
			creative.setItemMeta(creativeMeta);
			admin.setItemMeta(adminMeta);
			quickbedwars.setItemMeta(quickbedwarsMeta);
			survivalgames.setItemMeta(survivalgamesMeta);
			quicksurvivalgames.setItemMeta(quicksurvivalgamesMeta);
			onevsone.setItemMeta(onevsoneMeta);
			skywars.setItemMeta(skywarsMeta);
			masterbuilders.setItemMeta(masterbuildersMeta);
			skyblock.setItemMeta(skyblockMeta);
			oneinthechamber.setItemMeta(oneinthechamberMeta);

			Inventory inv;
			inv = Bukkit.createInventory(null, 54, "§eWähle einen Spielmodus");
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
			inv.setItem(20, quickbedwars);
			inv.setItem(21, placeholder);
			inv.setItem(22, survivalgames);
			inv.setItem(23, placeholder);
			inv.setItem(24, quicksurvivalgames);
			inv.setItem(25, placeholder);
			inv.setItem(26, placeholder);
			inv.setItem(27, placeholder);
			inv.setItem(28, onevsone);
			inv.setItem(29, placeholder);
			inv.setItem(30, skywars);
			inv.setItem(31, placeholder);
			inv.setItem(32, masterbuilders);
			inv.setItem(33, placeholder);
			inv.setItem(34, skyblock);
			inv.setItem(35, placeholder);
			inv.setItem(36, placeholder);
			inv.setItem(37, placeholder);
			inv.setItem(38, placeholder);
			inv.setItem(39, placeholder);
			inv.setItem(40, oneinthechamber);
			inv.setItem(41, placeholder);
			inv.setItem(42, placeholder);
			inv.setItem(43, placeholder);
			inv.setItem(44, placeholder);
			inv.setItem(45, placeholder);
			inv.setItem(46, placeholder);
			inv.setItem(47, placeholder);
			inv.setItem(48, placeholder);
			if (event.getPlayer().hasPermission("miepcraftlobby.adminwarp")) {
				inv.setItem(49, admin);
			} else {
				inv.setItem(49, placeholder);
			}
			inv.setItem(50, placeholder);
			inv.setItem(51, placeholder);
			inv.setItem(52, placeholder);
			inv.setItem(53, placeholder);
			event.getPlayer().openInventory(inv);
		}
		if (event.getPlayer().getItemInHand().getType() == Material.BLAZE_ROD) {
			PartyFriendsAPI.openHideInventory(event.getPlayer());
		}
		if (event.getPlayer().getItemInHand().getType() == Material.SKULL_ITEM) {
			if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
				PartyFriendsAPI.openMainInventory(event.getPlayer(), 0);
			}
		}
	}
}
