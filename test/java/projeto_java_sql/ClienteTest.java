package projeto_java_sql;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import dao.IClienteDAO;

public class ClienteTest {
	
	private IClienteDAO clienteDAO;
	
	@Test
	public void cadastrarTest() throws Exception {
		Cliente cliente=new Cliente();
		cliente.setCodigo("10");
		cliente.setNome("Rodrigo Pires");
		Integer countCad=clienteDAO.cadastrar(cliente);
		assertTrue(countCad==1);

		Cliente clienteBD=clienteDAO.buscar("10");
		assertNotNull(clienteBD);
		assertEquals(cliente.getCodigo(),clienteBD.getCodigo());
		assertEquals(cliente.getNome(),clienteBD.getNome());
		
		Integer countDel=clienteDAO.excluir(clienteBD);
		assertTrue(countDel==1);
		
	}
	@Test
	public void buscarTest() throws Exception{
		Cliente cliente=new Cliente();
		cliente.setCodigo("10");
		cliente.setNome("Rodrigo Pires");
		Integer countCad=clienteDAO.cadastrar(cliente);
		assertTrue(countCad==1);
	}
	
}
