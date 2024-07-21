package com.rd;

public enum planet {
    Mercury(1, 2, 3, 4),
    Venus(5,6,7,8),
    Earth(9,10,11,12),
    Mars(13,14,15,16),
    Jupiter(17,18,19,20),
    Saturn(21,22,23,24),
    Uranus(25,26,27,28),
    Neptune(29,30,31,32);

    int rankingNo;
    int distance;
    int radius;
    int turnaroundTime;

    planet(int rankingNo, int distance, int radius, int turnaroundTime) {
        this.rankingNo = rankingNo;
        this.distance = distance;
        this.radius = radius;
        this.turnaroundTime = turnaroundTime;
    }

    public int getRankingNo(){
        return rankingNo;
    }
    public int getDistance(){
        return distance;
    }
    public int getRadius(){
        return radius;
    }
    public int getTurnaroundTime(){
        return turnaroundTime;
    }

}
