package com.ashen.design.principle.dependenceinversion;

/**
 * @ClassName ICourse
 * @Author 董升
 * @Date 2021/7/31
 * @Version V1.0
 * @Description: 课程接口
 **/
public class Test {

    //v1
    //public static void main(String[] args) {
    //    Student student = new Student();
    //    student.studyJavaCourse();
    //    student.studyFECourse();
    //}

    //v2
    //public static void main(String[] args) {
    //    Student student = new Student();
    //    student.studyImoocCourse(new JavaCourse());
    //    student.studyImoocCourse(new FECourse());
    //    student.studyImoocCourse(new PythonCourse());
    //}

    //v3
    //public static void main(String[] args) {
    //    Student student = new Student(new JavaCourse());
    //    student.studyImoocCourse();
    //}
    public static void main(String[] args) {
        Student student = new Student();
        student.setiCourse(new JavaCourse());
        student.studyImoocCourse();

        student.setiCourse(new FECourse());
        student.studyImoocCourse();

    }


}
