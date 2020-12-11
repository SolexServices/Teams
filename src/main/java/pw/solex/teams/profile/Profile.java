package pw.solex.teams.profile;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter @Setter
public class Profile {

    private final UUID uuid;
    private String name;

    @Getter private static final List<Profile> profiles = new ArrayList<>();

    public Profile(UUID uuid, String name) {
        this.uuid = uuid;
        this.name = name;
    }

    /**
     * Find a profile.
     *
     * @param uuid the uuid.
     * @return the profile.
     */

    public static Profile findProfile(UUID uuid) {
        return profiles.stream()
                .filter(profile -> profile.getUuid().equals(uuid))
                .findFirst().orElse(null);
    }
}
