package com.example.trialassignment.constant;

import com.example.trialassignment.R;
import com.example.trialassignment.model.ExploreModel;

import java.util.ArrayList;

public class Constants

{
    public static ArrayList<ExploreModel> getPersonalData()
    {
        // create an ArrayList of type Employee class
        ArrayList<ExploreModel> employeeList
                = new ArrayList<ExploreModel>();
        ExploreModel emp1 = new ExploreModel("Divina Mahatani",
                "Mumbai | Student","Within 500-600 m",70,"Coffee | Business | Friendship","Hi community!I am open to new connections");
        employeeList.add(emp1);
        ExploreModel emp2
                = new ExploreModel("Ram prakash", "Mumbai | Student","Within 500-600 m",20,"Coffee | Business | Friendship","Hi community!I am open to new connections");
        employeeList.add(emp2);
        ExploreModel emp3 = new ExploreModel("OMM Meheta",
                "Mumbai | Student","Within 500-600 m",40,"Coffee | Business | Friendship","Hi community!I am open to new connections");
        employeeList.add(emp3);
        ExploreModel emp4 = new ExploreModel("Hari Mohapatra",
                "Mumbai | Student","Within 500-600 m",75,"Coffee | Business | Friendship","Hi community!I am open to new connections");
        employeeList.add(emp4);
        ExploreModel emp5 = new ExploreModel(
                "Abhisek Mishra", "Mumbai | Student","Within 500-600 m",10,"Coffee | Business | Friendship","Hi community!I am open to new connections");
        employeeList.add(emp5);
        ExploreModel emp6 = new ExploreModel("Sindhu Malhotra",
                "Mumbai | Student","Within 500-600 m",95,"Coffee | Business | Friendship","Hi community!I am open to new connections");
        employeeList.add(emp6);

        return employeeList;
    }

    public static ArrayList<ExploreModel> getBusinessData()
    {
        // create an ArrayList of type Employee class
        ArrayList<ExploreModel> employeeList
                = new ArrayList<ExploreModel>();
        ExploreModel emp1 = new ExploreModel("Shweta Joisher",
                "Mumbai, within 600-700 m","",60,"Student | 0 years of experience","Hi community!I am open to new connections");
        employeeList.add(emp1);
        ExploreModel emp2
                = new ExploreModel("Soniya Daryani",
                "Mumbai, within 1.7 KM","",10,"Student | 0 years of experience","Hi community!I am open to new connections");
        employeeList.add(emp2);
        ExploreModel emp3 = new ExploreModel("Shweta Joisher",
                "Thane, within 4.3 KM","",90,"Software Developer | 2 years of experience","Hi community!I am open to new connections");
        employeeList.add(emp3);
        ExploreModel emp4 = new ExploreModel("Sayli Bhalekar",
                "Mumbai, within 4.7 KM","",20,"Career Counsellor | 3 years of experience","Hi community!I am open to new connections");
        employeeList.add(emp4);
        ExploreModel emp5 = new ExploreModel(
                "Shashank Gore",
                "Mumbai, within 5.7 KM","",50,"Software Tester | 1 years of experience","Hi community!I am open to new connections");
        employeeList.add(emp5);
        ExploreModel emp6 = new ExploreModel("Ajay Patil",
                "Thane, Mumbai, within 7.3 KM","",35,"Coach Member | 30 years of experience","Hi community!I am open to new connections");
        employeeList.add(emp6);

        return employeeList;
    }


    public static ArrayList<ExploreModel> getMerchanData()
    {
        // create an ArrayList of type Employee class
        ArrayList<ExploreModel> employeeList
                = new ArrayList<ExploreModel>();
        ExploreModel emp1 = new ExploreModel("Bonnie'S Bakery",
                "Mumbai, within 200-500 m",30,"Hi community!I am open to new connections");
        employeeList.add(emp1);
        ExploreModel emp2
                = new ExploreModel("Shree Laxmi Services",
                "Mumbai, within 400-900 m",30,"Hi community!I am open to new connections");
        employeeList.add(emp2);
        ExploreModel emp3 = new ExploreModel("Tattoo Studio",
                "Mulund West, within 600-700 m",30,"Hi community!I am open to new connections");
        employeeList.add(emp3);
        ExploreModel emp4 = new ExploreModel("Ks Softech-Software Company",
                "Mumbai, within 4.7 KM",30,"Hi community!I am open to new connections");
        employeeList.add(emp4);
        ExploreModel emp5 = new ExploreModel(
                "King Computer Point",
                "Mumbai, within 5.7 KM",30,"Hi community!I am open to new connections");
        employeeList.add(emp5);
        ExploreModel emp6 = new ExploreModel("10 Sports",
                "Thane, Mumbai, within 7.3 KM",30,"Hi community!I am open to new connections");
        employeeList.add(emp6);

        return employeeList;
    }

}
