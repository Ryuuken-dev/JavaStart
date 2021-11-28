package OOP;


public class Company {

    Employee worker1 = new Employee("Jan", "Kowalski", 2000, 2);
    Employee worker2 = new Employee("Jarosław", "Zwain", 1989, 5);
    Employee worker3 = new Employee("Aurelia", "Fendt", 1992, 3);
    Employee[] employeeCollection = {worker1, worker2, worker3};

    public StringBuilder getWorkers() {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (Employee employee : employeeCollection) {
            result.append("Worker " + ++count + '\n' + "Name: " + employee.getName() + '\n' +
                    "Surname: " + employee.getSurname() + '\n' +
                    "Birth year: " + employee.getBirthYear() + '\n' + "Experience: " +
                    employee.getWorkExperience() + '\n' + '\n');

        }

        return result;
        }

    }

