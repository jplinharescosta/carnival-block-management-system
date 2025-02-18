package classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Foliao {

  private String name;
  private int idade;
  private String musicStylePrefer;
  private String intrestRegion;

  public Foliao(
    String name,
    int idade,
    String musicStylePrefer,
    String intrestRegion
  ) {
    this.name = name;
    this.idade = idade;
    this.musicStylePrefer = musicStylePrefer;
    this.intrestRegion = intrestRegion;
  }

  public void favoriteBlock(Bloco bloco) {
    bloco.setFavorite(this);
  }

  public void reviewBlock(Bloco bloco, int note) {
    if (note >= 1 && note <= 5) {
      System.out.println(
        name + ", sua nota [" + note + "] foi computada com sucesso."
      );
      bloco.setReview(note);
    } else {
      System.out.println("Por favor escolha uma nota entre 1 a 5, obrigado.");
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getIntrestRegion() {
    return intrestRegion;
  }

  public void setIntrestRegion(String intrestRegion) {
    this.intrestRegion = intrestRegion;
  }

  public String getMusicStylePrefer() {
    return musicStylePrefer;
  }

  public void setMusicStylePrefer(String musicStylePrefer) {
    this.musicStylePrefer = musicStylePrefer;
  }

  public List<Bloco> recommendBlocks(List<Bloco> blocos) {
    List<Bloco> recommended = new ArrayList<>();
    for (Bloco bloco : blocos) {
      if (bloco.getMusicStyle().equalsIgnoreCase(this.musicStylePrefer)) {
        recommended.add(bloco);
      }
    }

    if (recommended.isEmpty()) {
      blocos.sort(
        Comparator.comparingInt(Bloco::getFavoritesInt)
          .reversed()
          .thenComparingDouble(Bloco::getReviewsAverage)
          .reversed()
      );
      recommended = blocos.size() > 5 ? blocos.subList(0, 5) : blocos;
    }

    String listOfRecommended = recommended
      .stream()
      .map(Bloco::getName)
      .reduce((a, b) -> a + ", " + b)
      .orElse("Nenhum bloco encontrado");

    System.out.println(
      "Os blocos recomendado(s) para " +
      name +
      " é(são) " +
      "-> [" +
      listOfRecommended +
      "]"
    );
    return recommended;
  }
}
