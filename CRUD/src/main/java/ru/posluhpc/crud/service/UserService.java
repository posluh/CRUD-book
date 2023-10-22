package ru.posluhpc.crud.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.posluhpc.crud.model.User;
import ru.posluhpc.crud.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    // СОХРАНЕНИЕ
    public User save(User user){
        return userRepository.save(user);
    }


    // УДАЛЕНИЕ
    public void delete(Long id){
        this.userRepository.deleteById(id);
    }


    //ПОИСК ПО ID
    public Optional<User> getById(Long id){
        return userRepository.findById(id);
    }


    //ПОЛУЧИТЬ ВСЕХ ПОЛЬЗОВАТЕЛЕЙ
    public List<User> getAllUser(){
        return userRepository.findAll();
    }

}
