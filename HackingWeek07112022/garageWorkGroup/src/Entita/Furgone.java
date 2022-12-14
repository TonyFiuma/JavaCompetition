package Entita;

public class Furgone extends VeicoloAMotore {
    private int capacita;

    public Furgone(String marca, int anno, double cilindrata, int capacita) {
        super(marca, anno, cilindrata);
        this.capacita = capacita;
    }

    @Override
    public String getInfoVeicoli() {
        return super.getInfoVeicoli() + " capacita: " + capacita + " kg ";
    }

    public int getCapacita() {
        return capacita;
    }

    public void setCapacita(int capacita) {
        this.capacita = capacita;
    }


}
