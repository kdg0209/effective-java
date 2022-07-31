package com.effectivejava.study.chapter07.Item45;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Card {

    public enum Suit {
        SPADE, HEART, DIAMOND, CLUB
    }

    public enum Rank {
        ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN,
        EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit + "S";
    }

    public static List<Card> forExam() {
        List<Card> result = new ArrayList<>();
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                result.add(new Card(s, r));
            }
        }
        return result;
    }

    public static List<Card> streamExam() {
        return Stream.of(Suit.values())
                .flatMap(s ->
                        Stream.of(Rank.values())
                                .map(r -> new Card(s, r))
                )
                .collect(Collectors.toList());
    }
}
