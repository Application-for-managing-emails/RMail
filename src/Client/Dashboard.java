package Client;
import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame{
    public Dashboard(){
        setTitle("Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        DefaultListModel<String> emailListModel = new DefaultListModel<>();
        JList<String> emailList = new JList<>(emailListModel);
        add(new JScrollPane(emailList), BorderLayout.WEST);

        JTextArea emailContent = new JTextArea();
        emailContent.setEditable(false);
        add(new JScrollPane(emailContent), BorderLayout.CENTER);

        JButton composeButton = new JButton("Compose");
        add(composeButton, BorderLayout.SOUTH);
    }

//    public static void main(String[] args) {
//        Dashboard dashboard = new Dashboard();
//        dashboard.setVisible(true);
//
//        //dashboard.pack();
//    }
}
