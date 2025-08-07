package ligue;

public class palmares {
    private int point;
    private TypeMatch typeMatch;

    public palmares(int point) {
        this.point = 0;
    }
    public int getPoint() {
        return point;
    }
    public void setPoint(int point) {
        if (typeMatch == TypeMatch.AMICAUX){
            this.point = point;
        }
        if (typeMatch == TypeMatch.OFFICIELS){
            this.point = 0;
        }
        if (typeMatch == TypeMatch.forTITLE){
            System.out.println();
        }
    }
}
