import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ipcheck{
    public static void main(String[] args){
        try{
            InetAddress iad = InetAddress.getLocalHost();
            byte[] ipa = iad.getAddress();

            if (ipa.length == 4){
                System.out.println("Host has IPv4 address");
            }
            else if (ipa.length == 16){
                System.out.println("Host has IPv6 address");
            }
            else{
                System.out.println("invalid IP address");
            }
        }
        catch (UnknownHostException ex){
            System.out.print("Unable to resolve");
        }
    }
}