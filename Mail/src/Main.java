import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import javax.activation.*;


import javax.mail.Session;

 class SendEmailTLS {

     /**
      Outgoing Mail (SMTP) Server
      requires TLS or SSL: smtp.gmail.com (use authentication)
      Use Authentication: Yes
      Port for TLS/STARTTLS: 587
      */
     public static void main(String[] args) {
         final String fromEmail = "vaktitanzim@gmail.com"; //requires valid gmail id
         final String password = "Asd12345."; // correct password for gmail id
         final String toEmail = "ahmettkuris@gmail.com"; // can be any email id

         System.out.println("TLSEmail Start");
         Properties props = new Properties();
         props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
         props.put("mail.smtp.port", "587"); //TLS Port
         props.put("mail.smtp.auth", "true"); //enable authentication
         props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS

         //create Authenticator object to pass in Session.getInstance argument
         Authenticator auth = new Authenticator() {
             //override the getPasswordAuthentication method
             protected PasswordAuthentication getPasswordAuthentication() {
                 return new PasswordAuthentication(fromEmail, password);
             }
         };
         Session session = Session.getInstance(props, auth);

         EmailUtil.sendEmail(session, toEmail,"TLSEmail Testing Subject", "TLSEmail Testing Body");

     }
//        final String username = "javasiwng98@gmail.com";
//        final String password = "javamail";
//
//        Properties prop = new Properties();
//        prop.put("mail.smtp.host", "smtp.gmail.com");
//        prop.put("mail.smtp.port", "587");
//        prop.put("mail.smtp.auth", "true");
//        prop.put("mail.smtp.starttls.enable", "true"); //TLS
//
//        Session session = Session.getInstance(prop,
//                new javax.mail.Authenticator() {
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication(username, password);
//                    }
//                });
//
//        try {
//
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress("from@gmail.com"));
//            message.setRecipients(
//                    Message.RecipientType.TO,
//                    InternetAddress.parse("to_username_a@gmail.com, to_username_b@yahoo.com")
//            );
//            message.setSubject("Testing Gmail TLS");
//            message.setText("Dear Mail Crawler,"
//                    + "\n\n Please do not spam my email!");
//
//            Transport.send(message);
//
//            System.out.println("Done");
//
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }


}