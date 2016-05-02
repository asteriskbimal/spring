package extra.credit.imdb.model;

import javax.persistence.Entity;


@Entity
public class Actor extends Person {

	private Character character;
	
	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}


}
