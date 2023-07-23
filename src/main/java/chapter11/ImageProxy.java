package chapter11;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon {
    volatile ImageIcon imageIcon;
    final URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
            return;
        }
        g.drawString("앨범 커버를 불러오는 중입니다. 잠시만 기다려 주세요.", x + 300, y + 190);
        if (retrieving) return;
        retrieving = true;
        new Thread(() -> {
            setImageIcon(new ImageIcon(imageURL, "Album Cover"));
            c.repaint();
        });
        retrievalThread.start();
    }

    @Override
    public int getIconWidth() {
        if (imageIcon == null) return 800;
        return imageIcon.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        if (imageIcon == null) return 600;
        return imageIcon.getIconHeight();
    }

    synchronized void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }
}
