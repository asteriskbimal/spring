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

//	private static void printMoviesReport() {
//		
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction tx = em.getTransaction();
//		try {
//			tx.begin();
//			List<Movie> movies= em.createQuery("from Movie").getResultList();
//			for(Movie m:movies){
//				System.out.println(m.toString());
//			}
//			
//		} catch (Throwable e) {
//			if ((tx != null) && (tx.isActive())) tx.rollback();
//		} finally {
//			if ((em != null) && (em.isOpen())) em.close();
//		}
//
//	}
//
//	private static void addMovies() {
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction tx = em.getTransaction();
//		try {
//			tx.begin();
//			
//
//		// TODO your code
//			Movie movie = new Movie();
//			Actor a1=new Actor("kamaal","Hero",5);
//			Actor a2=new Actor("Bimaaal","Hero",6);
//			em.persist(a1);
//			em.persist(a2);
//			List<Actor> actors=new ArrayList<Actor>();
//			actors.add(a1);
//			actors.add(a2);
//			movie.setCategory(Genre.action);
//			movie.setComment("Comm");
//			movie.setName("Kaal");
//			Path p = FileSystems.getDefault().getPath("C:\\Users\\bimal\\Downloads\\exercise02-1\\exercise02-1\\src\\main\\resources\\images", "img.jpg");
//			byte[] fileData = Files.readAllBytes(p);
//			System.out.println(fileData.length);
//			movie.setCover(fileData);
//			movie.setRating(5);
//			movie.setActors(actors);
//			em.persist(movie);
//
//			tx.commit();
//		} catch (Throwable e) {
//			if ((tx != null) && (tx.isActive())) tx.rollback();
//		} finally {
//			if ((em != null) && (em.isOpen())) em.close();
//		}
//	}

}
