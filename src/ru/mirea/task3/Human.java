package ru.mirea.task3;

public class Human {
    private Head head;
    private Body body;

    private Hand leftHand;
    private Hand rightHand;

    private Leg leftLeg;
    private Leg rightLeg;

    public Human() {

    }

    private Human(HumanBuilder builder) {
        this.head = builder.head;
        this.body = builder.body;
        this.leftHand = builder.leftHand;
        this.rightHand = builder.rightHand;
        this.leftLeg = builder.leftLeg;
        this.rightLeg = builder.rightLeg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Hand getLeftHand() {
        return leftHand;
    }

    public void setLeftHand(Hand leftHand) {
        this.leftHand = leftHand;
    }

    public Hand getRightHand() {
        return rightHand;
    }

    public void setRightHand(Hand rightHand) {
        this.rightHand = rightHand;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(Leg leftLeg) {
        this.leftLeg = leftLeg;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(Leg rightLeg) {
        this.rightLeg = rightLeg;
    }

    @Override
    public String toString() {
        return "Human{" +
                "head=" + head +
                ", body=" + body +
                ", leftHand=" + leftHand +
                ", rightHand=" + rightHand +
                ", leftLeg=" + leftLeg +
                ", rightLeg=" + rightLeg +
                '}';
    }

    private static class Head {
        private String eyesColor;
        private int faceWidth;

        public Head(String eyesColor, int faceWidth) {
            this.eyesColor = eyesColor;
            this.faceWidth = faceWidth;
        }

        public String getEyesColor() {
            return eyesColor;
        }

        public void setEyesColor(String eyesColor) {
            this.eyesColor = eyesColor;
        }

        public int getFaceWidth() {
            return faceWidth;
        }

        public void setFaceWidth(int faceWidth) {
            this.faceWidth = faceWidth;
        }

        @Override
        public String toString() {
            return "Head{" +
                    "eyesColor='" + eyesColor + '\'' +
                    ", faceWidth=" + faceWidth +
                    '}';
        }
    }

    private static class Body {
        private String skinColor;
        private double height;

        public Body(String skinColor, double height) {
            this.skinColor = skinColor;
            this.height = height;
        }

        public String getSkinColor() {
            return skinColor;
        }

        public void setSkinColor(String skinColor) {
            this.skinColor = skinColor;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        @Override
        public String toString() {
            return "Body{" +
                    "skinColor='" + skinColor + '\'' +
                    ", height=" + height +
                    '}';
        }
    }

    private static class Hand {
        private double handLength;
        private double pointerFingerLength;

        public Hand(double handLength, double pointerFingerLength) {
            this.handLength = handLength;
            this.pointerFingerLength = pointerFingerLength;
        }

        public double getHandLength() {
            return handLength;
        }

        public void setHandLength(double handLength) {
            this.handLength = handLength;
        }

        public double getPointerFingerLength() {
            return pointerFingerLength;
        }

        public void setPointerFingerLength(double pointerFingerLength) {
            this.pointerFingerLength = pointerFingerLength;
        }

        @Override
        public String toString() {
            return "Hand{" +
                    "handLength=" + handLength +
                    ", pointerFingerLength=" + pointerFingerLength +
                    '}';
        }
    }

    private static class Leg {
        private double legLength;
        private double bigToeWidth;

        public Leg(double legLength, double bigToeWidth) {
            this.legLength = legLength;
            this.bigToeWidth = bigToeWidth;
        }

        public double getLegLength() {
            return legLength;
        }

        public void setLegLength(double legLength) {
            this.legLength = legLength;
        }

        public double getBigToeWidth() {
            return bigToeWidth;
        }

        public void setBigToeWidth(double bigToeWidth) {
            this.bigToeWidth = bigToeWidth;
        }

        @Override
        public String toString() {
            return "Leg{" +
                    "legLength=" + legLength +
                    ", bigToeWidth=" + bigToeWidth +
                    '}';
        }
    }

    public static class HumanBuilder {

        private Head head;
        private Body body;

        private Hand leftHand;
        private Hand rightHand;

        private Leg leftLeg;
        private Leg rightLeg;

        public HumanBuilder() {
        }

        public HumanBuilder head(String eyesColor, int faceWidth) {
            this.head = new Head(eyesColor, faceWidth);
            return this;
        }

        public HumanBuilder body(String skinColor, double height) {
            this.body = new Body(skinColor, height);
            return this;
        }

        public HumanBuilder leftHand(double handLength, double pointerFingerLength) {
            this.leftHand = new Hand(handLength, pointerFingerLength);
            return this;
        }

        public HumanBuilder rightHand(double handLength, double pointerFingerLength) {
            this.leftHand = new Hand(handLength, pointerFingerLength);
            return this;
        }

        public HumanBuilder leftLeg(double legLength, double bigToeWidth) {
            this.leftLeg = new Leg(legLength, bigToeWidth);
            return this;
        }

        public HumanBuilder rightLeg(double legLength, double bigToeWidth) {
            this.rightLeg = new Leg(legLength, bigToeWidth);
            return this;
        }

        public Human build() {
            return new Human(this);
        }
    }
}
