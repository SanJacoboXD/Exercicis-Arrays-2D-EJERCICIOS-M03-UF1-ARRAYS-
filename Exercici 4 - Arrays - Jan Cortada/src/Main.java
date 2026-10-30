void main() {

    char[][] figura = new char[5][5];


    for (int i = 0; i < figura.length; i++) {
        for (int j = 0; j < figura[i].length; j++) {
            if (i == j || i + j == 4) {
                figura[i][j] = 'X';
            } else {
                figura[i][j] = ' ';
            }
            System.out.print(figura[i][j] + " ");
        }
        System.out.println();
    }
}