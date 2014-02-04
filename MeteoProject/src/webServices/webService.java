package webServices;

import java.util.Scanner;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;

public class webService {
	private ConnectionFactory connectionFactory;
	private Destination destination;
	private Destination origine;
	
	private String reverse(String stg)
	{
		String res = "";
		for(int i = stg.length() - 1; i >=0; i--)
		{
			res += stg.charAt(i);
		}
		
		return res;
	}
	private void connect() throws Exception {
		//Initialize les attributs connectionFactory et destination.
		// Création d'un contexte JNDI
		Context jndiContext = new InitialContext();
		// Lookup de la fabrique de connexion et de la destination
		connectionFactory = (ConnectionFactory) jndiContext.lookup("connectionFactory");
		origine = (Destination) jndiContext.lookup("queueRequest");
		destination = (Destination) jndiContext.lookup("queueRespond");
		
	}
	private void waitMessages() throws Exception
	{
		boolean ok = true;
		// Créer une connexion au système de messagerie
		// Création d'une Connexion et d'une Session
		Connection connection = connectionFactory.createConnection();
		connection.start();
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		//Et affiche les messages au fur et à mesure de leur arrivée dans la queue
		// Création d'un MessageConsumer
		MessageConsumer consumer = session.createConsumer(origine);
		// Réception des messages jusqu’à obtention d’un message non texte
		while (ok) {
			Message m = consumer.receive();
			
			if( traiterMessage(m) == 1) // traiterMessage( m : TextMessage ) : void
			{
				System.out.println("fin de session Service");
				connection.close();
				ok = false;
			}
		}
	}
	private void sendMessages() throws Exception {
		// Créer une connexion au système de messagerie
		// Création d'une Connexion et d'une Session:
		String inputText = "";
		Scanner sc = new Scanner(System.in);
		
		Connection connection = connectionFactory.createConnection();
		connection.start();
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		
		// Emet des messages au fur et à mesure que l’utilisateur les saisit
		// Création d'un MessageProducer et d'un message de type Text
		while(inputText.compareTo("quit") != 0)
		{
			System.out.println("Entrez un message ");
			inputText = sc.nextLine();
			if(inputText != "")
			{
				MessageProducer producer = session.createProducer(origine);
				//producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
				TextMessage message = session.createTextMessage(inputText);
				// Envoi d'un message
				producer.send(message);
			}
		}
		System.out.println("Fin de session Producer");
		connection.close();// Envoi d'un message
		sc.close();
		
	}
	private int traiterMessage(Message message) throws Exception
	{
		try {
				if (message instanceof TextMessage) 
				{
					String msgText = ((TextMessage) message).getText();
					if(msgText.compareTo("quit") == 0)
						return 1;
					else if(msgText.compareTo("") != 0)
					{
						System.out.println("Service : message reçu : " + msgText);
						//msgText = reverse(msgText);
						//sendMessages(msgText);
					}
					else
						return 1;
				}
				else 
					return 1;
			} catch (JMSException jmse) {
			jmse.printStackTrace();	
			}
		return 0;
	}
	public static void main(String[] args) {
		try {
		webService service = new webService();
		service.connect();
		service.sendMessages();
		} catch (Throwable t) {
			t.printStackTrace() ;
		}
	}
}
