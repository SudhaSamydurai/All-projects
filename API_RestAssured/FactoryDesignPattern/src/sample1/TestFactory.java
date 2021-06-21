package sample1;

public class TestFactory {

	public static void main(String[] args) {

		Computer pc = ComputerFactory.getComputer("pc", "2GB", "500GB", "2.4GHz");
		Computer server = ComputerFactory.getComputer("server", "16GB", "1TB", "2.9GHz");

		System.out.println("PC config: " + pc);
		System.out.println("Server config: " + server);

	}
}
