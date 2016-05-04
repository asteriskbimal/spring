package extra.credit.imdb.control;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import extra.credit.imdb.dao.MovieDao;
import extra.credit.imdb.model.Actor;
import extra.credit.imdb.model.Characters;
import extra.credit.imdb.model.Comments;
import extra.credit.imdb.model.Director;
import extra.credit.imdb.model.Genre;
import extra.credit.imdb.model.Movie;


public class Application {
	
	MovieDao movieDao=new MovieDao();

	public static void main(String[] args) {
        
		new Application().listMovies();
		
	}
	
	public void listMovies(){
		
		List<Movie> movie1=movieDao.getAllMovies();
		for(Movie m: movie1){
			System.out.println("<---"+m.getMovieId()+":"+m.getName()+":"+m.getRating()+"--->");
			for(Actor a: m.getActors()){
				System.out.println("<---"+a.getId()+":"+a.getName()+":"+"--->");
			}
			for(Comments c:m.getComments()){
				System.out.println("<---"+c.getId()+":"+c.getComment()+"--->");
			}
			
		}
	}

	public void addMovies(){
		Movie movie=new Movie();
		List<Actor> actors=new ArrayList<Actor>();
		List<Director> directors=new ArrayList<Director>();
		List<Characters> characterz=new ArrayList<Characters>();
		List<Comments> comments=new ArrayList<Comments>();
		
		Actor actor1=new Actor();
		actor1.setName("Arnold3");
		Path p = FileSystems.getDefault().getPath("C:\\Users\\bimal\\git\\imdb\\ImdbExtraCredit\\images", "arnold.jpg");
		byte[] fileData = null;
		try {
			fileData = Files.readAllBytes(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actor1.setImage(fileData);
		
		Actor actor2=new Actor();
		actor2.setName("Bruce Willis3");
		 p = FileSystems.getDefault().getPath("C:\\Users\\bimal\\git\\imdb\\ImdbExtraCredit\\images", "BruceWillis.jpg");
		fileData = null;
		try {
			fileData = Files.readAllBytes(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actor2.setImage(fileData);
		Actor actor3=new Actor();
		actor3.setName("Silvestor Stalone3");
		 p = FileSystems.getDefault().getPath("C:\\Users\\bimal\\git\\imdb\\ImdbExtraCredit\\images", "SilvestorStalone.jpg");
		 fileData = null;
		try {
			fileData = Files.readAllBytes(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actor3.setImage(fileData);
		
		Director director=new Director();
		director.setName("Silvestor Stalone3");
		 p = FileSystems.getDefault().getPath("C:\\Users\\bimal\\git\\imdb\\ImdbExtraCredit\\images", "SilvestorStalone.jpg");
		 fileData = null;
		try {
			fileData = Files.readAllBytes(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		director.setImage(fileData);
		
		Characters character1=new Characters();
		character1.setName("Barney Ross7");
		character1.setActor(actor3);
		character1.setMovie(movie);
		
		Characters character2=new Characters();
		character2.setName("Mr. Church7");
		character2.setActor(actor2);
		character2.setMovie(movie);
		
		Characters character3=new Characters();
		character3.setName("Trench7");
		character3.setActor(actor1);
		character3.setMovie(movie);
		
		Comments comment1=new Comments();
		comment1.setComment("Excellent Movie7");
		comment1.setMovie(movie);
		
		Comments comment2=new Comments();
		comment2.setComment("Good Movie7");
		comment2.setMovie(movie);
		
		Comments comment3=new Comments();
		comment3.setComment("Not Bad Movie7");
		comment3.setMovie(movie);
		
		comments.add(comment1);
		comments.add(comment2);
		comments.add(comment3);
		
		actors.add(actor1);
		actors.add(actor2);
		actors.add(actor3);
		directors.add(director);
		characterz.add(character1);
		characterz.add(character2);
		characterz.add(character3);
		
		 p = FileSystems.getDefault().getPath("C:\\Users\\bimal\\git\\imdb\\ImdbExtraCredit\\images", "expendablesCover.jpg");
		 fileData = null;
		try {
			fileData = Files.readAllBytes(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		movie.setCover(fileData);
		System.out.println(actor1.getMovies()+"-----------------");
		movie.setName("The Expandables7");
		movie.setRating(8);
		movie.setActors(actors);
		movie.setCharacters(characterz);
		movie.setDirectors(directors);
		movie.setComments(comments);
		movie.setReleaseYear(new Date());
		movie.setGenre(Genre.action);
		movieDao.saveMovie(movie);
	}
}
