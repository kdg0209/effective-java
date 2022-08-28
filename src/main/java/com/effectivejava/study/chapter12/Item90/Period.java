package com.effectivejava.study.chapter12.Item90;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;

public final class Period implements Serializable {

    private static final long serialVersionUID = 1L;
    private final Date start;
    private final Date end;

    public Period(Date start, Date end) {
        if (start.compareTo(end) > 0) {
            throw new IllegalArgumentException(start + "가" + end + "보다 늦습니다.");
        }
        this.start = start;
        this.end = end;
    }

    // 직렬화 프록시 패턴용 writeReplace 메서드
    private Object writeReplace() {
        return new SerializationProxy(this);
    }

    // 직렬화 프록시 패턴용 readObject 메서드
    private void readObject(ObjectInputStream s) throws IOException {
        throw new InvalidObjectException("Proxy required !");
    }

    // 직렬화 프록시 클래스
    private static class SerializationProxy implements Serializable {

        private static final long serialVersionUID = 1L;
        private final Date start;
        private final Date end;

        public SerializationProxy(Period period) {
            this.start = period.start;
            this.end = period.end;
        }

        private Object readResolve() {
            return new Period(start, end);
        }
    }
}
