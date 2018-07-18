package entity;

import java.math.BigDecimal;

/**
 * UsersId entity. @author MyEclipse Persistence Tools
 */

public class UsersId implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private String username;
	private String password;
	private String uname;
	private String tximg;

	// Constructors

	/** default constructor */
	public UsersId() {
	}

	/** full constructor */
	public UsersId(BigDecimal id, String username, String password,
			String uname, String tximg) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.uname = uname;
		this.tximg = tximg;
	}

	// Property accessors

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getTximg() {
		return this.tximg;
	}

	public void setTximg(String tximg) {
		this.tximg = tximg;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UsersId))
			return false;
		UsersId castOther = (UsersId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getUsername() == castOther.getUsername()) || (this
						.getUsername() != null
						&& castOther.getUsername() != null && this
						.getUsername().equals(castOther.getUsername())))
				&& ((this.getPassword() == castOther.getPassword()) || (this
						.getPassword() != null
						&& castOther.getPassword() != null && this
						.getPassword().equals(castOther.getPassword())))
				&& ((this.getUname() == castOther.getUname()) || (this
						.getUname() != null
						&& castOther.getUname() != null && this.getUname()
						.equals(castOther.getUname())))
				&& ((this.getTximg() == castOther.getTximg()) || (this
						.getTximg() != null
						&& castOther.getTximg() != null && this.getTximg()
						.equals(castOther.getTximg())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getUsername() == null ? 0 : this.getUsername().hashCode());
		result = 37 * result
				+ (getPassword() == null ? 0 : this.getPassword().hashCode());
		result = 37 * result
				+ (getUname() == null ? 0 : this.getUname().hashCode());
		result = 37 * result
				+ (getTximg() == null ? 0 : this.getTximg().hashCode());
		return result;
	}

}