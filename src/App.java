import classes.*;

public class App {

  public static void main(String[] args) throws Exception {
    AgendaDeBlocos agenda = new AgendaDeBlocos();

    BlocoTematico blocoT = new BlocoTematico(
      "Bloco Louco",
      "FUNK",
      "Rio de Janeiro",
      "15/02/2025 20:00:00",
      100,
      "Hallow"
    );

    BlocoInfatil BlocoI = new BlocoInfatil(
      "Infantil",
      "BTS",
      "Rio de Janeiro",
      "15/02/2025 20:00:00",
      500,
      "+12"
    );

    agenda.registerBlock(blocoT);
    agenda.registerBlock(BlocoI);

    System.out.println("Data e hora: " + blocoT.getDateHour());
    System.out.println("Data e Hora: " + BlocoI.getDateHour());
  }
}
