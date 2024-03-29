package day16_switch_ternary;

import javax.sound.midi.Soundbank;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 1;
        if (floorNum == 1){
            System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
        }else if (floorNum == 2){
            System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
        }else if (floorNum == 3){
            System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house" );
        }else {
            System.out.println("Invailid floor - " + floorNum);
        }

        System.out.println("========SWITCH STATEMENT VERSION========");

        floorNum = 4;
        switch (floorNum) {
            case 1:
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                break;
            case 2:
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
                break;
            case 3:
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
                break;
            default:
                System.out.println("Invalid floor - " + floorNum);
                break;
        }
    }
}
