import java.util.Date;

public class Principale {
    public static void main(String[] args) {
//        type nomvar = valeur;
//        type objet = new
        Etudiant e1 = new Etudiant();
        Etudiant e2 = new Etudiant(1,"NDIAYE","ALIOU",12,new Date(),"GIT","2025-2026",true);
        e1.toString();
        e2.toString();
        e1.setNom("DIALLO");
        e1.setPrenom("KOUNADI");
        e1.toString();
    }
}
