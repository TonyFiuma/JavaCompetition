import Garage.Garage;
import Entita.Furgone;
import Entita.Macchina;
import Entita.Moto;
import Garage.Parcheggio;
import Garage.SlotParcheggioEnum;
import Garage.StatoParcheggioEnum;



public class Start {

    public static void main(String[] args) {

        System.out.println("Benvenuti nel garage Del Nonno Bill, parcheggiate il vostro veicolo");
        System.out.println();

        Parcheggio parcheggio0 = new Parcheggio(SlotParcheggioEnum.PARCHEGGIO_0, StatoParcheggioEnum.LIBERO);
        Parcheggio parcheggio1 = new Parcheggio(SlotParcheggioEnum.PARCHEGGIO_1, StatoParcheggioEnum.LIBERO);
        Parcheggio parcheggio2 = new Parcheggio(SlotParcheggioEnum.PARCHEGGIO_2, StatoParcheggioEnum.LIBERO);
        Parcheggio parcheggio3 = new Parcheggio(SlotParcheggioEnum.PARCHEGGIO_3, StatoParcheggioEnum.LIBERO);
        Parcheggio parcheggio4 = new Parcheggio(SlotParcheggioEnum.PARCHEGGIO_4, StatoParcheggioEnum.LIBERO);
        Parcheggio parcheggio5 = new Parcheggio(SlotParcheggioEnum.PARCHEGGIO_5, StatoParcheggioEnum.LIBERO);
        Parcheggio parcheggio6 = new Parcheggio(SlotParcheggioEnum.PARCHEGGIO_6, StatoParcheggioEnum.LIBERO);
        Parcheggio parcheggio7 = new Parcheggio(SlotParcheggioEnum.PARCHEGGIO_7, StatoParcheggioEnum.LIBERO);
        Parcheggio parcheggio8 = new Parcheggio(SlotParcheggioEnum.PARCHEGGIO_8, StatoParcheggioEnum.LIBERO);
        Parcheggio parcheggio9 = new Parcheggio(SlotParcheggioEnum.PARCHEGGIO_9, StatoParcheggioEnum.LIBERO);
        Parcheggio parcheggio10 = new Parcheggio(SlotParcheggioEnum.PARCHEGGIO_10, StatoParcheggioEnum.LIBERO);
        Parcheggio parcheggio11 = new Parcheggio(SlotParcheggioEnum.PARCHEGGIO_11, StatoParcheggioEnum.LIBERO);
        Parcheggio parcheggio12 = new Parcheggio(SlotParcheggioEnum.PARCHEGGIO_12, StatoParcheggioEnum.LIBERO);
        Parcheggio parcheggio13 = new Parcheggio(SlotParcheggioEnum.PARCHEGGIO_13, StatoParcheggioEnum.LIBERO);
        Parcheggio parcheggio14 = new Parcheggio(SlotParcheggioEnum.PARCHEGGIO_14, StatoParcheggioEnum.LIBERO);


        Macchina macchina1 = new Macchina("Peugeout", 2012, 1.2, "diesel", 5);
        Macchina macchina2 = new Macchina("Fiat", 2018, 1.6, "diesel", 5);
        Macchina macchina3 = new Macchina("Mercedes", 2020, 3.2, "benzina", 5);

        Furgone furgone1 = new Furgone("Iveco", 2000, 2.5, 2000);
        Furgone furgone2 = new Furgone("Mercedes", 2010, 3.0, 2500);
        Furgone furgone3 = new Furgone("Ford", 2020, 2.9, 2500);


        Moto moto1 = new Moto("Honda", 2020, 600, 2);
        Moto moto2 = new Moto("Yamaha", 2018, 750, 4);
        Moto moto3 = new Moto("Aprilia", 2022, 1000, 4);

        Garage garage = Garage.getIstance();


        garage.parcheggiaVeicolo(parcheggio0, macchina1);
        garage.parcheggiaVeicolo(parcheggio1, furgone1);
        garage.parcheggiaVeicolo(parcheggio2, moto1);

        garage.rimuoviVeicolo(parcheggio0, macchina1);


        System.out.println("Situazione attuale veicoli presenti nel garage ");
        System.out.println();


        garage.getMyGarage().forEach((parcheggio, veicoloAMotore) -> System.out.println(parcheggio.getSlotParcheggio()
                + " " + veicoloAMotore.getInfoVeicoli()));
        System.out.println("Nel garage ci sono " + Garage.getPostiOccupati() + " posti occupati su un totale di "
                + garage.getMaxPosti() + " posti disponibili");

    }

}
