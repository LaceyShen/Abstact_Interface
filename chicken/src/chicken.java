public class chicken {
    public static void main(String[] args) {
        for(int a=0; a<=20; a++) {
            for (int b = 0; b <= 33; b++) {
                for (int c = 0; c <= 100; c = c + 3) {
                    if (a + b + c == 100 && 5 * a + 3 * b + c / 3 == 100) {
                        System.out.println("公鸡数量:" + a + "母鸡数量:" + b + "小鸡数量:" + c);
                    }
                }
            }
        }
    }
}
