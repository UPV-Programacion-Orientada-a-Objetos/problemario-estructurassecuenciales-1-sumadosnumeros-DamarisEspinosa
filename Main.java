class Main {

    public static void main(String[] args) {
    	int a = Integer.parseInt(args[0]);
    	int b = Integer.parseInt(args[1]);
    	// crear un nuevo objeto 
	SumaDosNumeros obj = new SumaDosNumeros();
	// imprimir la suma de los dos numeros enviados 
	System.out.println(obj.suma(a,b));
    }
}
