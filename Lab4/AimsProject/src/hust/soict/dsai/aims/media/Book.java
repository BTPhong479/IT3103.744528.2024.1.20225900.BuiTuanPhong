package AimsProject.src.hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{

    
    private List<String> authors = new ArrayList<String>();


    public Book(){
        super();
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
