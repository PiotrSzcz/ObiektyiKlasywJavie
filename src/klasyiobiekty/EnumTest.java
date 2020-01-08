package klasyiobiekty;

import java.util.*;

public class EnumTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Podaj Swój rozmiar: (SMALL, MEDIUM, LARGE)");
		String input = in.next().toUpperCase();
		Size size = Enum.valueOf(Size.class, input);
		System.out.println("Sktót = " + size);
	}

}

enum Size{
	SMALL("S"),MEDIUM("M"),LARGE("L");
	
	private String skrot;
	private Size(String sktot) {this.skrot = skrot;}
	public String getSkrot() {
		return skrot;
	}
}