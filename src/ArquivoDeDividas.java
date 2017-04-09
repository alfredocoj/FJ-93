import java.io.File;

public class ArquivoDeDividas implements ArmazenadorDeDividas {
      private File arquivo;

      public ArquivoDeDividas(String nomeDoArquivo) {
        this.setArquivo(new File(nomeDoArquivo));
      }

      @Override
      public Divida carrega(Documento documentoCredor) {
    	  Divida divida = new Divida();
    	  divida.setDocumentoCredor(documentoCredor);
        return divida;
      }

      @Override
      public void salva(Divida divida) {
        // grava no arquivo
      }

	public File getArquivo() {
		return arquivo;
	}

	public void setArquivo(File arquivo) {
		this.arquivo = arquivo;
	}
}