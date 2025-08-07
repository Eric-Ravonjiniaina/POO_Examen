package ligue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class match {
    private final int id;
    private final LocalDate date;
    private int point;
    private List<Combattant> combattant;
    private final String endroit;

    public match(int id, LocalDate date, String endroit) {
        this.id = id;
        this.date = date;
        this.endroit = endroit;
        this.combattant = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getEndroit() {
        return endroit;
    }

    public void CombattantMatch(Combattant combattant1, Combattant combattant2){
        System.out.println("Match des combattants : " +  combattant1.toString() + " et " + combattant2.toString());
    }

    public static boolean matchStart(Combattant combattant1,Combattant combattant2){
        if(combattant1 == null && combattant2 == null ||  combattant1.equals(combattant2)){
            return false;
        }
        return true;
    }

    public void setCombattant(Combattant combattant1, Combattant combattant2) {
        for (int i = 0; i<this.point;i++){
            if(combattant1.getWeight() < combattant1.getWeight()){
                combattant2.point ++;
            }
            else if(combattant2.getWeight() < combattant2.getWeight()){
                combattant1.point ++;
            }
            else{
                combattant2.point = combattant1.point;
            }
        }
    }
}
