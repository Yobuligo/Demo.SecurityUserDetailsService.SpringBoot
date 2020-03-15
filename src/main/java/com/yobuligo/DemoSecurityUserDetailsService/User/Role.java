package com.yobuligo.DemoSecurityUserDetailsService.User;

import org.springframework.security.core.GrantedAuthority;

public class Role implements GrantedAuthority {

	private String rolename;

	public Role(String rolename) {
		this.rolename = rolename;
	}

	@Override
	public String getAuthority() {
		return rolename;
	}

}
