package ch.gyselanimatioon.miepcraftlobby.listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

public class WeatherChangeListener implements Listener {
	
	@EventHandler
	public void WeatherChanged(WeatherChangeEvent event) {
		Bukkit.getWorld(event.getWorld().getName()).setStorm(false);
		Bukkit.getWorld(event.getWorld().getName()).setThundering(false);
	}
}
