package hust.soict.dsai.aims.screen;

import javax.swing.*;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store.Store;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddItemToStoreScreen extends JFrame {

    protected JTextField titleField;
    protected JTextField categoryField;
    protected JTextField costField;
    protected JButton addButton;
    protected Store store;
    private Runnable callback;

    public AddItemToStoreScreen(Store store, Runnable callback) {
        this.callback= callback;
        this.store = store;
        setTitle("Add Item to Store");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel formPanel = createFormPanel();
        JPanel buttonPanel = createButtonPanel();

        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        setVisible(false );
    }

    protected JPanel createFormPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel titleLabel = new JLabel("Title:");
        JLabel categoryLabel = new JLabel("Category:");
        JLabel costLabel = new JLabel("Cost:");

        titleField = new JTextField();
        categoryField = new JTextField();
        costField = new JTextField();

        panel.add(titleLabel);
        panel.add(titleField);
        panel.add(categoryLabel);
        panel.add(categoryField);
        panel.add(costLabel);
        panel.add(costField);
        

        return panel;
    }

    protected JPanel createButtonPanel() {
        JPanel panel = new JPanel();
        addButton = new JButton("Add Item");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = titleField.getText();
                String category = categoryField.getText();
                String costText = costField.getText();
                float cost = Float.parseFloat(costText);
                String currentTitle = getTitle();
                Media media = null;

                if (currentTitle.equals("Add Book to Store")) {
                    media = new Book(title, category, cost);
                } else if (currentTitle.equals("Add CD to Store")) {
                    media = new CompactDisc(title, category, cost);
                } else if (currentTitle.equals("Add DVD to Store")) {
                    media = new DigitalVideoDisc(title, category, cost);
                }

                // Nếu media hợp lệ, thêm vào store và đóng cửa sổ
                if (media != null) {
                    store.addMedia(media);
                    if (callback != null) callback.run(); 
                    dispose();
                    
                    
                }

                
            }
        });
        panel.add(addButton);
        return panel;
    }

    
}
