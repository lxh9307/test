package entity;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private UsersId id;

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** full constructor */
	public Users(UsersId id) {
		this.id = id;
	}

	// Property accessors

	public UsersId getId() {
		return this.id;
	}

	public void setId(UsersId id) {
		this.id = id;
	}

}