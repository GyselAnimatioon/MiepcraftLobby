package ch.gyselanimatioon.miepcraftlobby;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.util.Vector;

public class DoubleJump implements Listener {
	 
	@EventHandler
    public void setFlyOnJoin(PlayerJoinEvent event)
    {
        Player p = event.getPlayer();
        if(p.hasPermission("derp.jump"))
        {
        p.setAllowFlight(true);
        p.setFlying(true);
        }
    }

    @EventHandler
    public void onFlightAttempt(PlayerToggleFlightEvent event) {
             
        Player p = event.getPlayer();
        if(p.isOp() == false && p.getGameMode() != GameMode.CREATIVE)
        {
            p.sendMessage(ChatColor.GREEN + "**WOOSH**");
            p.playSound(p.getLocation(), Sound.IRONGOLEM_THROW, 10, -10);
            event.setCancelled(true);
            Vector v = p.getLocation().getDirection().multiply(1).setY(1);
            p.setVelocity(v);
        }
 
    }
}
