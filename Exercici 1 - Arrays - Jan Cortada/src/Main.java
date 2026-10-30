//Scaner basic
Scanner input= new Scanner(System.in);
void main() {
    int n = 0;
    int m = 0;

    System.out.println("Nº filas:");
    n = input.nextInt();
    System.out.println("Nº Columnes");
    m = input.nextInt();

    float[][] tabla = new float[n][m];

    for (int i = 0; i < tabla.length; i++ ){
        System.out.println("Estem a la fila Nº" + (i + 1));
        for (int j = 0; j < tabla[i].length; j++){
            System.out.println("Introdueix el valor de la columna Nº" + (j + 1) + ":");
            tabla[i][j] = input.nextFloat();
        }
    }
}
