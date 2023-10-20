public class Personne {
    private int id;
    private String nom;
    private String prenom;
    private int age;

    public Personne(int id,String nom,String prenom,int age){

        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;


    }


    public Integer getId(){
        return id;
    }

    public String getNom(){
        return nom;
    }

@Override
  public String toString() {
      return(id + " " + nom + " " + prenom + " " + age); }
}
