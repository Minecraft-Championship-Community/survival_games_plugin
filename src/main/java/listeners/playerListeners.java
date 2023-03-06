package listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class playerListeners implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player player = event.getEntity().getPlayer();

        Location playerLocation = player.getLocation();

        player.getWorld().strikeLightningEffect(playerLocation);

        Bukkit.broadcastMessage("Oh no a player died!");
    }


}
