package zipcode;

public class Hamming {
    private String s;
    private String s1;

    public Hamming(String s, String s1) {
        if (s.length() != s1.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        this.s = s;
        this.s1 = s1;
    }

    int getHammingDistance() {
        int sum = 0;
        for (int currentIndex = 0; currentIndex < this.s.length(); currentIndex++) {
            if (this.s.charAt(currentIndex) != this.s1.charAt(currentIndex)) {
                sum++;
            }
        }
        System.out.println(sum);
        return sum;
    }

}
