package AimsProject.src.hust.soict.dsai.aims.media;

public abstract  class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    
    public Media(){
        
    }
    

    public Media(String title){
        
        this.title=title;
    }


    public Media(String title, String category, float cost){
        this.title=title;
        this.category=category;
        this.cost=cost;
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

    public boolean equals(Opject o){
        Media media = (Media) o;
        try{
            String title = media.getTitle();
            return title.equals(this.getTitle());
        }catch(NullPointerException e){
            return false;
        }
    }
    
}
