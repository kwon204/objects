package _chapter2_movie_reservation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Movie 클래스")
class MovieTest {

    @DisplayName("calculateMovieFee 메소드는")
    @Nested
    class Describe_calculateMovieFee {

        @Nested
        @DisplayName("상영 시간에 만족하는 할인 조건이 없다면")
        class Context_is_not_satisfied_by_discount_condition {

            @Test
            @DisplayName("0원을 리턴한다.")
            void It_returns_zero() {

            }
        }
    }
}