package hust.soict.dsai.aims.Aims;

import hust.soict.dsai.aims.cart.Cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Playable;

public class AimsProject{
    public static void main(String[] args){
        Cart a1 = new Cart();
        DigitalVideoDisc dvd1= new DigitalVideoDisc("abc","def", "ghi", 12, 19.95f);
        a1.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("hfgs", "jsfgsjf", "sjdfsj", 75, 24.95f);
        a1.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3= new DigitalVideoDisc("sfgjsdf", "jsgfjsdfgs", "hgsfshgf", 25, 18.99f);
        a1.addDigitalVideoDisc(dvd3);
        DigitalVideoDisc dvd4= new DigitalVideoDisc("sfgjsgdf", "jsgfjshdfgs", "hggsfshgf", 225, 15.99f);
        a1.addDigitalVideoDisc(dvd4);

        DigitalVideoDisc[] dvdList = new DigitalVideoDisc[2];
        dvdList[0]= new DigitalVideoDisc("fgjf","fbejf","fgwfj", 14,13.5f);
        dvdList[1]= new DigitalVideoDisc("gfj","fwf","jhfwj",23,15f);

        a1.addDigitalVideoDisc(dvdList);
        
        
        a1.addDigitalVideoDisc(dvd1, dvd2);

        System.out.println(dvd1.getId());
        System.out.println(dvd2.getId());
        System.out.println(dvd3.getId());
        System.out.println(dvd4.getId());
      /*   a1.addDigitalVideoDisc(dvd1, dvd2, dvd3);  */

      /*   a1.addDigitalVideoDisc(dvdList);  */

         
        System.out.print("Total cost is: ");
        System.out.println(a1.totalCost());
        a1.removeDigitalVideoDisc(dvd2);
        System.out.print("Total cost is: ");
        System.out.println(a1.totalCost());

        a1.print();

        dvd1.play();
        dvd2.play();
    }
}


