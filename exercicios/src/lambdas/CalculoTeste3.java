package lambdas;

/*
BinaryOperation: recebe dois parâmetros de entrada d o mesmo tipo 
e vai retornar um resultado que tem o mesmo tipo dos parâmetros.
Sintaxe: BinaryOperator<tipoParametro>
*/
import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		BinaryOperator<Double> operacao = (x, y) -> {
			return x + y;
		};
		
		//Ao invés do .executar(), utilixaremos o .apply()
		//E não é possível converter int para Double, apenas double para Double
		System.out.println(operacao.apply(2.0, 3.0));
		

		BinaryOperator<Integer> operacao2 = (x, y) -> {
			return x * y;
		};
		
		System.out.println(operacao2.apply(2, 3));

	}

}