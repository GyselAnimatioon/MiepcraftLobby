package ch.gyselanimatioon.miepcraftlobby;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.plugin.java.JavaPlugin;

import ch.gyselanimatioon.miepcraftlobby.listeners.BuildListener;
import ch.gyselanimatioon.miepcraftlobby.listeners.ChatListener;
import ch.gyselanimatioon.miepcraftlobby.listeners.CommandListener;
import ch.gyselanimatioon.miepcraftlobby.listeners.DropListener;
import ch.gyselanimatioon.miepcraftlobby.listeners.InventoryClickListener;
import ch.gyselanimatioon.miepcraftlobby.listeners.JoinListener;
import ch.gyselanimatioon.miepcraftlobby.listeners.NavigationMenu;
import ch.gyselanimatioon.miepcraftlobby.listeners.QuitListener;
import ch.gyselanimatioon.miepcraftlobby.listeners.WeatherChangeListener;

public class Main extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(new JoinListener(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new QuitListener(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new InventoryClickListener(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new NavigationMenu(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new BuildListener(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new DropListener(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new CommandListener(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new ChatListener(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new WeatherChangeListener(), this);
	}
	
	@SuppressWarnings("deprecation")
	public static void resetItems(Player p) {
		p.getInventory().clear();
		
		ItemStack compass = new ItemStack(Material.COMPASS);
		ItemStack blazeRod = new ItemStack(Material.BLAZE_ROD);
		ItemStack netherStar = new ItemStack(Material.NETHER_STAR);
		ItemStack platzhalter = new ItemStack(Material.STONE);

		ItemMeta compassMeta = compass.getItemMeta();
		ItemMeta blazeRodMeta = blazeRod.getItemMeta();
		ItemMeta netherStarMeta = netherStar.getItemMeta();

		compassMeta.setDisplayName("§r§aNavigator §7(Rechtsklick)");
		blazeRodMeta.setDisplayName("§r§aSpieler ausblenden §7(Rechtsklick)");
		netherStarMeta.setDisplayName("§r§bLobby wechseln §7(Comming Soon)");

		compass.setItemMeta(compassMeta);
		blazeRod.setItemMeta(blazeRodMeta);
		netherStar.setItemMeta(netherStarMeta);
		
		ItemStack skull = new ItemStack(397, 1, (short) 3);
		SkullMeta meta = (SkullMeta) skull.getItemMeta();
		meta.setDisplayName("§r§eFreunde §7(Rechtsklick)");
		meta.setOwner(p.getName());
		skull.setItemMeta(meta);

		p.getInventory().setItem(0, compass);
		p.getInventory().setItem(1, blazeRod);
		p.getInventory().setItem(2, platzhalter);
		p.getInventory().setItem(3, platzhalter);
		p.getInventory().setItem(4, platzhalter);
		p.getInventory().setItem(5, platzhalter);
		p.getInventory().setItem(6, platzhalter);
		p.getInventory().setItem(7, netherStar);
		p.getInventory().addItem(skull);
		p.getInventory().remove(platzhalter);
	}
}
