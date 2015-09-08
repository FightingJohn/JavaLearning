
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client implements Runnable {

	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			
	     DatagramSocket dsDatagramSocket = new DatagramSocket();
         
         BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
         
         String dataString;
         
         while( (dataString  = bReader.readLine())!=null){
        	 
        	  if (dataString.equals("886")) {
        		  System.out.println("UdpClient.main():exit");
				  break;
			   }
        	  
        	  DatagramPacket dpDatagramPacket = new DatagramPacket(dataString.getBytes(), dataString.getBytes().length, 
              InetAddress.getByName("zhao-PC"), 10010);
             dsDatagramSocket.send(dpDatagramPacket);
              
         }

         dsDatagramSocket.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		    

	}

}
