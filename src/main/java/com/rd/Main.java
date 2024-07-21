package com.rd;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for(planet planet : planet.values()){
            System.out.println("Planet: " + planet.name());
            System.out.println("The order number from the sun " + planet.getRankingNo());
            System.out.println("Distance from the Sun: " + planet.getDistance() + " million km");
            System.out.println("Radius: " + planet.getRadius() + " km");
            System.out.println("Rotation Period: " + planet.getTurnaroundTime()+ " days");
        }
    }
}