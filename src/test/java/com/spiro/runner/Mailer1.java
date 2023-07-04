//package com.spiro.runner;
//
//import org.apache.commons.mail.DefaultAuthenticator;
//import org.apache.commons.mail.Email;
//import org.apache.commons.mail.EmailException;
//import org.apache.commons.mail.SimpleEmail;
//
//import static org.bouncycastle.cms.RecipientId.password;
//public class Mailer1 {
//    public static void main(String[] args) throws EmailException {
//
//        Email email = new SimpleEmail();
//        email.setHostName("smtp.googlemail.com");
//        email.setSmtpPort(465);
//        email.setAuthenticator(new DefaultAuthenticator("demotestdemotest12345@gmail.com\", "password"));
//        email.setSSLOnConnect(true);
//        email.setFrom("user@gmail.com");
//        email.setSubject("TestMail");
//        email.setMsg("This is a test mail ... :-)");
//        email.addTo("foo@bar.com");
//        email.send();
//
//
//    }
//
//}
