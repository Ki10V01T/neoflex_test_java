package com.neoflex.testapp.service;

import com.neoflex.testapp.entity.Users;

import java.util.List;

public interface UsersService {

    /**
     * Создает нового пользователя
     * @param client - пользователь для создания
     */
    boolean create(Users user);
 
    /**
     * Возвращает список всех имеющихся пользователей
     * @return список пользователей
     */
    //List<Users> readAll();
 
    /**
     * Возвращает пользователя по его ID
     * @param id - ID клиента
     * @return - объект пользователя с заданным ID
     */
    Users read(int id);
 
    /**
     * Обновляет пользователя с заданным ID,
     * в соответствии с переданным клиентом
     * @param client - пользователь в соответсвии с которым нужно обновить данные
     * @param id - id пользователя которого нужно обновить
     * @return - true если данные были обновлены, иначе false
     */
    //boolean update(Users user, String name);
 
    /**
     * Удаляет пользователя с заданным ID
     * @param id - id пользователя, которого нужно удалить
     * @return - true если пользователь был удален, иначе false
     */
    boolean delete(int id);
 }
