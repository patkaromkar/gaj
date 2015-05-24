/**
 * 
 */
package com.gg.aashiyana.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gg.aashiyana.domain.User;

/**
 * @author User
 *
 */
@Repository
@Transactional
public class UserDaoImpl implements UserDao {
	
	public static final Logger LOGGER = Logger.getLogger(UserDaoImpl.class);

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public Integer insertUser(User user) {
		em.persist(user);
		LOGGER.info("Successfully inserted user with userId "  + user.getUserId() + ",user:" + user ); 
		return user.getUserId();
	}

	@Override
	public void updateUser(User user) {
		em.merge(user);
		
	}

	@Override
	public User getUserById(Integer userId) {
		return em.find(User.class, userId);
	}

	@Override
	public List<User> getAllUsers() {
		Query query = em.createQuery("select u from User u",User.class);
		return query.getResultList();
	}
	
	

}
