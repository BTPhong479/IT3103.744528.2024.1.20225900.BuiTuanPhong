package hust.soict.dsai.aims.Aims;

import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.store.Store.Store;

public class AimsProject{
  public static void main(String args[]){

	Store store = new Store();
	Cart cart = new Cart();

	DigitalVideoDisc dvd1 = new DigitalVideoDisc("The_Lion_King", "Animation", "Roger Allers", 87, 19.95f);
	DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star_War", "Science Fiction", "George Lucas", 87, 24.95f);
	DigitalVideoDisc dvd3 = new DigitalVideoDisc("The_Lion_King", "Animation", "Roger Allers", 100, 35f);

	store.addMedia(dvd1);
	store.addMedia(dvd2);
	store.addMedia(dvd3);

	Book book1 = new Book("OOP","IT",25f);
    book1.addAuthor("BTPHONG");
    book1.addAuthor("btphong");
	Book book2 = new Book("CTDL_GT", "IT", 22f);
	book2.addAuthor("CTDLAuthors");
	Book book3 = new Book("TTUD", "IT", 27f);
	book3.addAuthor("TTUDAuthors");

	store.addMedia(book1);
	store.addMedia(book2);
	store.addMedia(book3);

	CompactDisc cd1 =  new CompactDisc("Star_War", "Science Fiction", "George Lucas", 36, 12, "The Artist");
	CompactDisc cd2 =  new CompactDisc("OOP", "Science Fiction", "George Lucas", 32, 15, "The Artist OOP");
	CompactDisc cd3 =  new CompactDisc("TTUD", "Science Fiction", "George Lucas", 30, 18, "The Artist TTUD");

	store.addMedia(cd1);
	store.addMedia(cd2);
	store.addMedia(cd3);

    Scanner sc = new Scanner(System.in);
	while(true){
	showMenu();

	int a= sc.nextInt();
	if(a==0) break;
	if(a==1) {
		while(true){
			
			storeMenu();
			int a1= sc.nextInt();
			if(a1==5) break;
			if(a1==1) {
				store.print();
				while(true){
					mediaDetailsMenu();
					int a11 = sc. nextInt();
					if(a11==0) break;
										
					
					if(a11==1){
						System.out.println("nhap Title can tim: ");
						String s1 = sc.next();
						store.searchTitle(s1);
						System.out.println("Nhap ID Media muon them!!!");
						int a111 = sc.nextInt();
						cart.addMedia(store.getMediaById(a111));
						System.out.println("So Media hien co trong Cart: "+ cart.numberMediaCurCart());
						break;
					}
					if(a11==2){
						System.out.println("nhap Title can tim: ");
						String s1 = sc.next();
						store.searchTitle(s1);
						System.out.println("Nhap ID Media muon play!!!");
						int a112 = sc.nextInt();
						if( store.getMediaById(a112) instanceof Book){
							System.out.println("Book khong the play");
							break;
						}else{
							System.out.println("Playing.....");
							break;
						}
					}
					
				}
			}
			if(a1==2){
				System.out.println("nhap Title can tim: ");
				String s1 = sc.next();
				store.searchTitle(s1);
				System.out.println("Nhap ID Media muon them!!!");
				int a111 = sc.nextInt();
				cart.addMedia(store.getMediaById(a111));
				System.out.println("So Media hien co trong Cart: "+ cart.numberMediaCurCart());
				

			} 
			if(a1==3){
				System.out.println("nhap Title can tim: ");
				String s1 = sc.next();
				store.searchTitle(s1);
				System.out.println("Nhap ID Media muon play!!!");
				int a112 = sc.nextInt();
				if( store.getMediaById(a112) instanceof Book){
					System.out.println("Book khong the play");
					
				}else{
					System.out.println("Playing.....");
					
				}
			}
			if(a1==4){
				cart.print();
			}

		}
	}
	if(a==2){
		while(true){
		System.out.println("0.Back");
		System.out.println("1.UpdateStore");
		System.out.println("2.RemoveStore");
		System.out.print("Nhap so 0-1-2: ");
		int a21 = sc.nextInt();
		if(a21==0) break;
		if(a21==1){
			System.out.print("The loai muon them DVD-CD-Book: ");
			String s1 = sc.next();
			if(s1.equals("DVD")){
				System.out.print("\nNhap title: ");
				String title = sc.next();
				System.out.print("\nNhap category: ");
				String category = sc.next();
				System.out.print("\nNhap director: ");
				String director = sc.next();
				System.out.print("\nNhap length: ");
				int length = sc.nextInt();
				System.out.print("\nNhap cost: ");
				float cost = sc.nextFloat();

				DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, director, length, cost);
				store.addMedia(dvd);
				break;
			}
			if(s1.equals("CD")){
				System.out.print("\nNhap title: ");
				String title = sc.next();
				System.out.print("\nNhap category: ");
				String category = sc.next();
				System.out.print("\nNhap director: ");
				String director = sc.next();
				System.out.print("\nNhap length: ");
				int length = sc.nextInt();
				System.out.print("\nNhap cost: ");
				float cost = sc.nextFloat();
				System.out.print("\nNhap artist: ");
				String artist = sc.next();

				CompactDisc cd =  new CompactDisc(title, category, director, length, cost, artist);
				store.addMedia(cd);
				break;
			}
			if(s1.equals("Book")){
				System.out.print("\nNhap title: ");
				String title = sc.next();
				System.out.print("\nNhap category: ");
				String category = sc.next();
				System.out.print("\nNhap cost: ");
				float cost = sc.nextFloat();
				System.out.print("\nNhap artist: ");
				String artist = sc.next();

				Book book = new Book(title, category, cost);
				book.addAuthor(artist);
				store.addMedia(book);
				break;
			}

		}
		if(a21==2){
			System.out.print("Nhap Id Media muon remove: ");
			int a212 = sc.nextInt();
			store.removeMedia(store.getMediaById(a212));
			break;
		}
		
		}
	}
	if(a==3) {
		while(true){
		cart.print();
		cartMenu();
		int a31 = sc.nextInt();
		if(a31==0) break;
		if(a31==1){
			System.out.println("1. Filter by Id.");
			System.out.println("2. Filter by Title.");
			System.out.print("Chon option 1-2: ");
			int a311 = sc.nextInt();
			if(a311==1){
				System.out.print("\nNhap Id: ");
				int a3111 = sc.nextInt();
				cart.searchId(a3111);
				break;
			}
			if(a311==2){
				System.out.print("\nNhap Tilte: ");
				String s1 = sc.next();
				cart.searchTitle(s1);
				break;
			}

		}
		if(a31==2){
			System.out.println("1.Sort by Title.");
			System.out.println("Sort by Cost.");
			System.out.print("Chon option 1-2: ");
			int a312 = sc.nextInt();
			if(a312==1){
				cart.sortByTitle();
				break;
			}
			if(a312==2){
				cart.sortByCost();
				break;
			}
		}
		if(a31==3){
			System.out.println("nhap Title muon remove: ");
			String s1 = sc.next();
			store.searchTitle(s1);
			System.out.println("Nhap ID Media muon remove!!!");
			int a112 = sc.nextInt();
			cart.removeMedia(cart.getMediaById(a112));
			break;
		}
		if(a31==4){
			System.out.println("nhap Title can tim: ");
			String s1 = sc.next();
			store.searchTitle(s1);
			System.out.println("Nhap ID Media muon play!!!");
			int a112 = sc.nextInt();
			if( store.getMediaById(a112) instanceof Book){
				System.out.println("Book khong the play");
				break;
			}else{
				System.out.println("Playing.....");
				break;
			}
		}
		if(a31==5){
			cart.placeOrdered();
			break;
		}
		}
	}
	
	}
	sc.close();
    
  }

  public static void showMenu(){
    System.out.println("AIMS: ");
    System.out.println("--------------------------------");
    System.out.println("1. View store");
    System.out.println("2. Update store");
	System.out.println("3. See current cart");
	System.out.println("0. Exit");
	System.out.println("--------------------------------");
	System.out.print("Please choose a number: 0-1-2-3: ");
  }

    public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media details");
		System.out.println("2. Add a media to cart");
    	System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("5. Back");
		System.out.println("--------------------------------");
		System.out.print("Please choose a number: 1-2-3-4-5: ");
}

public static void mediaDetailsMenu() {
  System.out.println("Options: ");
  System.out.println("--------------------------------");
  System.out.println("1. Add to cart");
  System.out.println("2. Play");
  System.out.println("0. Back");
  System.out.println("--------------------------------");
  System.out.print("Please choose a number: 0-1-2: ");
  }

  public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.print("Please choose a number: 0-1-2-3-4-5: ");
  }





}