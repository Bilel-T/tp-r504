import java.io.*;
import java.net.*;

public class ClientTCP3
{
	public static void main ( String[] args )
	{
		try{
			
				Socket socket = new Socket ( "localhost", 2016 );
				DataOutputStream dOut = new DataOutputStream( socket.getOutputStream() );
				dOut.writeUTF( args[0] );
				DataInputStream dIn2 = new DataInputStream(socket.getInputStream());
				System.out.println("Message inversé: " + dIn2.readUTF());
				socket.close();
			
		}
		catch ( Exception ex ) 
		{
		System.out.println( "erreur !" );
		ex.printStackTrace();
		}
		  }	
	}

