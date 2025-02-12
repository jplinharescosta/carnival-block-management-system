package classes;

public abstract class Bloco {
    private String name;
    private String musicStyle;
    private String neighborhood;
    private String date;
    private String hour;
    private int numPartygoersLastYear;

    public Bloco(String date, String hour, String musicStyle, String name, String neighborhood, int numPartygoersLastYear) {
        this.date = date;
        this.hour = hour;
        this.musicStyle = musicStyle;
        this.name = name;
        this.neighborhood = neighborhood;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public int getNumPartygoersLastYear() {
        return numPartygoersLastYear;
    }

    public void setNumPartygoersLastYear(int numPartygoersLastYear) {
        this.numPartygoersLastYear = numPartygoersLastYear;
    }
}
