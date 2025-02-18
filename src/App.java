import static classes.Bloco.calculateEstimateTotalInCarnaval;
import static classes.Bloco.listEstimatePublic;

import classes.*;

public class App {

  public static void main(String[] args) throws Exception {
    AgendaDeBlocos agenda = new AgendaDeBlocos();

    BlocoTematico blocoT = new BlocoTematico(
      "Samba do João - Pólo São Gonçalo",
      "Samba",
      "Copacabana",
      "15/02/2025 20:00:00",
      100,
      "Hallow"
    );

    BlocoTradicional blocoTrad = new BlocoTradicional(
      "MBP do João - Polo São Gonçalo",
      "MBP",
      "Copacabana",
      "15/02/2025 20:00:00",
      350,
      25
    );

    BlocoInfatil BlocoI = new BlocoInfatil(
      "Forró do João - Pólo São Gonçalo",
      "Forró",
      "Barra da Tijuca",
      "15/02/2025 20:00:00",
      500,
      "+12"
    );

    agenda.registerBlock(blocoT);
    agenda.registerBlock(BlocoI);
    agenda.registerBlock(blocoTrad); //Bloco adicionado no mesmo horario

    Foliao foliao1 = new Foliao(
      "Folião João - Pólo São Gonçalo",
      26,
      "Funk",
      "Barra da Tijuca"
    );

    foliao1.reviewBlock(BlocoI, 5);

    foliao1.favoriteBlock(BlocoI);

    foliao1.recommendBlocks(agenda.getBlocks());

    listEstimatePublic(agenda.getBlocks());

    calculateEstimateTotalInCarnaval(agenda.getBlocks());
  }
}
