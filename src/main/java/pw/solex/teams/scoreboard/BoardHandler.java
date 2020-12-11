package pw.solex.teams.scoreboard;

import io.github.thatkawaiisam.assemble.AssembleAdapter;
import org.bukkit.entity.Player;
import pw.proteus.commons.util.CC;
import pw.solex.teams.TeamsPlugin;

import java.util.ArrayList;
import java.util.List;

public class BoardHandler implements AssembleAdapter {

    @Override
    public String getTitle(Player player) {
        return CC.translate(TeamsPlugin.get().getConfig().getString("SCOREBOARD.TITLE"));
    }

    @Override
    public List<String> getLines(Player player) {
        final List<String> lines = new ArrayList<>();

        return lines;
    }
}
