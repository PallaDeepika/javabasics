package Abstarct;

public class Wiring {
	public static void main(String[] args) {
		ISwitchBoardListener sListener = new SolarAppliance();
		sListener.switchOne();
		sListener.switchTwo();
		sListener.switchThree(12);
		sListener.switchFour();
	}
}


