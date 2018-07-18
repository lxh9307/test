package entity;

import java.math.BigDecimal;

/**
 * HyId entity. @author MyEclipse Persistence Tools
 */

public class HyId implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private BigDecimal userid;
	private BigDecimal hyid;

	// Constructors

	/** default constructor */
	public HyId() {
	}

	/** full constructor */
	public HyId(BigDecimal id, BigDecimal userid, BigDecimal hyid) {
		this.id = id;
		this.userid = userid;
		this.hyid = hyid;
	}

	// Property accessors

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public BigDecimal getUserid() {
		return this.userid;
	}

	public void setUserid(BigDecimal userid) {
		this.userid = userid;
	}

	public BigDecimal getHyid() {
		return this.hyid;
	}

	public void setHyid(BigDecimal hyid) {
		this.hyid = hyid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof HyId))
			return false;
		HyId castOther = (HyId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getUserid() == castOther.getUserid()) || (this
						.getUserid() != null
						&& castOther.getUserid() != null && this.getUserid()
						.equals(castOther.getUserid())))
				&& ((this.getHyid() == castOther.getHyid()) || (this.getHyid() != null
						&& castOther.getHyid() != null && this.getHyid()
						.equals(castOther.getHyid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getUserid() == null ? 0 : this.getUserid().hashCode());
		result = 37 * result
				+ (getHyid() == null ? 0 : this.getHyid().hashCode());
		return result;
	}

}