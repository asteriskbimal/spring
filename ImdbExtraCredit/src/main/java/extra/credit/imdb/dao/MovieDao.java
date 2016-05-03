package extra.credit.imdb.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import extra.credit.imdb.model.Movie;

public class MovieDao implements IMovieDao{

	private static EntityManagerFactory emf;

	static {
		try {
			emf = Persistence.createEntityManagerFactory("extra.credit.imdb");
		} catch (Throwable ex) {
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
	}

	EntityManager em = emf.createEntityManager();
	
	public Movie saveMovie(Movie movie) {

		Movie attached = em.find(Movie.class, movie.getMovieId());
		if (attached != null) em.persist(movie);	
		return attached;
	}

	public void updateMovie(Movie movie,int id) {
        movie.setMovieId(id);
		em.merge(movie);
		

	}

	public Movie getMovie(int id) {
		Movie movie = em.find(Movie.class, id);
		return movie;

	}

	public void deleteMovie(int id) {

		Movie movie = em.find(Movie.class, id);
		em.getTransaction().begin();
		em.remove(movie);
		em.getTransaction().commit();
		emf.close();

	}

	public List<Movie> getAllMovies() {

		List<Movie> movies = em.createQuery("from Movie").getResultList();
		return movies;

	}

}
