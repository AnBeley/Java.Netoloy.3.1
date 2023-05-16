public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float meters = 1.87F;
        float kg = 98;
        int bmi = service.calculate(kg, meters);
        System.out.println(bmi);
    }
}