public class TabScoreMax implements Observer{

    public TabScoreMax() {
    }

    @Override
    public void update(Match obj) {
        System.out.println(obj.getEquipeDomicile() + " " +obj.getScoreDomicile() + "  :  " + obj.getScoreVisteur() + " " +obj.getEquipeVisiteur());
    }
}
