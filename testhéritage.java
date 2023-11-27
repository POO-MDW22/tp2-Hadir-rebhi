public class testhéritage {
    public static void main(String[] args) {
        assietteronde ar = new assietteronde(1999, 20);
        System.out.println(ar.getRayon());
        assiettecarre ac = new assiettecarre(1955, 9);
        System.out.println(ac.getCote());
        cuillére c1 = new cuillére(2001, 15);
        System.out.println(c1.getLongueur());
        System.out.println(ar.calculvaleur());
        System.out.println(ac.calculvaleur());
        System.out.println(c1.calculvaleur());

    }
}