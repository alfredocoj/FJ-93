import java.util.HashMap;

public class BalancoEmpresa {
	private HashMap<String, Divida> dividas = new HashMap<String, Divida>();
	
	public void registraDivida(Divida divida) {
		//String credor, String cnpjCredor, double valor
		//Divida divida = new Divida();
        ///divida.setTotal(valor);
        //divida.setCredor(credor);
        //divida.getCnpjCredor().setCnpjCredor(cnpjCredor); // agora usamos o getter e depois o setter
        dividas.put(divida.getCnpjCredor().getCnpjCredor(), divida);
    }

    public void pagaDivida(String cnpjCredor, Pagamento pagamento) {
        Divida divida = dividas.get(cnpjCredor);
        if (divida != null) {
        	//double valor, String nomePagador, String cnpjPagador
            //Pagamento pagamento = new Pagamento();
            //pagamento.setCnpjPagador(cnpjPagador);
            //pagamento.setPagador(nomePagador);
            //pagamento.setValor(valor);
            divida.getPagamentos().registra(pagamento);
        }
    }
}
