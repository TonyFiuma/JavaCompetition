package Garage;

public class Parcheggio{


    private StatoParcheggioEnum statoParcheggio;
    private SlotParcheggioEnum slotParcheggio;

    public Parcheggio(SlotParcheggioEnum slotParcheggio, StatoParcheggioEnum statoParcheggio) {
        this.slotParcheggio = slotParcheggio;
        this.statoParcheggio = statoParcheggio;
    }

    public SlotParcheggioEnum getSlotParcheggio() {
        return slotParcheggio;
    }

    public void setSlotParcheggio(SlotParcheggioEnum slotParcheggio) {
        this.slotParcheggio = slotParcheggio;
    }

    public StatoParcheggioEnum getStatoParcheggio() {
        return statoParcheggio;
    }

    public void setStatoParcheggio(StatoParcheggioEnum statoParcheggio) {
        this.statoParcheggio = statoParcheggio;
    }
}
