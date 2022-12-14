package Entita;

public class Macchina extends VeicoloAMotore{

    private int porte;
    private String alimentazione;

    public Macchina(String marca, int anno, double cilindrata, String alimentazione, int porte) {
        super(marca, anno, cilindrata) ;
        this.porte = porte;
        this.alimentazione=alimentazione;
    }

    public int getPorte() {
        return porte;
    }

    public void setPorte(int porte) {
        this.porte = porte;
    }

    public String getAlimentazione() {
        return alimentazione;
    }

    public void setAlimentazione(String alimentazione) {
        this.alimentazione = alimentazione;
    }


    @Override
    public String getInfoVeicoli() {
        return super.getInfoVeicoli()+" alimentata a "+alimentazione+" con "+porte+" porte.";
    }
}
