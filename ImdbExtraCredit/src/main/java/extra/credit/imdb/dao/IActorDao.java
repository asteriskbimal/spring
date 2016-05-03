package extra.credit.imdb.dao;

import java.util.List;

import extra.credit.imdb.model.Actor;

public interface IActorDao {

	public Actor saveMovie(Actor actor);

	public void updateMovie(Actor actor, int id);

	public Actor getActor(int id);

	public void deleteActor(int id);

	public List<Actor> getAllActors();
}
