package Client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MailComposer extends JFrame {
    private JTextField recipientField;
    private JTextField subjectField;
    private JTextArea messageArea;

    private String senderEmaiL;

    public MailComposer(String senderEmail) {
        setTitle("Compose Mail");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        senderEmaiL = senderEmail;

        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(4, 2));
        JLabel senderLabel = new JLabel("Sender : "+senderEmaiL);
        JLabel senderEmailLabel = new JLabel();
        JLabel recipientLabel = new JLabel("Recipient:");
        JLabel subjectLabel = new JLabel("Subject:");
        JLabel messageLabel = new JLabel("Message:");

        recipientField = new JTextField();
        subjectField = new JTextField();
        messageArea = new JTextArea();


        inputPanel.add(senderLabel);
        inputPanel.add(senderEmailLabel);
        inputPanel.add(recipientLabel);
        inputPanel.add(recipientField);
        inputPanel.add(subjectLabel);
        inputPanel.add(subjectField);
        inputPanel.add(messageLabel);
        inputPanel.add(new JScrollPane(messageArea));

        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMail();
            }
        });

        panel.add(inputPanel, BorderLayout.CENTER);
        panel.add(sendButton, BorderLayout.SOUTH);

        add(panel);
    }

    private void sendMail() throws NullPointerException {
        String recipient = recipientField.getText();
        String subject = subjectField.getText();
        String message = messageArea.getText();

        // Implement sending email functionality here
        // You can use JavaMail API or any other email library to send emails
        // Example:
        // EmailSender.sendEmail(recipient, subject, message);

        // For demonstration purposes, print the composed email
        System.out.println("Recipient: " + recipient);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);

        // Optionally, you can close the composer window after sending
        // dispose();
    }

//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            private String senderEmail = "Shavidika.ekanayake@gmail.com";
//            @Override
//            public void run() {
//                new MailComposer(senderEmail).setVisible(true);
//            }
//        });
//    }
}
