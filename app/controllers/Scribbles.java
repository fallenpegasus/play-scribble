package controllers;
 
import models.Scribble;
import play.mvc.Controller;
 
public class Scribbles extends Controller {
 
    public static void delete(Long id) {
        Scribble scribble = Scribble.findById(id);
        scribble.delete();
	redirect("/");
    }

    public static void create(String content) {
        Scribble scribble = new Scribble(content);
        scribble.save();
	redirect("/");
    }
 
}