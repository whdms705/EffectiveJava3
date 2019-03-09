package ch04.item23;


class Figure {
    enum Shape{RECTANCE,CIRCLE};

    final Shape shape;

    double length;
    double width;

    double radius;

    Figure(double redius){
        shape = Shape.CIRCLE;
        this.radius = redius;
    }

    Figure(double length,double width){
        shape = Shape.RECTANCE;
        this.length =length;
        this.width = width;
    }


}
