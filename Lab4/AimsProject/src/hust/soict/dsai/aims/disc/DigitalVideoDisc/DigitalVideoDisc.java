package AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;

import AimsProject.src.hust.soict.dsai.aims.media.Media;

public class DigitalVideoDisc extends Media{
    
    private String director;
    private int length;
    
    private static int nbDigitalVideoDisc = 0;

    

    public DigitalVideoDisc(String title){
        super(title);
        super.setId(nbDigitalVideoDisc);
        nbDigitalVideoDisc++;
    }

    public DigitalVideoDisc(String title, String category, float cost){
        super(title, category, cost);
        super.setId(nbDigitalVideoDisc);
        nbDigitalVideoDisc++;
        
    }

    public DigitalVideoDisc(String title, String category, String director, float cost){
        this(title, category, cost);
        this.director=director;
        
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        this(title, category, director, cost);
        this.length=length;
        
    }

    
    

    public String getDirector(){
        return director;
    } 
    public int getLength(){
        return length;
    }

    

    public String toString(){
        return "DVD - " +super.getTitle()+ " - "+ super.getCategory()+ " - "+ director+ " - "+ length+ ": "+ super.getCost()+"$";
    }

    public boolean isMatch(String title){
        return title.equals(super.getTitle());
    }
    
}
