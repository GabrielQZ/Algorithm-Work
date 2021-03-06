package com.company;

public class OccupantCLI {

    public static void addOccupantsToVehicle( Vehicle vehicle, int passengers) {

        System.out.println("\nFirst you will need to add an operator.");
        String question = "\nEnter the operators name\nName: ";
        //create a new operator
        String operatorsName = CLI.stringQuestion(question);
        Operator vehicleOperator = new Operator(operatorsName);
        //add to simulation and add as operator of new vehicle
        vehicleOperator.occupying = vehicle;
        vehicle.addOperator( vehicleOperator );
        EntityManager.addOperator( vehicleOperator );

        for (int i = 1; i <= passengers; i++) {
            createAndAddPassenger( vehicle, i );
        }

        System.out.println("\nYour new vehicle is now in storage!\n");

    }

    private static void createAndAddPassenger(Vehicle vehicle, int passengerNum) {

        String question = "\nEnter the passenger #" + passengerNum +"'s name\nName: ";
        //get input from user and create new passenger instance
        String passengersName = CLI.stringQuestion(question);
        Passenger vehiclePassenger = new Passenger(passengersName);
        //add new passenger to simulation and new vehicle
        vehiclePassenger.occupying = vehicle;
        vehicle.addPassenger( vehiclePassenger );
        EntityManager.addPassenger( vehiclePassenger );
    }

}
