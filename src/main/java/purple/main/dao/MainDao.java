package purple.main.dao;

import purple.domain.User;

public interface MainDao {
	void saveUser(User user);
	void updateUser(User user);
	void deleteUser(User user);
	User findUserById(String id);
}
