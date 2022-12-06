public class TabScoreMin implements Observer{

    public TabScoreMin() {
    }

    @Override
    public void update(Match obj) {
        System.out.println(obj.getEquipeDomicile().substring(0,3) + " " +obj.getScoreDomicile() + "  :  " + obj.getScoreVisteur() + " " +obj.getEquipeVisiteur().substring(0,3));
    }
}
