/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unidf.Testes;

import br.unidf.DAL.ClienteDAL;
import br.unidf.DTO.ClienteDTO;

/**
 *
 * @author profe
 */
public class TesteIncluir {
    public static void main(String[] args) throws Exception
    {
        ClienteDTO cliente = new ClienteDTO();
        cliente.setCliNome("Rafael Teste");
        cliente.setCliDtInclusao(java.time.LocalDate.now());
        cliente.setCliEndereco("Rua Teste, 15");
        cliente.setCliBairro("Java Norte");
        cliente.setCliEmail("java15@teste.com");
        cliente.setCliTel("77777777");
        cliente.setCliCidade("Java");
        cliente.setCliUF("JV");
        ClienteDAL dal = new ClienteDAL();
        dal.incluirCliente(cliente);
        System.out.print("Cliente " + cliente.getCliNome() + " Cadastrado com sucesso!");
    }    
}