import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketDrive {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(2014);
		System.out.println("Server: Wait for connections from clients...");
		
		Socket s = ss.accept();
		System.out.println("Server: The client has been connected with the " + s.getInetAddress() + " port.");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		PrintWriter out = new PrintWriter(s.getOutputStream(), true);
		
		String reading = in.readLine();
		System.out.println("Server(Reception): " + reading);
		
		out.println(reading);
		System.out.println("Server(Transmission): " + reading);
		
		out.close();
		in.close();
		s.close();
		ss.close();
	}

}
