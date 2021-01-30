package DAO;

import DB.DBConnection;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.*;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.servlet.RequestDispatcher;

public class MonthlyEmail
{ 
    public static void send(String to, String sub, 
                         String msg, final String user,final String pass, String cont, String content1)
    { 
        //create an instance of Properties Class   
        Properties props = new Properties();
        /*  Specifies the IP address of your default mail server
     	      for e.g if you are using gmail server as an email sever
            you will pass smtp.gmail.com as value of mail.smtp host. 
            As shown here in the code. 
            Change accordingly, if your email id is not a gmail id
        */
        props.put("mail.smtp.host", "smtp.gmail.com");
        // below mentioned mail.smtp.port is optional 
        props.put("mail.smtp.port", "587");		
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
     
        /* Pass Properties object(props) and Authenticator object   
           for authentication to Session instance 
        */

        Session session = Session.getInstance(props,new javax.mail.Authenticator()
        {
            protected PasswordAuthentication getPasswordAuthentication()
            {
  	 	         return new PasswordAuthentication(user,pass); 
            }
        });

        try {
 
     	      /*  Create an instance of MimeMessage, 
     	          it accept MIME types and headers 
     	      */
               Connection con=DBConnection.getConnection();
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setSubject(sub);
          
                 message.setContent(
              "\n"+content1+"\n" ,
             "text/html");
                 
           

            /* Transport class is used to deliver the message to the recipients */
           
            Transport.send(message);     
            
        }
        catch(Exception e) {
    	     e.printStackTrace();
        }
    }  
}