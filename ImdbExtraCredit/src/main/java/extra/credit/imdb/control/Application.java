package extra.credit.imdb.control;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


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
