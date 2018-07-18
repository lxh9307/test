package entity;

/**
 * Ltjl entity. @author MyEclipse Persistence Tools
 */

public class Ltjl implements java.io.Serializable {

	// Fields

	private LtjlId id;

	// Constructors

	/** default constructor */
	public Ltjl() {
	}

	/** full constructor */
	public Ltjl(LtjlId id) {
		this.id = id;
	}

	// Property accessors

	public LtjlId getId() {
		return this.id;
	}

	public void setId(LtjlId id) {
		this.id = id;
	}

}