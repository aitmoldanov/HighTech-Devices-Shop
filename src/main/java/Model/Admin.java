package Model;

import javax.persistence.*;

@Entity
@Table(name="ADMIN")
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ADMINID")
	private int adminId;
	
	@Column(name="ADMINUSERNAME", nullable=false, unique=true)
	private String adminUsername;
	
	@Column(name="ADMINPASSWORD", nullable=false)
	private String adminPassword;

	public Admin() {	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminUsername() {
		return adminUsername;
	}
	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
}
