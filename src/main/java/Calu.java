public class Calu {
    public int compute(int num1, int num2, char symbol) {
        switch(symbol){

            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            default:
                throw new IllegalArgumentException();
        }
    }
//crtl+art+T 创建测试类

}
