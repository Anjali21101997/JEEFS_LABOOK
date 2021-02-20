package com.cg.ovs.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ovs.domain.UserDetail;
import com.cg.ovs.repository.UserDetailRepository;
import com.cg.ovs.service.UserAdminService;
@Service
public class UserAdminServiceImpl implements UserAdminService {
@Autowired
UserDetailRepository userDetailRepository;
	@Override
	public List<UserDetail> viewAll() {
		return (List<UserDetail>) userDetailRepository.findAll();
	}

	@Override
	public UserDetail viewByEmail(String emailId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDetail saveOrUpdate() {
		// TODO Auto-generated method stub
		return null;
	}

}
