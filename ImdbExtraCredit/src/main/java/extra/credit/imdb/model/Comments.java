package extra.credit.imdb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Comments {

	@Id
	@GeneratedValue
	private int id;
	
	private String comment;
	@ManyToOne
	@JoinColumn(name="movieId")
	private Movie movie;
}
