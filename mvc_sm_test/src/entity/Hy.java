package entity;

/**
 * Hy entity. @author MyEclipse Persistence Tools
 */

public class Hy implements java.io.Serializable {

	// Fields

	private HyId id;

	// Constructors

	/** default constructor */
	public Hy() {
	}

	/** full constructor */
	public Hy(HyId id) {
		this.id = id;
	}

	// Property accessors

	public HyId getId() {
		return this.id;
	}

	public void setId(HyId id) {
		this.id = id;
	}

}