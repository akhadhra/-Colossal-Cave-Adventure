public class Item {
    private String nom;
    private String description;
    private double poids;

    public Item(String nom, String description, double poids) {
        this.nom = nom;
        this.description = description;
        this.poids = poids;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public double getPoids() {
        return poids;
    }
  
    public void utiliser() {
        System.out.println("Vous utilisez " + nom);
    }

    public void examiner() {
        System.out.println(description);
    }
}
