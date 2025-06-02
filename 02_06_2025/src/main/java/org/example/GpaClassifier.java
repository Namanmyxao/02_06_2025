package org.example;

public class GpaClassifier{
    public String classify(double GPA){
        if(GPA>3.6 && GPA<4.0){
            return "Excellent";
        } else if (GPA>3.5 && GPA<3.59) {
            return "Good";
        } else if (GPA>2.0 && GPA<2.99) {
            return  "Average";
        } else {
            return "Poor";
        }
    }
}