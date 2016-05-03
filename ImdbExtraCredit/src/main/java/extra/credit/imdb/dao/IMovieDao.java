package extra.credit.imdb.dao;

import java.util.List;

import extra.credit.imdb.model.Movie;

public interface IMovieDao {

	public Movie saveMovie(Movie movie);

	public void updateMovie(Movie movie, int id);

	public Movie getMovie(int id);

	public void deleteMovie(int id);

	public List<Movie> getAllMovies();
}
