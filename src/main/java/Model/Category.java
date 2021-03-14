package Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="CATEGORY")
public class Category implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue
    @Column(name="CATGID")
	private int catgId;
	
	@Column(name="CATGNAME", unique=true, nullable=false)
	private String catgName;

	public Category() {	}

	public int getCatgId() {
		return catgId;
	}

	public void setCatgId(int catgId) {
		this.catgId = catgId;
	}

	public String getCatgName() {
		return catgName;
	}

	public void setCatgName(String catgName) {
		this.catgName = catgName;
	}

}
