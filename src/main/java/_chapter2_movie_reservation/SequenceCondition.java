package _chapter2_movie_reservation;

public class SequenceCondition implements DiscountCondition {
    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfied(Screening screening) {
        return screening.isSequence(sequence);
    }
}
