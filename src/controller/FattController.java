package controller;

public class FattController {

	public FattController() {
		super();
	}
	public int fatoraDuplo(int a) {
		if(a <= 0) {
//por conta de "a" estar sendo subtraido por 2 á cada nova chamada, assim que ele for menor ou igual a zero, a chamada de função será encerrada
			return 1;
		}
		else {
//levando em conta que "a" é um valor ímpar, ele será multiplicado por outros valores impares toda vez uma nova chamada for feita e seu valor for subtraido por 2 
			return a * fatoraDuplo(a - 2);
   }
  }
 }