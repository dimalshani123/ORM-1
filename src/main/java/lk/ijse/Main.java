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
//
//        //  -----------------------------STUDENT SAVE/UPDATE-------------------

//        FullName fullName = new FullName("Sathru", "Nimasha");
//        Student student = new Student();
//        student.setId(03);
//        student.setName(fullName);
//        student.setAddress("Matara");
//        Transaction transaction = session.beginTransaction();
//
//
//        session.save(student);
//        //session.update(teacher);
//        transaction.commit();
//        session.close();
//    }


        //---------------STUDENT DELETE--------------------

//        Student student = new Student();
//        student.setId(02);
//        Transaction transaction = session.beginTransaction();
//
//
//
//        session.delete(student);
//        transaction.commit();
//        session.close();
//    }


        //---------------STUDENT GET--------------------

//        Student student = session.get(Student.class, 01);
//        Transaction transaction = session.beginTransaction();
//
//
//        transaction.commit();
//        session.close();
//
//        // Display the retrieved student's details
//        if (student != null) {
//            System.out.println("Student ID: " + student.getId());
//            System.out.println("Student Name: " + student.getName());
//            System.out.println("Student Address: " + student.getAddress());
//        } else {
//            System.out.println("Student not found");
//        }
//    }

        //---------- TEACHER SAVE/UPDATE-------------
//
//        FullName fullName = new FullName("Dasun", "Kanchana");
//        Teacher teacher = new Teacher();
//        teacher.setId(04);
//        teacher.setName(fullName);
//        teacher.setAddress("Panadura");
//        Transaction transaction = session.beginTransaction();
//
//
//
//        session.save(teacher);
//        //session.update(teacher);
//        transaction.commit();
//        session.close();
// }


        //-----------TEACHER DELETE----------------

//        Teacher teacher=new Teacher();
//        teacher.setId(01);
//        Transaction transaction = session.beginTransaction();
//
//
//
//        session.delete(teacher);
//        transaction.commit();
//        session.close();
//    }


        //----------GET TEACHER-----------
//        Teacher teacher = session.get(Teacher.class, 01);
//        Transaction transaction = session.beginTransaction();
//
//
//        transaction.commit();
//        session.close();
//
//        // Display the retrieved student's details
//        if (teacher != null) {
//            System.out.println("Teacher ID: " + teacher.getId());
//            System.out.println("Teacher Name: " + teacher.getName());
//            System.out.println("Teacher Address: " + teacher.getAddress());
//        } else {
//            System.out.println("Teacher not found");
//        }
    }


    }