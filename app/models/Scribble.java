package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
 
@Entity
public class Scribble extends Model {
 
    public String content;
    public Date postedAt;
    
    public Scribble(String content) {
        this.content = content;
	this.postedAt = new Date();
    }
 
}