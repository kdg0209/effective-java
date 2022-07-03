package com.effectivejava.study.chapter01.item08;

import java.lang.ref.Cleaner;

public class Room implements AutoCloseable {

    private static final Cleaner cleaner = Cleaner.create();

    // 방의 상태 cleanable과 공유
    private final State state;

    private final Cleaner.Cleanable cleanable;

    public Room(int numJunkPiles) {
        state = new State(numJunkPiles);
        cleanable = cleaner.register(this, state);
    }

    @Override
    public void close() throws Exception {
        cleanable.clean();
    }

    // 청소가 필요한 자원. 절대 Room을 참조해서는 안된다.
    private static class State implements Runnable {

        int numJunkPiles; // 방(Room)안의 쓰래기 수

        public State(int numJunkPiles) {
            this.numJunkPiles = numJunkPiles;
        }

        @Override
        public void run() {
            System.out.println("방 청소");
            numJunkPiles = 0;
        }
    }
}
