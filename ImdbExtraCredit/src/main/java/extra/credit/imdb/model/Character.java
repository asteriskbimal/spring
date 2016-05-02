package extra.credit.imdb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Character {

	@Id
	@GeneratedValue
	private int characterId;
	@Column(name="character")
	private String name;
	@OneToOne
	@JoinColumn(name = "actorId")
	private Actor actor;
	@OneToOne
	@JoinColumn(name = "movieId")
	private Movie movie;
	

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public int getId() {
		return characterId;
	}

	public void setId(int id) {
		this.characterId = id;
	}


	public Character(String name) {
		this.name = name;
	}

	public Character() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
