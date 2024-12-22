package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.store.Store.Store;

public class AddBookToStoreScreen extends AddItemToStoreScreen{
    public AddBookToStoreScreen(Store store, Runnable callback) {
        super(store, callback);  // Truyền callback xuống lớp cha
        setTitle("Add Book to Store");
        setVisible(true);
    }
}
