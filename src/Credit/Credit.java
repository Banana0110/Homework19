package Credit;

public class Credit {
    public String Id;
    public int sum;
    public String period;
    public Double interestrate;
    public static int count;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Double getInterestrate() {
        return interestrate;
    }

    public void setInterestrate(Double interestrate) {
        this.interestrate = interestrate;
    }


    public Credit() {
        count++;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "Id='" + Id + '\'' +
                ", sum=" + sum +
                ", period=" + period +
                ", interestrate=" + interestrate +
                '}';
    }
}
