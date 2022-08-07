public class Cylinder {
    public class Clinder extends circle {
        private static final double raduis =1.0 ;
        double height = 1.0;

        public Clinder() {
            super(raduis, getColor());
        }

        public Clinder(double height) {
            super(raduis, getColor());
            this.height = height;
        }

        public Clinder(double height, double raduis) {
            super(raduis,
                    getColor());
            this.height = height;
        }

        public Clinder(double height, double raduis, String color) {
            super(raduis, color);
            this.height = height;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getVolume() {
            double raduis = 1.0;
            return Math.PI * Math.pow(raduis, 2) * height;
        }
    }
}
