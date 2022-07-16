package com.effectivejava.study.chapter03.Item22;

import lombok.Getter;

public enum PhysicalConstantsEnum {

    AVOGADROS_NUMBER(6.022_140_857e23),
    BOLTZMAN_CONSTANT(6.022_140_857e23),
    ELECTRON_MASS(6.022_140_857e23);
    @Getter
    private double val;

    PhysicalConstantsEnum(double val) {
        this.val = val;
    }
}
