package extra.credit.imdb.control;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import extra.credit.imdb.model.Actor;
import extra.credit.imdb.model.Genre;
import extra.credit.imdb.model.Movie;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Application {
	
	
	private static EntityManagerFactory emf;

	static {
		try {
			emf = Persistence.createEntityManagerFactory("extra.credit.imdb");
		} catch (Throwable ex) {
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static void main(String[] args) {

		emf.close();
	}

}
