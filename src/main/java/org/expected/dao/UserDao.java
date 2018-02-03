package org.expected.dao;

import org.expected.entity.User;

public interface UserDao {
	public User test();
	public User getRecordByName(String userName);
}
