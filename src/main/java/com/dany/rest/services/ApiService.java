package com.dany.rest.services;

import com.dany.rest.api.domain.User;

import java.util.List;

public interface ApiService {

    List<User> getUSers(Integer limit);
}
