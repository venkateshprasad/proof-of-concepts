package com.sivalabs.extjsdemo.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sivalabs.extjsdemo.entities.User;

/**
 * @author Siva
 *
 */
public interface UserMapper
{

	User selectUser(int userId);

	List<User> selectAllUsers();
	
	List<User> searchUsers(String searchQuery);

	User login(@Param("username") String username, @Param("password") String password);

	void createUser(User user);
	
	int updateUser(User user);
	
	int deleteUser(int id);
	
	
}
