package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;
import hust.soict.dsai.aims.media.Playable;


public class CompactDisc extends Disc implements Playable{
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();


    public CompactDisc(String title, String category, String director, int length, float cost,String artist){
        super(title,category,director,length,cost);
        this.artist=artist;
    }

    public String getArtist(){
        return artist;
    }


    public void addTrack(Track track){
        if(tracks.contains(track)) System.out.println("Da co Track nay roi!!!");
        else tracks.add(track);
    }

    public void removeTrack(Track track){
        if(tracks.contains(track)) tracks.remove(track);
        else System.out.println("Chua co Track nay trong danh sach!!!");
    }


    public int getLengthList(){
        int sumLength=0;
        for(Track item : tracks){
            sumLength+= item.getLength();
        }
        return sumLength;
    }

    
    public void play(){
        System.out.println("Artist: "+getArtist());
        for(Track item : tracks){
            item.play();
        }

    }



    


    
}
