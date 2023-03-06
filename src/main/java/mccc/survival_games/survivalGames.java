package mccc.survival_games;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class survivalGames extends JavaPlugin {

    enum gameState { // to be refactored
        WAITING,
        INTRO,
        MAIN,
        FINALE,
        OUTRO
    }

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("Survival games plugin started");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    // Improvised Core API (will be refactored)
    static public String getTeamByPlayer(Player player) {
       return "Test team";
    }

    static public void scorePoints(Player player, Integer amount, boolean silent) {
        if (!silent)
            System.out.println(player.getName() + " got " + amount.toString() + " points!");

        scorePoints(getTeamByPlayer(player), amount, silent);
    }

    static public void scorePoints(String team, Integer amount, boolean silent) {
        if (!silent)
            System.out.println(team + " got " + amount.toString() + " points!");
    }
}
