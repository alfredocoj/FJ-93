//import java.util.HashMap;

public class BalancoEmpresa {
	//private HashMap<String, Divida> dividas = new HashMap<String, Divida>();
	private ArmazenadorDeDividas dividas;
	
	public BalancoEmpresa(ArmazenadorDeDividas dividas) {
		this.dividas = dividas;
	}
	
	public void registraDivida(Divida divida) {
		//String credor, String cnpjCredor, double valor
		//Divida divida = new Divida();
        ///divida.setTotal(valor);
        //divida.setCredor(credor);
        //divida.getCnpjCredor().setCnpjCredor(cnpjCredor); // agora usamos o getter e depois o setter
        //dividas.put(divida.getDocumentoCredor(), divida);
		//dividas.carrega(divida.getDocumentoCredor());
		dividas.salva(divida);
    }

    public void pagaDivida(Documento documentoCredor, Pagamento pagamento) {
        //Divida divida = dividas.get(cnpjCredor);
    	Divida divida = dividas.carrega(documentoCredor);
        if (divida != null) {
        	//double valor, String nomePagador, String cnpjPagador
            //Pagamento pagamento = new Pagamento();
            //pagamento.setCnpjPagador(cnpjPagador);
            //pagamento.setPagador(nomePagador);
            //pagamento.setValor(valor);
            divida.registra(pagamento);
        }
        dividas.salva(divida);
    }
}
