package classes;

public class BlocoInfatil extends Bloco {

  private String recommendeAgeRange;

  public BlocoInfatil(
    String name,
    String musicStyle,
    String neighborhood,
    String dateHour,
    int numPartygoersLastYear,
    String recommendedAgeRange
  ) {
    super(name, musicStyle, neighborhood, dateHour, numPartygoersLastYear);
    this.recommendeAgeRange = recommendedAgeRange;
  }

  public String getRecommendeAgeRange() {
    return recommendeAgeRange;
  }

  public void setRecommendeAgeRange(String recommendeAgeRange) {
    this.recommendeAgeRange = recommendeAgeRange;
  }
}
