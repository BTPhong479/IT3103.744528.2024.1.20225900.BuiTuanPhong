package hust.soict.dsai.aims.media;


public class Track implements Playable{

    private String title;
    private int length;

    public Track(String title, int length){
        this.length=length;
        this.title=title;
    }

    public String getTitle(){
        return title;
    }

    public int getLength(){
        return length;
    }

    public void play(){
        System.out.println("Playing Track: "+ getTitle());
        System.out.println(("Track length: "+getLength()));
    }

    
    
}
