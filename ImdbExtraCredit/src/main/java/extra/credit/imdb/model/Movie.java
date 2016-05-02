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
	private String comment;
	@Lob
	private byte[] cover;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Movie_Actor",
	joinColumns=@JoinColumn(name="movieId"),
	inverseJoinColumns=@JoinColumn(name="actorId"))
	List<Actor> actors = new ArrayList<Actor>();

	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Movie_Director",
	joinColumns=@JoinColumn(name="movieId"),
	inverseJoinColumns=@JoinColumn(name="directorId"))
	List<Director> directors = new ArrayList<Director>();
	
	@OneToOne(cascade=CascadeType.ALL)
	List<Character> characters = new ArrayList<Character>();

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actor) {
		this.actors = actor;
	}

	public int getId() {
		return movieId;
	}

	public void setId(int id) {
		this.movieId = id;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public byte[] getCover() {
		return cover;
	}

	public void setCover(byte[] fileData) {
		this.cover = fileData;
	}

	public Date getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Date releaseYear) {
		this.releaseYear = releaseYear;
	}

}
