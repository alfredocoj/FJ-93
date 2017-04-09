import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

public class Pagamentos implements Iterable<Pagamento> {
	
	private double valorPago;
	private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
	
	public double getValorPago() {
		return valorPago;
	}
	
	public void registra(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
        this.paga(pagamento.getValor());
    }
	
	// métodos que trabalham com a lista de pagamentos
    public Collection<Pagamento> pagamentosAntesDe(Calendar data) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getData().before(data)) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    
    public ArrayList<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getValor() > valorMinimo) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    public Collection<Pagamento> pagamentosDo(Documento documentoPagador) {
    	Collection<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getDocumentoPagador().equals(documentoPagador)) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    
    public void paga(double valor) {
        if (valor < 0) {
          throw new IllegalArgumentException("Valor invalido para pagamento");
        }
        if (valor > 100) {
          valor = valor - 8;
        }
        this.valorPago += valor;
    }

	@Override
	public Iterator<Pagamento> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
