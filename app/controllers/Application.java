package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
	List<Scribble> listScribbles
	    = Scribble.find("order by postedAt desc").fetch();
	render(listScribbles);
    }
}
