import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Match m1 = new Match("France","Italie");

        TabScoreMax t1 = new TabScoreMax();
        TabScoreMin t2 = new TabScoreMin();

        m1.addObservale(t1);
        m1.addObservale(t2);

        System.out.println("Début du match");
        m1.setScoreDomicile();
        m1.setScoreDomicile();
        m1.setScoreDomicile();
    }
}