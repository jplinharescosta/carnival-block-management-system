package classes;

public class BlocoTematico extends Bloco {

  private String paradeTheme;

  public BlocoTematico(
    String name,
    String musicStyle,
    String neighborhood,
    String dateHour,
    int numPartygoersLastYear,
    String paradeTheme
  ) {
    super(name, musicStyle, neighborhood, dateHour, numPartygoersLastYear);
    this.paradeTheme = paradeTheme;
  }

  public String getParadeTheme() {
    return paradeTheme;
  }

  public void setParadeTheme(String paradeTheme) {
    this.paradeTheme = paradeTheme;
  }
}
