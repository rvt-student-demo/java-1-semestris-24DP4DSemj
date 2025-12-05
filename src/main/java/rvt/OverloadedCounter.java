package rvt;

public class OverloadedCounter {
    int startValue;
    int value;

    public OverloadedCounter() {
        this.value = 0;
    }

    public OverloadedCounter(int startValue) {
        this.value = startValue;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        if (this.value > this.startValue) {
            this.value--;
        }
    }

    public void increase(int increaseBy) {
        if (increaseBy < 0) {
            return;
        }
        this.value += increaseBy;
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy < 0) {
            return;
        }
        if (this.value - decreaseBy < this.startValue) {
            this.value = this.startValue;
        } else {
            this.value -= decreaseBy;
        }
    }
}