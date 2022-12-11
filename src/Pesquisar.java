import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pesquisar extends JDialog {

    public Pesquisar(Frame owner, String title){
        super(owner, title);

        FlowLayout flow = new FlowLayout();
        getContentPane().setLayout(flow);

        JLabel cpf = new JLabel("cpf: ");
        JTextField txtCpf = new JTextField(20);
        JButton btnPesquisar = new JButton("Pesquisar");
        btnPesquisar.setPreferredSize(new Dimension(250, 40));

        getContentPane().add(cpf);
        getContentPane().add(txtCpf);

        /*btnPesquisar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                boolean naoExiste = true;
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).getPaciente().getCpf().equals(cpf)) {
                        System.out.println(lista.get(i));
                        naoExiste = false;
                    }
                }
                if(naoExiste){
                    System.out.println("consulta nao encontrada");
                }
            }
        });*/

        setBounds(150,200, 250,200);
        setVisible(true);
    }
}
