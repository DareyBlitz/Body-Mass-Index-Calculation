public class BmiService {

    public int index(double height, double weight) {
        double twoHeight = (height * height);

        double result = weight / twoHeight;
        return (int) result;

    }

}
