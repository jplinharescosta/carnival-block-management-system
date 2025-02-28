package classes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public abstract class Bloco {

  private String name;
  private String musicStyle;
  private String neighborhood;
  private LocalDateTime dateHour;
  private int numPartygoersLastYear;
  private List<Foliao> favorites = new ArrayList<>();
  private List<Integer> reviews = new ArrayList<>();

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

  public void setFavorite(Foliao foliao) {
    if (!this.favorites.contains(foliao)) {
      System.out.println(
        "Favorito Adicionado com Sucesso na conta do foliao: " +
        foliao.getName()
      );
      favorites.add(foliao);
    } else {
      System.out.println(
        foliao.getName() + ", você já adicionou esse bloco no seu favoritos."
      );
    }
  }

  public static List<Bloco> sortBlockByPublic(List<Bloco> blocos) {
    // Aqui irei usar o algoritmo Bubble Sort
    for (int i = 0; i < blocos.size() - 1; i++) {
      for (int j = 0; j < blocos.size() - i - 1; j++) {
        if (
          blocos.get(j).calculateEstimetePublic() <
          blocos.get(j + 1).calculateEstimetePublic()
        ) {
          Bloco temp = blocos.get(j);
          blocos.set(j, blocos.get(j + 1));
          blocos.set(j + 1, temp);
        }
      }
    }
    return blocos;
  }

  public static void calculateEstimateTotalInCarnaval(List<Bloco> blocos) {
    int sum = 0;
    for (int i = 0; i < blocos.size(); i++) {
      sum += blocos.get(i).calculateEstimetePublic();
    }
    System.out.println(
      "A estimativa de público total do Carnaval no Rio de Janeiro é: " + sum
    );
  }

  public static void listEstimatePublic(List<Bloco> blocos) {
    List<Bloco> ordered = sortBlockByPublic(blocos);
    int index = 1;
    System.out.println(
      "\nVeje a estatistica de públicos nos blocos logo abaixo:"
    );
    for (Bloco bloco : ordered) {
      System.out.println(
        index++ +
        " - " +
        bloco.getName() +
        " - " +
        bloco.calculateEstimetePublic() +
        " pessoas"
      );
    }
    System.out.println();
  }

  public static void blockSchedule(List<Bloco> blocos) {
    List<Bloco> ordered = sortBlockByPublic(blocos);
    System.out.println("\nAgenda de Blocos de rua detalhadas: ");
    for (Bloco bloco : ordered) {
      System.out.println(
        "Bloco: " +
        bloco.getName() +
        " |" +
        " Data/Horário: " +
        bloco.getDateHour().format(FORMATTER) +
        " |" +
        " Local: " +
        bloco.getNeighborhood() +
        " |" +
        " Qtd. Est. de Foliões: " +
        bloco.calculateEstimetePublic()
      );
    }
  }

  //0 <= x <= 6
  public void setReview(int rating) {
    reviews.add(rating);
  }

  public List<Integer> getReviwes() {
    return this.reviews;
  }

  // Retorna média das notas dadas
  public float getReviewsAverage() {
    if (this.reviews.isEmpty()) return 0;
    int sum = 0;
    for (int review : this.reviews) {
      sum += review;
    }
    return (float) sum / this.reviews.size();
  }

  public int calculateEstimetePublic() {
    double Am = getReviewsAverage();
    int Nf = favorites.size();
    int Fa = numPartygoersLastYear;
    return (int) ((Nf * 2) + (Am * Fa * 0.2) + (Fa * 0.8));
  }

  public List<Foliao> getFavorites() {
    return this.favorites;
  }

  public int getFavoritesInt() {
    return this.favorites.size();
  }
}
