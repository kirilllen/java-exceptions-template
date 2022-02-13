package com.epam.izh.rd.online.service;

import com.epam.izh.rd.online.entity.User;

public interface IUserService {

    User register(User user) throws UserService.UserAlreadyRegisteredException, UserService.SimplePasswordException;

    void delete(String login) throws UserService.NotAccessException;
}
