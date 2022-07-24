package com.effectivejava.study.chapter06.Item34;

import static com.effectivejava.study.chapter06.Item34.PayrollDayV2.PayType.WEEKDAY;
import static com.effectivejava.study.chapter06.Item34.PayrollDayV2.PayType.WEEKEND;

public enum PayrollDayV2 {

    MONDAY(WEEKDAY), TUESDAY(WEEKDAY),
    WEDNESDAY(WEEKDAY), THURSDAY(WEEKDAY), FRIDAY(WEEKDAY),
    SATURDAY(WEEKEND), SUNDAY(WEEKEND);

    private final PayType payType;

    PayrollDayV2(PayType payType) {
        this.payType = payType;
    }

    int pay(int minutesWorkd, int payRate) {
        return payType.pay(minutesWorkd, payRate);
    }

    enum PayType {

        WEEKEND {
            @Override
            int overtimePay(int mins, int payRate) {
                return mins * payRate / 2;
            }
        },

        WEEKDAY {
            @Override
            int overtimePay(int mins, int payRate) {
                return mins <= MINS_PER_SHIFT ? 0 : (mins - MINS_PER_SHIFT) * payRate / 2;
            }
        };

        abstract int overtimePay(int mins, int payRate);
        private static final int MINS_PER_SHIFT = 8 * 60;

        int pay(int minutesWorkd, int payRate) {
            int basePay = minutesWorkd * payRate;
            return basePay + overtimePay(minutesWorkd, payRate);
        }
    }
}
