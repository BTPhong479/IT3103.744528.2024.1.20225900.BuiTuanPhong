package AimsProject.src.hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private int id;
    private String title;
    private String category;
    private float cost;
    private List<String> authors = new ArrayList<String>();


    public Book(){
        
    }
    
    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getCategory(){
        return category;
    }

    public float getCost(){
        return cost;
    }

    public List getAuthors(){
        return authors;
    }

    public void addAuthor(String authorName){
        if(authors.contains(authorName)) System.out.println("Da them author nay !!!");
        else authors.add(authorName);
    }

    public void removeAuthor(String authorName){
        if(authors.contains(authorName)) authors.remove(authorName);
        else System.out.println("Khong co author trong danh sach!!");
    }




}
