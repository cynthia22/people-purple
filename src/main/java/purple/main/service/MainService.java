package purple.main.service;

import purple.model.User;

public interface MainService {
	void saveUser(User user);
	void updateUser(User user);
	void deleteUser(User user);
	User findUserById(String id);
}
