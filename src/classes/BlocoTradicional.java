package classes;

public class BlocoTradicional extends Bloco {

  private int yearsOfExistence;

  public BlocoTradicional(
    String name,
    String musicStyle,
    String neighborhood,
    String dateHour,
    int numPartygoersLastYear,
    int yearsOfExistence
  ) {
    super(name, musicStyle, neighborhood, dateHour, numPartygoersLastYear);
    this.yearsOfExistence = yearsOfExistence;
  }

  public int getYearsOfExistence() {
    return yearsOfExistence;
  }

  public void setYearsOfExistence(int yearsOfExistence) {
    this.yearsOfExistence = yearsOfExistence;
  }
}
