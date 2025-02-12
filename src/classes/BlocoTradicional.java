
package classes;

public class BlocoTradicional extends Bloco {
    private int yearsOfExistence;

    public BlocoTradicional(String date, String hour, String musicStyle, String name, String neighborhood, int numPartygoersLastYear, int yearsOfExistence) {
        super(date, hour, musicStyle, name, neighborhood, numPartygoersLastYear);
        this.yearsOfExistence = yearsOfExistence;
    }

    public int getYearsOfExistence() {
        return yearsOfExistence;
    }

    public void setYearsOfExistence(int yearsOfExistence) {
        this.yearsOfExistence = yearsOfExistence;
    }


}
