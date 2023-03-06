package gameController;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;

public class gamemodeController {

    public void changeGamemodeGlobaly(GameMode gamemode) {
       for (Player player : Bukkit.getServer().getOnlinePlayers()) {
            player.setGameMode(gamemode);
       }
    }

}
