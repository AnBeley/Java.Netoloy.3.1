public class BmiService {

    public int calculate(float kg, float meters) {
        float bmi = kg / (meters * meters);
        return (int) bmi;
    }
}
