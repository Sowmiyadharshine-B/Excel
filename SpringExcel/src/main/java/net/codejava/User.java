package net.codejava;
 
import java.util.*;
 
import javax.persistence.*;
 
@Entity
@Table(name = "users")
public class User {
    @Id
    
    private Integer id;
     
    private String email;
     
    private String password;
     
    @Column(name = "fullname")
    private String fullName;
         
    private boolean enabled;
     
    public Integer getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getFullName() {
		return fullName;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
            )
    private Set<Role> roles = new HashSet<>();
 
    // constructors, getter and setters are not shown for brevity
}