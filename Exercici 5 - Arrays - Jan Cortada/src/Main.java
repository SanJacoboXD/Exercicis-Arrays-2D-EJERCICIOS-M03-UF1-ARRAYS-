Scanner input = new Scanner(System.in);
void main() {
    float[][] notes = new float[20][6];

    for (int i = 0; i < notes.length; i++) {
        System.out.println("Alumne Nº" + (i + 1));
        for (int j = 0; j < 3; j++) {
            System.out.println("Nota parcial " + (j + 1) + ":");
            notes[i][j] = input.nextFloat();
        }
    }

    for (int i = 0; i < notes.length; i++) {
        float suma = 0;
        float max = notes[i][0];
        float min = notes[i][0];
        for (int j = 0; j < 3; j++) {
            suma = suma + notes[i][j];
            if (notes[i][j] > max) {
                max = notes[i][j];
            }
            if (notes[i][j] < min) {
                min = notes[i][j];
            }
        }
        notes[i][3] = suma / 3;
        notes[i][4] = max;
        notes[i][5] = min;
    }

    System.out.println("N1\tN2\tN3\tMitj\tMax\tMin");
    for (int i = 0; i < notes.length; i++) {
        for (int j = 0; j < notes[i].length; j++) {
            System.out.printf("%.2f\t", notes[i][j]);
        }
        System.out.println();
    }

    float millor = notes[0][4];
    float pitjor = notes[0][5];
    for (int i = 0; i < notes.length; i++) {
        if (notes[i][4] > millor) {
            millor = notes[i][4];
        }
        if (notes[i][5] < pitjor) {
            pitjor = notes[i][5];
        }
    }
    System.out.println("Millor nota del curs: " + millor);
    System.out.println("Pitjor nota del curs: " + pitjor);
}