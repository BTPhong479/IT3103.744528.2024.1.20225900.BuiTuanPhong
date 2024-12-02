package hust.soict.dsai.test.cart.CartTest;

import hust.soict.dsai.aims.cart.Cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;


public class CartTest {
    public static void main(String args[]){
        Cart cart= new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addMedia(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", "Science Fiction", "George Lucas", 87, 24.95f);
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 20f);
        
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("The film");

        cart.addMedia(dvd2);
        cart.addMedia(dvd3);
        cart.removeMedia(dvd3);
        cart.removeMedia(dvd3);
        cart.addMedia(dvd3);
        cart.addMedia(dvd4);
        cart.addMedia(dvd5);
        

        Book book1 = new Book("jehgfse","sdgfsdjf",10);
        book1.addAuthor("BTPHONG");
        book1.addAuthor("btphong");

        cart.addMedia(book1);


        CompactDisc cd1 =  new CompactDisc("jhgfsd", "sdfgsf", "djfgfdsjf", 36, 12, "jsdgfsj");
        cart.addMedia(cd1);


        System.out.println(cart.totalCost());
        
        cart.print();

        cart.searchId(2);
        cart.searchTitle("The Lion King");
        cart.searchTitle("jfgsjfjsfvs");

        

    }
    
}
