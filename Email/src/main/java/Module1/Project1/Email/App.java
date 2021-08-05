package Module1.Project1.Email;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class App {
    public static void main( String[] args ) throws IOException{
       System.out.println("Emailing has started........");
       
       String msg="Hi, this Email is Auto-generated. \n The Email project is successful";
       String sbjt="Email Project Confirmation";
       String from="oneplusdisp@gmail.com";
       
       List<String> to= new ArrayList();
       
       File mailids=new File("C:\\Users\\mfahm_hdcxpui\\Desktop\\email.txt");
       BufferedReader br= new BufferedReader(new FileReader(mailids));
       
       String mail;
       while((mail = br.readLine())!= null) {
    	   to.add(mail);
       }
       
       sendEmail(msg,sbjt,to,from);
       
    }
    
    private static void sendEmail(String message, String subject, List<String> to, String from) {
    	
    	
    	
    	//get sys properties
    	Properties prop= new Properties();
    	System.out.println("Props: "+prop);
    	
    	//set imp info to prop object
    	
    	//host set
    	prop.put("mail.smtp.host", "smtp.gmail.com");
    	prop.put("mail.smtp.port", "465");
    	prop.put("mail.smtp.ssl.enable", "true");
    	prop.put("mail.smtp.auth", "true");
    	
    	//step 1: get session object
    	Session session=Session.getInstance(prop,new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				
				return new PasswordAuthentication("oneplusdisp@gmail.com","**********");
			}
    		 
    		
		});
    	
    	//Step2: the message
    	
    	session.setDebug(true);
    	MimeMessage mmsg= new MimeMessage(session);
    	
    	//from email
    	try { mmsg.setFrom(from);
    	// recepient
    	for( String mail : to){
    		mmsg.addRecipient(Message.RecipientType.TO, new InternetAddress(mail));
    	}
    	
    	
    	// add subject
    	mmsg.setSubject(subject);
    	
    	//add message
    	mmsg.setText(message);
    	
    	Transport.send(mmsg);
    	}catch(Exception e) {e.printStackTrace();};
    	
    	
    	
    	System.out.println("Mail sent successfully");
    }
}
