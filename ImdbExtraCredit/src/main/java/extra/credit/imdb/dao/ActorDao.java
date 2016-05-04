package extra.credit.imdb.dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import extra.credit.imdb.model.Actor;


public class ActorDao implements  IActorDao{
	
	private static EntityManagerFactory emf;

	static {
		try {
			emf = Persistence.createEntityManagerFactory("extra.credit.imdb");
		} catch (Throwable ex) {
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
	}

	@Override
	public Actor saveActor(Actor actor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateActor(Actor actor, int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Actor getActor(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteActor(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Actor> getAllActors() {
		// TODO Auto-generated method stub
		return null;
	}

}
