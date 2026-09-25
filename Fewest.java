public class Fewest{
    private String tempStr;

    public void fewestComparisons(double temp){
        if (temp >= 80) {
            tempStr = "hot";
        } else if (temp >= 60 && temp < 80) {
            tempStr = "warm";
        } else if (temp >= 40 && temp < 60) {
            tempStr = "cool";
        } else if (temp < 40) {
            tempStr = "cold";
        }
        System.out.println(tempStr);
    }

}