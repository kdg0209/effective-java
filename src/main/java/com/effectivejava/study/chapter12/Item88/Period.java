package com.effectivejava.study.chapter12.Item88;

import lombok.ToString;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;

@ToString
public final class Period implements Serializable {

    private Date start;
    private Date end;

    public Period(Date start, Date end) {
        this.start = new Date(start.getTime()); // 방어적 복사
        this.end = new Date(end.getTime());     // 방어적 복사

        // 유효성 검사
        if (this.start.compareTo(this.end) > 0)
            throw new IllegalArgumentException(this.start + "가 " + this.end + "보다 늦다.");
    }

    public Date start() {
        return new Date(start.getTime());
    }

    public Date end() {
        return new Date(end.getTime());
    }

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        s.defaultReadObject();

        this.start = new Date(start.getTime()); // 방어적 복사
        this.end = new Date(end.getTime());     // 방어적 복사


        if (this.start.compareTo(this.end) > 0)
            throw new IllegalArgumentException(this.start + "가 " + this.end + "보다 늦다.");
    }
}
