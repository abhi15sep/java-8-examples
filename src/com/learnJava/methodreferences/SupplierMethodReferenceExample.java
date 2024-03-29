package com.learnJava.methodreferences;

import com.learnJava.data.Student;

import java.util.function.Supplier;

public class SupplierMethodReferenceExample {

    static Supplier<Student> studentSupplier = Student::new;

    public static void main(String[] args) {

        System.out.println(studentSupplier.get());

    }
}
