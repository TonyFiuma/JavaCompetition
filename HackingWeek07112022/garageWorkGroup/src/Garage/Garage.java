package Garage;
import Entita.VeicoloAMotore;
import java.util.HashMap;
import java.util.Map;


public class Garage{

    private static final Garage garage = new Garage();
    private static final int maxPosti = 15;
    private static int postiOccupati = 0;

    private Map<Parcheggio, VeicoloAMotore> myGarage = new HashMap<>();

    private Garage() {
    }

    public int getMaxPosti() {
        return maxPosti;
    }

    public static int getPostiOccupati() {
        return postiOccupati;
    }

    public static void setPostiOccupati(int postiOccupati) {
        Garage.postiOccupati = postiOccupati;
    }

    public Map<Parcheggio, VeicoloAMotore> getMyGarage() {
        return myGarage;
    }

    public void setMyGarage(Map<Parcheggio, VeicoloAMotore> myGarage) {
        this.myGarage = myGarage;
    }

    public static Garage getIstance() {
        return garage;
    }

    /**
     * Il metodo aggiungerà un veicolo nel caso che il parcheggio sia libero
     *
     * @param parcheggio     è lo slot dove verrà allocato il veicolo
     * @param veicoloAMotore è il veicolo che deve essere allocato
     */
    public void parcheggiaVeicolo(Parcheggio parcheggio, VeicoloAMotore veicoloAMotore) {
        if (parcheggio.getStatoParcheggio() == StatoParcheggioEnum.LIBERO && postiOccupati < maxPosti) {
            myGarage.put(parcheggio, veicoloAMotore);
            postiOccupati += 1;
            parcheggio.setStatoParcheggio(StatoParcheggioEnum.OCCUPATO);
        } else {
            System.out.println("Errore: " + parcheggio.getSlotParcheggio() + " è già occupato");
        }
    }

    /**
     * Questo metodo rimuoverà un veicolo in caso sia presente
     *
     * @param parcheggio     dove rimuovi il veicolo
     * @param veicoloAMotore veicolo da rimuovere
     * @return ritorna il veicolo rimosso
     */
    public VeicoloAMotore rimuoviVeicolo(Parcheggio parcheggio, VeicoloAMotore veicoloAMotore) {
        if (parcheggio.getStatoParcheggio() == StatoParcheggioEnum.LIBERO) {
            System.out.println(parcheggio.getSlotParcheggio() + " è già libero");
        } else if (!(myGarage.get(parcheggio).equals(veicoloAMotore))) {
            System.out.println("Errore: il veicolo non corrisponde a quello da lei richiesto");
        } else {
            myGarage.remove(parcheggio, veicoloAMotore);
            parcheggio.setStatoParcheggio(StatoParcheggioEnum.LIBERO);
            postiOccupati -= 1;
            System.out.println("Il " + veicoloAMotore.getInfoVeicoli() + " è stato rimosso dal parcheggio n: "
                    + parcheggio.getSlotParcheggio());
        }
        return veicoloAMotore;
    }
}