package practicaExcepciones;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Boat boat;
		boolean cancel = false;
		String[] message = { "Barco", "Velero", "Deportiva", "Yate" };
		int selec=JOptionPane.showOptionDialog(null, "Que barco quieres crear", "Elige 1",  JOptionPane.CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, message, null);
		int inputInt;
		switch (selec) {
		case 0:// Boat
			boat = new Boat();
			try {			
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "plate of the boat?:"));
				boat.setPlate(inputInt);
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "length(in meters) of the boat?:"));
				boat.setLength(inputInt);
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "year of manufacture of the boat?:"));
				boat.setYear(inputInt);
			} catch (Exception e) {
				System.out.println("Errores encontrados, ejecución suspendida");
				cancel = true;
			}
			break;
		case 1:// Sailboat
			boat = new Sailboat();
			try {
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "plate of the boat?:"));
				boat.setPlate(inputInt);
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "length(in meters) of the boat?:"));
				boat.setLength(inputInt);
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "year of manufacture of the boat?:"));
				boat.setYear(inputInt);
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "numero de mastiles?:"));
				((Sailboat) boat).setMasts(inputInt);
			} catch (Exception e) {
				System.out.println("Errores encontrados, ejecución suspendida");
				cancel = true;
			}
			break;
		case 2:
			boat = new Sporty();
			try {
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "plate of the boat?:"));
				boat.setPlate(inputInt);
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "length(in meters) of the boat?:"));
				boat.setLength(inputInt);
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "year of manufacture of the boat?:"));
				boat.setYear(inputInt);
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "potencias?:"));
				((Sporty) boat).setPower(inputInt);
			} catch (Exception e) {
				System.out.println("Errores encontrados, ejecución suspendida");
				cancel = true;
			}
			break;
		case 3:
			boat = new Yacht();
			try {
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "plate of the boat?:"));
				boat.setPlate(inputInt);
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "length(in meters) of the boat?:"));
				boat.setLength(inputInt);
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "year of manufacture of the boat?:"));
				boat.setYear(inputInt);
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "potencias?:"));
				((Sporty) boat).setPower(inputInt);
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "number of cabins?:"));
				((Yacht) boat).setPower(inputInt);
			} catch (Exception e) {
				System.out.println("Errores encontrados, ejecución suspendida");
				cancel = true;
			}
			break;
		default:
			boat = new Boat();
			cancel = true;
		}
		if (!cancel) {
			int[] inputPos = new int[2];
			Rental r1 = new Rental();
			r1.setDNI(JOptionPane.showInputDialog(null, "DNI of the boat's owner?:"));
			inputPos[0] = Integer.parseInt(JOptionPane.showInputDialog(null, "Position in mooring (X Coordinate)?:"));
			inputPos[1] = Integer.parseInt(JOptionPane.showInputDialog(null, "Position in mooring (Y Coordinate):"));
			r1.setMooringPos(inputPos);
			r1.setBoat(boat);
			// Me falla el calculo de la resta de días (Rental.calculateRental)
			JOptionPane.showMessageDialog(null, "price of the rental of Boat 1 = " + r1.calculateRental());
		}
	}
}
