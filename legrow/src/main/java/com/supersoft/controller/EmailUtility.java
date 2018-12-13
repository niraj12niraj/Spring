package com.supersoft.controller;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

/**
 * A utility class for sending e-mail messages
 * @author www.codejava.net
 *
 */
public class EmailUtility {
    public static void sendEmail(String host, String port,
                                 final String userName, final String password, String toAddress,
                                 String subject, String message) throws MessagingException {

        // sets SMTP server properties
        try
        {
            Properties properties = new Properties();


            properties.put("mail.smtp.host", host);
            properties.put("mail.smtp.port", port);
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "false");/*false*/
            properties.put("mail.transport.protocol","smtp");
            /*properties.put("mail.smtp.starpublic ttls.enable", "false");*/


            // creates a new session with an authenticator
            Authenticator auth = new Authenticator() {
                public PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(userName, password);
                }
            };

            Session session = Session.getInstance(properties, auth);

            // creates a new e-mail message


            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(userName));
            InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
            msg.setRecipients(Message.RecipientType.TO, toAddresses);
            msg.setSubject(subject);

            msg.setSentDate(new Date());
            msg.setContent(message,"text/html");
            System.out.println("calling transport send method*****");
            // sends the e-mail

            Transport.send(msg);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }


    }
}