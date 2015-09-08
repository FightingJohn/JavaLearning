import java.net.*;

import java.io.*;

class Ping {

		public static void main(String[] args)
		{ 
				System.out.println("请输入ping主机名称或地址：\n");
		
				try {
					String host = keyreadline();
					long t1=System.currentTimeMillis();
					InetAddress ip = InetAddress.getByName(host);
					
					Socket socket= new Socket(ip, 80);
				    long t2 =System.currentTimeMillis();
    		   
					if(socket!=null)
					{
						System.out.println("\nReply from " + ip.getHostAddress() + " time<=" + (t2-t1) + "ms"); 
						System.out.println();
					}
					else { 
						System.out.println("Request timed out.");
					} 
				}
				catch (IOException e){ 
					System.out.println("Request timed out."); 
				}
		}

	   private static String keyreadline() {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = null;
	
			try {
	
				str = br.readLine();
	
			} catch (IOException e) {
	
				e.printStackTrace();
			}

			return str;

	}

}