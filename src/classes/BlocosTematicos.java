package classes;

public class BlocosTematicos extends Bloco {
    private String paradeTheme;

    public BlocosTematicos(String date, String hour, String musicStyle, String name, String neighborhood, int numPartygoersLastYear, String paradeTheme) {
        super(date, hour, musicStyle, name, neighborhood, numPartygoersLastYear);
        this.paradeTheme = paradeTheme;
    }

    public String getParadeTheme() {
        return paradeTheme;
    }

    public void setParadeTheme(String paradeTheme) {
        this.paradeTheme = paradeTheme;
    }
        
}
