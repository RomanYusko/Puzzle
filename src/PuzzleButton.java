import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PuzzleButton extends JButton {

    private boolean isLastButton;


    public PuzzleButton() {
        initUI();
    }

    public PuzzleButton(Image a) {
        super(new ImageIcon(a));
        initUI();
    }


    public boolean isLastButton() {
        return isLastButton;
    }

    public void setLastButton(boolean lastButton) {
        isLastButton = lastButton;
    }

    private void initUI() {
        isLastButton = false;
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBorder(BorderFactory.createLineBorder(Color.CYAN));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBorder(BorderFactory.createLineBorder(Color.BLUE));
            }
        });


    }
}
