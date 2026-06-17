class VolumeCalculator {//Q3

    double calculateVolume(double length) {
        return length * length * length;
    }
    // Cube

    double calculateVolume(double length,
                           double width,
                           double height) {
        return length * width * height;
    }
    // Cuboid

    public static void main(String[] args) {

        VolumeCalculator obj = new VolumeCalculator();

        System.out.println(
                "Cube Volume = " +
                        obj.calculateVolume(5));

        System.out.println(
                "Cuboid Volume = " +
                        obj.calculateVolume(5, 4, 3));
    }
}
