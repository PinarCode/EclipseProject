package commerceSignUp.business.abstracts;

import commerceSignUp.entities.concretes.User;

public interface UserValidationService {
     boolean validate(User user);
}
