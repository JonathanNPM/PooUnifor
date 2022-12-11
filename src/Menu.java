import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {

    Menu() {
        setTitle("Menu");
        setSize(400, 300);

        JMenuBar menuBar = new JMenuBar();

        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("Arquivo");
        menuBar.add(fileMenu);

        JMenuItem exitAction = new JMenuItem("Sair");

        fileMenu.add(exitAction);

        exitAction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(400, 500);
        setLayout(null);
        setVisible(true);
    }

}
