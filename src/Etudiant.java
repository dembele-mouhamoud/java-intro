import java.util.Date;

public class Etudiant {
    //attributs
    private int id;
    private String nom;
    private String prenom;
    private int age;
    private Date dateNaiss;
    private String filiere;
    private String anneScol;
    private boolean etat;

    //les construsteur sans param
    public Etudiant() {
    }

    //les construsteur avec param
    public Etudiant(int id, String nom, String prenom, int age, Date dateNaiss, String filiere, String anneScol, boolean etat) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.dateNaiss = dateNaiss;
        this.filiere = filiere;
        this.anneScol = anneScol;
        this.etat = etat;
    }

    //getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public String getAnneScol() {
        return anneScol;
    }

    public void setAnneScol(String anneScol) {
        this.anneScol = anneScol;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        String s = "Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", dateNaiss=" + dateNaiss +
                ", filiere='" + filiere + '\'' +
                ", anneScol='" + anneScol + '\'' +
                ", etat=" + etat +
                '}';

        System.out.println(s);
        return  s;
    }
}
