package com.cg.ovs.service;

import java.util.List;

import com.cg.ovs.domain.UserDetail;

public interface UserAdminService {
	public List<UserDetail> viewAll();
	public UserDetail viewByEmail(String emailId);
	//view by city
	public UserDetail saveOrUpdate();

}
