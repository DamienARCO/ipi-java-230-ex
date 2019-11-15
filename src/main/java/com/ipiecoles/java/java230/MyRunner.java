package com.ipiecoles.java.java230;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.ipiecoles.java.java230.model.Employe;
import com.ipiecoles.java.java230.repository.EmployeRepository;

@Component
public class MyRunner implements CommandLineRunner {

	@Autowired
	private EmployeRepository employeRepo;

	@Override
	public void run(String... strings) throws Exception {
		System.out.println("Nombre d'employés : " + employeRepo.count());
		/*
		 * Get by Id = 5 Employe emp = employeRepo.findOne(5L);
		 * emp.setNom(emp.getNom().toUpperCase()); employeRepo.save(emp);
		 * print(emp.toString());
		 */

		/*
		 * Create new employe Employe newEmp = new Employe("ARCO", "Damien", "M98989",
		 * LocalDate.now(), 2000d); print(newEmp.toString()); newEmp =
		 * employeRepo.save(newEmp); print(newEmp.toString());
		 */

		/*
		 * DELETE BY ID = 2504 (the new employe) employeRepo.delete(2504L);
		 */

		/*
		 * PAGINATION des employes par 10 (affiche la première page
		 * Page<Employe> emps = employeRepo.findAll(new PageRequest(0, 10,
		 * Sort.Direction.ASC, "matricule")); for (Employe e : emps) {
		 * print(e.toString()); }
		 */

	}

	public static void print(Object t) {
		System.out.println(t);
	}
}
