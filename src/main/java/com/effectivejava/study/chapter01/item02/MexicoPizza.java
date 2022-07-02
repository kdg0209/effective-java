package com.effectivejava.study.chapter01.item02;

public class MexicoPizza extends Pizza {

    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {

        private boolean sauceInside = false;

        public Builder sauceInside() {
            sauceInside = true;
            return this;
        }

        @Override
        public MexicoPizza build() {
            return new MexicoPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private MexicoPizza(Builder builder) {
        super(builder);
        this.sauceInside = builder.sauceInside;
    }
}
