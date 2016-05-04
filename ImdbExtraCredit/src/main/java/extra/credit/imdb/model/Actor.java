package extra.credit.imdb.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Actor extends Person {
	
	@ManyToMany(mappedBy = "actors")
	private List<Movie> movies = new ArrayList<Movie>();

	public List<Movie> getMovies() {
		return movies;
	}
		
	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

}
