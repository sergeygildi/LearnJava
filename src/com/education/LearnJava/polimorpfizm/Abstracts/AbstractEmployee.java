package com.education.LearnJava.polimorpfizm.Abstracts;

import com.education.LearnJava.polimorpfizm.Interfaces.EmployerInterface;

/**
 * Created by Serhii Hildi on 22.10.18.
 */

public class AbstractEmployee implements EmployerInterface {

    private String name;
    private String fieldOfActivity; //сфера деятельности
    private double workExperience; //опыт работы
    private boolean diploma; //наличие диплома

    public void introduceYourself() {
        System.out.println("Привет! Меня зовут " + getName() + ". Я работаю " + getFieldOfActivity()
                + "ом на протяжении " + (int)getWorkExperience() + " лет. " + checkDiploma(isDiploma()));
    }

    /**
     *
     * Проверка на наличие диплома
     *
     * @param doYouHaveDiploma
     *
     * @return
     * Вернет строку соответсвующую пришедшему параметрую. Если "true", то "Диплома у меня нет.".
     * В случае если пришедший параметр "false" - передастся строка "У меня есть диплом."
     */
    String checkDiploma(boolean doYouHaveDiploma){

        boolean terms = false;
        return terms == doYouHaveDiploma ? "Диплома у меня нет." : "У меня есть диплом.";
    }

    public AbstractEmployee() {
    }

    public AbstractEmployee(String name, String fieldOfActivity, double workExperience, boolean diploma) {
        this.name = name;
        this.fieldOfActivity = fieldOfActivity;
        this.workExperience = workExperience;
        this.diploma = diploma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean isDiploma() {
        return diploma;
    }

    public void setDiploma(boolean diploma) {
        this.diploma = diploma;
    }

    public double getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(double workExperience) {
        this.workExperience = workExperience;
    }

    public String getFieldOfActivity() {
        return fieldOfActivity;
    }

    public void setFieldOfActivity(String fieldOfActivity) {
        this.fieldOfActivity = fieldOfActivity;
    }

}
