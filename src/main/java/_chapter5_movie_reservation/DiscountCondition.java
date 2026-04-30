package _chapter5_movie_reservation;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
