import java.text.NumberFormat;
import java.util.Locale;

public class RelatorioDeDivida {
	private Divida divida;
	
	public RelatorioDeDivida(Divida divida){
		this.divida = divida;
	}

	public void geraRelatorio(NumberFormat formatador){
		System.out.println("CNPJ credor: "+ divida.getDocumentoCredor());

		System.out.println("Credor: "+ divida.getCredor());

		
		System.out.println("Valor da dívida: "+ formatador.format( divida.getTotal() ) );

		System.out.println("Valor pago: "+ formatador.format( divida.getValorPago() ) );

	}

	public static void main(String[] args){
		Divida divida = new Divida();
		divida.setCredor("Uma empresa");
		divida.setTotal(100);
		
		divida.setDocumentoCredor( new Cpf("00.000.001-11") );

		Pagamento pagamento = new Pagamento();
		pagamento.setDocumentoPagador(new Cnpj("00.000.002/0002-02"));
		pagamento.setPagador("Outra empresa");
		pagamento.setValor(90);
		divida.registra(pagamento);

		RelatorioDeDivida relatorio = new RelatorioDeDivida(divida);
		NumberFormat formatador  = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		relatorio.geraRelatorio(formatador);

		NumberFormat formatador1  = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
		relatorio.geraRelatorio(formatador1);

	}
}