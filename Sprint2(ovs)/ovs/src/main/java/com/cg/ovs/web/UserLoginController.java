package com.cg.ovs.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ovs.domain.Address;
import com.cg.ovs.domain.UserDetail;
import com.cg.ovs.service.MapValidationErrorService;
import com.cg.ovs.service.UserLoginService;

@RestController
@RequestMapping("ovs/api/login")
public class UserLoginController {
	@Autowired
	UserLoginService userLoginService;
	@Autowired
	MapValidationErrorService mapValidationErrorService;
	@GetMapping("/{emailId}/{password}")
	public ResponseEntity<?> userLogin(@PathVariable String emailId,@PathVariable String password)
	{
	UserDetail testUser =userLoginService.loginUser(emailId,password);
	if(testUser!=null)
	{
	return new ResponseEntity<String>("Successfully Login  "+testUser.getLoginName()+ " !!!!!", HttpStatus.OK);
}
	return new ResponseEntity<String>("Enter correct Details !!!!!", HttpStatus.OK);
}
	@GetMapping("/viewProfile/{emailId}")
	public ResponseEntity<?> viewProfile(@Valid @PathVariable String emailId) {
		UserDetail testUser = userLoginService.viewByEmail(emailId);
		return new ResponseEntity<UserDetail>(testUser, HttpStatus.OK);
	}
	@PutMapping("/updateProfile")
	public ResponseEntity<?> updateProfile(@Valid @RequestBody UserDetail userDetail, BindingResult result) {
		ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);
		if (errorMap != null)
		{
			System.out.println(errorMap);
			return errorMap;
		}
		UserDetail testUser = userLoginService.updateProfile(userDetail);
		return new ResponseEntity<UserDetail>(testUser, HttpStatus.OK);
	}
	@PutMapping("/updateAdress/{emailId}")
	public ResponseEntity<?> updateProfile(@Valid @RequestBody Address address,@PathVariable String emailId, BindingResult result) {
		ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);
		if (errorMap != null)
		{
			System.out.println(errorMap);
			return errorMap;
		}
		UserDetail testUser = userLoginService.updateAddress(address, emailId);
		return new ResponseEntity<UserDetail>(testUser, HttpStatus.OK);
	}
	@DeleteMapping("/deleteProfile/{emailId}")
	public ResponseEntity<?> deleteProfile(@Valid @PathVariable String emailId) {
		String result=userLoginService.deleteProfile(emailId);
		return new ResponseEntity<String>(result, HttpStatus.OK);
	}
}
