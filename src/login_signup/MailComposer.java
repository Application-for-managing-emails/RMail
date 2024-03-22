package login_signup;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import login_signup.MailComposer;

public class MailComposer extends JFrame {
    private JTextField recipientField;
    private JTextField subjectField;
    private JTextArea messageArea;

    public MailComposer() {
        setTitle("Compose Mail");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        JLabel recipientLabel = new JLabel("Recipient:");
        JLabel subjectLabel = new JLabel("Subject:");
        JLabel messageLabel = new JLabel("Message:");

        recipientField = new JTextField();
        subjectField = new JTextField();
        messageArea = new JTextArea();

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

    private void sendMail() {
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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MailComposer().setVisible(true);
            }
        });
    }
}
