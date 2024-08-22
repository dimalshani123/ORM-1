package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.embed.FullName;
import lk.ijse.entity.Student;
import lk.ijse.entity.Teacher;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();

        FullName fullName1 = new FullName("Dasuni", "Nimnavi");
        FullName fullName2 = new FullName("Vikum", "Sudesh");


        Student student = new Student();
        student.setId(1);
        student.setName(fullName1);
        student.setAddress("Mathara");

       Teacher teacher = new Teacher();
        teacher.setId(2);
        teacher.setName(fullName2);
        teacher.setAddress("Panadura");

        Transaction transaction = session.beginTransaction();
       // session.save(student);
        //session.update(student);
       // session.delete("1",student);
//        Student student1=session.get(Student.class,1);
//        System.out.println(student1.toString());


        //session.save(teacher);
        //session.update(student);
        //session.delete("1",student);
//        Teacher teacher1=session.get(Teacher.class,1);
//        System.out.println(teacher1.toString());

        transaction.commit();
        session.close();
    }

    }