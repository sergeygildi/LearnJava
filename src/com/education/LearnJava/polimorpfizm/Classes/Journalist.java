package com.education.LearnJava.polimorpfizm.Classes;

import com.education.LearnJava.polimorpfizm.Abstracts.AbstractEmployee;

/**
 * Created by Serhii Hildi on 22.10.18.
 */
public class Journalist extends AbstractEmployee {

    @Override
    public void introduceYourself() {
        super.introduceYourself();
    }

    public Journalist(String name, String fieldOfActivity, double workExperience, boolean diploma) {
        super(name, fieldOfActivity, workExperience, diploma);
    }
}
