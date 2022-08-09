package com.effectivejava.study.chapter09.Item58;

import com.effectivejava.study.chapter07.Item47.Collection;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ExampleV2 {

    static class Card {

        Suit suit;
        Rank rank;

        public Card(Suit suit, Rank rank) {
            this.suit = suit;
            this.rank = rank;
        }
    }
    enum Suit { CLUB, DIAMOND, HEART, SPADE}
    enum Rank { ACE, DEUCE, THREE,
                FOUR, FIVE, SIX, SEVEN,
                EIGHT, NINE, TEN, JACK,
                QUEEN, KING
    }

    static List<Suit> suits = Arrays.asList(Suit.values());
    static List<Rank> ranks = Arrays.asList(Rank.values());

    public static void main(String[] args) {

        List<Card> deck = new ArrayList<>();
        for (Suit suit : suits) {
            for (Rank rank : ranks) {
                deck.add(new Card(suit, rank));
            }
        }
    }
}
