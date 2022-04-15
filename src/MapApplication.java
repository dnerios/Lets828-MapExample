import domain.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapApplication {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("F","Amanda", "1111111", "Rua do Diego");
        Cliente c2 = new Cliente("M","Joao", "22222222", "Rua do Diego");
        Cliente c3 = new Cliente("F","Lara", "33333333", "Rua do Diego");
        Cliente c4 = new Cliente("M","Alex", "4444444", "Rua do Diego");


        List<Cliente> listaClientes = new ArrayList<>();

        listaClientes.add(c1);
        listaClientes.add(c2);
        listaClientes.add(c3);
        listaClientes.add(c4);

        List<String> telefones = new ArrayList<>();
        for (Cliente c : listaClientes) {
            if(c.getSexo() == "F") {
                telefones.add(c.getTelefone());
            }
        }

        System.out.println(telefones);

        List<String> telefonesMap = listaClientes.stream()
                .map(cliente -> cliente.getTelefone())
                .collect(Collectors.toList());

        List<Cliente> clienteMap = listaClientes.stream()
                .filter(cliente -> cliente.getTelefone() == "11111111")
                .collect(Collectors.toList());

        List<String> filtroClienteMap = listaClientes.stream()
                .filter(c -> c.getSexo() == "F")
                .map(c -> c.getTelefone())
                .collect(Collectors.toList());


        System.out.println(telefonesMap);
        System.out.println(filtroClienteMap);

    }
}
