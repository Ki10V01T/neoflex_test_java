package com.neoflex.testapp.service;

import com.neoflex.testapp.entity.Users;
import com.neoflex.testapp.repository.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public boolean create(Users user) {
        Example<Users> userExample = Example.of(user);
        if (usersRepository.exists(userExample)) {
            return false;
        }
        usersRepository.save(user);
        return true; 
    }

    /*@Override
    public List<Users> readAll() {
        return usersRepository.findAll();
    }*/
    
    @Override
    public Users read(int id) {
        return usersRepository.getById(id);
    }

    /*@Override
    public boolean update(Users user, String name) {
        if (usersRepository.exists(name)) {
            user.setName(name);
            usersRepository.save(user);
            return true;
        }

        return false;
    }*/

    @Override
    public boolean delete(int id) {
        if (usersRepository.existsById(id)) {
            usersRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
