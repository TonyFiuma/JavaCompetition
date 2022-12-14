package Entita;


public abstract class VeicoloAMotore{
        private String marca;
        private int anno;
        private double cilindrata;

        public VeicoloAMotore(String marca, int anno, double cilindrata) {
            this.marca = marca;
            this.anno = anno;
            this.cilindrata = cilindrata;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public int getAnno() {
            return anno;
        }

        public void setAnno(int anno) {
            this.anno = anno;
        }

        public double getCilindrata() {
            return cilindrata;
        }

        public void setCilindrata(double cilindrata) {
            this.cilindrata = cilindrata;
        }


        public String getInfoVeicoli(){
            return "Veicolo :"+ marca +", dell'anno "+anno+",  con una cilindrata di "+cilindrata;
        }
    }

