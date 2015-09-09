package murach.business;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the JSFUSER database table.
 * 
 */
@Entity
@Table(name="JSFUSER", schema="TESTDB")
@NamedQuery(name="Jsfuser.findAll", query="SELECT j FROM Jsfuser j")
public class Jsfuser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="JSFUSER_USERID_GENERATOR", sequenceName="SEQ_JSFUSER" , schema="TESTDB", allocationSize = 1, initialValue = 3)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="JSFUSER_USERID_GENERATOR")
	@Column(name="USER_ID")
	private long userId;

	private String email;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="LAST_NAME")
	private String lastName;

	public Jsfuser() {
	}

	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}