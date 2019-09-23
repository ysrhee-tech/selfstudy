import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDrive {

	public static void main(String[] args) throws UnknownHostException, IOException {
		String str = "TCP Programming";
		
		Socket s = new Socket("127.0.0.1", 2014);
		System.out.println("localhost address and try to connect to port 2014 ...");
		
		System.out.println("Client(Transmission): " + s);
		PrintWriter out = new PrintWriter(s.getOutputStream(), true);
		out.println(str);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String reading = in.readLine();
		System.out.println("Client(Reception): " + reading);
		
		in.close();
		out.close();
		s.close();
	}

}