package pw.solex.teams;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public class TeamsPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
    }

    /**
     * Main Instance.
     *
     * @return main class.
     */

    public static TeamsPlugin get() {
        return getPlugin(TeamsPlugin.class);
    }
}
