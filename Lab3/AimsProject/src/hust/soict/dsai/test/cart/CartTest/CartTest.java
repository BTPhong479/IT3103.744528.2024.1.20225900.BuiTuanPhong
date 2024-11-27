package AimsProject.src.hust.soict.dsai.test.cart.CartTest;
import AimsProject.src.hust.soict.dsai.aims.cart.Cart.Cart;
import AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class CartTest {
    public static void main(String args[]){
        Cart cart= new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 20f);
        cart.addDigitalVideoDisc(dvd4);


        System.out.println(dvd1.getId());
        
        System.out.println(dvd2.getId());
        System.out.println(dvd3.getId());




        cart.print();
        cart.searchId(3);


        cart.searchTitle("The Lion King");



    }
    
}
