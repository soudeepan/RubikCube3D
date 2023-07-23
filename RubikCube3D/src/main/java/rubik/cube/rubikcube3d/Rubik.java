package rubik.cube.rubikcube3d;

import javafx.scene.AmbientLight;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.paint.Material;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Transform;


public class Rubik {

    SmartGroup root = new SmartGroup();
    Box blackBox,f1,f2,f3,f4,f5,f6,f7,f8,f9,b1,b2,b3,b4,b5,b6,b7,b8,b9,u1,u2,u3,u4,u5,u6,u7,u8,u9,d1,d2,d3,d4,d5,d6,d7,d8,d9,r1,r2,r3,r4,r5,r6,r7,r8,r9,l1,l2,l3,l4,l5,l6,l7,l8,l9;


    public SmartGroup getMyRoot(){

        double gap = 5.0;
        double edgeLength = 50.0;
        double distFromCent = 85.0;


        blackBox = new Box(3*edgeLength,3*edgeLength,3*edgeLength);
        blackBox.setMaterial(new PhongMaterial(Color.BLACK));

        // Create materials with different colors

        PhongMaterial materialFront = new PhongMaterial(Color.RED);
        PhongMaterial materialBack = new PhongMaterial(Color.ORANGERED);
        PhongMaterial materialTop = new PhongMaterial(Color.GREY);
        PhongMaterial materialBottom = new PhongMaterial(Color.YELLOW);
        PhongMaterial materialRight = new PhongMaterial(Color.BLUE);
        PhongMaterial materialLeft = new PhongMaterial(Color.GREEN);

        // FACEs of the Cube

        //Front


        f1 = new Box(edgeLength, edgeLength, 0);
        f1.setMaterial(materialFront);
        f1.setTranslateX(-edgeLength-gap);
        f1.setTranslateY(-edgeLength-gap);
        f1.setTranslateZ(-distFromCent);

        f2 = new Box(edgeLength, edgeLength, 0);
        f2.setMaterial(materialFront);
        f2.setTranslateY(-edgeLength-gap);
        f2.setTranslateZ(-distFromCent);

        f3 = new Box(edgeLength, edgeLength, 0);
        f3.setMaterial(materialFront);
        f3.setTranslateX(edgeLength+gap);
        f3.setTranslateY(-edgeLength-gap);
        f3.setTranslateZ(-distFromCent);

        f4 = new Box(edgeLength, edgeLength, 0);
        f4.setMaterial(materialFront);
        f4.setTranslateX(-edgeLength-gap);
        f4.setTranslateZ(-distFromCent);

        f5 = new Box(edgeLength, edgeLength, 0);
        f5.setMaterial(materialFront);
        f5.setTranslateZ(-distFromCent);

        f6 = new Box(edgeLength, edgeLength, 0);
        f6.setMaterial(materialFront);
        f6.setTranslateX(edgeLength+gap);
        f6.setTranslateZ(-distFromCent);

        f7 = new Box(edgeLength, edgeLength, 0);
        f7.setMaterial(materialFront);
        f7.setTranslateX(-edgeLength-gap);
        f7.setTranslateY(edgeLength+gap);
        f7.setTranslateZ(-distFromCent);

        f8 = new Box(edgeLength, edgeLength, 0);
        f8.setMaterial(materialFront);
        f8.setTranslateY(edgeLength+gap);
        f8.setTranslateZ(-distFromCent);

        f9 = new Box(edgeLength, edgeLength, 0);
        f9.setMaterial(materialFront);
        f9.setTranslateX(edgeLength+gap);
        f9.setTranslateY(edgeLength+gap);
        f9.setTranslateZ(-distFromCent);


        //Back


        b1 = new Box(edgeLength, edgeLength, 0);
        b1.setMaterial(materialBack);
        b1.setTranslateX(edgeLength+gap);
        b1.setTranslateY(-edgeLength-gap);
        b1.setTranslateZ(distFromCent);

        b2 = new Box(edgeLength, edgeLength, 0);
        b2.setMaterial(materialBack);
        b2.setTranslateY(-edgeLength-gap);
        b2.setTranslateZ(distFromCent);

        b3 = new Box(edgeLength, edgeLength, 0);
        b3.setMaterial(materialBack);
        b3.setTranslateX(-edgeLength-gap);
        b3.setTranslateY(-edgeLength-gap);
        b3.setTranslateZ(distFromCent);

        b4 = new Box(edgeLength, edgeLength, 0);
        b4.setMaterial(materialBack);
        b4.setTranslateX(edgeLength+gap);
        b4.setTranslateZ(distFromCent);

        b5 = new Box(edgeLength, edgeLength, 0);
        b5.setMaterial(materialBack);
        b5.setTranslateZ(distFromCent);

        b6 = new Box(edgeLength, edgeLength, 0);
        b6.setMaterial(materialBack);
        b6.setTranslateX(-edgeLength-gap);
        b6.setTranslateZ(distFromCent);

        b7 = new Box(edgeLength, edgeLength, 0);
        b7.setMaterial(materialBack);
        b7.setTranslateX(edgeLength+gap);
        b7.setTranslateY(edgeLength+gap);
        b7.setTranslateZ(distFromCent);

        b8 = new Box(edgeLength, edgeLength, 0);
        b8.setMaterial(materialBack);
        b8.setTranslateY(edgeLength+gap);
        b8.setTranslateZ(distFromCent);

        b9 = new Box(edgeLength, edgeLength, 0);
        b9.setMaterial(materialBack);
        b9.setTranslateX(-edgeLength-gap);
        b9.setTranslateY(edgeLength+gap);
        b9.setTranslateZ(distFromCent);


        //Up


        u1 = new Box(edgeLength, 0, edgeLength);
        u1.setMaterial(materialTop);
        u1.setTranslateX(-edgeLength-gap);
        u1.setTranslateZ(edgeLength+gap);
        u1.setTranslateY(-distFromCent);

        u2 = new Box(edgeLength, 0, edgeLength);
        u2.setMaterial(materialTop);
        u2.setTranslateZ(edgeLength+gap);
        u2.setTranslateY(-distFromCent);

        u3 = new Box(edgeLength, 0, edgeLength);
        u3.setMaterial(materialTop);
        u3.setTranslateX(edgeLength+gap);
        u3.setTranslateZ(edgeLength+gap);
        u3.setTranslateY(-distFromCent);

        u4 = new Box(edgeLength, 0, edgeLength);
        u4.setMaterial(materialTop);
        u4.setTranslateX(-edgeLength-gap);
        u4.setTranslateY(-distFromCent);

        u5 = new Box(edgeLength, 0, edgeLength);
        u5.setMaterial(materialTop);
        u5.setTranslateY(-distFromCent);

        u6 = new Box(edgeLength, 0, edgeLength);
        u6.setMaterial(materialTop);
        u6.setTranslateX(edgeLength+gap);
        u6.setTranslateY(-distFromCent);

        u7 = new Box(edgeLength, 0, edgeLength);
        u7.setMaterial(materialTop);
        u7.setTranslateX(-edgeLength-gap);
        u7.setTranslateZ(-edgeLength-gap);
        u7.setTranslateY(-distFromCent);

        u8 = new Box(edgeLength, 0, edgeLength);
        u8.setMaterial(materialTop);
        u8.setTranslateZ(-edgeLength-gap);
        u8.setTranslateY(-distFromCent);

        u9 = new Box(edgeLength, 0, edgeLength);
        u9.setMaterial(materialTop);
        u9.setTranslateX(edgeLength+gap);
        u9.setTranslateZ(-edgeLength-gap);
        u9.setTranslateY(-distFromCent);



        //Down


        d1 = new Box(edgeLength, 0, edgeLength);
        d1.setMaterial(materialBottom);
        d1.setTranslateX(-edgeLength-gap);
        d1.setTranslateZ(-edgeLength-gap);
        d1.setTranslateY(distFromCent);

        d2 = new Box(edgeLength, 0, edgeLength);
        d2.setMaterial(materialBottom);
        d2.setTranslateZ(-edgeLength-gap);
        d2.setTranslateY(distFromCent);

        d3 = new Box(edgeLength, 0, edgeLength);
        d3.setMaterial(materialBottom);
        d3.setTranslateX(edgeLength+gap);
        d3.setTranslateZ(-edgeLength-gap);
        d3.setTranslateY(distFromCent);

        d4 = new Box(edgeLength, 0, edgeLength);
        d4.setMaterial(materialBottom);
        d4.setTranslateX(-edgeLength-gap);
        d4.setTranslateY(distFromCent);

        d5 = new Box(edgeLength, 0, edgeLength);
        d5.setMaterial(materialBottom);
        d5.setTranslateY(distFromCent);

        d6 = new Box(edgeLength, 0, edgeLength);
        d6.setMaterial(materialBottom);
        d6.setTranslateX(edgeLength+gap);
        d6.setTranslateY(distFromCent);

        d7 = new Box(edgeLength, 0, edgeLength);
        d7.setMaterial(materialBottom);
        d7.setTranslateX(-edgeLength-gap);
        d7.setTranslateZ(edgeLength+gap);
        d7.setTranslateY(distFromCent);

        d8 = new Box(edgeLength, 0, edgeLength);
        d8.setMaterial(materialBottom);
        d8.setTranslateZ(edgeLength+gap);
        d8.setTranslateY(distFromCent);

        d9 = new Box(edgeLength, 0, edgeLength);
        d9.setMaterial(materialBottom);
        d9.setTranslateX(edgeLength+gap);
        d9.setTranslateZ(edgeLength+gap);
        d9.setTranslateY(distFromCent);


        //Right


        r1 = new Box(0, edgeLength, edgeLength);
        r1.setMaterial(materialRight);
        r1.setTranslateY(-edgeLength-gap);
        r1.setTranslateZ(-edgeLength-gap);
        r1.setTranslateX(distFromCent);

        r2 = new Box(0, edgeLength, edgeLength);
        r2.setMaterial(materialRight);
        r2.setTranslateY(-edgeLength-gap);
        r2.setTranslateX(distFromCent);

        r3 = new Box(0, edgeLength, edgeLength);
        r3.setMaterial(materialRight);
        r3.setTranslateY(-edgeLength-gap);
        r3.setTranslateZ(edgeLength+gap);
        r3.setTranslateX(distFromCent);

        r4 = new Box(0, edgeLength, edgeLength);
        r4.setMaterial(materialRight);
        r4.setTranslateZ(-edgeLength-gap);
        r4.setTranslateX(distFromCent);

        r5 = new Box(0, edgeLength, edgeLength);
        r5.setMaterial(materialRight);
        r5.setTranslateX(distFromCent);

        r6 = new Box(0, edgeLength, edgeLength);
        r6.setMaterial(materialRight);
        r6.setTranslateZ(edgeLength+gap);
        r6.setTranslateX(distFromCent);

        r7 = new Box(0, edgeLength, edgeLength);
        r7.setMaterial(materialRight);
        r7.setTranslateZ(-edgeLength-gap);
        r7.setTranslateY(edgeLength+gap);
        r7.setTranslateX(distFromCent);

        r8 = new Box(0, edgeLength, edgeLength);
        r8.setMaterial(materialRight);
        r8.setTranslateY(edgeLength+gap);
        r8.setTranslateX(distFromCent);

        r9 = new Box(0, edgeLength, edgeLength);
        r9.setMaterial(materialRight);
        r9.setTranslateY(edgeLength+gap);
        r9.setTranslateZ(edgeLength+gap);
        r9.setTranslateX(distFromCent);


        //Left


        l1 = new Box(0, edgeLength, edgeLength);
        l1.setMaterial(materialLeft);
        l1.setTranslateY(-edgeLength-gap);
        l1.setTranslateZ(edgeLength+gap);
        l1.setTranslateX(-distFromCent);

        l2 = new Box(0, edgeLength, edgeLength);
        l2.setMaterial(materialLeft);
        l2.setTranslateY(-edgeLength-gap);
        l2.setTranslateX(-distFromCent);

        l3 = new Box(0, edgeLength, edgeLength);
        l3.setMaterial(materialLeft);
        l3.setTranslateZ(-edgeLength-gap);
        l3.setTranslateY(-edgeLength-gap);
        l3.setTranslateX(-distFromCent);

        l4 = new Box(0, edgeLength, edgeLength);
        l4.setMaterial(materialLeft);
        l4.setTranslateZ(edgeLength+gap);
        l4.setTranslateX(-distFromCent);

        l5 = new Box(0, edgeLength, edgeLength);
        l5.setMaterial(materialLeft);
        l5.setTranslateX(-distFromCent);

        l6 = new Box(0, edgeLength, edgeLength);
        l6.setMaterial(materialLeft);
        l6.setTranslateZ(-edgeLength-gap);
        l6.setTranslateX(-distFromCent);

        l7 = new Box(0, edgeLength, edgeLength);
        l7.setMaterial(materialLeft);
        l7.setTranslateY(edgeLength+gap);
        l7.setTranslateZ(edgeLength+gap);
        l7.setTranslateX(-distFromCent);

        l8 = new Box(0, edgeLength, edgeLength);
        l8.setMaterial(materialLeft);
        l8.setTranslateY(edgeLength+gap);
        l8.setTranslateX(-distFromCent);

        l9 = new Box(0, edgeLength, edgeLength);
        l9.setMaterial(materialLeft);
        l9.setTranslateY(edgeLength+gap);
        l9.setTranslateZ(-edgeLength-gap);
        l9.setTranslateX(-distFromCent);





        // Translate the boxes to position them properly


        // Create a Group and add the Box objects to it
        root.getChildren().addAll(blackBox,f1,f2,f3,f4,f5,f6,f7,f8,f9,b1,b2,b3,b4,b5,b6,b7,b8,b9,u1,u2,u3,u4,u5,u6,u7,u8,u9,d1,d2,d3,d4,d5,d6,d7,d8,d9,r1,r2,r3,r4,r5,r6,r7,r8,r9,l1,l2,l3,l4,l5,l6,l7,l8,l9);

        root.translateXProperty().set(700);
        root.translateYProperty().set(350);

        // Light

        AmbientLight ambientLight = new AmbientLight();
        root.getChildren().add(ambientLight);


        /*

            Testing Area

        */


        return root;
    }

    public void fMove(){

        Material temp;

        temp = f1.getMaterial();
        f1.setMaterial(f7.getMaterial());
        f7.setMaterial(f9.getMaterial());
        f9.setMaterial(f3.getMaterial());
        f3.setMaterial(temp);
        temp = f2.getMaterial();
        f2.setMaterial(f4.getMaterial());
        f4.setMaterial(f8.getMaterial());
        f8.setMaterial(f6.getMaterial());
        f6.setMaterial(temp);

        temp= u7.getMaterial();
        u7.setMaterial(l9.getMaterial());
        l9.setMaterial(d3.getMaterial());
        d3.setMaterial(r1.getMaterial());
        r1.setMaterial(temp);
        temp= u9.getMaterial();
        u9.setMaterial(l3.getMaterial());
        l3.setMaterial(d1.getMaterial());
        d1.setMaterial(r7.getMaterial());
        r7.setMaterial(temp);
        temp= u8.getMaterial();
        u8.setMaterial(l6.getMaterial());
        l6.setMaterial(d2.getMaterial());
        d2.setMaterial(r4.getMaterial());
        r4.setMaterial(temp);
    }

    public void f2Move(){
        fMove();
        fMove();
    }
    public void fPrimeMove(){
        fMove();
        fMove();
        fMove();
    }


    public void rMove(){

        Material temp;

        temp = r1.getMaterial();
        r1.setMaterial(r7.getMaterial());
        r7.setMaterial(r9.getMaterial());
        r9.setMaterial(r3.getMaterial());
        r3.setMaterial(temp);
        temp = r2.getMaterial();
        r2.setMaterial(r4.getMaterial());
        r4.setMaterial(r8.getMaterial());
        r8.setMaterial(r6.getMaterial());
        r6.setMaterial(temp);

        temp= u9.getMaterial();
        u9.setMaterial(f9.getMaterial());
        f9.setMaterial(d9.getMaterial());
        d9.setMaterial(b1.getMaterial());
        b1.setMaterial(temp);
        temp= u3.getMaterial();
        u3.setMaterial(f3.getMaterial());
        f3.setMaterial(d3.getMaterial());
        d3.setMaterial(b7.getMaterial());
        b7.setMaterial(temp);
        temp= u6.getMaterial();
        u6.setMaterial(f6.getMaterial());
        f6.setMaterial(d6.getMaterial());
        d6.setMaterial(b4.getMaterial());
        b4.setMaterial(temp);
    }

    public void r2Move(){
        rMove();
        rMove();
    }
    public void rPrimeMove(){
        rMove();
        rMove();
        rMove();
    }



    public void lMove(){

        Material temp;

        temp = l1.getMaterial();
        l1.setMaterial(l7.getMaterial());
        l7.setMaterial(l9.getMaterial());
        l9.setMaterial(l3.getMaterial());
        l3.setMaterial(temp);
        temp = l2.getMaterial();
        l2.setMaterial(l4.getMaterial());
        l4.setMaterial(l8.getMaterial());
        l8.setMaterial(l6.getMaterial());
        l6.setMaterial(temp);

        temp= u1.getMaterial();
        u1.setMaterial(b9.getMaterial());
        b9.setMaterial(d1.getMaterial());
        d1.setMaterial(f1.getMaterial());
        f1.setMaterial(temp);
        temp= u7.getMaterial();
        u7.setMaterial(b3.getMaterial());
        b3.setMaterial(d7.getMaterial());
        d7.setMaterial(f7.getMaterial());
        f7.setMaterial(temp);
        temp= u4.getMaterial();
        u4.setMaterial(b6.getMaterial());
        b6.setMaterial(d4.getMaterial());
        d4.setMaterial(f4.getMaterial());
        f4.setMaterial(temp);
    }

    public void l2Move(){
        lMove();
        lMove();
    }
    public void lPrimeMove(){
        lMove();
        lMove();
        lMove();
    }



    public void bMove(){

        Material temp;

        temp = b1.getMaterial();
        b1.setMaterial(b7.getMaterial());
        b7.setMaterial(b9.getMaterial());
        b9.setMaterial(b3.getMaterial());
        b3.setMaterial(temp);
        temp = b2.getMaterial();
        b2.setMaterial(b4.getMaterial());
        b4.setMaterial(b8.getMaterial());
        b8.setMaterial(b6.getMaterial());
        b6.setMaterial(temp);

        temp= u1.getMaterial();
        u1.setMaterial(r3.getMaterial());
        r3.setMaterial(d9.getMaterial());
        d9.setMaterial(l7.getMaterial());
        l7.setMaterial(temp);
        temp= u3.getMaterial();
        u3.setMaterial(r9.getMaterial());
        r9.setMaterial(d7.getMaterial());
        d7.setMaterial(l1.getMaterial());
        l1.setMaterial(temp);
        temp= u2.getMaterial();
        u2.setMaterial(r6.getMaterial());
        r6.setMaterial(d8.getMaterial());
        d8.setMaterial(l4.getMaterial());
        l4.setMaterial(temp);
    }

    public void b2Move(){
        bMove();
        bMove();
    }
    public void bPrimeMove(){
        bMove();
        bMove();
        bMove();
    }



    public void dMove(){

        Material temp;

        temp = d1.getMaterial();
        d1.setMaterial(d7.getMaterial());
        d7.setMaterial(d9.getMaterial());
        d9.setMaterial(d3.getMaterial());
        d3.setMaterial(temp);
        temp = d2.getMaterial();
        d2.setMaterial(d4.getMaterial());
        d4.setMaterial(d8.getMaterial());
        d8.setMaterial(d6.getMaterial());
        d6.setMaterial(temp);

        temp= f7.getMaterial();
        f7.setMaterial(l7.getMaterial());
        l7.setMaterial(b7.getMaterial());
        b7.setMaterial(r7.getMaterial());
        r7.setMaterial(temp);
        temp= f9.getMaterial();
        f9.setMaterial(l9.getMaterial());
        l9.setMaterial(b9.getMaterial());
        b9.setMaterial(r9.getMaterial());
        r9.setMaterial(temp);
        temp= f8.getMaterial();
        f8.setMaterial(l8.getMaterial());
        l8.setMaterial(b8.getMaterial());
        b8.setMaterial(r8.getMaterial());
        r8.setMaterial(temp);
    }

    public void d2Move(){
        dMove();
        dMove();
    }
    public void dPrimeMove(){
        dMove();
        dMove();
        dMove();
    }



    public void uMove(){

        Material temp;

        temp = u1.getMaterial();
        u1.setMaterial(u7.getMaterial());
        u7.setMaterial(u9.getMaterial());
        u9.setMaterial(u3.getMaterial());
        u3.setMaterial(temp);
        temp = u2.getMaterial();
        u2.setMaterial(u4.getMaterial());
        u4.setMaterial(u8.getMaterial());
        u8.setMaterial(u6.getMaterial());
        u6.setMaterial(temp);

        temp= f1.getMaterial();
        f1.setMaterial(r1.getMaterial());
        r1.setMaterial(b1.getMaterial());
        b1.setMaterial(l1.getMaterial());
        l1.setMaterial(temp);
        temp= f3.getMaterial();
        f3.setMaterial(r3.getMaterial());
        r3.setMaterial(b3.getMaterial());
        b3.setMaterial(l3.getMaterial());
        l3.setMaterial(temp);
        temp= f2.getMaterial();
        f2.setMaterial(r2.getMaterial());
        r2.setMaterial(b2.getMaterial());
        b2.setMaterial(l2.getMaterial());
        l2.setMaterial(temp);
    }

    public void u2Move(){
        uMove();
        uMove();
    }
    public void uPrimeMove(){
        uMove();
        uMove();
        uMove();
    }

}

class SmartGroup extends Group {

    Rotate r;
    Transform t = new Rotate();

    void rotateByX(int ang) {
        r = new Rotate(ang, Rotate.X_AXIS);
        t = t.createConcatenation(r);
        this.getTransforms().clear();
        this.getTransforms().addAll(t);
    }

    void rotateByY(int ang) {
        r = new Rotate(ang, Rotate.Y_AXIS);
        t = t.createConcatenation(r);
        this.getTransforms().clear();
        this.getTransforms().addAll(t);
    }
}