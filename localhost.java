import java.net.InetAddress;
import java.net.UnknownHostException;

public class localhost{
    public static void main(String[] args){
        try{
            InetAddress ia = InetAddress.getLocalHost();
            System.out.println(ia);
        }
        catch (UnknownHostException e) {
            System.out.println("Unable to resolve given domain name");
        }
    }
}