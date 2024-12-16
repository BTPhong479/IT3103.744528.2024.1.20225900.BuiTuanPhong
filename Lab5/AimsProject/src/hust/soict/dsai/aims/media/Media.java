package hust.soict.dsai.aims.media;

import java.util.Comparator;

public abstract class Media {

    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    private int id;
    private String title;
    private String category;
    private float cost;
    private static int nbDigitalVideoDisc = 0;

    
    public Media(){
        
    }
    

    public Media(String title){
        
        this.title=title;
        setId(nbDigitalVideoDisc);
        nbDigitalVideoDisc++;
    }


    public Media(String title, String category, float cost){
        this.title=title;
        this.category=category;
        this.cost=cost;
        setId(nbDigitalVideoDisc);
        nbDigitalVideoDisc++;
    }

    

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
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

    public float getCost(){
        return cost;
    }

    
    
}
