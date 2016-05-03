package extra.credit.imdb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Movie {

	@Id
	@GeneratedValue
	private int movieId;

	@Enumerated(EnumType.STRING)
	private Genre genre;
	private int rating;
	private Date releaseYear;
	private String name;
	
	@OneToMany
	private List<Comments> comments=new ArrayList<Comments>();
	
	@Lob
	private byte[] cover;

	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Movie_Actor",
	joinColumns=@JoinColumn(name="movieId"),
	inverseJoinColumns=@JoinColumn(name="id"))
	List<Actor> actors = new ArrayList<Actor>();

	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Movie_Director",
	joinColumns=@JoinColumn(name="movieId"),
	inverseJoinColumns=@JoinColumn(name="id"))
	List<Director> directors = new ArrayList<Director>();
	
	@OneToMany(mappedBy="movie")
	List<Characters> characters = new ArrayList<Characters>();

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Date getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Date releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Comments> getComments() {
		return comments;
	}

	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}

	public byte[] getCover() {
		return cover;
	}

	public void setCover(byte[] cover) {
		this.cover = cover;
	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}

	public List<Director> getDirectors() {
		return directors;
	}

	public void setDirectors(List<Director> directors) {
		this.directors = directors;
	}

	public List<Characters> getCharacters() {
		return characters;
	}

	public void setCharacters(List<Characters> characters) {
		this.characters = characters;
	}

	

}
