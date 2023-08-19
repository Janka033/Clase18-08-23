package Arrays;

import java.lang.reflect.Array;

public class MainServicio {
    public static void main(String[] args) {
        ServiceMovil[] serviceMovils = new ServiceMovil[2];
        Cliente cliente = new Cliente(1095208076,"Jan Carlos Guevara Perdomo");
        Array.set(serviceMovils,0,new ServiceMovil(cliente,310727366));
        System.out.println(serviceMovils[0].getCliente());
        System.out.println(serviceMovils[0].getNumeroCelular());
    }
}
