package ligue;

import java.util.ArrayList;
import java.util.List;

public class Combattant {
    private String id;
    private String name;
    private String surname;
    private String nameOfCombattant;
    private double weight;
    int point;
    private List<String> title;

    public Combattant(String id, String name, String surname, String nameOfCombattant, double weight) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.nameOfCombattant = nameOfCombattant;
        this.weight = weight;
        this.title = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNameOfCombattant() {
        return nameOfCombattant;
    }

    public int getWeight() {
        return (int) weight;
    }

    public List<String> getTitle() {
        return title;
    }
    @Override
    public String toString() {
        return "Combattant{" +
                "name='" + name + '\'' +
                ", surname=" + surname +
                ", nameOfCombattant=" + nameOfCombattant +
                ", weight=" + weight +
                ", title=" + title +
                '}';
    }
}
