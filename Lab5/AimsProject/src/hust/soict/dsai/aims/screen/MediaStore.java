package hust.soict.dsai.aims.screen;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import hust.soict.dsai.aims.cart.Cart.Cart;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;

public class MediaStore extends JPanel{
    private JButton btnAddToCart, btnPlay;
    private Media media;
    private Cart cart;
    public MediaStore(Media media, Cart cart){

        ButtonListener btnListener =  new ButtonListener();
        this.media=media;
        this.cart=cart;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel  title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost = new JLabel(""+media.getCost()+" $");
        cost.setAlignmentX(CENTER_ALIGNMENT);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));

        btnAddToCart = new JButton("Add to cart");
        container.add(btnAddToCart);
        btnAddToCart.addActionListener(btnListener);

        if(media instanceof Playable){
            btnPlay = new JButton("Play");
            container.add(btnPlay);
            btnPlay.addActionListener(btnListener);
        }

        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));

    }

    private class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String button = e.getActionCommand();
            if(button.equals("Add to cart")){
                cart.addMedia(media);
            }
            if(button.equals("Play")){
                JDialog dialog = new JDialog();
                dialog.setTitle("Playing ");
                dialog.setSize(500,100);
                dialog.setLayout(new FlowLayout());

                JLabel label = new JLabel("Playing " + media.toString());
                dialog.add(label);

                dialog.setLocationRelativeTo(null);

                dialog.setVisible(true);

            }
        }
    }
}
