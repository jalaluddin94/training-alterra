package com.alterra.tugas2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.alterra.tugas2.model.AppUser;
import com.alterra.tugas2.model.Role;
import com.alterra.tugas2.services.UserRoleService;

import java.util.ArrayList;

@SpringBootApplication
public class Tugas2Application {

	public static void main(String[] args) {
		SpringApplication.run(Tugas2Application.class, args);
	}

	@Bean
	public CommandLineRunner run(UserRoleService appUserService) {

		return args -> {

			appUserService.saveUser(new AppUser(null, "Okky Septian", "okky123", "okky123", "0812345", new ArrayList<>()));
			appUserService.saveUser(new AppUser(null, "Denny Muharom", "denta123", "denta123", "0812344", new ArrayList<>()));
			appUserService.saveUser(new AppUser(null, "Jalaluddin", "jalal123", "jalal123","0812343", new ArrayList<>()));
			appUserService.saveUser(new AppUser(null, "Abu Dzar", "abu123", "abu123","0812342", new ArrayList<>()));

			appUserService.saveRole(new Role(null, "ROLE_USER"));
			appUserService.saveRole(new Role(null, "ROLE_MANAGER"));
			appUserService.saveRole(new Role(null, "ROLE_ADMIN"));
			appUserService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

			appUserService.addRoleToUser("0812345", "ROLE_USER");
			appUserService.addRoleToUser("0812344", "ROLE_MANAGER");
			appUserService.addRoleToUser("0812343", "ROLE_ADMIN");
			appUserService.addRoleToUser("0812342", "ROLE_SUPER_ADMIN");
		};
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
