public class assiettecarre extends assiette {
    private double cote;
    public assiettecarre(int anneefabrication,double cote){
        super(anneefabrication);
        this.cote=cote;
    }
    public void setCote(double cote){
        this.cote=cote;
    }
    public double getCote(){
        return cote;
    }
}
