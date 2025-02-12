package classes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Bloco {

  private String name;
  private String musicStyle;
  private String neighborhood;
  private LocalDateTime dateHour;
  private int numPartygoersLastYear;

  private static final DateTimeFormatter FORMATTER =
    DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); //Conversor de horario(String) para LocalDateTime

  public Bloco(
    String name,
    String musicStyle,
    String neighborhood,
    String dateHour,
    int numPartygoersLastYear
  ) {
    this.name = name;
    this.musicStyle = musicStyle;
    this.neighborhood = neighborhood;
    this.dateHour = LocalDateTime.parse(dateHour, FORMATTER); // Aqui estou convertendo o horario(dd/MM/yyyy HH:mm:ss) passado em String para LocalDateTime.
    this.numPartygoersLastYear = numPartygoersLastYear;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMusicStyle() {
    return musicStyle;
  }

  public void setMusicStyle(String musicStyle) {
    this.musicStyle = musicStyle;
  }

  public String getNeighborhood() {
    return neighborhood;
  }

  public void setNeighborhood(String neighborhood) {
    this.neighborhood = neighborhood;
  }

  public LocalDateTime getDateHour() {
    return dateHour;
  }

  public void setDateHour(LocalDateTime dateHour) {
    this.dateHour = dateHour;
  }

  public int getNumPartygoersLastYear() {
    return numPartygoersLastYear;
  }

  public void setNumPartygoersLastYear(int numPartygoersLastYear) {
    this.numPartygoersLastYear = numPartygoersLastYear;
  }
}
