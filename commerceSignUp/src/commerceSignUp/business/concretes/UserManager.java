package commerceSignUp.business.concretes;

import java.util.List;

import commerceSignUp.business.abstracts.UserService;
import commerceSignUp.dataAccess.abstracts.UserDao;
import commerceSignUp.entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userDao.add(user);
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}

	@Override
	public User getByMail(String mail) {
		
		return userDao.getByEmail(mail);
	}

	@Override
	public List<User> getAll() {
		
		return userDao.getAll();
	}

}
