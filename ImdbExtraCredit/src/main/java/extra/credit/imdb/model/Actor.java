package extra.credit.imdb.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Actor extends Person {
	
	@ManyToMany(mappedBy = "actors")
	private Set<Movie> movies = new HashSet<Movie>();

	public Set<Movie> getMovies() {
		return movies;
	}
		
	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}
	
//	public Characters getCharacter() {
//		return character;
//	}
//
//	public void setCharacter(Characters character1) {
//		this.character = character1;
//	}
//
//	@OneToOne(cascade=CascadeType.ALL)
//	private Characters character;

}
