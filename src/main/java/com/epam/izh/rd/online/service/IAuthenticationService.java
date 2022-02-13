package com.epam.izh.rd.online.service;

import com.epam.izh.rd.online.entity.User;

public interface IAuthenticationService {
    User login(User user) throws AuthenticationService.UserNotFoundException, AuthenticationService.NotCorrectPasswordException;

    void logout();
}
