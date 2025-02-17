package AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;


public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id;
    private static int nbDigitalVideoDisc = 0;



    public DigitalVideoDisc(String title){
        this.title=title;
        id = nbDigitalVideoDisc;
        nbDigitalVideoDisc++;
    }

    public DigitalVideoDisc(String title, String category, float cost){
        this(title);
        this.category=category;
        this.cost=cost;
        
    }

    public DigitalVideoDisc(String title, String category, String director, float cost){
        this(title, category, cost);
        this.director=director;
        
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        this(title, category, director, cost);
        this.length=length;
        
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String Title){
        title=Title;
    }
    public String getCategory(){
        return category;
    }

    public String getDirector(){
        return director;
    } 
    public int getLength(){
        return length;
    }

    public float getCost(){
        return cost;
    }

    public int getId(){
        return id;
    }

    public String toString(){
        return "DVD - " +title+ " - "+ category+ " - "+ director+ " - "+ length+ ": "+ cost+"$";
    }

    public boolean isMatch(String title){
        return title.equals(this.title);
    }
    
}
