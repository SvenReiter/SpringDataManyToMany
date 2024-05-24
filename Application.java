package com.example.SpringBootSpringDataExample.StudentVsCourseManyToMany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//https://www.youtube.com/watch?v=jCYonZey5dY
/* Postman example:
    Post: http://localhost:8080/student/course
        Body/raw/JSON:
            {
                "name": "basant",
                "age": 30,
                "dept": "DEV",
                "courses": [
                    {
                        "title": "Michine Learning",
                        "abbreviation": "ML",
                        "modules": 10,
                        "fee": 4000
                    },
                    {
                        "title": "Spring Boot",
                        "abbreviation": "SB",
                        "modules": 11,
                        "fee": 2500
                    },
                    {
                        "title": "Database System",
                        "abbreviation": "DSSB",
                        "modules": 5,
                        "fee": 1500
                    }
                ]
            }
    Post: http://localhost:8080/student/course
        Body/raw/JSON:
            {
                "name": "santosh",
                "age": 33,
                "dept": "UI",
                "courses": [
                    {
                        "title": "Angular",
                        "abbreviation": "ng",
                        "modules": 12,
                        "fee": 5000
                    },
                    {
                        "title": "React JS",
                        "abbreviation": "RJS",
                        "modules": 11,
                        "fee": 1600
                    }
                ]
            }
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
