import java.applet.Applet;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Avant l'appel de l'applet");
        DeuxiemeApplet j = new DeuxiemeApplet();
        System.out.println(" Après l'appel de l'applet");

        System.out.println("Aw ni sou!");
        /*for(int i=1; i<=5;i++ ){
            System.out.println(" GIT NDIAYE");
            System.out.println("  Valeur I: "+i);
            System.out.print( " DOUMBIA\n");
        }*/
        f(5);
        f(10);
        f(15);
        f(125);
        perimetre(20,10);
        parite(13);
    }

    //Founction double
    public static double f(double x){
        System.out.println(" le double de L="+x + "*2:: "+x*2);
        return 2*x;
    }

    //fonction perimetre
    public static double perimetre(double longueur, double largeur){
        double p=0;
        p=(longueur+largeur)*2;
        System.out.println(" le perimetre de L:"+longueur+" l:"+largeur+" =====> "+p);
        return p;
    }

    public static void parite(int x){
        int rest =0;
        rest = x%2;
        if (rest == 0) System.out.println(" Yes, X= "+x +" est paire");
        else System.out.println(" Yes, X= "+x +" est impaire");
    }


}