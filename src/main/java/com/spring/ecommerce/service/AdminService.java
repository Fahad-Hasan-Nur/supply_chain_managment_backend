package com.spring.ecommerce.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.spring.ecommerce.dto.UserDto;
import com.spring.ecommerce.model.Category;
import com.spring.ecommerce.model.User;

/*************************************************************************
 * {@link Category} service class
 * 
 * @author Fahad Hasan
 * @since 2021-02-13
 *************************************************************************/
public interface AdminService {

	/*************************************************************************
	 * Create a new Admin
	 * 
	 * @param ob {@link Admin} object
	 * @param rs {@link HttpServletResponse} object
	 * @return {@link Admin}
	 *************************************************************************/
	User create(User ob);

	/*************************************************************************
	 * Get all Admin {@link Admin}
	 * 
	 * @return {@link List< Admin>}
	 *************************************************************************/
	List<UserDto> getAllAdmin();
	
	/*************************************************************************
	 * Get all Admin {@link Admin}
	 * 
	 * @return {@link List< Admin>}
	 *************************************************************************/
	List<UserDto> getAllActiveDealers();
	
	/*************************************************************************
	 * Get all Admin {@link Admin}
	 * 
	 * @return {@link List< Admin>}
	 *************************************************************************/
	List<UserDto> getAllInactiveDealers();

	/*************************************************************************
	 * Get Admin {@link Admin} by Id
	 * 
	 * @return {@link Admin}
	 *************************************************************************/
	UserDto getUserDtoById(String id);

	/*************************************************************************
	 * Get Admin {@link Admin} by Email
	 * 
	 * @return {@link Email}
	 *************************************************************************/
	UserDto getUserDtoByEmail(String email);

	/*************************************************************************
	 * Update {@link Admin}
	 * 
	 * @param ob {@link Admin} object
	 * @param rs
	 * @return {@link Admin}
	 *************************************************************************/
	User update(User ob);

	/*************************************************************************
	 * Delete {@link Admin}
	 * 
	 * @param ob {@link Admin} object
	 * @param rs
	 * @return {@link Admin}
	 *************************************************************************/
	ResponseEntity<?> deleteById(String id);
	
	/*************************************************************************
	 * Verify Dealer {@link Admin}
	 * 
	 * @return {@link Admin}
	 *************************************************************************/

	 User verifyDealer( String id);
}
