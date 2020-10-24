package pl.kzlamaniec.cc;

import pl.kzlamaniec.cc.factory.Employee;
import pl.kzlamaniec.cc.factory.FactoryConfiguration;
import pl.kzlamaniec.cc.factory.Product;


public final class Cli {
    public static void main(String[] args){
        System.out.println("Hello World");

        Employee employee = FactoryConfiguration.getResponsible();
        Product p1 = employee.doWork();
        Product p2 = employee.doWork();
        Product p3 = employee.doWork();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
