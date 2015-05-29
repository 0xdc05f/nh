package Server;
import java.io.*;
import java.net.*;

public class UdpDayTimeClientTest {
	public void start() throws IOException, UnknownHostException {
		DatagramSocket datagramSocket = new DatagramSocket();
		
		byte[] msg = new byte[100];
		
		String data = "jh";
		byte[]byteARR = data.getBytes("UTF-8");
		
		DatagramPacket outPacket = new DatagramPacket (byteARR,
				byteARR.length,
				new InetSocketAddress("220.149.124.244", 3000));
		
		DatagramPacket inPacket = new DatagramPacket(msg, msg.length);
		
		datagramSocket.send(outPacket);
		
		datagramSocket.receive(inPacket);
		
		System.out.println(new String(inPacket.getData()));
		
		datagramSocket.close();
	} //start()
	
	public static void main(String args[]) {
		try {
			new UdpDayTimeClientTest().start();
		} catch(Exception e) {
			e.printStackTrace();
		}
	} //main
}
