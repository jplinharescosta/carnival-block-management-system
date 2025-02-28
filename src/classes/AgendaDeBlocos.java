package classes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class AgendaDeBlocos {

  private List<Bloco> blocks;

  public AgendaDeBlocos() {
    this.blocks = new ArrayList<>();
  }

  public List<Bloco> getBlocks() {
    return blocks;
  }

  public void setBlocks(List<Bloco> blocks) {
    this.blocks = blocks;
  }

  public boolean verifyConflicts(Bloco newBlock) {
    for (Bloco block : blocks) {
      if (
        block.getNeighborhood().equalsIgnoreCase(newBlock.getNeighborhood()) &&
        block.getDateHour().equals(newBlock.getDateHour())
      ) {
        return true;
      }
    }
    return false;
  }

  public LocalDateTime sugestNewHour(Bloco newBlock) {
    LocalDateTime attempt = newBlock.getDateHour().plusHours(1);
    DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(
      "dd/MM/yyyy HH:mm:ss"
    ); // Aqui como a classe aceita o horario como String, estou fazendo o inveso do que fiz na hora de criar o objeto.
    // No caso estou transformando a tentativa de horario que está em LocalDateTime e passando para String.

    while (true) {
      Bloco newB;
      if (newBlock instanceof BlocoTradicional blocoTradicional) {
        newB = new BlocoTradicional(
          newBlock.getName(),
          newBlock.getMusicStyle(),
          newBlock.getNeighborhood(),
          attempt.format(FORMATTER),
          newBlock.getNumPartygoersLastYear(),
          blocoTradicional.getYearsOfExistence()
        );
      } else if (newBlock instanceof BlocoTematico blocoTematico) {
        newB = new BlocoTematico(
          newBlock.getName(),
          newBlock.getMusicStyle(),
          newBlock.getNeighborhood(),
          attempt.format(FORMATTER),
          newBlock.getNumPartygoersLastYear(),
          blocoTematico.getParadeTheme()
        );
      } else if (newBlock instanceof BlocoInfatil blocoInfatil) {
        newB = new BlocoInfatil(
          newBlock.getName(),
          newBlock.getMusicStyle(),
          newBlock.getNeighborhood(),
          attempt.format(FORMATTER),
          newBlock.getNumPartygoersLastYear(),
          blocoInfatil.getRecommendeAgeRange()
        );
      } else {
        throw new IllegalArgumentException("Tipe de bloco desconhecido!");
      }

      if (!verifyConflicts(newB)) {
        break;
      }

      attempt = attempt.plusHours(1);
    }

    return attempt;
  }

  public void registerBlock(Bloco newBlock) {
    DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(
      "dd/MM/yyyy HH:mm:ss"
    );

    if (verifyConflicts(newBlock)) {
      System.out.println(
        "Conflito de horário no bloco: " +
        newBlock.getName() +
        " detectado! Sugerindo novo horário..."
      );
      LocalDateTime newDateHour = sugestNewHour(newBlock);
      newBlock.setDateHour(newDateHour);
      System.out.println(
        "Novo horário sugerido: " + newDateHour.format(FORMATTER)
      );
    }
    blocks.add(newBlock);
    System.out.println("Bloco cadastrado com sucesso: " + newBlock.getName());
  }
}
