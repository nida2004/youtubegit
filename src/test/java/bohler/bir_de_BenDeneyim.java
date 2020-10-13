package bohler;

public class bir_de_BenDeneyim {
    private String karasenir;
    private int kozakli;
    private double kanlica;

    public bir_de_BenDeneyim(String karasenir) {
        this.karasenir = karasenir;
    }

    public String getKarasenir() {
        return karasenir;
    }

    public void setKarasenir(String karasenir) {
        this.karasenir = karasenir;
    }

    @Override
    public String toString() {
        return "bir_de_BenDeneyim{" +
                "karasenir='" + karasenir + '\'' +
                ", kozakli=" + kozakli +
                ", kanlica=" + kanlica +
                '}';


    }
}