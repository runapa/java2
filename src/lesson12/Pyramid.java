package lesson12;

public class Pyramid implements Figur {
    private double l;
    private double w;
    private double h;

    public double getL() {
        return l;
    }

    public double getW() {
        return w;
    }

    public double getH() {
        return h;
    }

    public Pyramid(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Pyramid)) {
            return false;
        }
        Pyramid newObj = (Pyramid) object;
        if (newObj.getH() != h) {
            return false;
        }
        if (newObj.getW() != w) {
            return false;
        }
        if (newObj.getL() != l) {
            return false;
        }
        return true;
    }

    @Override
    public double getVolume() {
        return (l * w * h) / 3;
    }

    @Override
    public double getSquare() {
        return l * w + l * Math.sqrt(Math.pow(w / 2, 2) + Math.pow(h, 2)) + w * Math.sqrt(Math.pow(l / 2, 2) + Math.pow(h, 2));
    }
}
