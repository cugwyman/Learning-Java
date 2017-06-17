package drivers;

public class ConnectTest {
	public static void main(String[] args) {
			ConnectDatabase help = new ConnectDatabase();
			if(help.TestConn())
				System.out.println("Connect unsuccessful£¡");
	}
}
