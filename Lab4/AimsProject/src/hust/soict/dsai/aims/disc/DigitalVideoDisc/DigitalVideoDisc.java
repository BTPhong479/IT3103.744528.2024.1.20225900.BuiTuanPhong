package AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;

import hust.soict.dsai.aims.media.Disc;

public class DigitalVideoDisc extends Disc{
    
    
    
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
        super(title, category, director, cost);
        super.setId(nbDigitalVideoDisc);
        nbDigitalVideoDisc++;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        super(title, category,director,length,cost);
        super.setId(nbDigitalVideoDisc);
        nbDigitalVideoDisc++;
    }

    public String toString(){
        return "DVD - " +super.getTitle()+ " - "+ super.getCategory()+ " - "+ super.getDirector()+ " - "+ super.getLength()+ ": "+ super.getCost()+"$";
    }

    public boolean isMatch(String title){
        return title.equals(super.getTitle());
    }
    
}
