package com.example.weaslymath;

public class Score {
    Long time = System.currentTimeMillis();
    int score =0;

    public Score(Long time, int score) {
        this.time = time;
        this.score = score;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}


