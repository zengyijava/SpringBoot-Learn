package com.jk.autoconfigure;

public class UserService {

    
    private UserProperties userProperties;

    public UserService(UserProperties userProperties) {
        this.userProperties = userProperties;
    }

    public UserService() {
    }

    public boolean validata(){
        if("admin".equals(userProperties.getName()) && "123".equals(userProperties.getPwd()) ){
            return true;
        }
        return false;
    }
}
