public class ustensile {
   private int anneefabrication;
    public ustensile(){}
    public ustensile(int anneefabrication){
        this.anneefabrication=anneefabrication;}
        public void setanneefabrication(int anneefabrication){
            this.anneefabrication=anneefabrication;
    }
    public int getAnneefabrication(){
        return anneefabrication;
    }

    public double calculvaleur(int anneeactuel) {
        int age = (anneeactuel - getAnneefabrication());
        double valeur = 0;
        if (age > 50) {
            valeur = age - 50;

        }
        return valeur;
    }
}