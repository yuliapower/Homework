package ru.itmo.homework7;

import java.util.Arrays;

public class School {
    private String schoolName;
    private Director director;
    private Teacher teachers[];
    private Pupil pupils[];


    public School(String schoolName, Director director, Teacher[] teachers, Pupil[] pupils) {
        setSchoolName(schoolName);
        this.director = director;
        this.teachers = teachers;
        this.pupils = pupils;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if (schoolName==null){
            throw new IllegalArgumentException("Введите название школы");
        }
        this.schoolName = schoolName;
    }

    //    public void addTeachers(Teacher teacher) {
//        for (int i = 0; i < teachers.length; i++) {
//            if (teachers[i] == null) {
//                teachers[i] = teacher;
//                return;
//            }
//
//        }
//        System.out.println("Учитель не добавлен ");
//    }
//
//    public void addPupils(Pupil pupil) {
//        for (int i = 0; i < pupils.length; i++) {
//            if (pupils[i] == null) {
//                pupils[i] = pupil;
//                return;
//            }
//        }
//        System.out.println("Ученик не добавлен ");
//    }

    public void dayAtSchool() {
        director.startLessons();
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] != null) {
                for (int j = 0; j < pupils.length; j++) {
                    if (pupils[j]!=null&&teachers[i].getTeacherSubject().equals(pupils[j].getPupilSubject())) {
                        teachers[i].teach(pupils[j]);
                        System.out.println(pupils[j]);
                    }
                }
            }
        }
        director.finishLessons();
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", director=" + director +
                ", teachers=" + Arrays.toString(teachers) +
                ", pupils=" + Arrays.toString(pupils) +
                '}';
    }
}
