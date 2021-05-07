package commerceSignUp.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import commerceSignUp.dataAccess.abstracts.UserDao;
import commerceSignUp.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Kullanýcý eklendi : " + user.getFirstName() + ' ' + user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		users.remove(user);
		System.out.println("Kullanýcý silindi : " + user.getFirstName() + ' ' + user.getLastName());
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý güncellendi : " + user.getFirstName() + ' ' + user.getLastName());
		
	}

	@Override
	public User get(int id) {
		for (User user : users) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public User getByEmail(String email) {
		for (User user : users) {
			if(user.getEmail() == email) {
				return user;
			}
		}
		return null;
	}

}
