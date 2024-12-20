package metier;

public class Article {

    private Integer idArticle;
    private String designation;
    private Double caArticle;
    private Integer qteStock;
    private Double prix;
    private Tva tva;
    private  Famille uneFamille;


    public Integer getIdArticle(){
        return this.idArticle;
    }

    public void setidArticle(Integer idArticle){
        this.idArticle = idArticle;
    }

    public String getDesignation(){
        return this.designation;
    }

    public void setDesignation(String designation){
        this.designation = designation;
    }

    public Double getcaArticle(){
        return this.caArticle;
    }

    public void setcaArticle(Double caArticle){
        this.caArticle = caArticle;
    }


    public Integer getQteStock(){
        return this.qteStock;
    }

    public void setQteStock(Integer qteStock){
        this.qteStock = qteStock;
    }


    public Double getPrix(){
        return this.prix;
    }

    public void setPrix(Double prix){
        this.prix = prix;
    }

    public String setTva(Tva tva){
        return this.tva.toString();
    }

    public Tva setTva(){
        return this.tva;
    }

    public Famille getUneFamille(){
        return this.uneFamille;
    }

    public void setUneFamille(Famille uneFamille){

        this.uneFamille = uneFamille;
    }


    public Article(int idArticle, String designation, int qteStock, double prix, Tva uneTva, Famille uneFamille) {
      setidArticle(idArticle);
      setDesignation(designation);
      setQteStock(qteStock);
      setPrix(prix);
      setTva(tva);



    }

}