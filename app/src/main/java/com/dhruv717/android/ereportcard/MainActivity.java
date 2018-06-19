package com.dhruv717.android.ereportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String chemistryGrade;
    String englishGrade;
    String mathGrade;
    String historyGrade;
    String biologyGrade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Grade> subjectGraded = new ArrayList<>();
        subjectGraded.add(new Grade("A+","Mathematics","Slot-A"));
        subjectGraded.add(new Grade("B-","Biology","Slot-B"));
        subjectGraded.add(new Grade("A-","English","Slot-A"));
        subjectGraded.add(new Grade("B+","Chemistry","Slot-B"));
        subjectGraded.add(new Grade("O","Computer Science","Slot-C"));
        ListView listView = findViewById(R.id.list_view);
        GradeAdapter gradeAdapter = new GradeAdapter(this,subjectGraded);
        listView.setAdapter(gradeAdapter);
    }


}
