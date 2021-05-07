package commerceSignUp.business.abstracts;

import java.util.List;

import commerceSignUp.entities.concretes.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void update(User user);
	User getByMail(String mail);
	List<User> getAll();
}
