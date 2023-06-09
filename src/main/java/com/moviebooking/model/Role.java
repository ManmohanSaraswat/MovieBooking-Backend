package com.moviebooking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "role")
public class Role {
	@Id
	private String roleName;
	private String roleDescription;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public Role(String roleName, String roleDescription) {
		super();
		this.roleName = roleName;
		this.roleDescription = roleDescription;
	}

	public Role() {
	}

	@Override
	public String toString() {
		return "Role [roleName=" + roleName + ", roleDescription=" + roleDescription + "]";
	}

}
