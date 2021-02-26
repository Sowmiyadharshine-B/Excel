package net.codejava;
 
import javax.persistence.*;
 
@Entity
@Table(name = "roles")
public class Role {
    @Id
    
    private Integer id;
     
    private String name;
     
    private String description;

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}
 
    // constructors, getter and setters are not shown for brevity  
}