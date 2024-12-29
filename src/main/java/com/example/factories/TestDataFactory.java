package com.example.factories;

import com.example.pojo.Student;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public final class TestDataFactory {

    private TestDataFactory() {
    };

    private static final PodamFactory podamFactory = new PodamFactoryImpl();

    public static Student createRandomStudent() {
        return podamFactory.manufacturePojo(Student.class);
    }
}