package com.atto.server;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    String id = "admin";
    String pw = "atto12!@";

    @Override
    public User getUser(String id) {
        return null;
    }

    @Override
    public Boolean checkId(User user) {
        if(this.id.equals(user.getId())  && this.pw.equals(user.getPw())) {
            return true;
        } else {
            return false;
        }
    }
}
