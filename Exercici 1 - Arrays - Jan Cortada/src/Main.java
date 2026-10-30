//Scaner basic
Scanner input= new Scanner(System.in);
void main() {
    //variables
    int n = 0;
    int m = 0;


    System.out.println("Nº filas:");
    n = input.nextInt();
    System.out.println("Nº Columnes");
    m = input.nextInt();

    //Arrays
    float[][] tabla = new float[n][m];
    float[] sumCol = new float[m];

    for (int i = 0; i < tabla.length; i++ ){
        System.out.println("Estem a la fila Nº" + (i + 1));
        for (int j = 0; j < tabla[i].length; j++){
            System.out.println("Introdueix el valor de la columna Nº" + (j + 1) + ":");
            tabla[i][j] = input.nextFloat();
        }
    }

    for (int i = 0; i < tabla.length; i++ ) {
        float suma = 0;
        for (int j = 0; j < tabla[i].length; j++) {
            suma = suma + tabla[i][j];
        }
        sumCol[i] = suma;
    }

    for (int i = 0; i < m; i++){
        System.out.println(sumCol[i]);
    }
}
