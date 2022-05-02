public class InvoiceSummary {
    public final int noOfRides;
    public final double totalFare;
    public final double averageFare;


    public InvoiceSummary(int noOfRides, double totalFare) {
        this.noOfRides = noOfRides;
        this.totalFare = totalFare;
        this.averageFare = totalFare / noOfRides;
    }

    @Override
    public boolean equals(Object o) {
        // TODO Auto-generated method stub
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return noOfRides == that.noOfRides && Double.compare(that.totalFare, this.totalFare) == 0
                && Double.compare(that.averageFare, this.averageFare) == 0;
    }
}