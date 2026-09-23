public class Weight {
    private int pounds;
    private int ounces;

    public Weight(int ounces) {
        this(ounces, 0);
    }

    public Weight(int ounces, int pounds) {
        if (ounces >= 0) {
            if (ounces < 16) {
                this.ounces = ounces;
            }
        }
        if (pounds > 0)
            this.pounds = pounds;
    }

    public int totalOunces(){
        return this.ounces + 16 * this.pounds;
    }

    public Weight multiple(int scale){
        int newOunces = totalOunces() * scale;
        int p = newOunces/16;
        int o = newOunces % 16;
        return new Weight(o,p);
    }

    public boolean isHeavier(Weight other){
        int totalW = totalOunces();
        int otherW = other.totalOunces();
        if(totalW > otherW)
            return true;
        else
            return false;
    }

    public void print(){
        System.out.println(this.pounds + " pounds, " + this.ounces + " ounces.");
    }
}