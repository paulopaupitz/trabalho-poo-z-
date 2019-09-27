public class TstEstoque{

	public static void main(String arg[]){

		Salto sal = new Salto();
		Sandalia san = new Sandalia();
		Mocassim moca = new Mocassim();
		Leitura l = new Leitura();
				
		//String cores = l.inData("Informe a cor: ");  PEGA STRINGS
		//String numS = l.inData("Informe um numero: ");
		//int numI = Integer.parseInt(l.inData("Informe um numero: "));  PEGA NUMEROS
		
		san.setCor(l.inData("Informe a cor: "));
		san.setNum(Integer.parseInt(l.inData("Informe um numero: ")));

		san.getFabrica().setNome(l.inData("Informe o nome da empresa: "));	
		san.getFabrica().setCnpj(Integer.parseInt(l.inData("Informe o cnpj: ")));
		san.setMate(l.inData("Informe o material do chinelo: "));
		san.setModelo(l.inData("Informe o modelo: "));
		san.setPreco(Integer.parseInt(l.inData("Informe o preco: ")));
		
		System.out.println("\nCor: "+san.getCor());
		System.out.println("\nNumero: "+san.getNum());
		System.out.println("\nNome: "+san.getFabrica().getNome());
		System.out.println("\nCnpj: "+san.getFabrica().getCnpj());
		System.out.println("\nMaterial: "+san.getMate());
		System.out.println("\nModelo: "+san.getModelo());
		System.out.println("\nPreco: "+san.getPreco());

		moca.setCorsola((l.inData("Informe a cor da sola: ")));
		moca.setMarca((l.inData("Informe a marca do mocassim: ")));
		moca.setPalmilha((l.inData("Informe o tipo de palmilha: ")));
		moca.setTamanhoBico(Integer.parseInt(l.inData("Informe o tamanho do bico: ")));
		moca.setTamanhoFormato(Integer.parseInt(l.inData("Informe o tamanho do formato do mocassim: ")));
		
		System.out.println("\nMOCASSIM");
		System.out.println("\nCor da sola: "+moca.getCorSola());
		System.out.println("\nMarca: "+moca.getMarca());
		System.out.println("\nTipo de palmilha: "+moca.getPalmilha());
		System.out.println("\nTamanho do bico: "+moca.getTamanhoBico());
		System.out.println("\nTamanho do formato: "+moca.getTamanhoFormato());

		sal.setTipoSalto(l.inData("Tamanho do salto: "));
		sal.setTamSalto(Integer.parseInt(l.inData("Informe o tamanho do salto: ")));


		System.out.println("\nATRIBUTOS SALTO");
		System.out.println("\nTamanho do salto: " +sal.getTamSalto());
		System.out.println("\nTipo do salto: "+sal.getTipoSalto());

	}
}