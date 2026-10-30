//Scaner basic
Scanner input= new Scanner(System.in);
void main() {
    //variables
//    int n = 0;
    int m = 0;


//    System.out.println("Nº filas:");
//    n = input.nextInt();
    System.out.println("Nº Columnes");
    m = input.nextInt();

    //Arrays
    float[][] tabla = new float[3][m];
    float[][] resultats = new float[3][m];

    for (int i = 0; i < tabla.length; i++ ){
        System.out.println("Estem a la fila Nº" + (i + 1));
        for (int j = 0; j < tabla[i].length; j++){
            System.out.println("Introdueix el valor de la columna Nº" + (j + 1) + ":");
            tabla[i][j] = input.nextFloat();
        }
    }

    for (int j = 0; j < m; j++) {
        float suma = 0;
        float max = tabla[0][j];
        float min = tabla[0][j];
        for (int i = 0; i < tabla.length; i++) {
            suma = suma + tabla[i][j];
            if (tabla[i][j] > max) {
                max = tabla[i][j];
            }
            if (tabla[i][j] < min) {
                min = tabla[i][j];
            }
        }
        resultats[0][j] = suma;
        resultats[1][j] = max;
        resultats[2][j] = min;
    }

    for (int j = 0; j < m; j++){
        System.out.println("Columna " + (j + 1) + " -> Suma: " + resultats[0][j] + " | Max: " + resultats[1][j] + " | Min: " + resultats[2][j]);
    }
}