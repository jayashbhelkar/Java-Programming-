class PatternMock {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 0; j < 2; j++) { 
                for (int k = i; k >= 1; k--) {
                    System.out.print(k + "*");
                }
            }
            System.out.println();
        }
    }
}
