package info.krzysztof.jpa;

import info.krzysztof.jpa.domain.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by krzysztof on 25.03.16.
 */
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Działa");

        Employee employee = new Employee();
        //employee.setId(1L);
        employee.setFirstName("Jan");
        employee.setLastName("Nowak");
        employee.setSalary(3333.3);

        Employee employee2 = new Employee();
        //employee2.setId(1L);
        employee2.setFirstName("Robert");
        employee2.setLastName("Bedmarek");
        employee2.setSalary(3333.3);

        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.persist(employee2);
        entityManager.getTransaction().commit();


        entityManager.close();
        entityManagerFactory.close();
    }

}
