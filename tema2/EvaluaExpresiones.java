public class EvaluaExpresiones {

    public static void main(String[]args) {

    int a, b, c;

    System.out.println("Este programa evalua expresiones");
    System.out.println("=============================================================");
    
    //primera expresión
    a = 2; b = 5;
    System.out.println("3 * A + B - 6 / A = " );
    System.out.println(3 * a + b - 6 / a);
    
    //segunda expresión
    a = 4; b = 5; c =1;
    System.out.println("B * A - B * B / 4 * C  ");
    System.out.println(b * a - b * b / 4 * c  );

    //tercera expresión
    a = 4; b = 5;
    System.out.println("(A * B) / 9 ");
    System.out.println((a * b) / 9  );

    //cuarta expresión 
    a = 4; b = 5; c = 1; 
    System.out.println("(((B + C) / 2 * A + 10) * 3 * B) - 6 ");
    System.out.println((((b + c) / 2 * a + 10) * 3 * b) - 6 );

    //quinta expresión
    System.out.println("5 + 25 % 2 ");
    System.out.println(5 + 25 % 2 );

    //sexta expresión
    System.out.println("(5+25) % 2  ");
    System.out.println((5+25) % 2  );

    //séptima expresión
    System.out.println("5+25 / 10   ");
    System.out.println( 5+25 / 10  );

    //octava expresión
    System.out.println("-2*2");
    System.out.println(-2*2);

    //novena expresión
    System.out.println("(-2)*2 ");
    System.out.println((-2)*2 );

    //décima expresión
    System.out.println("- (2*2) ");
    System.out.println(- (2*2) );



    
}
}
