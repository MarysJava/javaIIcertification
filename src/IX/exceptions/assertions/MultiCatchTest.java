package IX.exceptions.assertions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;

public class MultiCatchTest {
	public static void fooThrower() throws FileNotFoundException {
		throw new FileNotFoundException();
	}

	public static void barThrower() throws SQLException {
		throw new SQLException();
	}

	public static void main(String[] args) {
		try {
			fooThrower();
			barThrower();
		} catch (FileNotFoundException | SQLException multie) {
			System.out.println(multie); //Sempre printa a exceção que foi lançada primeiro
			//Como estourou exeção, o segundo método não executou e não tem nada em getSupressed()
			for (Throwable suppressed : multie.getSuppressed()) {
				System.out.println(suppressed);
			}
		} catch(IOException e) {
			e = new IOException();
		}
	}
}
