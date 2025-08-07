package ligue;

import java.util.List;

public class ligueOfCombat {
    private String name;
    private List<Combattant> combattants;
    private List<match>  matches;

    public ligueOfCombat(String name, List<Combattant> combattants, List<match> matches) {
        this.name = name;
        this.combattants = combattants;
        this.matches = matches;
    }

    public String getName() {
        return name;
    }

    public List<Combattant> getCombattants() {
        return combattants;
    }

    public List<match> getMatches() {
        return matches;
    }
}
