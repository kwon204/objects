package _chapter2_movie_reservation;

public interface DiscountCondition {
    boolean isSatisfied(Screening screening);
}
