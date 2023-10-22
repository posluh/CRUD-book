package ru.posluhpc.crud.model;
//Пользователи

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private int typeRole;
        private String name;
        private String surname;
        private String patronymic;
        private int age;
        private String numberPhone;
        private String login;
        private String password;
}
