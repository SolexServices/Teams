package pw.solex.teams.team;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter @Setter
public class Team {

    private final UUID uuid;
    private final String name;

    @Getter private static final List<Team> teams = new ArrayList<>();

    /**
     * Teams Constructor.
     *
     * @param uuid the uuid.
     * @param name the name.
     */

    public Team(UUID uuid, String name) {
        this.uuid = uuid;
        this.name = name;

        teams.add(this);
    }

    /**
     * Find a team by their name.
     *
     * @param name the name.
     * @return the team.
     */

    public static Team findTeamByName(String name) {
        return teams.stream()
                .filter(team -> team.getName().equalsIgnoreCase(name))
                .findFirst().orElse(null);
    }
}
