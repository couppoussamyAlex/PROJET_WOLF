import java.net.*;
import java.io.*;

public class TestClientTCP {
  final static int port = 9632;

  public static void main(String[] args) {

    Socket socket;
    DataInputStream userInput;
    PrintStream theOutputStream;
    String modifiedSentence;
    String sentence;
    try {
      InetAddress serveur = InetAddress.getByName("10.11.65.12");
      
      socket = new Socket(serveur, port);
     
      while(true){
    	  DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());
    	  BufferedReader inFromUser = new BufferedReader( new InputStreamReader(System.in));          
          BufferedReader inFromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
          sentence = inFromUser.readLine();
          outToServer.writeBytes(sentence + '\n');
          modifiedSentence = inFromServer.readLine();
          System.out.println("FROM SERVER: " + modifiedSentence); 
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}