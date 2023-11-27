public class assietteronde extends assiette{
    private double Rayon;
    public assietteronde(int anneefabrication,double rayon){
        super(anneefabrication);
        this.Rayon=Rayon;
    }
    public void setRayon(double rayon){
        this.Rayon=rayon;
    }
    public double getRayon(){
        return Rayon;
    }
}
