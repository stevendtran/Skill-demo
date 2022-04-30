public class SkillDemo{
    static double conversionK = 0.453592;
 
    public static double convertLbs(double lbs){
        return lbs * conversionK;
    }
 
    public static double convertKgs(double kgs){
        return kgs / conversionK;
    }
}

