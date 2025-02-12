package classes;

public class BlocoInfatil extends Bloco {
    private String recommendeAgeRange;

    public BlocoInfatil(String date, String hour, String musicStyle, String name, String neighborhood, int numPartygoersLastYear, String recommendedAgeRange) {
        super(date, hour, musicStyle, name, neighborhood, numPartygoersLastYear);
        this.recommendeAgeRange = recommendedAgeRange;
    }

    public String getRecommendeAgeRange() {
        return recommendeAgeRange;
    }

    public void setRecommendeAgeRange(String recommendeAgeRange) {
        this.recommendeAgeRange = recommendeAgeRange;
    }
}