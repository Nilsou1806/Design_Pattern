import java.util.ArrayList;
import java.util.Arrays;

public class Match implements Observable{

    private String equipeDomicile;
    private String equipeVisiteur;
    private int scoreDomicile = 0;
    private int scoreVisteur = 0;

    private ArrayList<Observer> observers = new ArrayList<Observer>();;


    public Match(String equipeDomicile, String equipeVisiteur) {
        super();
        this.equipeDomicile = equipeDomicile;
        this.equipeVisiteur = equipeVisiteur;
    }

    @Override
    public void addObservale(Observer obj) {
        observers.add(obj);
    }

    @Override
    public void removeObserver(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObserver() {
        for (Observer obj : observers) {
            obj.update(this);
        }
    }

    public void setScoreDomicile() {
        ++this.scoreDomicile;
        notifyObserver();
    }

    public void setScoreVisteur() {
        ++this.scoreVisteur;
        notifyObserver();
    }



    public String getEquipeDomicile() {
        return equipeDomicile;
    }

    public String getEquipeVisiteur() {
        return equipeVisiteur;
    }

    public int getScoreDomicile() {
        return scoreDomicile;
    }

    public int getScoreVisteur() {
        return scoreVisteur;
    }

}
