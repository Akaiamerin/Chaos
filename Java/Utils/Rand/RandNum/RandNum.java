import java.security.SecureRandom;
public class RandNum {
    private static final int LEFT_CLOSED_INTERVAL_RIGHT_CLOSED_INTERVAL = 1; //左闭右闭
    private static final int LEFT_CLOSED_INTERVAL_RIGHT_OPEN_INTERVAL = 2; //左闭右开
    private static final int LEFT_OPEN_INTERVAL_RIGHT_CLOSED_INTERVAL = 3; //左开右闭
    private static final int LEFT_OPEN_INTERVAL_RIGHT_OPEN_INTERVAL = 4; //左开右开
    private static final int MAX_RAND_NUM = 0x3f3f3f3f;
    private static final SecureRandom secRand = new SecureRandom();
    private static int randInteger(int minNum, int maxNum, int opt) {
        int ret = 0;
        if (opt == 1) {
            ret = secRand.nextInt(RandNum.MAX_RAND_NUM) % (maxNum - minNum + 1) + minNum;
        }
        else if (opt == 2) {
            ret = secRand.nextInt(RandNum.MAX_RAND_NUM) % (maxNum - minNum) + minNum;
        }
        else if (opt == 3) {
            ret = secRand.nextInt(RandNum.MAX_RAND_NUM) % (maxNum - minNum) + minNum + 1;
        }
        else if (opt == 4) {
            ret = secRand.nextInt(RandNum.MAX_RAND_NUM) % (maxNum - minNum - 1) + minNum + 1;
        }
        else {
            ret = secRand.nextInt(0, 1);
        }
        return ret;
    }
    private static double randDecimal(double minNum, double maxNum, int opt) {
        double ret = 0.0;
        if (opt == 1) {
            ret = secRand.nextDouble(RandNum.MAX_RAND_NUM) / RandNum.MAX_RAND_NUM * (maxNum - minNum) + minNum;
        }
        else if (opt == 2) {
            ret = secRand.nextDouble(RandNum.MAX_RAND_NUM) / (RandNum.MAX_RAND_NUM + 1) * (maxNum - minNum) + minNum;
        }
        else if (opt == 3) {
            ret = (secRand.nextDouble(RandNum.MAX_RAND_NUM) + 1) / (RandNum.MAX_RAND_NUM + 1) * (maxNum - minNum) + minNum;
        }
        else if (opt == 4) {
            ret = (secRand.nextDouble(RandNum.MAX_RAND_NUM) + 1) / (RandNum.MAX_RAND_NUM + 2) * (maxNum - minNum) + minNum;
        }
        else {
            ret = secRand.nextDouble(0, 1);
        }
        return ret;
    }
}