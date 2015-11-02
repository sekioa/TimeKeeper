package fr.jservices.timekeeper.business.srcummanagement;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.jservices.timekeeper.business.time.ConnectionData;

@Entity
@Table(name = "user")
public class User {

	// public final static int TEAMMEMBER_USERTYPE = 0;
	// public final static int PO_USERTYPE = 1;
	// public final static int SM_USERTYPE = 2;
	// public final static int ADMIN_USERTYPE = 3;
	//
	// private Set<Integer> usertypes;

	@Column(name = "team_member")
	private boolean teamMember;
	private boolean administrator;
	@Column(name = "scrum_master")
	private boolean scrumMaster;
	@Column(name = "product_owner")
	private boolean productOwner;

	private String forename;
	private String lastname;
	private String nickname;
	@Column(name = "picture_file_name")
	private String pictureFilename;
	@ManyToMany(mappedBy = "project")
	private Set<Project> projects;

	@OneToMany(mappedBy = "connection_data")
	private Set<ConnectionData> connexionDatas;

	// GENERATED ACCESSORS / MUTATORS
	public boolean isTeamMember() {
		return teamMember;
	}

	public void setTeamMember(boolean teamMember) {
		this.teamMember = teamMember;
	}

	public boolean isAdministrator() {
		return administrator;
	}

	public void setAdministrator(boolean administrator) {
		this.administrator = administrator;
	}

	public boolean isScrumMaster() {
		return scrumMaster;
	}

	public void setScrumMaster(boolean scrumMaster) {
		this.scrumMaster = scrumMaster;
	}

	public boolean isProductOwnerr() {
		return productOwner;
	}

	public void setProductOwnerr(boolean productOwnerr) {
		this.productOwner = productOwnerr;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPictureFilename() {
		return pictureFilename;
	}

	public void setPictureFilename(String pictureFilename) {
		this.pictureFilename = pictureFilename;
	}

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

	public Set<ConnectionData> getConnexionDatas() {
		return connexionDatas;
	}

	public void setConnexionDatas(Set<ConnectionData> connexionDatas) {
		this.connexionDatas = connexionDatas;
	}
	// GENERATED ACCESSORS / MUTATORS END
	// Utils
	// public boolean isTeamMember() {
	// return usertypes.contains(TEAMMEMBER_USERTYPE);
	// }
	// public boolean isPO() {
	// return usertypes.contains(PO_USERTYPE);
	// }
	// public boolean isSM() {
	// return usertypes.contains(SM_USERTYPE);
	// }
	// public boolean isAdmin() {
	// return usertypes.contains(ADMIN_USERTYPE);
	// }
	// Utils END

}
