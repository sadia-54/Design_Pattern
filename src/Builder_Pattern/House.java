package Builder_Pattern;


//product class
public class House {  //the product class
    private String material;
    private String foundation;
    private String roof;
    private String interior;

    public void setMaterial(String material){
        this.material = material;
    }

    public void setFoundation(String foundation){
        this.foundation = foundation;
    }

    public void setRoof(String roof){
        this.roof = roof;
    }

    public void setInterior(String interior){
        this.interior = interior;
    }

    public String toString(){
        return "House [material = "+material+", foundation = "+foundation+", roof = "+roof+", interior = "+interior+ "]";
    }


    
}
