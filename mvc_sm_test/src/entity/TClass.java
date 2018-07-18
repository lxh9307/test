package entity;

import java.math.BigDecimal;

/**
 * TClass entity. @author MyEclipse Persistence Tools
 */

public class TClass implements java.io.Serializable {

	// Fields

	private int classid;
	private String classname;
	private String classlevel;

	// Constructors

	/** default constructor */
	public TClass() {
	}

	/** full constructor */
	public TClass(String classname, String classlevel) {
		this.classname = classname;
		this.classlevel = classlevel;
	}

	// Property accessors

	public int getClassid() {
		return this.classid;
	}

	public void setClassid(int classid) {
		this.classid = classid;
	}

	public String getClassname() {
		return this.classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getClasslevel() {
		return this.classlevel;
	}

	public void setClasslevel(String classlevel) {
		this.classlevel = classlevel;
	}

}