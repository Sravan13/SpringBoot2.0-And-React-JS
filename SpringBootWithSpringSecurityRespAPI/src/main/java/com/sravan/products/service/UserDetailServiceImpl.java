package com.sravan.products.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sravan.products.domain.ProductUser;
import com.sravan.products.repository.ProductUserRepository;

@Service
public class UserDetailServiceImpl implements UserDetailsService{
	
	@Autowired
	ProductUserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {		
		ProductUser prodosUser = userRepository.findByUsername(username);
		UserDetails userDetails = new User(username, prodosUser.getPassword(), AuthorityUtils.createAuthorityList(prodosUser.getRole()));
		
		System.out.println("password : "+prodosUser.getPassword());
		return userDetails;
	}

}
