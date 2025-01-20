package channelServiceSubscription;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Service {
    private int dailyPrice;
    private LocalDate dateSubscribed;

    public int getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(int dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public LocalDate getDateSubscribed() {
        return dateSubscribed;
    }

    public void setDateSubscribed(LocalDate dateSubscribed) {
        this.dateSubscribed = dateSubscribed;
    }

    public int dateDifference() {
        long daysBetween = ChronoUnit.DAYS.between(dateSubscribed, LocalDate.now());
        return (int) daysBetween;
    }

    abstract public int calcFee();
}
