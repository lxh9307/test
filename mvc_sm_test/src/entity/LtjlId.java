package entity;

import java.math.BigDecimal;

/**
 * LtjlId entity. @author MyEclipse Persistence Tools
 */

public class LtjlId implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private BigDecimal fsid;
	private String fsnr;
	private BigDecimal jsid;

	// Constructors

	/** default constructor */
	public LtjlId() {
	}

	/** full constructor */
	public LtjlId(BigDecimal id, BigDecimal fsid, String fsnr, BigDecimal jsid) {
		this.id = id;
		this.fsid = fsid;
		this.fsnr = fsnr;
		this.jsid = jsid;
	}

	// Property accessors

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public BigDecimal getFsid() {
		return this.fsid;
	}

	public void setFsid(BigDecimal fsid) {
		this.fsid = fsid;
	}

	public String getFsnr() {
		return this.fsnr;
	}

	public void setFsnr(String fsnr) {
		this.fsnr = fsnr;
	}

	public BigDecimal getJsid() {
		return this.jsid;
	}

	public void setJsid(BigDecimal jsid) {
		this.jsid = jsid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LtjlId))
			return false;
		LtjlId castOther = (LtjlId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getFsid() == castOther.getFsid()) || (this.getFsid() != null
						&& castOther.getFsid() != null && this.getFsid()
						.equals(castOther.getFsid())))
				&& ((this.getFsnr() == castOther.getFsnr()) || (this.getFsnr() != null
						&& castOther.getFsnr() != null && this.getFsnr()
						.equals(castOther.getFsnr())))
				&& ((this.getJsid() == castOther.getJsid()) || (this.getJsid() != null
						&& castOther.getJsid() != null && this.getJsid()
						.equals(castOther.getJsid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getFsid() == null ? 0 : this.getFsid().hashCode());
		result = 37 * result
				+ (getFsnr() == null ? 0 : this.getFsnr().hashCode());
		result = 37 * result
				+ (getJsid() == null ? 0 : this.getJsid().hashCode());
		return result;
	}

}