package cyb.rms.services.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cyb.rms.daos.IEmployeeDao;
import cyb.rms.daos.IUserDao;
import cyb.rms.entities.User;
import cyb.rms.exceptions.DaoException;
import cyb.rms.services.IUserSevrice;

@Service
public class UserService implements IUserSevrice {

	@Autowired
	IUserDao userDao;
	
	@Override
	public User addUser(User user) throws DaoException {
		return userDao.saveUser(user);
	}

	@Override
	public User removeUser(User user) throws DaoException {
		return userDao.removeUser(user);
	}

	@Override
	public User updateUser(User user) throws DaoException {
		return userDao.updateUser(user);
	}

	@Override
	public List<User> listUsers() throws DaoException {
		return userDao.listUsers();
	}

	@Override
	public User findUserById(long id) throws DaoException {
		return userDao.getUser(id);
	}

	@Override
	public User findUsersByUsername(String userName) throws DaoException {
		// will be called in spring security
		return userDao.getUserByUsername(userName);
	}

}
