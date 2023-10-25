package q1_PedroVictorBraga;

public class Main {

	public static void main(String[] args) {
		// Cria uma Company
        Company myCompany = new Company("UniDevs");

        // Cria algumas instâncias de Employee
        Employee employee1 = new Employee("Pedro Víctor");
        Employee employee2 = new Employee("Lucas Cardoso");

        // Cria alguns Vehicle
        Vehicle vehicle1 = new Vehicle("498-UTC");
        Truck truck1 = new Truck("821-TIF", 3000);
        Car car1 = new Car("666-OPS", "Automático");

        // Contrate os funcionários
        myCompany.Employs(employee1);
        myCompany.Employs(employee2);

        // Adicione veículos à empresa
        myCompany.Hire(vehicle1);
        myCompany.Hire(truck1);
        myCompany.Hire(car1);

        // Mostrar o nome da empresa
        myCompany.CompName();

        // Mostrar os nomes dos funcionários
        employee1.EmploName();
        employee2.EmploName();

        //Atribui um veiculo a um funcionário
        employee1.Drives(car1);
        employee2.Drives(truck1);

        //Mostra o veiculo do funcionário
        employee1.WhatDrive();
        employee2.WhatDrive();

	}

}
