package com.atto.server;

public interface UserService {
    User getUser(String id);
    Boolean checkId(User user);
}
