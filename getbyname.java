import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class getbyname{
    public static void main(String[] args){
        try{
            InetAddress ia = InetAddress.getByName("www.fohss.tu.edu.");
            System.out.println(ia);

            if (ia.isReachable(5000)) {
                System.out.println("Host is reachable");
            } else {
                System.out.println("Host is not reachable");
            }
        }
        catch (UnknownHostException e) {
            System.out.println("Unable to resolve host");
        }
        catch (IOException e) {
            System.out.println("Unreachabale host");
        }
    }
}