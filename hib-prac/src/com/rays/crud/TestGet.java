package com.rays.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rays.user.UserDTO;

public class TestGet {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();

		UserDTO dto = (UserDTO) session.get(UserDTO.class, 1);

		System.out.println("Id " + dto.getId());
		System.out.println("FirstName " + dto.getFirstName());

	}

}
