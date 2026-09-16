package Smart_Home_Project;

import java.util.Scanner;

public class SmartHome {
	int temperature, lightlevel, time;

//  Method is written with return Type .
	public String checkTemperature() {
		if (temperature >= 35) {
			return "The AC is On.";
		} else if (temperature >= 25) {
			return "The Fan is On.";
		} else {
			return "Cooling Off.";
		}
	}

//  Method is written with return Type .
	public String checkLight() {
		if (lightlevel <= 3) {
			return "Lights On.";
		} else {
			return "Lights Off.";
		}

	}

//  Method is written with return Type .
	public String checkTime() {

		if (time >= 6 && time <= 11) {
			return "Morning Mode Activated.";
		} else if (time >= 12 && time <= 17) {
			return "Afternoon Mode Activated.";
		} else if (time >= 18 && time <= 21) {
			return "Evening Mode Activated.";
		} else {
			return "Night Mode Activated.";
		}

	}

//  Method is written with return Type .
	public String checkDoorLock() {
		if (time >= 22 && time <= 23 || time >= 0 && time <= 5) {
			return "Door Locked (Night Security On.)";
		} else {
			return "Door Unlocked (Day Mode.)";
		}
	}

	public void runSystem() {
		Scanner sc = new Scanner(System.in);
		SmartHome sm = new SmartHome();
		System.out.println("Enter Temperature : ");
		sm.temperature = sc.nextInt();
		System.out.println("Enter Light : ");
		sm.lightlevel = sc.nextInt();
		System.out.println("Enter Time : ");
		sm.time = sc.nextInt();
		System.out.println("The Details Are :");
		System.out.println(sm.checkTemperature());
		System.out.println(sm.checkLight());
		System.out.println(sm.checkTime());
		System.out.println(sm.checkDoorLock());
	}
}
