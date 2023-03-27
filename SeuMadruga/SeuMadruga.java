package SeuMadruga;

public class SeuMadruga {
    
        public void seumadruga() {
            Scanner sc = new Scanner(System.in);
            System.out.println("informe o peso de maças que você comprou");
            double maca = sc.nextDouble();
            double precoMaca = maca * 2.3;
            System.out.println("informe o peso de banana que você comprou");
            double banana = sc.nextDouble();
            double precoBanana = banana * 1.8;
            System.out.println("informe o peso de morango que você comprou");
            double morango = sc.nextDouble();
            double precoMorango = morango * 3.5;  
          double pesoTotal = (maca+ banana+morango);  
          double precoTotal = (precoBanana+precoMaca+precoMorango);  
          double ValorFinal;
          if ( pesoTotal >=15 || precoTotal>=30) {
            ValorFinal= precoTotal-(precoTotal/10);
            System.out.println("O preço foi"+ValorFinal );
          } else {
            System.out.println("O Preço total foi"+ precoTotal);
          }
} 
} 
