package com.Training4.tools;

import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;

public class ReadEmail {

	public static String verifyEmail(String user, String pass) {
		
		//System.out.println("in verifyEmail " + user + " " + pass);
		//boolean found = false;
		//String linie=  " - ";
		String body=null;
		Properties props = new Properties();
		props.setProperty("mail.store.protocol", "imaps");
		
		try {
			Session session = Session.getInstance(props, null);
			Store store = session.getStore();
			props.put("mail.imap.port", "993");
			// store.connect("imap.gmail.com", "raluca.moroianu@evozon.com",
			// "");
			store.connect("mail.evozon.com", user, pass);
			Folder inbox = store.getFolder("INBOX");
			inbox.open(Folder.READ_ONLY);

			// Message[] messages = inbox.getMessages();//added
			
			Message message = inbox.getMessage(inbox.getMessageCount());
			body = message.getContent().toString();
			//System.out.println(body.toString());

		} catch (Exception mex) {
			mex.printStackTrace();
		}

		return body;
	}
}
